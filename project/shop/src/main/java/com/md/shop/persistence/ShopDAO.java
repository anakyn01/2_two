package com.md.shop.persistence;

import java.util.List;

import com.md.shop.domain.CartListVO;
import com.md.shop.domain.CartVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.domain.ReplyListVO;
import com.md.shop.domain.ReplyVO;

public interface ShopDAO {

	//조회 디테일
	public GoodsViewVO goodsView(int gdsNum) throws Exception;

	//댓글
	void registReply(ReplyVO reply) throws Exception;
	
	//댓글 리스트
	public List<ReplyListVO> replyList(int gdsNum) throws Exception;

	List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception;

	List<GoodsViewVO> list(int cateCode) throws Exception;

	void deleteReply(ReplyVO reply) throws Exception;

	String idCheck(int repNum) throws Exception;
	
	public void modifyReply(ReplyVO reply) throws Exception;
	
	//카트담기
	public void addCart(CartVO cart) throws Exception;
	
	//카트 리스트
	public List<CartListVO> cartList(String userId) throws Exception;
	
	
	
	
	
	

}
