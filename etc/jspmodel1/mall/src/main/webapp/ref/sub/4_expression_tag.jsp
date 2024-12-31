<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.util.Date"
%>
<% int count=0; %>
Page Count is <%=++count%>
<p>Today's date: <%=new java.util.Date() %></p>
<%
int d=10; int e=20; int f=30;
//인클루드 파일로 다른 조각이 겹쳐도 동일한 변수는 허용이 되지 않는다
%>
<%=d+e+f%>