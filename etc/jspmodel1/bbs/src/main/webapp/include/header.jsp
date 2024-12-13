<!-- 
세션
-현재 접속한 한명의 회원에게 할당되는 고유한 ID
-웹서버는 한명의 회원을 세션 ID로 구분할수 있습니다
-로그인을 하면 세션이 부여되어서 로그인하지 않았을때와는 다른 화면을 제공할수 있습니다

 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- jsp standard tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 이문서에 가로크기는 디바이스(컴퓨터,태플릿,스마트폰)일때 마다 가로 크기가 같다 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="${contextPath}css/custom.css"/>
<script src="${contextPath}/js/js.js"></script>
<!-- 절대경로 설정 css, script --> 
</head>
<body class="">
<%
//어느 페이지나 이동을 했을때 세션에 값이 담겨있는지 체크

String userID = null;//1)값이 담겨져 있으면 안됨
//2)만약에 세션값이 존재한다면 
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}

int pageNumber = 1; //기본으로 1페이지 할당
/*만약 파라미터로 넘어온 오브젝트 타입 'pageNumber'가 존재한다면
확대캐스팅 자동[byte -> short -> char -> int -> long -> float -> double], 
작은캐스팅 수동[위에것을 거꾸로]]
int타입으로 캐스팅을 해주고 그 값을 pageNumber변수에 저장한다
*/
if(request.getParameter("pageNumber") != null){
   pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
}
%>
<!-- GNB -->
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
	<div class="container-fluid"><!-- width:100% -->
	<a class="navbar-brand" href="${contextPath}/login.jsp">
	bbs
	</a>
	<!-- 아디다스 -->
	<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mynavbar">
	<span class="navbar-toggler-icon"></span>
	</button>
	
	<!-- 메뉴 -->
	<div class="collapse navbar-collapse" id="mynavbar">
	<ul class="navbar-nav me-auto">
		<li class="nav-item">
		 <a class="nav-link" href="main.jsp">메인</a>
		</li>
		<li class="nav-item">
		 <a class="nav-link" href="bbs.jsp">게시판</a>
		</li>
		<!--  <li class="nav-item">
		 <a class="nav-link" href="#">Link</a>
		</li>-->
	</ul>
	<form class="d-flex">
	<input class="form-control me-2" type="text" placeholder="Search">
	<input type="submit" class="btn btn-primary" value="Search">
	</form>
	<%
	//로그인 하지 않았을때 보여지는 화면
	if(userID == null){
	%>
	<ul class="nav justify-content-end">
		<li class="nav-item dropdown">
		<a href="#" class="nav-link dropdown-toggle text-white" data-bs-toggle="dropdown">접속</a>
			<ul class="dropdown-menu"><!-- 드롭다운 아이템 영역 -->
				<li class="active">
					<a href="login.jsp" class="dropdown-item nav-link active">
					로그인
					</a>
				</li>
				<li>
					<a href="join.jsp" class="dropdown-item">
					회원가입
					</a>
				</li>
			</ul>
		</li>
	</ul>
	<%
	}else{ //로그인이 되어있는 상태에서 보여지는 화면
	%>
	<ul class="nav justify-content-end">
		<li class="nav-item dropdown">
		<a href="#" class="nav-link dropdown-toggle text-white" data-bs-toggle="dropdown">회원관리</a>
			<ul class="dropdown-menu"><!-- 드롭다운 아이템 영역 -->
				<li>
					<a href="logoutAction.jsp" class="dropdown-item">
					로그아웃
					</a>
				</li>
			</ul>
		</li>
	</ul>
	<%
	}
	%>
	</div>	
	</div>

</nav>