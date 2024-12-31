package lambda.expression.return2;

public class Person {
	public void action(Calc calc) {
		double result = calc.calc(10,4);
		System.out.println("결과 : " + result);
	}
}
