package thread.ref;

public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread twosomeplace = new SumThread(); //재귀 연산을 위하여..
		twosomeplace.start();
		try {
			twosomeplace.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~100합 : " + twosomeplace.getSum());
	}

}
/*
다른 스레드의 종료를 기다림
스레드는 다른 스레드와 독립적으로 실행하지만 다른 스레드가 종료될때까지 기다렸다가
실행을 해야하는 경우가 있다
예를 들어서 계산 스레드가 있는데
계산스레드의 작업이 종료된 후 그 결과값을 받아 처리하는 경우이다
이를 위해 스레드는 join()메소드를 제공한다




*/