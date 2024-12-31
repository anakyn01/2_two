<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" flush="false" />

<div class="container-fluid">
<div class="row">
<div class="col-md-3">
<jsp:include page="../include/aside.jsp" flush="false" />
</div>
<div class="col-md-9">
<ul>
<c:forEach items="${list}" var="list">
<li>
<div class="goodsThumb">
<img src="${list.gdsThumbImg}"/>
</div>
<div class="goodsName">
<a href="/shop/view?n=${list.gdsNum}">${list.gdsName}</a>
</div>
</li>
</c:forEach>
</ul>
</div>
</div>
</div>


<jsp:include page="../include/footer.jsp" flush="false" />