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
//유효한 글이라면 구체적인 정보를 'bbs' 라는 인스턴스에 담아준다
Bbs bbs = new BbsDAO().getBbs(bbsID);
%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-3">view</h1>

<ul class="breadcrumb">
	<li class="breadcrumb-item">
		<svg width="24" height="24" xmlns="http://www.w3.org/2000/svg" fill-rule="evenodd" clip-rule="evenodd"><path d="M22 11.414v12.586h-20v-12.586l-1.293 1.293-.707-.707 12-12 12 12-.707.707-1.293-1.293zm-6 11.586h5v-12.586l-9-9-9 9v12.586h5v-9h8v9zm-1-7.889h-6v7.778h6v-7.778z"/></svg>
	</li>
	<li class="breadcrumb-item">
		<a href="bbs.jsp">
		list
		</a>
	</li>
	<li class="breadcrumb-item active">
	view
	</li>
</ul>

<table class="table">
	<colgroup>
	<col style="width:15%">
	<col style="width:85%">
	</colgroup>
	<tr>
	<th>제목</th>
	<td><%=bbs.getBbsTitle().replaceAll(" ","&nbsp").replaceAll(">","&gt").replaceAll("\n","<br>")%></td>
	</tr>
	
	<tr>
	<th>작성자</th>
	<td><%=bbs.getUserID() %></td>
	</tr>
	
	<tr>
	<th>작성일자</th>
	<td><%=bbs.getBbsDate().substring(0,11)+bbs.getBbsDate().substring(11, 13)+"시" + bbs.getBbsDate().substring(14,16) + "분"%></td>
	</tr>
	
	<tr>
	<th>내용</th>
	<td><%=bbs.getBbsContent().replaceAll(" ","&nbsp").replaceAll(">","&gt").replaceAll("\n","<br>") %></td>
	</tr>

</table>
<!-- 세션일때 -->
<div class="d-flex justify-content-end mt-5">
<%
if(userID != null && userID.equals(bbs.getUserID())){
%>
	<div class=" btn-group">
		<a href="bbs.jsp" class="btn btn-outline-primary">
		list
		</a>
		<a href="update.jsp?bbsID=<%=bbsID %>" class="btn btn-outline-success">
		update
		</a>
		<a href="deleteAction.jsp?bbsID=<%=bbsID %>" class="btn btn-outline-danger">
		delete
		</a>		
	</div>
<%} %>
</div>


<pre>
</pre>
<script src=""></script>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>