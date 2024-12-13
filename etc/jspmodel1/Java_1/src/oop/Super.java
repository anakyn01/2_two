package oop;
/*
Java Inheritance (Subclass and Superclass) 
한클래스에서 다른 클래스로 속성과메소드를 상속할수 있음
슈퍼클래스 -> 상속시킴 public이 빠짐
하위클래스 -> 상속받음 extends
*/

class Super {//public 슈퍼클래스
	//아무나 접근하지 않게 접근 한정자
	protected String brand = "hyundai";
	
	public void honk() {
		System.out.println("현실은 폭망");
	}
	
}
class Sub extends Super{//extends
	private String modelName = "스텔라";
	
	public static void main(String[] args) {
		//객체 생성
		Sub myCar = new Sub();
		myCar.honk();
		System.out.println(myCar.brand +""+ myCar.modelName);
		System.out.println("상속을 사용하는 의미는 무엇인가요? 새클래스를 생성할때 기존클래스의 속성과 메서드를 재사용 합니다");
	}
	
	
}