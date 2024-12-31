package thread.ref;

public class Daemon {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);//데몬 스레드(보조 스레드)로 만듬
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {	
		}
		System.out.println("메인 스레드 종료");
	}

}
/*
데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드이 다
주 스레드가 종료되면 데몬 스레드도 따라서 자동으로 종료됩니다
데몬스레드를 적용한 예는 워드프로세서의 자동저장, 미디어 플레이어 
동영상 및 음악재생, 가비지 컬렉터 
스레드를 데몬으로 만들기 위해서는 주 스레드가 데몬이 될 스레드의
setDaemon(true)를 호출하면 된다
*/