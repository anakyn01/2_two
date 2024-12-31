<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:out value="jstl core 태그라이브러리"/>
<c:forEach var="k" begin="1" end="10" step="1">
<c:out value="${k}"/>
</c:forEach>