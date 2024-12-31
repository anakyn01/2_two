package collection.stream;

import java.util.Arrays;

/*
요소조건 만족 여부 (매칭)
매칭은 요소들이 특정 조건에 만족하는지 여부를 조사하는 최종처리 기능
매칭과 관련된 메소드는 아래와 같다

 리턴 타입 : 
 boolean 
 allMatch : 모든요소가 만족하는지 여부
 anyMatch : 최소한 하나의 요소가 만족하는지 여부
 noneMatch : 모든 요소가 만족하지 않는지 여부
*/
public class Maching {

	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr).allMatch(a -> a %2==0);
		System.out.println("모두 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr).anyMatch(a -> a%3==0);
		System.out.println("하나라도 3의 배수인가? " + result);
		
		result = Arrays.stream(intArr).noneMatch(a -> a%3==0);
		System.out.println("3의 배수는 없는가? " + result);

	}

}
