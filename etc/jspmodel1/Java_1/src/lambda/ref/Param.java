package lambda.ref;
/*
 매개변수의 메소드 참조
 람다식에서
 (a,b) -> {a.instanceMethod(b);}
 
 a 매개변수의 메소드를 호출해서 b매개변수 매개값으로 사용한다
 
 위에 사항을 메소드참조로 표현하면
 클래스 :: instanceMethod
 
 아래에 예제에서는 사람의 이름을 비교하기위해
 String 인스턴스메소드인 compareToIgnoreCase 메소드로 참조하는데
 사전 순으로 a가 b보다 먼저 오면 음수를 
 동일하면 0
 나중에 오면 양수를 리턴
 */
public class Param {

	public static void main(String[] args) {
		Ps ps = new Ps();
		ps.ordering(String :: compareToIgnoreCase);
		
	}

}
