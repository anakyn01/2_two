package thread.ref;

public class WaitNotify {

	public static void main(String[] args) {
WorkObject workObject = new WorkObject(); //공유 작업 객체 생성

ThreadA threadA = new ThreadA(workObject);
ThreadB threadB = new ThreadB(workObject);

threadA.start();
threadB.start();
	}

}
/*
wait()과 notify()를 이용한 스레드 제어
경우에 따라서는 두개의 스레드를 교대로 번갈아 가며 실행할 때가 있다
정확한 교대 작업이 필요할 경우
자신의 작업이 끝나면 상대방 스레드를 일시정지 상태에서 풀어주고 
자신은 일시 정지상태로 만들면 된다

이 방법의 핵심은 공유 객체에 있다
공유 개체는 두스레드가 작업할 내용을 각각 동기화 메소드로 정해 놓는다

한스레드가 작업을 완료하면 notify()메소드를 호출해서
일시 정지상태에 있는 다른 스레드를 실행 대기 상태로 만들고
자신은 두 번 작업을 하지 않도록 wait()메소드를 호출하여 
일시 정지 상태로 만든다

notify()는 wait()에 의해 일시정지된 스레드중에 한개를 실행 대기 상태로
만들고 notifyAll()은 wait에 의해 일시정지된 모든 스레드를 실행 대기
상태로 만든다 

주의할점은 이 두메소드는 동기화 메소드 또는 동기화 블록 내에서만 
사용할수 있다는 것이다

위에 예제는 동기화 메소드인 mA, mB로 정의하여 교대로
mA, mB를 호출하도록 한다 


*/