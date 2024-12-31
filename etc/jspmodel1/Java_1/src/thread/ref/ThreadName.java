package thread.ref;

public class ThreadName {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); 
		//이코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(mainThread.getName() + "실행");
		
		for(int i=0; i<3; i++) {//ThreadA-n
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행");//스레드 이름얻기
				}
			};
			threadA.start();
		}
		
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start(); //작업스레드 이름변경
	}

}
/*
스레드는 자신의 이름을 가지고 있다
메인스레드는 main이름을 가지고 있고
작업스레드는 자동적으로 Thread-n 이라는 이름을 가진다
작업스레드 이름을 Thread-n 대신 다른 이름으로 설정하고 싶으면
Thread 클래스의 setName()메소드를 사용하면 된다
thread.setName("스레드 이름")

스레드 이름은 디버깅할때 어떤 스레드가 작업을 하는지 조사하는 목적으로
주로 사용된다 현재코드를 어떤 스레드가 있는지 확인하려면
정적 메소드인 currentThread()로 스레드의 객체 참조를 
얻은 다음 getName()메소드드로 이름을 출력해 보면 된다

Thread thread = Thread.currentThread();
System.out.println(thread.getName());


*/