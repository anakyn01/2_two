<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.io.PrintWriter, bbs.Bbs, bbs.BbsDAO"
%>
<%
/*bbsId를 초기화 시키고 bbsId라는 데이터가 넘어온것이 존재한다면
캐스팅하여 변수에 담는다 
parseInt : 문자열을 파싱[구문분석]하여 특정진수의 정수로 리턴
*/
int bbsID = 0;
if(request.getParameter("bbsID") != null){
bbsID = Integer.parseInt(request.getParameter("bbsID"));
}
//만약 넘어온 데이터가 없다면
if(bbsID == 0){
PrintWriter script = response.getWriter();
script.println("<script>");
script.println("alert('유효하지 않은 글 입니다')");
script.println("location.href='bbs.jsp'");
script.println("</script>");
}
Bbs bbs = new BbsDAO().getBbs(bbsID);
%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>update</h1>
<form method="post" action="updateAction.jsp?bbsID=<%=bbsID%>">
<table class="table">
   <colgroup>
      <col style="width:15%">
      <col style="width:85%">
   </colgroup>
   <tr>
      <th>글제목</th>
      <td>
      <input 
      type="text" 
      class="form-control" 
      name="bbsTitle"
      value="<%=bbs.getBbsTitle()%>"
      />
      </td>
   </tr>
   <tr>
      <th>내용</th>
      <td>
<textarea class="form-control" name="bbsContent"><%=bbs.getBbsContent() %></textarea>
      </td>
   </tr>
</table>

<div class="d-flex justify-content-end mt-5">
<input type="submit" class="btn btn-outline-primary" value="수정하기"/>
</div>

</form>











<pre>
</pre>
<script src=""></script>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>