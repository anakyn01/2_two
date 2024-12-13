<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 페이지 디렉티브 -->
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1>
Classes
</h1>
<pre>
- ECMAScript에서 등장
- 클래스는 자바스크립트 객체용 템플릿
- syntax
class ClassName{
  constructor(name, year){
  this.name = name;
  this.year = year;
  }
}
- 클래스는 객체가 아님 => 객체용 템플릿
</pre>
<p id="class"></p>
<script src="../js/class.js"></script>
</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>