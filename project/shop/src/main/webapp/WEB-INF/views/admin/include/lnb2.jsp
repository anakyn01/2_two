<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div id="accordion">
	<div class="card">
		<div class="card-header">
			<a class="btn" data-bs-toggle="collapse" href="#collapseOne">
			성별		
			</a>
		</div>
		<div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
		<div class="card-body">
		<a href="#" class="a-link">남성</a><br>
		<a href="#" class="a-link">여성</a><br>
		<a href="#" class="a-link">유니섹스</a><br>
		</div>
		</div>
 	</div>
 	
</div>