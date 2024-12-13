<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container">
	<div class="row">
		<div class="col-md-12 p-0">
			<div id="join">
			
			</div>
		</div>
	</div>
</div>

<script type="text/babel">
const Join = () => {
return(
<>
<h1 className="my-5">회원가입</h1>
<form id="join_form" method="POST">
<div className="input-group mb-3">
<label className="form-label">아이디</label>
<input type="text" className="form-control id_input" name="memberId"/>
</div>
<div className="id_input_re_1">사용가능한 아이디 입니다</div>
<div className="id_input_re_2">아이디가 이미 존재 합니다</div>

<div className="input-group mb-3">
<label className="form-label">비밀번호</label>
<input type="password" className="form-control" name="memberPw"/>
</div>

<div className="input-group mb-3">
<label className="form-label">이름</label>
<input type="text" className="form-control" name="memberName"/>
</div>

<div className="input-group mb-3">
<label className="form-label">이메일</label>
<input type="email" className="form-control" name="memberMail"/>
</div>

<div className="input-group mb-3">
<div className="mail_check_input_box" id="mail_check_input_box_false">
<input type="text"
className="form-control mail_check_input" disabled="disabled"/>
</div>
<button className="mail_check_button btn btn-outline-success">
인증번호 전송
</button>
<div id="mail_check_input_box_wran"></div>
</div>

<div className="input-group mb-3">
<label className="form-label">주소</label>
<input type="text" className="form-control address_input_1" name="memberAddr1" readonly="readonly"/>
<button className="btn btn-outline-success address_button" onClick="execution_daum_address()">
주소찾기
</button>
</div>

<div className="d-flex justify-content-end">
<input type="submit" className="join_button btn btn-outline-primary btn-lg w-100"/>
</div>
</form>
</>
);
}

const root = ReactDOM.createRoot(document.getElementById('join'));
root.render(<Join/>)
</script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>
//다음 주소연동
function execution_daum_address(){
	
	new daum.Postcode({
		oncomplete: function(data){
			var addr = '';
			var extraAddr = '';
		}
	})
}
</script>

<jsp:include page="../include/footer.jsp" flush="false"/>



