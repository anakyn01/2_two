<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
String userid = request.getParameter("id");
String password = request.getParameter("passwd");

if (userid.equals("백수") && password.equals("1234")){
	response.sendRedirect("success.jsp");
}else{
	response.sendRedirect("fail.jsp");
}
%>