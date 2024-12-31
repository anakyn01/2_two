package thread.ref;

public class YieldRun {
	
	public static void main(String[] args) {
		Yield workThreadA = new Yield("workThreadA");
		Yield workThreadB = new Yield("workThreadB");
		workThreadA.start();
		workThreadB.start();//상속받은 스레드를 커멘드하여 실행
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		workThreadA.work = false;
		
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
		workThreadA.work = true;
			
		

	}

}
