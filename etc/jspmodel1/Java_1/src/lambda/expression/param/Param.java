package lambda.expression.param;

public class Param {
/*
매개변수가 있는 람다식
- 매개변수를 선언할때 타입은 생략할수 있고
- 구체적인 타입대신에 var를 사용할수도 있지만
- 대부분 타입을 생략하고 작성하는것이 일반적이다
- 매개변수가 하나일 경우에는 괄호를 생략할수 있다
이때는 타입또는 var를 붙일수 없다 
 */
	public static void main(String[] args) {
		Person person = new Person();
		
		//매개변수가 두개일 경우
		person.action1((name, job)->{
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다");
			
		});
		person.action1((name, job)->System.out.println(name + "이" + job + "을 하지않습니다"));
		
		//매개변수가 한개일 경우
		person.action2(word ->{System.out.print("\" "+word+"\""); System.out.println();});
		person.action2(word ->System.out.println("\" "+word+"\"라고외칩니다."));
	}

}
