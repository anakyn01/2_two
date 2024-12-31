package oop;

import java.util.LinkedList;
/*
 Java LinkedList
 ArrayList 와 거의 동일하지만
 구축되는 방식이 매우 다릅니다
 
 ArrayList => 요소가 추가되면 배열에 배치 => 새로운 요소가 추가되었기에
 이전배열은 제거하고 새로운 배열이 생성 
 
 LinkedList => 컨테이너에 저장됩니다 => 각컨테이너에는 목록이 다음 컨테이너에
 링크가 있습니다 목록에 요소를 추가하려면 요소가 새컨테이너에 배치되고
 해당컨테이너는 목록의 다른 컨테이너 중 하나에 연결됩니다
 
 기존 있던 배열에서 firstchild(왼쪽), lastchild(오른쪽)으로 붙습니다
addFirst()
 */


public class Linked {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
	//왼쪽 으론쪽 붙기
		cars.addFirst("왼쪽");
		cars.addLast("오른쪽");
	//개별 엑세스
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		System.out.println();
	//부분 삭제 출력하기 전에 삭제 합니다
		cars.removeFirst();
		cars.removeLast();				
		System.out.println(cars);
	}

}
