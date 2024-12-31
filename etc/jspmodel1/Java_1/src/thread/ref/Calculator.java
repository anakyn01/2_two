package thread.ref;

public class Calculator {
private int memory;

public int getMemory() {
	return memory;
}

	public synchronized void setMemory1(int memory) {//동기화 메소드
		this.memory = memory;//메모리값 저장
		try {
			Thread.sleep(2000);//2초간 일시 정지
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		//현재 스레드의 메모리값 읽기 
	}

	public void setMemory2(int memory) {
		
		synchronized(this) {//동기화 블록
			this.memory = memory;
			try {
				Thread.sleep(2000);//2초간 일시 정지
			}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
			//현재 스레드의 메모리값 읽기 
		}
	}
// Memory1,2는 하나의 스레드만 실행 가능한 메소드가 된다
}
