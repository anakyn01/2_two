function includeHTML(){
   
   var z, i, elmnt, file, xhttp;
   //변수 선언만
   z = document.getElementsByTagName("*");
   //변수 z에 = 도큐먼트에 모든 태그를 얻는 값을 할당
   for (i=0; i < z.length; i++){//변수 i는 z가 가지고 있는것 만큼 반복
   elmnt = z[i]; //변수 elmnt는 z각각의 요소를 대입
   file = elmnt.getAttribute("w3-include-html");
   //file변수에 변수elmnt에 "w3-include-html속성을 대입
   if(file){
      //속성값을 파일 이름으로 사용하여 http요청를 만든다
      xhttp = new XMLHttpRequest();
      xhttp.onreadystatechange = function(){
         //XMLHttpRequest객체의 readystate 프로퍼티 값이 변할때 마다 자동으로 호출되는 함수
   /*
   0 => 객체만 생성
   1 => open 매서드 호출
   2 => send 매서드 호출
   3 => 데이터의 일부를 받은 상태
   4 => 데이터 전부 받은 상태
   
   200 ok  요청성공
   403 접근거부
   404 페이지 없음
   500 서버오류 발생
    */if (this.readyState == 4) {//데이터를 전부 받았다면
     if(this.status == 200) {elmnt.innerHTML = this.responseText;}
     if(this.status == 404) {elmnt.innerHTML = "Page not found";}
     /*속성을 제거하고 함수를 한번 더 호출 */   
     elmnt.removeAttribute("w3-include-html");
     includeHTML();
    }

      }
    xhttp.open("GET", file, true);
    xhttp.send();
    return;
   }
      
   }
   
};