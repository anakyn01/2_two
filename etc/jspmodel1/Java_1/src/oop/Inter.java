package oop;

/*
 자바에서 추상화를 달성하는 또다른 방법은 인터페이스를 사용하는것 입니다
 완벽한 추상 클래스
 실무에서 사용법 클래스에 implements를 만들고 파생
 YouImpl
 service Youservice 
 */
interface Youservice{
	public void animalSound();
}
interface Second{
	public void myOtherMethod();
}

class YouImpl implements Youservice, Second{
	public void animalSound() {
		System.out.println("몸통");
	}
	public void myOtherMethod() {
		System.out.println("두번째 인터페이스");
	}
	public void sleep() {
		System.out.println("zzZ");
	}
}

public class Inter {

	public static void main(String[] args) {
		YouImpl impl = new YouImpl();
		impl.animalSound();
		impl.sleep();
		System.out.println("인터페이스 속성은 기본적으로 final 이며 생성자를 포함할수 없다");
		System.out.println("자바는 다중 상속을 지원하지 않음(클래스는 하나의 슈퍼클래스에서만 상속합니다)");
		System.out.println("그러나 클래스가 여러 인터페이스를 구현 할수 있으므로 이를 달성함");

	}

}
