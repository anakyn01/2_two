<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! //선언문 태그를 사용하여 자바변수와 메소드를 정의
int count = 3;
String makeItLower(String data){
	return data.toLowerCase();//소문자로 
}
%><!-- 선언문 -->

<%
//선언한걸 여기서 사용 <=라스트인덱스도 포함
for(int i = 1; i <= count; i++){
	out.println("java Server pages" + i + "<br>");
}
%><!-- 스크립틀릿 -->

<%=
makeItLower("또 헬로월드")
%><!-- 익스프레션 -->