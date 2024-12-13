package collection.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WrapperClass {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();
		
		//boxed
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
		
		
/**
래퍼 클래스는 원시자료형(type)이 아닌 클래스 객체임 
스트림에서 기본 타입요소를 래퍼객체 요소로 변환하려면 아래와 같이 간편화 메소드를 사용합니다
int -> long asLongStream()
int,long -> asDoubleStream() 확대

Stream<Integer><Long><Double>
-> boxed()
int -> Integer 원시값을 boxing 된 래퍼클래스로
long -> Long
double -> Double
*/
		

	}

}
