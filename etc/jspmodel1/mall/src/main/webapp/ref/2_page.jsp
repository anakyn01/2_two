<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="java.util.*"
%>
<%@ include file="include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>디렉티브 태그</h1>
<pre>
디렉티브 태그의 종류
- page : 페이지에 대한 정보설정
- include : 특정영역에 다른 문서를 포함한다
- taglib : 태그라이브러리를 설정한다
</pre>
<h1 class="my-3">page 디렉티브 태그</h1>
<%@ include file="sub/5_tag.jsp" %>
<h1>실습</h1>
<%@ include file="sub/5_tag_run.jsp" %>
<h1>jstl</h1>
<%@ include file="sub/6_jstl.jsp" %>
<pre>
jstl 형식 : uri="경로" prefix="태그식별자"
</pre>
<%@ include file="sub/7_jstl.jsp" %>











<%@ include file="sub/7_jstl.jsp" %>


</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>