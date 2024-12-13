package thread.ref;

public class SafeShutDown {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		printThread.setStop(true);
	}

}
/*
스레드는 자신의 run()메소드가 모두 실행되면 자동적으로 종료되지만
경우에 따라서는 실행중인 스레드를 즉시 종료할 필요가 있습니다
예를 들어 음악을 듣다가 전화가 와서 전화를 받는 경우(사용자가 멈춤을 요구하는 경우)

스레드를 강제 종료시키기 위해서 Thread는 stop()메소드를 제공하고 있으나
이 메소드는 deprecated(더 이상 사용하지 않음)
그 이유는 스레드를 갑자기 종료할 경우 사용중이던 리소스들이 불안정한 상태로
남겨지기 때문이다
여기에서 리소스란 파일, 네트워크 연결 등을 말한다

스레드를 안전하게 종료하는 방법은 사용하던 리소스들을 정리하고 run() 메소드를
빨리 종료하는 것이다
주로 조건 이용방법과 interrupt()메소드 이용방법을 사용한다

1) 조건 이용
private boolean stop; stop 필드선언
public void run() {
	while(!stop) { //stop이 true가 되면 while문을 빠져 나감
	//스레드가 반복 실행하는 코드
	}
	//스레드가 사용한 리소스 정리
}//스레드 종료

 
 
 
 
 
 
*/