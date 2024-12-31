package collection.list;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
	//Hashtable 컬렉션 생성
	Map<String, Integer>map = new Hashtable<>();
	// 오류 남 Map<String, Integer>map = new HashMap<>();
		
	//A
	Thread threadA = new Thread() {//스레드 객체 생성
		@Override
		public void run() {
			for (int i = 1; i<= 1000; i++) {
				map.put(String.valueOf(i), i);
			}
		}
		
	};
	//B
	Thread threadB = new Thread() {//스레드 객체 생성
		@Override
		public void run() {
			for (int i = 1001; i<= 2000; i++) {
				map.put(String.valueOf(i), i);
			}
		}
		
	};
	
	//작업스레드 실행 순서준수
		threadA.start();
		threadB.start();
	
	try {//순차적으로 동시 실행이 아닌 문제는 스레드를 스타트 시키고 해야됨
		threadA.join();
		threadB.join();
	} catch (Exception e) {
		
	}
	
	
	
	//총 엔트리
	int size = map.size();
	System.out.println("총 엔트리 수 : " + size);
	System.out.println();
	
		String table = "Hashtable\n"+
		"- HashMap과 동일한 내부 구조를 가지고 있다\n"+
		"- 차이점은 Hashtalbe은 동기화된 메소드로 구성되어 있다\n" +
		"- 멀티스레드에서 동시에 Hashtable메소드를 실행할수 없다\n" +
		"- 멀티 스레드 환경에서도 안전하게 객체를 추가, 삭제 할수 있다";
		System.out.println(table);

	}

}
