package com.md.shop.service;

import java.util.List;

import com.md.shop.domain.CartListVO;
import com.md.shop.domain.CartVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.domain.ReplyListVO;
import com.md.shop.domain.ReplyVO;

public interface ShopService {

	
	
	GoodsViewVO goodsView(int gdsNum) throws Exception;

	void registReply(ReplyVO reply) throws Exception;

	List<ReplyListVO> replyList(int gdsNum) throws Exception;

	List<GoodsViewVO> list(int cateCode, int level) throws Exception;
	
	public void deleteReply(ReplyVO reply)throws Exception;
	
	public String idCheck(int repNum) throws Exception;
	
	public void modifyReply(ReplyVO reply) throws Exception;
	
	public void addCart(CartVO cart) throws Exception;
	
	//카트리스트
	public List<CartListVO> cartList(String userId) throws Exception;
	
	
	
	
	

}
