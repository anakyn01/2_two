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
}else{//입력이 안됬거나 빈 값이 있는지 체크한다 equals  는 객체끼리 내용을 비교합니다
   if(request.getParameter("bbsTitle")==null 
   || request.getParameter("bbsContent")==null 
   || request.getParameter("bbsTitle").equals("") 
   || request.getParameter("bbsContent").equals("")){   
      PrintWriter script = response.getWriter();
      script.println("<script>");
      script.println("alert('입력이 안된 사항이 있습니다')");
      script.println("history.back()");
      script.println("</script>");
   }else{
      //정상적으로 입력이 되었다면 글 수정 로직을 수행한다
      BbsDAO bbsDAO = new BbsDAO();
      int result = 
      bbsDAO.update(bbsID, request.getParameter("bbsTitle"),
      request.getParameter("bbsContent")
      );
      //데이터베이스 오류인 경우
      if(result == -1){
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('글 수정하기에 실패했습니다')");
         script.println("history.back()");
         script.println("</script>");
      }else{//글수정이 정상적으로 실행되면 알림창을 띄우고 게시판 메인으로 이동한다
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('글 수정하기 성공')");
         script.println("location.href='bbs.jsp'");
         script.println("</script>");
      }
   }
}















%>