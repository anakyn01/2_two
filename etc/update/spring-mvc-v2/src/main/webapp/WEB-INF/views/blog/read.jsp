<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<meta name="referrer" content="no-referrer-when-downgrade" />
<% pageContext.setAttribute("CRLF", "\r\n"); %>
<jsp:include page="../include/header.jsp" flush="false"/>
<div class="container">
<div class="row">
<div class="col-md-12">
<h1 class="my-5">Read</h1>
<table class="table">
<tr>
<th>글번호 : </th><td>${blogCont.BLG_CONT_SEQ}</td>
</tr>
<tr>
<th>제목 :</th><td>${blogCont.TITLE}</td>
</tr>
<tr>
<th></th><td>${fn:replace(blogCont.CONT_BDY, CRLF, '<br/>') }</td>
</tr>
<tr>
<th>입력일</th>
<td><fmt:formatDate value="${blogCont.INSERT_DT}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
</tr>
</table>

<form method="post" action="/delete">
	<div class="d-flex justify-content-end">
	<input type="hidden" name="_method" value="delete"/>
	<input type="hidden" name="blogContSeq" value="${blogCont.BLG_CONT_SEQ}"/>
	<div class="btn-group">
		<a class="btn btn-secondary" href="/list">목록으로</a>
		<input type="submit" name="delete_button" value="삭제" class="btn btn-danger"/></div>
	</div>
	


</form>
	
<div class="btn-group w-100">
	<input type="text" id="cmtBdy" class="form-control"/>
	<input type="password" id="tmpPw" class="form-control"/>
	<input type="submit" id="btn_comment_add" value="댓글쓰기" class="btn btn-success"/>
</div>
<div id="comment_list">    
</div>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script type="text/javascript">
    $("#btn_comment_add").click(function(){
        let blgContSeq = ${blogCont.BLG_CONT_SEQ};
        let cmtBdy = $("#cmtBdy").val();
        let tmpPw = $("#tmpPw").val();
        let send_data = {};
        if (tmpPw == ""){
            send_data = {
                "blgContSeq": blgContSeq,
                "cmtBdy" : cmtBdy
            };
        }else{
            send_data = {
                "blgContSeq": blgContSeq,
                "cmtBdy" : cmtBdy,
                "tmpPw" : tmpPw,
            };
        }
 
        $.post( "/comment/add", send_data, function( data ) {
        	render_comment(data.cmtBdy, data.seqBlgCmt);
        });
    });
    
    function render_comment(cmtBdy, seqBlgCmt, tmpPw){
        let append_val = '<p><a href="/comment/delete/{seqBlgCmt}">{cmtBdy}</a></p>'
            .replace("{seqBlgCmt}", seqBlgCmt)
            .replace("{cmtBdy}", cmtBdy);
     
        $("#comment_list").append(append_val);
    }
     
    function init_comment(){
        $.get("/comment/list/${blogCont.BLG_CONT_SEQ}", function(data){
            for (comment of data){
                render_comment(comment.cmtBdy, comment.seqBlgCmt);
            }
        });
    }
     
    $(document).ready(function(){
        init_comment();
    });
</script>

</div>
</div>
</div>







<jsp:include page="../include/footer.jsp" flush="false"/>