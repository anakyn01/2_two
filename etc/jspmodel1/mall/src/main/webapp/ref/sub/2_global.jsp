<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h1 class="display-1">Page Count is:</h1>
<%
out.print("<h1 class='text-danger'>" + myMethod(0) + "</h1>");
out.println("2 + 3 = " +  sum(2,3));
%>
<!-- 선언문 -->
<%!
public int myMethod(int count){
	return ++count;
	/*전위전산자[값이 먼저 증가하고 작업수행] 후위연산자[작업이 수행된 후에 값이 증가]*/
}

int sum(int a, int b){
	return a + b;
}
%>