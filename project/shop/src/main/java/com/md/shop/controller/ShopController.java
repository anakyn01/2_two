package com.md.shop.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.md.shop.domain.CartListVO;
import com.md.shop.domain.CartVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.domain.MemberVO;
import com.md.shop.domain.ReplyListVO;
import com.md.shop.domain.ReplyVO;
import com.md.shop.service.ShopService;

@Controller
@RequestMapping("/shop/*")
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Inject
	ShopService service;

	@GetMapping(value="/")
	public String home() {
		return "home";
	}
	
	//ī�װ��� ��ǰ ����Ʈ
	@GetMapping("/list")
	public void getList(@RequestParam("c") int cateCode, @RequestParam("l") int level, Model model) throws Exception{
		logger.info("get list");
		
		List<GoodsViewVO> list = null;
		list = service.list(cateCode, level);
		
		model.addAttribute("list", list);
	}
	
	@GetMapping("/view")
	public void getView(@RequestParam("n") int gdsNum, Model model) throws Exception{
		logger.info("get view");
		
		GoodsViewVO view = service.goodsView(gdsNum);
		model.addAttribute("view", view);
		
		//add list
		/*List<ReplyListVO> reply = service.replyList(gdsNum);
		model.addAttribute("reply", reply);*/
		
	}
	@ResponseBody
	@GetMapping("/view/replyList")
	public List<ReplyListVO> getReplyList(@RequestParam("n") int gdsNum) throws Exception{
		logger.info("get reply list");
		List<ReplyListVO> reply = service.replyList(gdsNum);
		return reply;
	}
	
	@ResponseBody
	@PostMapping(value = "/view/registReply")
	public void registReply(ReplyVO reply, HttpSession session) throws Exception{
		logger.info("regist reply");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		//���ǿ��� �α����� ����� �˻�
		reply.setUserId(member.getUserId());
		//��ۿ� ���� ����� ID����
		service.registReply(reply);

		//��ǰ���� �������� ���𷺼��ϰ� ���� �Ű������� ��ǰ�� ��ǰ��ȣ�� �Ű������� �߰���
	}
	
	//��ǰ�Ұ� ����
	@ResponseBody
	@PostMapping(value = "/view/deleteReply")
	public int getReplyList(ReplyVO reply, HttpSession session) throws Exception{
		logger.info("post delete reply");
		
		 int result = 0;
		 
		 MemberVO member = (MemberVO)session.getAttribute("member");
		 String userId = service.idCheck(reply.getRepNum());
		   
		 if(member.getUserId().equals(userId)) {
		  
		  reply.setUserId(member.getUserId());
		  service.deleteReply(reply);
		  
		  result = 1;
		 }
		 return result;
	}
	
	//����
	// ��ǰ �Ұ�(���) ����
	@ResponseBody
	@RequestMapping(value = "/view/modifyReply", method = RequestMethod.POST)
	public int modifyReply(ReplyVO reply, HttpSession session) throws Exception {
	 logger.info("modify reply");
	 
	 int result = 0;
	 
	 MemberVO member = (MemberVO)session.getAttribute("member");
	 String userId = service.idCheck(reply.getRepNum());
	 
	 if(member.getUserId().equals(userId)) {
	  
	  reply.setUserId(member.getUserId());
	  service.modifyReply(reply);
	  result = 1;
	 }
	 
	 return result;
	}
	
	
	/*@PostMapping("/view")//��� �ּ�
	public String registReply(ReplyVO reply, HttpSession session) throws Exception{
		//ReplyVO reply ��� ��ۿ� �� ���� ������ 
		//HttpSession session ���ǰ�ü�� ����Ͽ� �α����� ������ Ư�� ����� ���̵� �˻�
		logger.info("regist reply");
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		//���ǿ��� �α����� ����� �˻�
		reply.setUserId(member.getUserId());
		//��ۿ� ���� ����� ID����
		service.registReply(reply);
		//���� ������ ȣ���Ͽ� ������ ���
		return "redirect:/shop/view?n="+reply.getGdsNum();
		//��ǰ���� �������� ���𷺼��ϰ� ���� �Ű������� ��ǰ�� ��ǰ��ȣ�� �Ű������� �߰���
	}*/
	
	// īƮ ���
	@ResponseBody
	@RequestMapping(value = "/view/addCart", method = RequestMethod.POST)
	public int addCart(CartVO cart, HttpSession session) throws Exception {
		
	 int result = 0;
	 
	 MemberVO member = (MemberVO)session.getAttribute("member");
	 
	 if(member != null) {
		 cart.setUserId(member.getUserId());
		 service.addCart(cart);
		 result = 1;
	 }
	 return result;
	 
	}
	
	// īƮ ���
	@RequestMapping(value = "/cartList", method = RequestMethod.GET)
	public void getCartList(HttpSession session, Model model) throws Exception {
	 logger.info("get cart list");
	 
	 MemberVO member = (MemberVO)session.getAttribute("member");
	 String userId = member.getUserId();
	 
	 List<CartListVO> cartList = service.cartList(userId);
	 
	 model.addAttribute("cartList", cartList);
	 
	}
	
	
	
	
	
	
	
}
