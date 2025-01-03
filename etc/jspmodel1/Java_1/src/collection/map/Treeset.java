package collection.map;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// 무작위로 저장한 점수를 검색하는 방법
		TreeSet<Integer> scores = new TreeSet<>();
		// Integer 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for (Integer s : scores) {
			System.out.println(s + " ");
		}
		
		//특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위에 점수 : " + scores.higher(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점 이거나 바로 위에 점수 : " + scores.ceiling(85)+ "\n");
		
		/*
		 IteraTor<E> descendingIterator => 내림차순
		 NavigableSet<E> descendingSet() => 내림차순으로 정렬된 NavigableSet을 리턴
		 */
		
		//오름차순ascending (ASC[1,2,3,4]) 내림차순descending(DESC)
		
		//내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (Integer s : descendingScores) {
			System.out.println(s);
		}
		
		//범위 검색 (80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색 (80 <= score < 90)
		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		
	}

}
