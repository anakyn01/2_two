package lambda.ref;
/*
 메소드 참조
 메소드를 참조해서 매개변수의 정보 및 리턴타입을 알아내
 람다식에서 불필요한(다시 한번 더 쓰는) 매개변수를 제거하는것을 목적으로 한다
 예를 들어 두 개의 값을 받아 큰수를 리턴하는 math클래스에
 max() 정적 메소드를 호출하는 람다식은 아래와 같다
 (10, 100) -> Math.max(10, 100);
 람다식은 단순히 두개의 값을 Math.max()메소드의 매개값으로 
 전달하는 역할만 하기 때문에 인자를 쓰는것 불필요해 보인다
 이경우 아래와 같이 메소드 참조를 이용하면 깔끔하게 처리할수 있다
 Math :: max
 
 정적 메소드와 인스턴스 메소드 참조
 static (정적) 메소드를 참조할 경우 클래스 이름 뒤에 :: 기호를 붙이고 
 정적 메소드 이름을 기술한다
 instance (인스턴스) 메소드일 경우 :
 1)객체를 생성 2)참조변수뒤에 ::기호를 붙이고
 인스턴스 메소드 이름을 기술한다
 참조변수 :: 메소드
 
 지금부터 시작할 예제는
 두수를 람다식으로 기술하는 대신에
 computer 클래스를 만들어
 static / instance를 참조로 대체하는 방법을 보여준다
  */

public class Ref {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 정적메소드일 경우 람다식
		person.action((x,y)-> Computer.staticMethod(x, y));
		
		// 정적메소드일 경우 람다식이 아닌 메소드 참조
		person.action(Computer :: staticMethod);
		
		//인스턴스 메소드일 경우 람다식
		 Computer com = new Computer();
		 person.action((x,y)->com.instanceMethod(x, y));
		
		//인스턴스 메소드일 경우 람다식이 아닌 참조
		 person.action(com :: instanceMethod);
		 
	}

}
