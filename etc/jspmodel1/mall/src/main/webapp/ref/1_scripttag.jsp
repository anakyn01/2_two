<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>스크립트 태그</h1>
<pre>
- jsp태그 -
jsp는 태그를 이용하여 문법을 기술합니다
jsp태그는 크게 스크립트 태그[html코드에 자바코드] 
디렉티브 태그[jsp페이지를 어떻게 처리할것인지를 설정] 
액션 태그로 나뉩니다
스크립트 태그의 종류
선언문(declaration)<%--   <%! %>   --%>
스크립틀릿(scriptlet)<%--   <% %>   --%>
표현문(expression)<%--   <%= %>   --%>
</pre>
<h1>선언문,스크립틀릿,표현식의 예시</h1>
<%@ include file="sub/1_script.jsp" %>
<h1>전역 메소드 선언</h1>
<pre>
- 변수뿐만 아니라 메소드도 선언할수 있다
- 서블릿 프로그램으로 변환할때 _jspService()메소드 외부에 배치된다
</pre>
<%@ include file="sub/2_global.jsp" %>
<h1>스크립틀릿</h1>
<pre>
- 메소드 없이 변수만을 선언할수 있다
- 서블릿 프로그램으로 변환할때 _jspService()메소드 내부에 배치된다
</pre>
<%@ include file="sub/3_scriptlet.jsp" %>
<h1>익스프레션</h1>
<pre>
- 선언문 태그 또는 스크립틀릿 태그에서 선언된 변수나 메소드의 리턴값을 출력
- 기본데이터 타입은 toString()을 통해 출력되고
- 각행을 세미콜론으로 종료할수 없습니다
</pre>
<%@ include file="sub/4_expression_tag.jsp" %>








</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>