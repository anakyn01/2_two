package thread.ref;

public class Yield extends Thread{
	
	public boolean work = true;
	
	//생성자
	public Yield(String name) {
		setName(name);
	}
	//메소드 
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + " : 작업처리");
			}else {
				Thread.yield();
			}
		}
	}



}
/*
다른 스레드에게 실행을 양보
스레드가 처리하는 작업은 반복적인 실행을 위해 for문이나
while문을 포함하는 경우가 많아요
그래서 가끔 반복문이 무의미한 반복을 하는 경우가 있다
아래의 코드를 확인해 보아요

public void run() {
 	while(true) { but => false일 경우 어떠한 실행문도 실행하지 않고 무의미한 반복을 함
  		if(work) {
  		System.out.println("난 참일경우만 반복해");
  		} else {
  		Thread.yield();
  		}
 	}
}

asap
이럴 때 다른 스레드에게 실행을 양보하고 자신은 실행 대기 상태로 가는 것이 프로그램 성능에 
도움이 된다.
이런 기능을 위해 Thread는 양보 yield() 메소드를 제공
yield() 호출한 스레드는 실행대기 상태로 돌아가고 다른 스레드 실행 상태가

위에 예제에서는 처음 5초 동안 ThreadA와 B가 번갈아 실행하다가 
5초뒤에 메인스레드가 필드를 거짓 변경하므로써 
yield() B가 더 많은 실행기회를 얻는다

그리고 10초뒤에 A가 참으로 변경해서
A와 B가 번갈아 가며 실행되도록 하자


*/