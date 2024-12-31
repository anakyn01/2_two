/*var x = 6;//변수 x에 6을 대입
var x = 10;
document.getElementById("view").innerHTML = x;

//자바스크립트는 대소문자를 구분합니다
var Upper = "대문자";
var upper = "대문자2";
document.getElementById('upper').innerHTML = upper;

//변수는 변수끼리 더할수 있다
var first_name = '영일';
var last_name = '황';
var myname = last_name + first_name;
document.getElementById('name').innerHTML = myname + " 입니다";

//숫자 더하기
var one = 1
var two = 2
var sum = one + two
document.getElementById('number').innerHTML = sum;*/

//let
let q; //변수를 선언 
q = "재선언 재할당 금지"//선언한 변수에 값을 할당
//q = "다른값"

let x = "지훈";
//let x = 0; 한번 선언한 변수를 다시 선언 할수 없음
let xx = "지훈";

let w = 10;
{
let w = 2;
}


//document.getElementById('Let').innerHTML= x + "<br>" + w;

//const
const PI = 3.1415926553589793;
//const PI = 3.14;
//document.getElementById('Const').innerHTML = PI;

//aray
//1)basic
const hyundai = [
"그랜저",
"아반떼",
"산타페"
];
const cars = new Array("그랜저","아반떼","산타페")
//0,1,2

document.getElementById('array').innerHTML = 
"배열 기본형 " + hyundai + "<br>" +
"new 키워드 배열" + cars + "<br>" +
"배열 cars에서 부분 발췌는 : [0]이라고 쓰고 1이라고 읽는다 " + cars[0];

//ul로 과일세트 만들기 
const goldfruits = ["바나나","흙수박","사과","망고","참외","딸기"];
let ea = goldfruits.length;
//변수 갯수 = 금과일의 길이(총 갯수)
let text = "<ul class='list-group'>"; //변수 텍스트는 ul태그를 열고
for (let i = 0; i < ea; i++){
    //변수 i는 0부터 시작하고 변수 ea길이보다 작을때 까지 0,1,2,3,4 i는 개별증가하라
    text += "<li class='list-group-item'>" + goldfruits[i] + "</li>";
} 
text += "</ul>";

document.getElementById('order').innerHTML = text;