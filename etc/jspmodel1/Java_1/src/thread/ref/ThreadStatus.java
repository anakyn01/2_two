package thread.ref;

import java.awt.Toolkit;

public class ThreadStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Toolkit toolkit = Toolkit.getDefaultToolkit();
for (int i=0; i<10; i++) {
	toolkit.beep();//비프음을 3초에 한번씩 발생
	//seTimeOut[한번만], setInterval[주기적으로] => 비동기
	try {
		Thread.sleep(3000);	
	}catch(InterruptedException e) {
		
	}
}
	}

}
/*
스레드 상태
1) 스레드 객체를 생성(new)하고 => start()메소드를 호출하면 곧바로 스레드가
실행되는 것이 아니라 아래에 3가지[실행,실행대기,일시정지]에서 반복을 한다

[실행대기] -> [실행]
[실행] -> [실행대기] -> [일시정지] -> [종료]

method
일시정지로 보냄
sleep(long millis) : 주어진 시간동안 스레드를 일시 정지상태로 만든다
주어진 시간이 지나면 자동적으로 실행 대기상태가 된다
join() : 메소드를 호출한 스레드는 일시 정지 상태가 된다
실행대기 상태가 되려면, join()메소드를 가진 스레드가 종료되어야 한다
wait() : 동기화 블록 내에서 스레드를 일시 정지 상태로 만든다

일시 정지에서 벗어남
interrupt() : 일시 정지 상태일 경우, InterruptedException을 발생시켜
실행대기 상태 또는 종료 상태로 만들어 준다
notify() : wait 메소드로 인해 일시 정지 상태인 스레드하나를 실행대기 상태로 만든다
nottifyAll() : wait 메소드로 인해 일시 정지 상태인 모든스레드를 실행대기 상태로 만든다

실행 대기로 보냄
yield() : 실행 상태에서 다른 스레드에게 실행을 양보하고 실행대기 상태가 된다
*/ 
