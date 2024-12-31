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
<p>
<img src="${view.gdsThumbImg}"/>
<img src="${view.gdsImg}"/>
</p>
<p>상품이름:${view.gdsName}</p>
<p>상품가격:${view.gdsPrice}</p>
<p>상품수량:${view.gdsStock}</p>
<p>상품설명:${view.gdsDes}</p>
<p class="addToCart">
<button type="button" class="addCart_btn">카트에 담기</button>

<script>
  $(".addCart_btn").click(function(){
   var gdsNum = $("#gdsNum").val();
   var cartStock = $(".numBox").val();
      
   var data = {
     gdsNum : gdsNum,
     cartStock : cartStock
     };
   
   $.ajax({
    url : "/shop/view/addCart",
    type : "post",
    data : data,
    success : function(result){
        if(result == 1) {
            alert("카트 담기 성공");
            $(".numBox").val("1");
           } else {
            alert("회원만 사용할 수 있습니다.")
            $(".numBox").val("1");
           }
    },
    error : function(){
     alert("카트 담기 실패");
    }
   });
  });
 </script>
</p>

<!-- add -->
<div id="reply">
<section class="replyForm">
<c:if test="${member == null }">
	<p>소감을 남기시려면 <a href="/member/signin">로그인</a>해주세요</p>
</c:if>
<c:if test="${member != null }">
<form role="form" method="post" autocomplete="off">
<input type="hidden" name="gdsNum" value="${view.gdsNum}"/>
<!-- 화면에 보이지 않지만 데이터를 가지고 있는 인풋박스 -->
<textarea name="repCon" id="repCon" class="form-control" rows="5"></textarea>
<div class="d-flex justify-content-end my-3">
<button type="button" id="reply_btn" class="btn btn-outline-secondary">소감 남기기</button>
<script>
 $("#reply_btn").click(function(){
  
  var formObj = $(".replyForm form[role='form']");
  var gdsNum = $("#gdsNum").val();
  var repCon = $("#repCon").val()
  
  var data = {
    gdsNum : gdsNum,
    repCon : repCon
    };
  
  $.ajax({
   url : "/shop/view/registReply",
   type : "POST",
   data : data,
   success : function(){
    replyList();
    $("#repCon").val("");
   }
  });
 });
</script>
</div>
</form>
</section>
</c:if>
<section class="replyList">
	<ol class="list-group list-group-flush">
	<%-- 첨부파일이 있는페이지로 메모리 소요가 심함 그래서 jquery ajax로 대신한다
		<c:forEach items="${reply}" var="reply">
			<li class="list-group-item">
			<div class="userInfo">
				<span class="userName">${reply.userName}</span>	
				<span class="date">
				<fmt:formatDate value="${reply.repDate}" pattern="yyyy-MM-dd"/>
				</span>
				<div class="replyContent">
				${reply.repCon}
				</div>		
			</div>
			</li>
		</c:forEach>--%>
		</ol>
<script>
replyList();
</script>
<script>
$(document).on("click", ".delete", function(){
	var data = {repNum : $(this).attr("data-repNum")};
	$.ajax({
		url:"/shop/view/deleteReply",
		type:"post",
		data:data,
		success:function(){
			if(result == 1){
				replyList();
			}else{
				alert("작성자 본인만 삭제할수 있습니다")
			}
			
		},
		error : function(){
			alert("로그인 하셔야 합니다")
		}
	});
});
</script>
</section>



</div>
<!-- add end -->

</div>
</div>
</div>

<div class="replyModal">

 <div class="modalContent">
  
  <div>
   <textarea class="modal_repCon" name="modal_repCon"></textarea>
  </div>
  
  <div>
   <button type="button" class="modal_modify_btn">수정</button>
   <button type="button" class="modal_cancel">취소</button>
  </div>
  
 </div>

 <div class="modalBackground"></div>
 
</div>
<script>
$(document).on("click", ".modify", function(){
	 //$(".replyModal").attr("style", "display:block;");
	 $(".replyModal").fadeIn(200);
	 
	 var repNum = $(this).attr("data-repNum");
	 var repCon = $(this).parent().parent().children(".replyContent").text();
	 
	 $(".modal_repCon").val(repCon);
	 $(".modal_modify_btn").attr("data-repNum", repNum);
	 
	});
</script>

<script>
$(".modal_cancel").click(function(){
 $(".replyModal").attr("style", "display:none;");
});
</script>

<script>
$(".modal_modify_btn").click(function(){
	 var modifyConfirm = confirm("정말로 수정하시겠습니까?");
	 
	 if(modifyConfirm) {
	  var data = {
	     repNum : $(this).attr("data-repNum"),
	     repCon : $(".modal_repCon").val()
	    };  // ReplyVO 형태로 데이터 생성
	  
	  $.ajax({
	   url : "/shop/view/modifyReply",
	   type : "post",
	   data : data,
	   success : function(result){
	    
	    if(result == 1) {
	     replyList();
	     $(".replyModal").fadeOut(200);
	    } else {
	     alert("작성자 본인만 할 수 있습니다.");       
	    }
	   },
	   error : function(){
	    alert("로그인하셔야합니다.")
	   }
	  });
	 }
	 
	});
</script>

<style>
 div.replyModal { position:relative; z-index:1; }
 div.modalBackground { position:fixed; top:0; left:0; width:100%; height:100%; background:rgba(0, 0, 0, 0.8); z-index:-1; }
 div.modalContent { position:fixed; top:20%; left:calc(50% - 250px); width:500px; height:250px; padding:20px 10px; background:#fff; border:2px solid #666; }
 div.modalContent textarea { font-size:16px; font-family:'맑은 고딕', verdana; padding:10px; width:500px; height:200px; }
 div.modalContent button { font-size:20px; padding:5px 10px; margin:10px 0; background:#fff; border:1px solid #ccc; }
 div.modalContent button.modal_cancel { margin-left:20px; }
</style>






<jsp:include page="../include/footer.jsp" flush="false" />