const cars = ["car1","car2","car3"]

document.getElementById('array').innerHTML =
"<b>배열을 출력</b>" +cars + "</br>" + 
"<b>배열을 문자열로 리턴</b>" + cars.toString() + "</br>" +
"<b>배열의 길이</b>" +cars.length + "</br>" +
"<b>배열의 개별 엑세스는 index </b>" +cars[0] + "</br>" +
"<b>배열의 마지막 요소 엑세스는 </b>" +cars[cars.length -1] + "</br>";

//loop
const fruits = ["banana", "orange", "apple", "mango"];

let text = "<ul>";
fruits.forEach(plus);
text += "</ul>";
document.getElementById("loop").innerHTML = text;
//plus = (value) => {
function plus(value){
text += "<li>" + value + "</li>";
}