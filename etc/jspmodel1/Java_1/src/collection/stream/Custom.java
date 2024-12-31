package collection.stream;

import java.util.Arrays;
import java.util.List;

public class Custom {

	public static void main(String[] args) {
		List<St3> studentList = Arrays.asList(
			new St3("최가영",100),	
			new St3("김효성",100),	
			new St3("감자",95));
//방법1
int sum1 = studentList.stream().mapToInt(St3 :: getScore).sum();		
System.out.println("sum1 : " + sum1);
//방법2
int sum2 = studentList.stream().mapToInt(St3 :: getScore).reduce(1, (a, b) -> a+b);
System.out.println("sum2 : " + sum2);
System.out.println("BinaryOperator는 함수형 인터페이스 두개의 매개값을 받아 하나의 값을 리턴하는 apply()메소드를 가지고 있다");
	}

}
/*
요소 커스텀 집계
스트림은 기본 집계 메소드인
sum(), average(), count(), max(), min()을 제공하지만 
다양한 집계 결과물을 만들수 있도록 reduce()메소드를 제공한다 

Stream => Optional<T>, T reduce
IntStream => OptionalInt, int(int identity,BinaryOperator)
LongStream => OptionalLong, long
DoubleStream OptionalDouble, double

int sum = stream.reduce((a,b) -> a+b).getAsInt();
스트림에 요소가 없을 경우 예외가 발생하지만
identity매개값이 주어지면 이 값을 디퐅르 값으로 리턴한다

int sum = stream.reduce(0, (a, b) -> a + b);

아래의 예제에서는 기본 집계 메소드 sum()과 동일한 결과를 산출하는
reduce() 메소드를 사용해 봅니다 
*/