<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value='<%=request.getParameter("language") %>'/>
<fmt:bundle basename="bundle.message">
<div class="container py-4">

<div class="p-5 mb-4 bg-body-secondary rounded-3">
	<div class="container-fluid py-5">
	<h1 class="display-5 fw-bold"><fmt:message key="title"/></h1>
	<p class="col-md-8 fs-4">Book Addition</p>
</div>

<!-- 데이터 베이스 입력영역 -->
<div class="row">
<div class="text-end">
<a href="?language=ko">Korea</a> | <a href="?language=en">English</a>
</div>
<form name="newBook" action="processAddBook.jsp" method="post" class="" enctype="multipart/form-data">

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="bookId"/></label>
	<div class="col-sm-10">
	<input type="text" name="bookId" class="form-control" >

	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="name"/></label>
	<div class="col-sm-10">
	<input type="text" name="name" class="form-control" >
		
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="unitPrice"/></label>
	<div class="col-sm-10">
	<input type="text" name="unitPrice" class="form-control" >
		
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="author"/></label>
	<div class="col-sm-10">
	<input type="text" name="author" class="form-control" >
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="publisher"/></label>
	<div class="col-sm-10">
	<input type="text" name="publisher" class="form-control" >
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="releaseDate"/></label>
	<div class="col-sm-10">
	<input type="text" name="releaseDate" class="form-control" >
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="description"/></label>
	<div class="col-sm-10">
	<textarea name="description" rows="2" class="form-control" placeholder="100자 이상 적어주세요" ></textarea>
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="category"/></label>
	<div class="col-sm-10">
	<input type="text" name="category" class="form-control" >
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="unitsInStock"/></label>
	<div class="col-sm-10">
	<input type="text" name="unitsInStock" class="form-control" >
	
	
	</div>
</div>

<div class="mb-3 row">
	<label class="col-sm-2"><fmt:message key="condition"/></label>
	<div class="col-sm-10">
	<input type="radio" name="condition" value="New"><fmt:message key="condition_New"/>
	<input type="radio" name="condition" value="Old"><fmt:message key="condition_Old"/>
	<input type="radio" name="condition" value="EBook"><fmt:message key="condition_Ebook"/>
	
	
	</div>
</div>

<div class="mb-3 row">
<label class="col-sm-2"><fmt:message key="bookImage"/></label>
<div class="col-sm-10">
<input type="file" name="BookImage" class="form-control">
</div>
</div>

<div class="mb-3 row">
	<div class="col-sm-12">
<div class="d-flex justify-content-end">
<input type="submit" class="btn btn-primary btn-lg" value='<fmt:message key="button"/>'/>
</div>
	</div>
</div>


</form>

</div>

</div>
</fmt:bundle>
<%@ include file="include/footer.jsp" %>