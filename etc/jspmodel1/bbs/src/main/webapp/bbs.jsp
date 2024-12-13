<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="java.util.ArrayList" %>

<%@ include file="include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-3">bbs</h1>
<div class="table-responsive-sm">
<table class="table table-hover"><!-- table-dark table-striped -->
	<colgroup>
		<col style="width:5%">
		<col style="width:70%">
		<col style="width:10%">
		<col style="width:15%">
	</colgroup>
	<thead>
		<tr>
		<th class="text-center">번호</th>
		<th class="text-center">제목</th>
		<th class="text-center">작성자</th>
		<th class="text-center">작성일</th>
		</tr>
	</thead>
	<tbody>
<%
BbsDAO bbsDAO = new BbsDAO(); //인스턴스 생성
ArrayList<Bbs> list = bbsDAO.getList(pageNumber);
for(int i=0; i < list.size(); i++){
%>
<tr>
<td class="text-center">
<%= list.get(i).getBbsID() %>
</td>
<td class="">
<a href="view.jsp?bbsID=<%=list.get(i).getBbsID()%>" class="">
<%=list.get(i).getBbsTitle() %>
</a>
</td>
<td class="text-center">
<%=list.get(i).getUserID() %>
</td>
<td class="text-center">
<%= list.get(i).getBbsDate().substring(0, 11) + list.get(i).getBbsDate().substring(11,13) + "시" + list.get(i).getBbsDate().substring(14,16)+"분" %>
</td>
</tr>
<%
}
%>

	</tbody>
</table>
<!-- 페이징 -->
<%
if(pageNumber !=1){
%>

<a href="bbs.jsp?pageNumber=<%=pageNumber -1 %>" class="btn btn-success">이전</a>
<%
}if(bbsDAO.nextPage(pageNumber + 1)){
%>
<a href="bbs.jsp?pageNumber=<%=pageNumber +1 %>" class="btn btn-success">다음</a>
<%
}
%>

<div class="d-flex justify-content-end my-5">

<a class="btn btn-outline-primary btn-lg" href="write.jsp">write</a>
</div>






</div>
</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>