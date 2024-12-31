package oop;
/*
자바에서는 클래스내의 클래스 하는 것도 가능합니다
중첩 중첩클래스의 목적은 함게 속한 클래스를
그룹화하여 코드를 더 읽기 쉽고 유지 관리하기 쉽게
만드는 것입니다 


 */
class OuterClass{
	String x = "17";
	class InnerClass{
		String y = "2024";
	}
	//개인적인 내부 클래스를 만들려면 private 사용
	private class privacy{
		int q = 12;
		
	}
}




public class Nest {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		/*
		 중첩 클래스를 객체로 만드는법
		 외부클래스.내부클래스 객체명 = 외부객체명.new 내부클래스() 
		 */
	}

}
