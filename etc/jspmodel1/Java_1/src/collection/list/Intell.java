package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Intell {

	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<Board> uml = new ArrayList<>();
		
		//객체추가
		uml.add(new Board("객체간의 동적 상호작용을 시간 개념을 중심으로 모델링 하는것","일반적으로 다이어그램의 수직 방향이 시간의 흐름을 나타낸다","회귀 메세지 제어블록으로 구성된다"));
		uml.add(new Board("난","UML다이어그램","에 순차다이어 그램이다"));
		uml.add(new Board("제목3","내용3","글쓴이3"));
		
		//특정 인덱스 객체 가져오기
		Board board = uml.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		//저장된 총 객체수 얻기
		int size = uml.size();
		System.out.println("총 객체수: "+ size);
		System.out.println();
		
		//모든 객체 반복
		for (int i=0; i < uml.size(); i++) {
			Board b = uml.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		//삭제
		uml.remove(2);
		//uml.remove(2);
		
		//for
		for(Board b:uml) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		
		
		
	}

}
