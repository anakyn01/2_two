package com.md.shop.service;

import java.util.List;

import com.md.shop.domain.CategoryVO;
import com.md.shop.domain.GoodsVO;
import com.md.shop.domain.GoodsViewVO;

public interface AdminService {

	public List<CategoryVO> category() throws Exception;
	
	//상품등록
	public void register(GoodsVO vo) throws Exception;

	//목록
	List<GoodsVO> goodslist() throws Exception;
	
	//view
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	//edit
	public void goodsModify(GoodsVO vo) throws Exception;
	
	//delete
	public void goodsDelete(int gdsNum) throws Exception;
		
}
