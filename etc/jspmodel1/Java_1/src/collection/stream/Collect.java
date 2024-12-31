package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		List<Sex> totalList = new ArrayList<>();
		totalList.add(new Sex("홍길동","남",92));
		totalList.add(new Sex("김수영","여",87));
		totalList.add(new Sex("김우성","남",95));
		totalList.add(new Sex("오해영","여",93));
		
		//남학생만 묶어서
		List<Sex> maleList = totalList.stream()
				.filter(s -> s.getSex().equals("남"))
				.collect(Collectors.toList());
		
				maleList.stream().forEach(s->System.out.println(s.getName()));
				System.out.println();
		
		
		//남학생만 묶어서 java 16이후
		List<Sex> maleList2 = totalList.stream()
				.filter(s -> s.getSex().equals("남")).toList();
				maleList2.stream().forEach(s->System.out.println(s.getName()));
				System.out.println();
	}

}
/*
스트림은 요소들을 필터링 또는 매핑한후 요소들을 수집하는 최종처리 메소드인
collect()를 제공한다
이 메소드를 이용하면 필요한 요소만 컬렉션에 담을 수 있고
요소들을 그룹핑한 후에 집계도 할수 있다

collect(Collector<T(요소),A(누적기),R(스트림 요소가 저장될 컬렉션)> collector)
T 요소를 A 누적기가 R에 저장한다는 의미이다

아래의 예시는 Student 스트림에서 남학생만 필터링해서 별도의 List로 생성하는 코드이다
List<Student> maleList = totalList.stream().filter(s -> s.getSex().equals("남"))
.collect(Collectors.toList());

Map<String, Integer>map = totalList.stream()
.collect(
Collectors.toMap(
s -> s.getName(), 키가 될 부분
s -> s.getScore() 값이 될 부분
)
);

자바 16부터 좀더 편리하게 요소 스트림에서 List컬렉션을 얻을 수 있다
스트림에서 toList()메소드를 아래와 같이 사용하면 된다

List<Student> maleList = totalList.stream()
.filter(s -> s.getSex().equals("남"))
.toList();
*/
