package collection.list;

import java.util.ArrayList;
import java.util.List;

public class VecTor {

	public static void main(String[] args) {
		// Vector 컬렉션 생성
		//List<Board> list = new Vector<>();
		//ArrayList로 처리할경우
		List<Board> list = new ArrayList<>();
		
		//작업 스레드 객체 영역
		Thread threadA = new Thread() {
			@Override
			public void run() {
			//객체 1000개 추가
				for (int i=1; i <= 1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 영역
		Thread threadB = new Thread() {
			@Override
			public void run() {
			//객체 1000개 추가	
				for (int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
	
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때 까지 메인 스레드를 기다리게 함
		try {
			threadA.join(); //스레드 실행시 반드시 해야함 순서대로 실행하고자 할때
			threadB.join(); 
		}catch(Exception e) {
			
		}
		
		//저장된 총 객체수 얻기
		int size = list.size();
		System.out.println("총객체수: " + size);
		
		String vt = "Vector\n" +
		"vecotr는 ArrayList와 동일한 내부구조를 가지고 있다\n" +
		"차이점은 Vector는 동기화된 synchronized메소드로 구성되어있기 때문에\n" +
		"멀티 스레드가 동시에 Vector() 메소드를 실행할수 없다는 것이다\n" +
		"그렇기 때문에 멀티스레드 환경에서 안전하게 객체를 추가 또는 삭제할수 있다";
		System.out.println(vt);
		
		
		
		
	}

}
