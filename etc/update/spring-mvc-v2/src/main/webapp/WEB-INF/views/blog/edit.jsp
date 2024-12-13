<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" flush="false"/>
<div class="container">
<div class="row">
<div class="col-md-12">
    <form method="post">
        <input type="hidden" name = "_method" value = "put"/>
        <p>글번호 : ${blogCont.BLG_CONT_SEQ}</p>
        <p>
            컨텐츠 제목 :
            <input type='text' name='title' style='width:80%' value="${blogCont.TITLE}" class="form-control"/>
        </p>
        <p>
            본문
        </p>
        <p>
            <textarea rows="10" name="contBdy" style='width:100%' class="form-control">${blogCont.CONT_BDY}</textarea>
        </p>
        <p>입력일 : <fmt:formatDate value="${blogCont.INSERT_DT}" pattern="yyyy.MM.dd HH:mm:ss" /></p>
            <div class="d-flex justify-content-end my-5">
            <div class="btn-group">
            <a class="btn btn-secondary" href="/list">목록으로</a>
            <input type="submit" name="create" value="블로그 컨텐츠 수정" class="btn btn-outline-success"/>
            </div>
            </div>
    </form>
</div>
</div>
</div>
<jsp:include page="../include/footer.jsp" flush="false"/>