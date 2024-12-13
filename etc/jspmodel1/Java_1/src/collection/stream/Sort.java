package collection.stream;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	/**
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list = new ArrayList<>();
list.add("배현주");list.add("배현주");list.add("배현주");
list.add("감자");list.add("고구마");

//중복요소 제거
list.stream().distinct().forEach(n -> System.out.println(n));
System.out.println();

//배로 시작하는 요소만 필터링	
list.stream().filter(b -> b.startsWith("배")).forEach(b-> System.out.println(b));
System.out.println();

//중복을 제거하고 배로 시작하는 요소만 필터링
list.stream().distinct().filter(b -> b.startsWith("배")).forEach(b-> System.out.println(b));
System.out.println();

	}

}
