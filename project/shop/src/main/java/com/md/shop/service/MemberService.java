package com.md.shop.service;

import javax.servlet.http.HttpSession;

import com.md.shop.domain.MemberVO;

public interface MemberService {
	//ȸ������ �ñ״�ó
	public void signup(MemberVO vo)throws Exception;
	//�α���
	public MemberVO signin(MemberVO vo)throws Exception;
	//�α׾ƿ�
	public void signout(HttpSession session)throws Exception;
}
