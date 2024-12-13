package oop;

import java.util.HashSet;
/*
 java HashSet => 고유하다
 contains => 항목이 존재 하는지 확인
 remove() => 제거
 clear() => 항목 전체 제거
 size() => 크기
 */
public class Hashset {

	public static void main(String[] args) {
		//응용
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);
		
		for(int i = 1; i <= 10; i++) {
			if(numbers.contains(i)) {
				System.out.println(i+"존재하는 숫자 입니다");
			}else {
				System.out.println(i + "동수");
			}
		}
		
		
		HashSet<String> car = new HashSet<String>();
		car.add("김효성");
		car.add("김효성");
		car.add("서영철");
		car.add("서영철");
		car.add("서영철");
		car.add("서영철");
		car.add("서영철");
		car.add("서영철");
		car.add("이준영");
		car.add("이준영");
		
		System.out.println(car);
		System.out.println(car.contains("배현주"));
	}

}
