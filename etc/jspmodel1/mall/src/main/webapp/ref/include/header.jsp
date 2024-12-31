<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<title>jsp 레퍼런스</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${contextPath}/ref/css/style.css"/>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light">
<div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:8080/mall/welcome.jsp" >Home</a>
    <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mynavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse" id="mynavbar">
        <ul class="navbar-nav me-auto">
            <li class="nav-item">
                <a class="nav-link" href="1_scripttag.jsp">1_스크립트태그</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="2_page.jsp">2_페이지태그</a>
            </li>     
            <li class="nav-item">
                <a class="nav-link" href="3_action.jsp">3_액션태그</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="4_sass.jsp">4_sass</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="5_jquery.jsp">5_제이쿼리</a>
            </li>     
            <li class="nav-item">
                <a class="nav-link" href="6_object.jsp">6_내장객체</a>
            </li>     
        </ul>
    </div>
</div>
</nav>








