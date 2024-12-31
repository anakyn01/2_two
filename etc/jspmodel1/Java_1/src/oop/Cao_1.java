package oop;
/*
 자바 스크립트는 객체지향 프로그래밍 언어
 자바의 모든것은 해당 속성 및 메소드와 함께
 class 및 객체와 연관이 되어 있습니다
 class는 객체 생성자 또는 객체 생성을 위한 청사진 입니다 
Static vs public
static으로 시작하는 함수는 호출만 
public으로 시작하는 함수는 호출만
 */
public class Cao_1 {
	int x = 5; //클래스에 필드또는 클래스의 속성 변수
	int y = 3;
	int q; //비워진 변수를 만듬
	//바꿈을 허용하지 않는 경우 final 키워드를 사용한다 상수로 만듬
	final double PI = 3.14;
	
	//메소드 사용
	static void myMethod() {
		System.out.println("hello world");
	}
	public void madeObject(){
		System.out.println("객체로 만들고 호출");
	}
	

	public static void main(String[] args) {
		Cao_1 myEat = new Cao_1();
		//속성을 물려받기 위해 객체 생성
		//객체는 여러번 생성할수 있습니다
		Cao_1 myObj2 = new Cao_1();
		myObj2.q = 40;//빈주머니를 물려받고 내돈을 채움
		myEat.x = 1000;
		//myEat.PI = 314; 상수는 변동이 아닌 참조만 할 뿐이다
		System.out.println(myEat.x);
		System.out.println(myObj2.x);
		System.out.println(myObj2.q);
		
		Cao_1 call = new Cao_1();
		call.madeObject();
		//public으로 함수를 만들때는 객체 만들고 호출 
		
		myMethod();
	}

}
