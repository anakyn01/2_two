<%@ page import="java.io.PrintWriter" %>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%
//현재 세션상태를 체크한다
String userID = null;
if(session.getAttribute("userID") != null){
   userID = (String)session.getAttribute("userID");
}
//로그인 한 사람만 글을 쓸 수 있도록 한다
if(userID == null){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('로그인을 하세요')");
   script.println("location.href='login.jsp'");
   script.println("</script>");
}

int bbsID = 0;
if(request.getParameter("bbsID") != null){
   bbsID = Integer.parseInt(request.getParameter("bbsID"));
}
if(bbsID == 0){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('유효하지 않은 글 입니다')");
   script.println("location.href='bbs.jsp'");
   script.println("</script>");
}
Bbs bbs = new BbsDAO().getBbs(bbsID);
if(!userID.equals(bbs.getUserID())){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('권한이 없습니다')");
   script.println("location.href='bbs.jsp'");
   script.println("</script>");
}else{//글 삭제 로직을 수행합니다
	BbsDAO bbsDAO = new BbsDAO();
int result = bbsDAO.delete(bbsID);
	if(result == -1){
		PrintWriter script = response.getWriter();
		   script.println("<script>");
		   script.println("alert('글 삭제하기 실패')");
		   script.println("history.back()");
		   script.println("</script>");
	}else{
		PrintWriter script = response.getWriter();
		   script.println("<script>");
		   script.println("alert('글 삭제 완료')");
		   script.println("location.href='bbs.jsp'");
		   script.println("</script>");
	}
  
   
}















%>