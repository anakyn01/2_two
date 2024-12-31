<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="user.UserDAO" %>
<% request.setCharacterEncoding("utf-8"); %><!-- 입출력 한글강제 설정 -->
<jsp:useBean id="user" class="user.User" scope="page"/>
<jsp:setProperty name="user" property="userID"/>
<jsp:setProperty name="user" property="userPassword"/>
<jsp:setProperty name="user" property="userName"/>
<jsp:setProperty name="user" property="userGender"/>
<jsp:setProperty name="user" property="userEmail"/>

<%
String userID = null;
if(session.getAttribute("userID") != null){
userID = (String)session.getAttribute("userID");
}
//이미 로그인 했으면 다시 회원가입을 할수 없게 만든다
if(userID != null){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('이미 로그인이 되어 있습니다')");
   script.println("location.href='main.jsp'");
   script.println("</script>");
}


if(user.getUserID() == null || user.getUserPassword() == null || user.getUserName() == null || user.getUserGender() == null || user.getUserEmail() == null){
//만약 다섯개의 항목이 누락되고 그중하나라도 누락이 된다면
PrintWriter script = response.getWriter();
script.println("<script>");
script.println("alert('입력이 안된 사항이 있습니다')");
script.println("history.back()");
script.println("</script>");
}else{
   UserDAO userDAO = new UserDAO();
   int result = userDAO.join(user);
   if(result == -1){
      PrintWriter script = response.getWriter();
      script.println("<script>");
      script.println("alert('이미존재하는 아이디 입니다')");
      script.println("history.back()");
      script.println("</script>");
   }else{
      PrintWriter script = response.getWriter();
      script.println("<script>");
      script.println("alert('회원가입 성공')");
      script.println("location.href='main.jsp'");
      script.println("</script>");
   }
}










%><!-- 자바코드를 jsp에 internal {% %}-->