<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="bbs" class="bbs.Bbs" scope="page"/>
<!--  id="자바빈스 식별이름" class="자바빈즈 이름" scope="범위"-->
<jsp:setProperty property="bbsTitle" name="bbs"/>
<jsp:setProperty property="bbsContent" name="bbs"/>

<%
//현재 세션상태를 체크
String userID = null;
if(session.getAttribute("userID") != null){//만약 세션이 존제 한다면
   userID = (String)session.getAttribute("userID");//userId를 얻는다
}
//로그인 한사람만 글을 쓸수 있도록한다
if(userID == null){
   PrintWriter script = response.getWriter();
   script.println("<script>");
   script.println("alert('로그인을 하세요')");
   script.println("location.href='login.jsp'");
   script.println("</script>");
}else{//입력이 안된 부분이 있는지 체크합니다
   if(bbs.getBbsTitle()==null || bbs.getBbsContent()==null){
      PrintWriter script = response.getWriter();
      script.println("<script>");
      script.println("alert('입력이 안된 사항이 있습니다')");
      script.println("history.back()");
      script.println("</script>");
   }else{//정상적으로 입력이 되었다면 글쓰기 로직을 수행한다
      BbsDAO bbsDAO = new BbsDAO();
   int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent());
      if(result == -1){//데이터베이스 오류인 경우
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('글쓰기에 실패 했습니다')");
         script.println("history.back()");
         script.println("</script>");
      }else{
         PrintWriter script = response.getWriter();
         script.println("<script>");
         script.println("alert('글쓰기 성공')");
         script.println("location.href='bbs.jsp'");
         script.println("</script>");
      }
   }
}










%>