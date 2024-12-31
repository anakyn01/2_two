<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${contextPath}/resources/css/bbs.css"/>
 
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
function replyList(){
	var gdsNum = ${view.gdsNum};
	$.getJSON("${contextPath}/shop/view/replyList" + "?n=" + gdsNum, function(data){
		var str = "";
		$(data).each(function(){
			console.log(data);
			var repDate = new Date(this.repDate);
			repDate = repDate.toLocaleDateString("ko-US")
			str += "<li data-repNum='" + this.repNum + "'>" //"<li data-gdsNum='" + this.gdsNum + "'>"
			  + "<div class='userInfo'>"
			  + "<span class='userName'>" + this.userName + "</span>"
			  + "<span class='date'>" + repDate + "</span>"
			  + "</div>"
			  + "<div class='replyContent'>" + this.repCon + "</div>"
			 
			  + "<c:if test='${member != null}'>"
			 
			  + "<div class='replyFooter'>"
			  + "<button type='button' class='modify' data-repNum='" + this.repNum + "'>M</button>"
			  + "<button type='button' class='delete' data-repNum='" + this.repNum + "'>D</button>"
			  + "</div>"
			 
			  + "</c:if>"
			 
			  + "</li>";
		});
		$("section.replyList ol").html(str);
		});
	}
</script>

<title>shoping mall</title>
<body>

<nav class="navbar navbar-expand-sm bg-light">
  <div class="container-fluid w-100">
    <a class="navbar-brand" href="/">HYI</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
				<ul class="navbar-nav mb-2 mb-lg-0 me-auto align-items-center">
					<c:if test ="${member == null }">
						<li class="nav-item">
							<a class="nav-link" href="${contextPath}/board/write">write</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="${contextPath}/member/signin">login</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="${contextPath}/member/signup">join</a>
						</li>

					</c:if>	
                 

		
					<c:if test ="${member != null }">
						<c:if test ="${member.verify == 9}">
						
						<li class="nav-item">
							<a class="nav-link" href="${path}/admin/index">관리자 화면</a>
						</li>
						</c:if>
						<li class="nav-item">
						<span class="fw-bold">${member.userName}&nbsp;님 환영합니다</span>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="${path}/member/signout">logout</a>
						</li>
						
					</c:if>			
					 </ul>
      <form class="dflex btn-group">
         <input class="form-control" type="text" placeholder="Search">
        <button class="btn btn-primary" type="button">Search</button>
      </form>
    </div>
  </div>
</nav>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- $제이쿼리는 cdn설정을 해야된다 그러히 않으면 문서에 장착해야 된다-->
<script src="${contextPath}/resources/js/js.js"></script>
<script src="${contextPath}/resources/js/daum.js"></script>
<script src="${contextPath}/resources/js/util.js"></script>
<script src="${contextPath}/resources/js/register.js"></script>
<script src="${contextPath}/resources/js/member.js"></script>








