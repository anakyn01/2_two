<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<div class="container">
<div class="row">
<div class="col-md-12">

<form method="post" action="writeAction.jsp">
<h1 class="my-5">
글쓰기
</h1>
<table class="table table-bordered">
<thead>
	<tr>
		<th>제목</th>
		<td>
			<input
			type="text"
			class="form-control"
			placeholder="글제목"
			name="bbsTitle"
			/>
		</td>
	</tr>
	<tr>
		<th>내용</th>
		<td>
			<textarea class="form-control" placeholder="글내용" name="bbsContent" rows="3"></textarea>
		</td>
	</tr>
</thead>


</table>

<div class="d-flex justify-content-end">
	<div class="btn-group my-5">
	<input 
	type="submit"
	class="btn btn-outline-primary"
	value="write"
	/>
	<a class="btn btn-outline-secondary" href="bbs.jsp">list</a>
	</div>
</div>








</form>

</div>
</div>
</div>
<%@ include file="../include/footer.jsp" %>