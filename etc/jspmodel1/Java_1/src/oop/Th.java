package oop;

public class Th extends Thread{
	
	

	public static void main(String[] args) throws Exception{
		//스레드 생성 두가지 Threads클래스를 확장하고 해당 메서드를 재정의 하여 만듭니다		
		//스레드 객체 생성
		Th thread = new Th();
		thread.start();
		System.out.println("inside");
				
								
		String thread2 = "java Threads\n"+
		"클라이언트가 묻습니다\n" +
		"왜 자바스프링으로 개발하죠?\n"+
		"유지보수가 용이하고 멀티스레드 방식때문에 자바로 개발합니다\n"+
		"스레드를 사용하면 동시에 여러작업을 수행합니다 프로그램이 보다 효율적으로 작동할수 있습니다\n"+
		"스레드를 사용하면 기본 프로그램을 중단하지 않고 백그라운드에서 복잡한 작업을 수행할수 있습니다";
		System.out.println(thread2);
	}
	
	public void run() {
		System.out.println("outside");
	}

}
