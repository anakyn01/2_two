package com.md.shop.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.md.shop.domain.CategoryVO;
import com.md.shop.domain.GoodsVO;
import com.md.shop.service.AdminService;
import com.md.shop.utils.UploadFileUtils;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);	
	
	@Inject
	AdminService adminService;
	
	@Resource(name="uploadPath")//리소스로 임명
	private String uploadPath;
	
	@GetMapping(value="/index")
	public void getIndex() throws Exception{
		logger.info("get index");
	}
	
	//상품등록
	@GetMapping(value="/goods/register")
	public void getGoodsRegister(Model model) throws Exception{
		logger.info("get goods register");
		
		List<CategoryVO> category = null;
		category = adminService.category();
		model.addAttribute("category", JSONArray.fromObject(category));
		//pom.xml에 DI추가
	}
	
	@PostMapping(value="/goods/register")
	public String postGoodsRegister(GoodsVO vo, MultipartFile file) throws Exception{
	//add
	String imgUploadPath = uploadPath + File.separator + "imgUpload";
	String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
	String fileName = null;
	
	if(file != null) {
		fileName = UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);
	}else {
		fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
	}
	
	vo.setGdsImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
	vo.setGdsThumbImg(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
	//add end
		adminService.register(vo);
		return "redirect:/admin/index";
	}
	
	//상품목록
	@GetMapping(value="/goods/list")
	public void getGoodsList(Model model) throws Exception{
		logger.info("get goods list");
		List<GoodsVO> list = adminService.goodslist();
		model.addAttribute("list", list);
	}
	
	
	
	
	
	
	
	
	
	
}
