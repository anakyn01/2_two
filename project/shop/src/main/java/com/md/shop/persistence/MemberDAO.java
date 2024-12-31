package com.md.shop.persistence;

import com.md.shop.domain.MemberVO;

public interface MemberDAO {


	public void signup(MemberVO vo)throws Exception;

	public MemberVO signin(MemberVO vo)throws Exception;
	
}
