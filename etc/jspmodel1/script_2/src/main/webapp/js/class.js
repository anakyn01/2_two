class Car{
	constructor(name, money, year){
		this.name = name;
		this.money = money;
		this.year = year;
	}
	//age 클래스 매서드를 만듬
	age(){
		const date = new Date();//현재시간 객체를 가지고 옵니다
		return date.getFullYear() - this.year;
	}
}
const myCar1 = new Car("걸어다님",0,2000);
const myCar2 = new Car("빈폴",1000,2000);

document.getElementById("class").innerHTML =
myCar1 + "<br>" +
myCar2 + "<br>" +
myCar1.name + "이고 들어간 돈은 " + myCar1.money + "입니다" +
"내가 뚜벅이로 다닌 시간은? " + myCar2.age() + " 걸어다님";