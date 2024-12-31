package com.md.shop.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.md.shop.domain.CartListVO;
import com.md.shop.domain.CartVO;
import com.md.shop.domain.GoodsViewVO;
import com.md.shop.domain.ReplyListVO;
import com.md.shop.domain.ReplyVO;

@Repository
public class ShopDAOImpl implements ShopDAO {
	
	@Inject
	private SqlSession sql;

	//����
	private static String namespace ="com.md.shop.mappers.shopMapper";
	
	//ī�װ��� ��ǰ����Ʈ
	@Override
	public List<GoodsViewVO> list(int cateCode, int cateCodeRef) throws Exception{
		HashMap<String, Object> map = new HashMap<>();
		map.put("cateCode", cateCode);
		map.put("cateCodeRef", cateCodeRef);
		return sql.selectList(namespace + ".list_1", cateCode);
	}
	@Override
	public List<GoodsViewVO> list(int cateCode) throws Exception{
		return sql.selectList(namespace + ".list_2", cateCode);
	}
	//read
	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception{
		return sql.selectOne(namespace + ".goodsView", gdsNum);
	}
	
	//��ǰ �Ұ�(���) �ۼ�
	@Override
	public void registReply(ReplyVO reply) throws Exception{
		sql.insert(namespace + ".registReply", reply);
	}
	
	//��ǰ �Ұ�(���)����Ʈ
	@Override
	public List<ReplyListVO> replyList(int gdsNum) throws Exception{
		return sql.selectList(namespace + ".replyList", gdsNum);
	}
	
	@Override
	public void deleteReply(ReplyVO reply)throws Exception{
		sql.delete(namespace+".deleteReply",reply);
	}
	
	@Override
	public String idCheck(int repNum)throws Exception{
		return sql.selectOne(namespace+".replyUserIdCheck",repNum);
	}
	@Override
	public void modifyReply(ReplyVO reply) throws Exception {
		sql.update(namespace + ".modifyReply", reply);		
	}
	@Override
	public void addCart(CartVO cart) throws Exception {
		sql.insert(namespace + ".addCart", cart);
		
	}
	@Override
	public List<CartListVO> cartList(String userId) throws Exception {
		return sql.selectList(namespace + ".cartList", userId);
	}
	
	
	
	
	
}
