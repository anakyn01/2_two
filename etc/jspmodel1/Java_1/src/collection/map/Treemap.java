package collection.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		//엔트리 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//특정키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		
		entry = treeMap.lastEntry();
		System.out.println("제일 뒷 단어: " + entry.getKey() + "-" + entry.getValue());
		
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 위의 단어: " + entry.getKey() + "-" + entry.getValue());
		
		
		//범위 검색
		System.out.println("[c~h 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true,"h",false);
		for (Entry <String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
		/* 이진 트리를 기반으로한 Map 컬렉션이다
		 TreeSet과의 차이점은 키와 값이 저장된 Entry를 저장한다는 점이다
		 TreeMap에 엔트리를 저장하면 키를 기준으로 자동정렬되는데
		 부모 키 값과 비교해서 낮은것은 왼쪽 높은것은 오른쪽 자식노드에
		 Entry 객체를 저장한다
		 노드 => 트리구조에서 데이터의 상하위 계층을 나타내는 위치의 항목
		 Map.Entry<k,v> firstEntry => 제일낮은 Map.Entry를 리턴
		 Map.Entry<k,v> lastEntry => 제일높은 Map.Entry를 리턴
		 Map.Entry<k,v> lowerEntry(K key) => 주어진 키보다 바로아래 Map.Entry를 리턴
		 Map.Entry<k,v> higherEntry(K key) => 주어진 키보다 바로 위 Map.Entry를 리턴
		 Map.Entry<k,v> floorEntry(K key) => 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
		 없다면 주어진 키 바로 아래의 Map.Entry를 리턴
		 Map.Entry<k,v> ceilingEntry(K key) => 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
		 없다면 주어진 키 바로 위의 Map.Entry를 리턴
		 Map.Entry<k,v> pollFirstEntry() => 제일낮은 Map.Entry를 꺼내오고 컬렉션 제거함
		 Map.Entry<k,v> pollLastEntry() => 제일높은 Map.Entry를 꺼내오고 컬렉션 제거함
		 NavigableSet<K> descendingKeySet() => 내림 차순으로 정렬된 키의 NavigableSet을 리턴
		 NavigableMap<K,V>descendingMap()   => 내림 차순으로 정렬된 키의 Map.Entry의 NavigableMap을 리턴
		
		 NavigableMap<K,V>headMap() => 주어진 키보다 낮은 Map.Entry들을 NavigableMap을 리턴
		 [두번째 매개 값에 따라 달라짐]
		
		 NavigableMap<K,V>tailMap() => 주어진 객체보다 높은 Map.Entry들을 NavigableMap을 리턴
		 [객체 포함여부는 두번째 매개 값에 따라 달라짐]
		 
		 NavigableMap<K,V>subMap() => 시작과 끝으로 주어진 키 사이의 Map.Entry들을  NavigableMap 컬렉션으로 변환
		 [Entry 포함여부는 두 번째 네번째 매개 값에 따라 달라짐]
		 
		 
		 
		 
		 */

	}

}
