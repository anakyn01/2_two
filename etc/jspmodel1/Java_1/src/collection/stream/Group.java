package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group {

	public static void main(String[] args) {
		List<Sex> totalList = new ArrayList<>();
		totalList.add(new Sex("A","남",92));
		totalList.add(new Sex("B","여",87));
		totalList.add(new Sex("C","남",95));
		totalList.add(new Sex("D","여",93));
		
		Map<String, List<Sex>> map = totalList.stream().collect(
		Collectors.groupingBy(s -> s.getSex()));
				
				
		List<Sex> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
	
		List<Sex> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		
		Map<String, Double>nextjs = totalList.stream().collect(
				Collectors.groupingBy(s -> s.getSex(), Collectors.averagingDouble(s->s.getScore()))
				);
		System.out.println(nextjs);
		
	}

}
/*
collect()메소드는 단순히 요소를 수집하는 기능 이외에 컬렉션의 요소들을
그룹핑해서 Map객체를 생성하는 기능도 제공한다
Collectors.groupingBy()메소드에서 얻은
Collector를 collect()메소드를 호출할때 제공하면 된다

그룹핑후에 매핑 및 집계(평균, 카운팅, 연결, 최대, 최소, 합계)를 수행할 수 있도록
매개값인 Collector 가질수 있다

아래는 두번째 매개값으로
사용될 Collector를 얻을 수 있는 Collectors의 정적메소드이다

mapping() : 매핑
averagingDouble() : 평균값
counting() : 요소수
maxBy() : 최대값
minBy() : 최소값
reducing() : 커스텀 집계 값

Map<String, List<Student>>map = totalList.stream()
.collect(
Collectors.groupingBy(s -> s.getSex()) //그룹핑 키를 리턴
)



 */