package collection.stream;

import java.util.ArrayList;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		//매핑은 스트림의 요소를 다른 요소로 변환하는 중간처리 기능 매핑메소드는 mapXxx(),asDoubleStream().boxed,flat
	List<Student2> studentList = new ArrayList<>();
	studentList.add(new Student2("최가영",10));
	studentList.add(new Student2("김효성",92));
	studentList.add(new Student2("서영철",87));
	
	studentList.stream().mapToInt(s -> s.getScore()).forEach(s -> System.out.println(s));
	}
}
