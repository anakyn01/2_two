<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../../include/header.jsp" flush="false"/>

<div class="container-fluid bg-gradient-primary">
<div class="row">
<div class="col-md-2">
<div class="mt-1"></div>
<jsp:include page="../include/lnb.jsp" flush="false"/>
</div>
<div class="col-md-10">
<h2 class="my-3 text-white">상품 등록</h2>
<form method="post" autocomplete="off" class="my-5" enctype="multipart/form-data">

<div class="input-group">
	<label class="form-label text-white">1차분류</label>
	<div class="w-5"></div>
	<select class="form-select category1">
		<option value="">전체</option>
	</select>
	<div class="w-5"></div>
	<label class="form-label text-white">2차분류</label>
	<div class="w-5"></div>
	<select class="form-select category2" name="cateCode">
		<option value="">전체</option>
	</select>
</div>

<div class="input-group mt-5">
	<label class="form-label text-white w-10">상품명</label>
	<input type="text" id="gdsName" name="gdsName" class="form-control w-90" required/>
</div>

<div class="input-group mt-5">
	<label class="form-label text-white w-10">상품가격</label>
	<input type="text" id="gdsPrice" name="gdsPrice" class="form-control w-90" required/>
</div>

<div class="input-group mt-5">
	<label class="form-label text-white w-10">상품수량</label>
	<input type="text" id="gdsStock" name="gdsStock" class="form-control w-90" required/>
</div>

<div class="input-group mt-5">
	<label class="form-label text-white w-10">상품소개</label>
	<textarea cols="50" id="gdsDes" name="gdsDes" class="form-control w-90" required></textarea>
</div>

<div>
<div class="input-group mt-5">
	<label class="form-label" for="gdsImg">이미지</label>
	<input type="file" id="gdsImg" name="file" class="form-control"/>
</div>

<div class="select_img">
	<img src=""/>
</div>
<P>원본 이미지</P>
<img src="${goods.gdsImg}"/>
<P>썸네일</P>
<img src="${goods.gdsThumbImg}"/>
</div>
<script>
$("#gdsImg").change(function(){
if(this.files && this.files[0]){
	var reader = new FileReader;
	reader.onload = function(data){
		$(".select_img img").attr("src", data.target.result).width(500);
	}
	reader.readAsDataURL(this.files[0]);
}	
});

var regExp = /[^0-9]/gi;//숫자가 아님

$("#gdsPrice").keyup(function(){numCheck($(this));});
$("#gdsStock").keyup(function(){numCheck($(this));});

function numCheck(selector){
	var tempVal = selector.val();
	selector.val(tempVal.replace(regExp, ""));
}
</script>
<div class="text-white"><%=request.getRealPath("/") %></div>

<div class="d-flex justify-content-end my-5">
<button type="submit" id="register_Btn" class="btn btn-outline-warning btn-block py-3">
등록
</button>
</div>

</form>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
//컨트롤러에서 데이터 받기
var jsonData = JSON.parse('${category}');
console.log(jsonData);

var cate1Arr = new Array();
var cate1Obj = new Object();

// 1차 분류 셀렉트 박스에 삽입할 데이터 준비
for(var i = 0; i < jsonData.length; i++) {
 
 if(jsonData[i].level == "1") {
  cate1Obj = new Object();  //초기화
  cate1Obj.cateCode = jsonData[i].cateCode;
  cate1Obj.cateName = jsonData[i].cateName;
  cate1Arr.push(cate1Obj);
 }
}

// 1차 분류 셀렉트 박스에 데이터 삽입
var cate1Select = $("select.category1")

for(var i = 0; i < cate1Arr.length; i++) {
 cate1Select.append("<option value='" + cate1Arr[i].cateCode + "'>"
      + cate1Arr[i].cateName + "</option>"); 
}

$(document).on("change", "select.category1", function(){
	//select.category1이 변경되었다면 실행되는 함수

	 var cate2Arr = new Array();
	 var cate2Obj = new Object();
	 
	 // 2차 분류 셀렉트 박스에 삽입할 데이터 준비
	 for(var i = 0; i < jsonData.length; i++) {
	  
	  if(jsonData[i].level == "2") {
	   cate2Obj = new Object();  //초기화
	   cate2Obj.cateCode = jsonData[i].cateCode;
	   cate2Obj.cateName = jsonData[i].cateName;
	   cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;
	   
	   cate2Arr.push(cate2Obj);
	  }
	 }
	 
	 var cate2Select = $("select.category2");
	 
	 cate2Select.children().remove();

	 /*for(var i = 0; i < cate2Arr.length; i++) {
	   cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
	        + cate2Arr[i].cateName + "</option>");
	 }*/
	$("option:selected", this).each(function(){
		var selectVal = $(this).val();
		cate2Select.append("<option value='" + selectVal + "'>전체</option>");
		
		for(var i =0; i < cate2Arr.length; i++){
			if(selectVal == cate2Arr[i].cateCodeRef){
				   cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
					        + cate2Arr[i].cateName + "</option>");
			}
		}
		
	}); 
});
</script>


</div>
</div>
</div>

<jsp:include page="../../include/footer.jsp" flush="false"/>