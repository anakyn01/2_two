<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="low">
<div class="col-md-12">
<h1>Date</h1>
<pre>
- 날짜 객체
- 자바스크립트에서 날짜를 만드는 방법은 크게 9가지 이다
- 공통으로 new Date()
new Date(date String)
new Date(year, month)
new Date(year, month, day)
new Date(year, month, day, hours)
new Date(year, month, day, hours, minutes)
new Date(year, month, day, hours, minutes, seconds)
new Date(year, month, day, hours, minutes, seconds,ms)
new Date(milliseconds)
</pre>
<p id="time"></p>
<script src="../js/time.js">

</script>

</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>