package com.md.shop.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.md.shop.domain.CategoryVO;
import com.md.shop.domain.GoodsVO;
import com.md.shop.domain.GoodsViewVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Inject
	private SqlSession sql;
	
	//Îß§Ìçº
	private static String namespace = "com.md.shop.mappers.adminMapper";

	@Override//
	public List<CategoryVO> category() throws Exception {
		return sql.selectList(namespace + ".category");
	}

	@Override//ªÛ«∞µÓ∑œ
	public void register(GoodsVO vo) throws Exception {
		sql.insert(namespace + ".register", vo);
		
	}

	@Override
	public List<GoodsVO> goodslist() throws Exception {
		return sql.selectList(namespace + ".goodslist");
	}

	@Override
	public GoodsViewVO goodsView(int gdsNum) throws Exception {
		return sql.selectOne(namespace+".goodsView",gdsNum);
	}

	@Override
	public void goodsModify(GoodsVO vo) throws Exception {
		sql.update(namespace+".goodsModify", vo);
	}

	@Override
	public void goodsDelete(int gdsNum) throws Exception {
		sql.delete(namespace + ".goodsDelete",gdsNum);
	}

}
