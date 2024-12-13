if(new Date().getHours() < 18){//만약에 시간객체에서 현재시간을 얻을경우
    document.write = ("gooday");
}

const hour = new Date().getHours();//hour라는 시간 객체를 만듬
let greeting; // greeting 변수를 시간에 따라 출력이 달라서 선언만 합니다

if (hour < 10) {
    greeting = "good morning"
} else if (hour < 20){
    greeting = "good day";
} else{
    greeting = "good evening";
}
//swith
let day;
switch (new Date().getDay()){
    case 0:
        day = "Sunday";
        break;
    case 1:
        day = "Monday";   
        break;
    default:
        day = "뭔데이"; 
}

//switch에서 공통코드블록 공유
let text;
switch (new Date().getDay()) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        text = "월화수목금중에 하나";
        break;
    case 0:
    case 6:
        text = "주말";
        break;
    default:
        text = "나는 안나올것 같음";
    
}

//break;
let bk = "";
for(let i=0; i<10; i++){
    if(i==3){break;}
    bk += "The number is " + i + "<br>";
}
//continue;
let ct = "";
for (let q=0; q<10; q++){
    if(q ==3) {continue}
    ct += "the number is " + q + "<br>";
}
//배열 중지
const cars = ["BMW", "Volvo", "Saab", "Ford"];
let txt = "";
list:{
txt += cars[0] + "<br>";
txt += cars[1] + "<br>";
break list;
txt += cars[2] + "<br>";
txt += cars[3] + "<br>";
}

document.getElementById("ifelse").innerHTML =
"<br>" + greeting + "<br>" + day + "<br>" + text + 
"<br>" + bk + "<br>" + ct + "<br>" + 
" continue 와 break는 유일하게 코드블록에서 빠져나올수 있는 문(statement)이다" + "<br>" + txt;


