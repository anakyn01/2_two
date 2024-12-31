package thread.ref;

public class User1Thread extends Thread {
	
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread"); //스레드 이름변경
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}//외부에서 공유 객체인 Calculator를 필드에 저장
	@Override
	public void run() {
		calculator.setMemory1(100);//동기화 메소드 호출
		
	}

}