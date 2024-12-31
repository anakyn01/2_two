package thread.ref;

public class ThreadA extends Thread{
	
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {//공유 작업 개체를 받음
		setName("ThreadA");
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();//동기화 메소드 호출
		}
	}
}
