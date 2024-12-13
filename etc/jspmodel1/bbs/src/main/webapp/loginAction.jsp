<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.io.PrintWriter, user.UserDAO"
%>
<% request.setCharacterEncoding("utf-8");%><!-- 스크립 틀릿 -->
<!-- 캐릭터 인코딩 설정 -->
<jsp:useBean id="user" class="user.User" scope="page"/>
<jsp:setProperty name="user" property="userID"/>
<jsp:setProperty name="user" property="userPassword"/>
<%
String userID = null;
if(session.getAttribute("userID") != null){
   userID = (String)session.getAttribute("userID");
}
//이미 로그인을 햇으면 다시 로그인 할수 없게 만든다
if(userID != null){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('이미로그인이 되어 있습니다')");
   script.println("location.href='main.jsp' ");
   script.println("</script>");
}

UserDAO userDAO = new UserDAO();
int result = userDAO.login(user.getUserID(), user.getUserPassword());
if(result == 1) {
   //add 세션이란 로그인을 하는 순간 그유저를 식별하는 유일한 수단
   session.setAttribute("userID", user.getUserID());
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('로그인 성공')");
   script.println("location.href='main.jsp' ");
   script.println("</script>");
}else if(result == 0) {
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('비밀번호가 틀립니다')");
   script.println("history.back()");
   script.println("</script>");
}else if(result == -1){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('존재하지 않는 아이디 입니다')");
   script.println("history.back()");
   script.println("</script>");
}else if(result == -2){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('데이터베이스 오류 입니다')");
   script.println("history.back()");
   script.println("</script>");
}











%>