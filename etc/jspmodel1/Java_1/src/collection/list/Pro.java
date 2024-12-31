package collection.list;

import java.util.Properties;

/*
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
public class Pro {

	public static void main(String[] args) throws Exception {
		
		//Properties 컬렉션 생성
		Properties properties = new Properties();
		//TreeMapSet.class와 동일한 ClassPath안에 있는 database.properties파일 로드
		properties.load(Pro.class.getResourceAsStream("database.properties"));
		//getResourceAsStream 전달받은 리소스 이름이 절대경로 "/"로 시작하는지 본다
		
		//주어진 키에 대한 값을 읽는다
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);

	}

}
