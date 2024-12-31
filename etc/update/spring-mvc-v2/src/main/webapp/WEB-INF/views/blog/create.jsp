<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>
<div class="container">
<div class="row">
<div class="col-md-12">
<form method="post">
<div class="input-group my-3">
	<label class="form-label">
	컨텐츠 제목 : 
	</label>
	<input type="text" name="title" class="form-control">
</div>	
<div class="input-group my-3">
	<label class="form-label">
	컨텐츠 본문 : 
	</label>
	<textarea rows="5" name="content_body" class="form-control"></textarea>
</div>	
<div class="d-flex justify-content-end">
<input type="submit" name="create" class="btn btn-outline-success" value="블로그 컨텐츠 쓰기"/>
</div>	
</form>
</div>
</div>
</div>
<jsp:include page="../include/footer.jsp" flush="false"/>