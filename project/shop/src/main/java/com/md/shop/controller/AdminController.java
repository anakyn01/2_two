package com.md.shop.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.md.shop.domain.CategoryVO;
import com.md.shop.domain.GoodsVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.service.AdminService;
import com.md.shop.utils.UploadFileUtils;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);	
	
	@Inject
	AdminService adminService;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	@GetMapping(value="/index")
	public void getIndex() throws Exception{
		logger.info("get index");
	}
	
	
	@GetMapping(value="/goods/register")
	public void getGoodsRegister(Model model) throws Exception{
		logger.info("get goods register");
		
		List<CategoryVO> category = null;
		category = adminService.category();
		model.addAttribute("category", JSONArray.fromObject(category));
		//pom.xml占쏙옙 DI占쌩곤옙
	}
	
	@PostMapping(value="/goods/register")
	public String postGoodsRegister(GoodsVO vo, MultipartFile file) throws Exception{
	//add
		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
		 fileName =  UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
		vo.setGdsImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		vo.setGdsThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		 
		} else {
		 fileName = File.separator + "images" + File.separator + "none.png";
		vo.setGdsImg(fileName);
		vo.setGdsThumbImg(fileName);		 
		}


	//add end
		adminService.register(vo);
		return "redirect:/admin/index";
	}
	
	//占쏙옙품占쏙옙占�
	@GetMapping(value="/goods/list")
	public void getGoodsList(Model model) throws Exception{
		logger.info("get goods list");
		List<GoodsVO> list = adminService.goodslist();
		model.addAttribute("list", list);
	}
	
	//상품조회
	@GetMapping(value="/goods/view")
	public void getGoodsview(@RequestParam("n") int gdsNum, Model model) throws Exception{
		logger.info("get goods view");
		
		GoodsViewVO goods = adminService.goodsView(gdsNum);
		model.addAttribute("goods", goods);	
	}
	
	//상품수정
	@GetMapping(value="/goods/modify")
	public void getGoodsModify(@RequestParam("n") int gdsNum, Model model) throws Exception{
	    logger.info("get goods modify");
	    
		GoodsViewVO goods = adminService.goodsView(gdsNum);
		model.addAttribute("goods", goods);	
		
		List<CategoryVO> category = null;
		category = adminService.category();
		model.addAttribute("category", JSONArray.fromObject(category));	    
	}
	@PostMapping(value="/goods/modify")
	public String postGoodsModify(GoodsVO vo, MultipartFile file, HttpServletRequest req) throws Exception{
		logger.info("get goods modify");
		
		//새로운 파일이 등록되어 있는지 확인
		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			//기존 일반이미지와 썸네일 파일을 삭제
			new File(uploadPath + req.getParameter("gdsImg")).delete();
			new File(uploadPath + req.getParameter("gdsThumbImg")).delete();
			
			//새로 첨부한 파일을 등록
			String imgUploadPath = uploadPath + File.separator + "imgUpload";
			String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
			String fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
			
			vo.setGdsImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
			vo.setGdsThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		}else {
			vo.setGdsImg(req.getParameter("gdsImg"));
			vo.setGdsThumbImg(req.getParameter("gdsThumbImg"));
		}
	    
		adminService.goodsModify(vo);
	    return "redirect:/admin/index";
	}
	
	//상품삭제
	@PostMapping(value="/goods/delete")
	public String postGoodsDelete(@RequestParam("n") int gdsNum) throws Exception{
		logger.info("post goods delete");
		adminService.goodsDelete(gdsNum);
		return "redirect:/admin/index";
	}
	
	
	
	
	
	
	
	
	
	
	
}
