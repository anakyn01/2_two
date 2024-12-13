package thread.ref;

public class Synch {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1thread = new User1Thread();
		user1thread.setCalculator(calculator);
		user1thread.start();
		
		User2Thread user2thread = new User2Thread();
		user2thread.setCalculator(calculator);
		user2thread.start();
//User1 실행할때 반대편 잠금
	}

}
/*
동기화 메소드 및 블록선언
멀티 스레드는 하나의 객체를 공유해서 작업할수도 있다
이 경우 다른 스레드에 의해 객체 내부 데이터가 쉽게 변경될수 있기 때문에
의도했던 것과 다른 결과가 나올수 있습니다

동기화 메소드를 선언하는 방법은 아래와 같이 synchronized 키워드를 붙이면 된다
이 키워드 인스턴스와 정적 메소드 어디든 붙일 수 있다

public synchronized void method(){
//단 하나의 스레드만 실행하는 영역
}

스레드가 동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나고
메소드 실행이 끝나면 잠금이 풀린다
그래서 메소드에 전체가 아닌 일부영역을 실행할때만 객체잠금을 걸고 싶다면
아래와 같이 동기화 블록을 만든다

public void method() {
//여러 스레드가 실행할수 있는 영역

	synchronized(공유객체){
	//단 하나의 스레드만 실행하는 영역
	}

//여러 스레드가 실행할수 있는 영역
}





*/