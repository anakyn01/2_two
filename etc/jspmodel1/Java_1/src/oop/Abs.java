package oop;
	
/*
자바 추상화
데이터 추상화는 특정 세부정보를 숨기고 필수 정보만 사용자에게 표시하는
프로세스 추상화는 추상클래스나 인터페이스를 통해 달성할수 있다
추상클래스 : 객체를 생성할수 없고 제한된 클래스 (엑서스 하려면 다음 클래스에 상속되어야 합니다)
추상메서드 : 추상클래스에서만 사용할수 있고 본문이 없습니다
본문은 하위 클래스(상속됨)에 의해 제공됩니다
추상 클래스에 추상메소드와 일반 메소드 모두 있을수 있습니다

추상 클래스 abstract 
상속 받을때는 extends
인터페이스
 */
//추상클래스
abstract class Animal2{
	public abstract void AnimalSound();//추상메서드
}
class Pig2 extends Animal2{
	public void AnimalSound() {
		System.out.println("the pig says: Rndndnd");
	}
}
	

public class Abs {	
	public static void main(String[] args) {
		Pig2 mypig = new Pig2();
		mypig.AnimalSound();
		System.out.println("보안을 유지하려면 특정 세부정보를 숨기고 객체의 중요한 세부정보만 표시하세요");
		System.out.println("추상화는 인터페이스를 통해서도 달성할수 있습니다");
	}
}
