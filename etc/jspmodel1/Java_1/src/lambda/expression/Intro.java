/*
 함수형 프로그래밍
 함수를 정의하고 이함수를 데이터 처리부로 보내
 데이터를 처리하는 기법을 말한다
 데이터 처리부는 데이터만 가지고 있을 뿐
 처리 방법이 정해져 있지 않아서
 외부에서 제공된 함수에 의존한다
 
 동일한 데이터라도 함수 A를 제공해서 처리하는 결과와
 함수 B를 제공해서 처리하는 결과가 다를수 있다
 이것이 함수형 프로그래밍의 특징이다
 
 자바는 함수형 프로그래밍을 위해서 java8부터
 Lambda Expression 을 지원한다
 */
package lambda.expression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Intro {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		//numbers.forEach((n) -> {System.out.println(n);});
		
		Consumer <Integer> method = (n) -> {System.out.println(n);};
		numbers.forEach(method);
		
		String Lambda = "자바 람다 표현식\n" +
		"Java 8에서 추가됨\n" +
		"매개변수를 받아서 값을 반환하는 짧은 코드블록\n" +
		"매서드 비슷하지만 이름이 필요없고\n" +
		"매서드 본문에서 바로 구현할수 있습니다\n" +
		"syntax\n" +
		"parameter -> expression\n" +
		"두개 이상일 경우\n" +
		"(para1, para2) -> {code block}\n" +
		"표현에 제한이 있습니다\n" +
		"즉시 값을 리턴해야 하며\n" +
		"변수, 할당 if같은 명령문을 포함할수 없다\n" +
		"값을 반환해야 하는경우 return이 필요합니다\n";
		System.out.println(Lambda);

	}

}
