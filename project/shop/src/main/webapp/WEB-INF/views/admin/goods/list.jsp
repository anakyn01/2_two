<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../../include/header.jsp" flush="false"/>

<div class="container-fluid bg-gradient-primary">
<div class="row">
<div class="col-md-2">
<div class="mt-1"></div>
<jsp:include page="../include/lnb.jsp" flush="false"/>
</div>
<div class="col-md-10">
<h2 class="my-3 text-white">상품 목록</h2>
<table class="table">
<colgroup>
<col style="width:10%"/>
<col style="width:10%"/>
<col style="width:40%"/>
<col style="width:10%"/>
<col style="width:10%"/>
<col style="width:10%"/>
<col style="width:10%"/>
</colgroup>
<thead>
<tr>
<th>번호</th><th>썸네일</th><th>이름</th><th>카테고리</th><th>가격</th><th>수량</th><th>등록날짜</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="list">
<tr>
<td>${list.gdsNum}</td>
<td><img src="${list.gdsThumbImg}" class="w-50"/></td>
<td>
<a href="/admin/goods/view?n=${list.gdsNum}">
${list.gdsName}
</a>
</td>
<td>${list.cateCode}</td>
<td>${list.gdsPrice}</td>
<td>${list.gdsStock}</td>
<td>${list.gdsDate}</td>
</tr>
</c:forEach>

</tbody>
</table>


</div>
</div>
</div>

<jsp:include page="../../include/footer.jsp" flush="false"/>