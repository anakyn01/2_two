package base;

/*
Object 클래스
클래스를 선언할때 extends 키워드로 다른클래스를 상속하지 않으면
임시적으로 Object 클래스를 상속합니다
따라서 자바의 모든 클래스는 Object의 자식이거나 자손입니다
그렇기때문에 Object가 가진 메소드는 모든 객체에서 사용할수 있다

Object method
boolean equals(Object obj) : 객체의 번지를 비교하고 결과를 리턴
int hashCode() : 객체의 해시코드를 리턴
String toString() : 객체 문자 정보를 리턴

객체 동등 비교
public boolean equals(Object obj)
여기서 매개변수 타입이 Object 이므로
자동타입변환에 의해 모든 객체가 매개값으로 대입될수 있다
equals 메소드는 비교연산자인 == 와 동일한 결과를 리턴
참이다 거짓이다

동등비교란 무엇인가/
객체가 비록달라도
내부의 데이터가 같은지를 말한다
*/

public class Equals {

	public static void main(String[] args) {
		Member obj1 = new Member("최가영");
		Member obj2 = new Member("최가영");
		Member obj3 = new Member("배현주");
		
		if(obj1.equals(obj2)) {
			System.out.println("동등");
		} else {
			System.out.println("동등하지않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("동등");
		} else {
			System.out.println("동등하지않음");
		}
		
		
		
		
		
	}

}
