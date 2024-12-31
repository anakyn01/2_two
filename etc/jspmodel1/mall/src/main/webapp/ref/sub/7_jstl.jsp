<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<h1>foreach</h1>
<c:forEach var="k" begin="1" end="10" step="1">
<c:out value="${k}"/>
</c:forEach>

<c:set var="intArray" value="<%=new int[]{1,2,3,4,5} %>" />
출력 : ${intArray[0]}
<h1>캐치</h1>
<c:catch var="ex">
<%= 1/0 %>
</c:catch>
<mark class="fs-4 text-danger">
Error Msg: ${ex}
</mark>
<%-- <fmt:formatDate value="${today}" type="date"/>
<mark>${today}</mark>--%>

<h1>출력</h1>
<c:set var="name" value="돼지" scope="page"/>
<c:set var="age" value="46" scope="page"/>
<c:set var="height" value="177" scope="page"/>
<c:set var="weight" value="89" scope="page"/>
<c:set var="bmi" value="${weight div (height * height * 0.0001)}" scope="page"/>
<c:set var="health" value="${bmi ge 25 ? '되지':'정상' }" scope="page"/>
<h1>이름 : ${name}</h1>
<h1>나이 : ${age}</h1>
<h1>뚱 : ${bmi}</h1>
<h1>건강상태 : ${health}</h1>
<pre>
c:set : 변수선언
c:remove : 변수제거
c:out :변수출력
c:catch : 예외처리
c:if : 조건문 else는 없습니다

c:choose,c:otherwise
c:when : switch문과 비슷하다

c:forEach : 반복문
c:forTokens : 구분자로 분활하여 반복

c:url : url생성
c:param : 파라미터 추가
c:import : 페이지 첨부
c:redirect : URL 이동
</pre>