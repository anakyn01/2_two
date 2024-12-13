package collection.map;

import java.util.Stack;

public class LifoFifo {
	
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//Queue 인터페이스는 FIFO 선입선출을 구현한 대표적인 클래스는 LinkedList 
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {//비어있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			System.out.println("LIFO 자료 구조 Stack 후입선출");
		}
	}
/*
 후입선출 (LIFO last in first out) => 나중에 넣은 객체가 먼저 빠져나가고
 선입선출 (FIFO first in first out) => 먼저 넣은 객체가 먼저 빠져나가는 구조

컬렉션 프레임 워크에서 LIFO 자료구조를 제공하는 Stack 인터페이스를 제공함
컬렉션 프레임 워크에서 FIFO 자료구조를 제공하는 Queue 인터페이스를 제공함

스택을 응용한 대표적인 예가 jvm스택 메모리이다
스택메모리에 저장된 변수는 나중에 저장된 것 부터 제거된다

큐를 응용한 대표적인 예가 스레드풀의 작업큐이다
 */
	
}
