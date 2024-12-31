package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
Optional 클래스
optional, OptionalDouble, OptionalInt, OptionalLong클래스는
단순히 집계값만 저장하는 것이 아니라
집계값이 존재 하지 않을경우
디폴트 값을 설정하거나 
집계값을 처리하는 Consumer를 등록할수 있습니다
아래는 Optional 클래스가 제공하는 메소드입니다

boolean => isPresent() 집계값이 있는지 여부

T,double,int,long => orElse(T,double,int,long) 집계값이 없을 경우 디폴트 값 설정

void => ifPresent(Consumer, DoubleConsumer, IntConsumer, LongConsumer)
집계값이 있을경우 Consumer에서 처리

컬렉션의 요소는 동적으로 추가되는 경우가 많다
만약 컬렉션의 요소가 존재하지 않으면 집계값을 산출할 수 없어서
NosuchElementException(존재하지 않는것을 가져오려할때 발생)예외가 발생한다.

하지만 앞의 표에 언급되어 있는 메소드를 이용하면 예외를 막을수 있다

예를 들어 평균을 구하는 average를 최종처리에 사용할경우
아래와 같이 3가지 방법으로 요소(집계값)가 없는 경우대비를 할 수 있다

1)isPresent()메소드가 true를 리턴할때만 집계값을 얻는다

OptionalDouble optional = stream.average();
if(optional.isPresent()) {
System.out.println("평균 : " + optional.getAsDouble());
} else {
System.out.println("평균 : 0.0");
}

2)orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 정해 놓는다
double avg = stream.average(0.0);
System.out.println("평균 : " + avg);

3)ifPresent()메소드로 집계값이 있을 경우에만 동작하는 Consumer람다식을 제공한다
stream.average().ifPresent(a -> System.out.println("평균 : " + a));





*/
public class Optional {

	public static void main(String[] args) {
		int nums = 9; //원시값 => 원시자료형(더이상 단순화 될 수 없다)
		Integer nums2 = 10; //래퍼 클래스
		List<Integer> list = new ArrayList<>();//클래스 사용하여 객체생성
		//list.add(30);
		//list.add(20);
		
		//예외발생 double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		// 방법1
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());			
		}else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		//방법2
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		//방법3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("방법3_평균 : " + a));
		System.out.println("3번 방법은 집계값이 없으면 에러도 나오지 않고 아예 실행을 하지 않습니다");
	
	}

}
