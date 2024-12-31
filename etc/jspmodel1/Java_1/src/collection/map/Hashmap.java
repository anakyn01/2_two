package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
Map <K, V> map = new HashMap<K, V>();

저장된 키와 값의 타입이 HashMap과 동일할 경우new HashMap<>()를 사용할수 있다
Map <String, Integer> map = new HashMap<K, V>();
모든 타입이 키와 객체를 저장할수 있도록 HashMap을 아래와 같이 생성할수 있지만
이런 경우는 거의 없습니다
Map map = new HashMap();


검색 기능을 강화시킨 TreeSet[Set], TreeMap[Map]컬렉션 입니다
TreeSet은 이진트리(binary tree)를 기반으로 한 Set컬렉션
하나의 노드로 시작해서 각 노드에 최대 2개의 노드를 연결할수 있는 구조를 가지고 있다

검색 메소드
- first() : 제일 낮은 객체를 리턴
- last() : 제일 높은 객체를 리턴
- lower(E e) : 주어진 객체보다 바로 아래 객체를 리턴
- higher(E e) : 주어진 객체보다 바로 위 객체를 리턴
- ceiling(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 위의 객체를 리턴
- pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
- pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함
- Iterator<E> descendingIterator() : 내림차순으로 정렬된 iterator를 리턴
- NavigableSet<E> descendingSet() : 내림차순으로 정렬된 NavigableSet을 리턴
- NavigableSet<E> headSet() : 주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴
- NavigableSet<E> tailSet() : 주어진 객체보다 높은 객체들을 NavigableSet으로 리턴
- NavigableSet<E> subSet() : 시작과 끝으로 주어진 객체사이의 객체들을 NavigableSet으로 리턴

NavigableSet SortedSet을 상속하는 인터페이스이다

TreeMap 
- TreeSet과 차이점은 키와 값이 저장된 Entry를 저장 한다는 점이다
- TreeMap에 엔트리를 저장하면 키를 기준으로 자동정렬이 되는데 
부모 키 값과 비교하여 낮은 것은 왼쪽,높은 것은 오른쪽 자식노드에
Entry개체를 저장한다
*/

public class Hashmap {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("서영철",85);
		map.put("김효성",90);
		map.put("성승환",80);
		map.put("김효성",95);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키 set컬렉션을 얻고 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		//키 반복하기 위해서 반복자를 얻음
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리 set컬렉션을 얻고 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
	}

}
