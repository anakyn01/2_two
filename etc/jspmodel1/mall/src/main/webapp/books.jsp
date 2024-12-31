<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp" flush="false"/>
<%@ page import="java.util.ArrayList, mall.dto.Book, mall.dao.BookRepository" %>
<%--<jsp:useBean id="bookDAO" class="mall.dao.BookRepository" scope="session"/> --%>
<div class="container py-4">
	<div class="p-5 mb-4 bg-body-tertiary rounded-3">
		<div class="container-fluid py-5">
			<h1 class="display-5 fw-bold">만화목록</h1>
			<p class="col-md-8 fs-4">아니메리스트</p>
		</div>
	</div>
	
<%-- useBean 사용일때  <%ArrayList<Book> listOfBooks = bookDAO.getAllBooks();	%>--%>	
<%
BookRepository dao = BookRepository.getInstance();
ArrayList<Book> listOfBooks = dao.getAllBooks();
%>
<div class="row align-items-md-stretch text-center">
<%
for (int i=0; i < listOfBooks.size(); i++){
	Book book = listOfBooks.get(i);
%>
<div class="col-md-4">
	<div class="h-100 p-2">
<h5 class="titleShot mb-2">
<div class="my-2">
<img src="./images/<%=book.getFilename() %> " class='img-thumbnail rectSizeOne'/>
</div>
<b><%=book.getName() %></b></h5>
<p><%=book.getAuthor() %>
<p><%=book.getPublisher()%> | <%=book.getUnitPrice()%>원
<p><%=book.getDescription() %><!-- .substring(0,50) -->
<!-- 글자를 잘라서 붙임(start, last) -->
<p><%=book.getUnitPrice() %>원	
<p><a href="./book.jsp?id=<%=book.getBookId() %>" class="btn btn-secondary">
상세 정보 &raquo;</a>
	</div>
</div>
<%} %>
</div>
</div>
<jsp:include page="include/footer.jsp" flush="false"/>