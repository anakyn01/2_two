<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>out 내장객체 => 출력스트림 객체</h1>
<jsp:include page="sub/out.jsp" flush="false"/>

<h1>요청파라미터 값 출력하기</h1>
<form action="sub/process.jsp" method="POST">
<p>이름 : <input type="text" name="name">
<p>전번 : <input type="tel" name="tel">
<p>비밀번호 : <input type="password" name="pwd"/>

<input type="submit" value="전송">
</form>

<h1>login</h1>
<form action="sub/response_process.jsp" method="post">
아디 : <input type="text" name="id"/>
패스 : <input type="password" name="passwd">
<p><input type="submit" value="전송">

</form>

<h1>내장 객체(implicit object)</h1>
<pre>
- jsp패이지에서 사용할수 있도록 jsp컨테이너가 미리정의된 객체로 그종류가 다양합니다
</pre>
<jsp:include page="sub/objectTable.jsp" flush="false"/>
<h1>속성 처리 메소드의 종류</h1>
<jsp:include page="sub/attr.jsp" flush="false"/>
<h1>request 내장객체</h1>
<jsp:include page="sub/request.jsp" flush="false"/>
</div>
</div>
</div>
<%@ include file="include/footer.jsp" %>