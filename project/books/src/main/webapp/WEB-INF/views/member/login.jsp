<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../include/header.jsp" flush="false"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container">
	<div class="row">
		<div class="col-md-12 p-0">
			<div id="login">
			
			</div>
		</div>
	</div>
</div>

<script type="text/babel">
const Login = () => {
return(
<>
<h1 className="my-5">로그인</h1>
<form>
<div className="id_wrap mb-3">
<div className="id_input_box">
  <input type="text" className="form-control id_input" name=""
placeholder="ID"
/>
</div>
</div>

<div className="pw_wrap">
<div className="pw_input_box">
<input type="password" className="pw_input form-control"
placeholder="PW"
/>
</div>
</div>

<div className="d-flex justify-content-end my-5">
<input type="button" className="btn btn-outline-primary btn-lg login_button" value="로그인"/>
</div>
</form>
</>
);
}

const root = ReactDOM.createRoot(document.getElementById('login'));
root.render(<Login/>)
</script>



<jsp:include page="../include/footer.jsp" flush="false"/>



