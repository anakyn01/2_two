<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="include/header.jsp" flush="false"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12 p-0">
			<div id="main">
			
			</div>
		</div>
	</div>
</div>

<script type="text/babel">
const Main = () => {
return(
<>
<div id="demo" className="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
    <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
    <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
  </div>
  

  <div class="carousel-inner">
    <div className="carousel-item active">
      <img src="${contextPath}/resources/images/la.jpg" alt="Los Angeles" className="w-100"/>
    </div>
    <div className="carousel-item">
      <img src="${contextPath}/resources/images/chicago.jpg" alt="Chicago" className="w-100"/>
    </div>
    <div className="carousel-item">
      <img src="${contextPath}/resources/images/ny.jpg" alt="New York" className="w-100"/>
    </div>
  </div>
  

  <button className="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
    <span className="carousel-control-prev-icon"></span>
  </button>
  <button className="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
    <span className="carousel-control-next-icon"></span>
  </button>
</div>

</>
);
}

const root = ReactDOM.createRoot(document.getElementById('main'));
root.render(<Main/>)
</script>



<jsp:include page="include/footer.jsp" flush="false"/>



