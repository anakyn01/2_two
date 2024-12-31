<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${contextPath}/css/style.css"/>
<title></title>
</head>
<body>

<header class="navbar navbar-expand-sm bg-light">
   <div class="container-fluid">

         <a href="${contextPath}/welcome.jsp" class="navbar-brand">
            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path d="M12 6.453l9 8.375v9.172h-6v-6h-6v6h-6v-9.172l9-8.375zm12 5.695l-12-11.148-12 11.133 1.361 1.465 10.639-9.868 10.639 9.883 1.361-1.465z"/></svg>
            <span class="fs-4">Home</span>
         </a>
  
		  <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
		  	<span class="navbar-toggler-icon"></span>
		  </button>
		  
		  <div class="collapse navbar-collapse" id="collapsibleNavbar">
			  <ul class="navbar-nav">
				<li class="nav-item">
					<a href="${contextPath}/books.jsp" class="nav-link">shop</a>
				</li>  
				<li class="nav-item">
					<a href="${contextPath}/add.jsp" class="nav-link">등록</a>
				</li>
			  	<li class="nav-item">
					<a href="${contextPath}/ref/1_scripttag.jsp" class="nav-link">JSP 레퍼런스</a>
				</li>
			  </ul>  
		  </div>
  
     
      </div>
      
      

</header>
<div class="container py-4">













