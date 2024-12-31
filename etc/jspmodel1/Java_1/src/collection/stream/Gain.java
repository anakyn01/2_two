package collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Gain {
	public static int sum;//정적 (static) 멤버선언 공용으로 사용하느냐 아니냐 판단한다
	//그냥 생성 한다면 자동으로 인스턴스로 생성되고 정적으로 생성하려면 필드와 메소드 선언시 static이라는 키워드를 추가적으로 붙인다
	//타입 필드 초기값
	
	public static void main(String[] args) {
/**
 숫자 범위로 부터 스트림 얻기
 range()[라스트 인덱스 미포함], rangeClosed()[라스트 인덱스 미포함] 
 특정 범위의 정수 스트림을 얻을수 있다
 */

		
		// 배열로 부터 스트림 얻기 아래는 문자열 배열과 정수 배열로 부터 스트림을 얻는다
String[] strArray = {"홍길동","신용재","김미나"};
Stream<String> strStream = Arrays.stream(strArray);
strStream.forEach(item -> System.out.println(item + ","));
System.out.println("\t");

int[] intArray = {1,2,3,4,5};
IntStream intStream = Arrays.stream(intArray);
intStream.forEach(item -> System.out.println(item + ","));
System.out.println();		
		
		
		
List<Product> list = new ArrayList<>(); //배열을 담기 위한 껍데기 

for (int i=1; i <= 5; i++) {
	Product product = new Product(i, "상품"+i, "평생직장", (int)(10000*Math.random()));
	list.add(product);
}

//객체 스트림 얻기
Stream<Product> stream = list.stream();
stream.forEach (shot -> System.out.println(shot));



	}

}
