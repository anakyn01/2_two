package thread.ref;

public class PrintThread extends Thread {
	private boolean stop;

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		//외부에서 stop 필드값을 변경할수 있도록 Setter선언
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {//stop 필드값에 따라 반복 여부 결정
			System.out.println("실행중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행종료");
		
	}
	
	
}
