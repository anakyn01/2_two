package com.md.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.md.shop.domain.CartListVO;
import com.md.shop.domain.CartVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.domain.ReplyListVO;
import com.md.shop.domain.ReplyVO;
import com.md.shop.persistence.ShopDAO;

@Service
public class ShopServiceImpl implements ShopService{

	@Inject
	private ShopDAO dao;
	
	@Override
	public List<GoodsViewVO> list (int cateCode, int level) throws Exception{
		int cateCodeRef=0;
		if(level == 1) {
			cateCodeRef = cateCode;
			return dao.list(cateCode, cateCodeRef);
		}else {
			return dao.list(cateCode);
		}
		
	}
	
	//read
	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception{
		return dao.goodsView(gdsNum);
	}
	
	//상품소감 댓글작성
	@Override
	public void registReply(ReplyVO reply) throws Exception{
		dao.registReply(reply);
	}
	
	//상품소감 댓글리스트
    @Override
    public List<ReplyListVO> replyList(int gdsNum)throws Exception{
    	return dao.replyList(gdsNum);
    }

	@Override
	public void deleteReply(ReplyVO reply) throws Exception {
		dao.deleteReply(reply);
		
	}

	@Override
	public String idCheck(int repNum) throws Exception {
		return dao.idCheck(repNum);
	}

	@Override
	public void modifyReply(ReplyVO reply) throws Exception {
		dao.modifyReply(reply);
		
	}

	@Override
	public void addCart(CartVO cart) throws Exception {
		dao.addCart(cart);		
	}

	@Override
	public List<CartListVO> cartList(String userId) throws Exception {
		return dao.cartList(userId);
	}


	
	
	
	
	
	
	
}
