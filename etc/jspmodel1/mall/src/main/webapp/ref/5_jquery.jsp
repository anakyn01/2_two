<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>제이쿼리</h1>  
<pre>
- $선택자 지정
- 문서가 실행되기 전에 동시다발로 실행되는것을 막기위해 비동기
- cdn선언
</pre> 
<p>아니메 실행 니뮤</p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
$(document).ready(function(){//페이지가 실행되기전 동기로 실행되는걸 방지

    $("p").click(function(){//태그 p를 누를때의 기능은
        $(this).hide();//p를 숨김
    });
});
</script>
</body>
</html>