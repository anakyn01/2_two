<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<%@ page import="java.util.Date" %>
<%!
String greeting = "Welcome to shopping Mall";

String tagline = "welcome to Web Market!";
%>
<div class="p-5 mb-4 bg-body-tertiary rounded-3">
	<div class="container-fluid py-5">
	<h1 class="display-5 fw-bold"><%=greeting %></h1>
	<p class="col-md-8 fs-4">Market</p>
	</div>
</div>

<div class="row align-items-md-stretch text-center">
	<div class="col-md-12">
		<div class="h-100 p-5">
			<h3><%=tagline %></h3>
<%
Date day = new java.util.Date();//Date클래스 인스턴스 day설정
String am_pm;
int hour = day.getHours();//시
int minute = day.getMinutes();//분
int second = day.getSeconds();//초

if (hour /12 == 0){//현재시각이 12이하이면 AM
	am_pm = "AM";
}else{//12를 초과하면 PM
	am_pm = "PM";
	hour = hour - 12;
}
String CT = hour + ":" + minute + ":" + second + " " + am_pm;
out.println("현재 접속시각 : " + CT + "</br>");

%>
		</div>
	</div>
</div>




<%@ include file="../include/footer.jsp" %>