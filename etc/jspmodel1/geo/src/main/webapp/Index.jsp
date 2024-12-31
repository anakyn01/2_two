<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>위치기반 서비스</title>
</head>
<body>
<button onclick="getLocation()">위치기반</button>
<p id = "find"></p>
<script type="text/javascript">
const x = document.getElementById("find");

function getLocation() {//아래의 위도와 경도를 가져와서 출력해주는 함수
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(showPosition);		
	}else{
		x.innerHTML = "당신의 브라우저는 위치기반을 지원하지 않음"
	}
}

function showPosition(position) {//위도와 경도를 얻는 함수
	x.innerHTML = "위도: " + position.coords.latitude +
	"<br>경도 : " + position.coords.longitude;
}

</script>

</body>
</html>