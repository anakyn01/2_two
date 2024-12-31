<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="mall.dto.Book, mall.dao.BookRepository"
%>
<%--<jsp:useBean id="bookDAO" class="mall.dao.BookRepository" scope="session"/> --%>
<%@ include file="include/header.jsp" %>
<div class="container py-4">

    <div class="p-5 mb-4 bg-body-tertiary rounded-3">
        <div class="container-fluid py-5">
            <h1 class="display-5 fw-bold">상세정보</h1>
            <p class="col-md-8 fs-4">Info</p>
        </div>
    </div>
<%
String id = request.getParameter("id");
//add
BookRepository dao = BookRepository.getInstance();
/*Book book = bookDAO.getBookById(id);*/
Book book = dao.getBookById(id);
%>
<div class="row align-items-md-stretch">
<div class="col-md-12">
<div class="text-center">

<div class="d-flex align-items-center">
<img src="images/<%=book.getFilename()%>" class="img-thumbnail rectSizeOne"/>
<h3 class="my-5"><b><%=book.getName()%></b></h3>
</div>

<div class="my-5">
<div class="p-5 my-5"><%=book.getDescription()%></div>
<b>도서코드</b><span class="badge text-bg-danger"><%=book.getBookId()%></span>
<b>저자</b>:<%=book.getAuthor()%>
<b>출판사</b>:<%=book.getPublisher()%>
<b>출판일</b>:<%=book.getReleaseDate()%>
<b>분류</b>:<%=book.getCategory()%>
<b>재고</b>:<%=book.getUnitsInStock()%>
<h4><%=book.getUnitPrice()%>원</h4>
</div>
</div>
<div class="d-flex justify-content-center my-5">
    <div class="btn-group">
        <a href="#" class="btn btn-info">도서주문</a>
        <a href="./books.jsp" class="btn btn-secondary">도서목록</a>
    </div>
</div>
</div>

</div>

</div>
<%@ include file="include/footer.jsp" %>