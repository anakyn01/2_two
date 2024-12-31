package lambda.expression.noparam;

public class NoParamRun {

	public static void main(String[] args) {
		
		Person person = new Person();

		//실행문이 두개 이상인 경우 중괄호가 필요
		person.action(()->{
			System.out.println("집에 가자");
			System.out.println("현실은 내일도 출근");
		});
		
		//실행문이 한개일 경우 중괄호 생략 가능
		person.action(()-> System.out.println("집에 가자"));
	}

}