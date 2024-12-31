package com.md.shop.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.md.shop.domain.MemberVO;

//��ð� �α��� ������� �α����� �Ǿ� ������ ��Ʋ�η� ��������ϰ� �ƴ϶�� ������ �������� �̵�
public class AdminInterceptor extends HandlerInterceptorAdapter{
/*
AdminInterceptor HandlerInterceptorAdapter�� ��ӹ޾Ƽ� 
��Ʈ�ѷ� ���� ���� ����Ǵ� preHandel�޼���� 
��Ʈ�ѷ� ���� �� ���صǴ� postHandle�� �����ϴ�
*/	
	
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		
		if(member == null) {//�α��� ���� ���� ����
			res.sendRedirect("/member/signin");
			return false;
		}
		if(member.getVerify() != 9) {//�α��� �� �˻�
			res.sendRedirect("/");
			return false;
		}
		
		return true;
	}

}
