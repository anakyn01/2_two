package com.md.shop.persistence;

import java.util.List;

import com.md.shop.domain.CategoryVO;
import com.md.shop.domain.GoodsVO;
import com.md.shop.domain.GoodsViewVO;

public interface AdminDAO {

	//ī�װ�
	public List<CategoryVO> category() throws Exception;
	
	//��ǰ���
	public void register(GoodsVO vo) throws Exception;
	
	//list
	public List<GoodsVO> goodslist() throws Exception;
	
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	public void goodsModify(GoodsVO vo) throws Exception;
	
	public void goodsDelete(int gdsNum) throws Exception;
}
