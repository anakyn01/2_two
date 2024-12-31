<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//지역변수 사용하기
int a = 2; int b = 3; int sum = a+b;
out.println("2 + 3 = " + sum);

//1부터 10까지 짝수 출력하기
for (int i=0; i<= 10; i++){
	if(i % 2 == 0)
		out.println(i + "<br>");
}
%>