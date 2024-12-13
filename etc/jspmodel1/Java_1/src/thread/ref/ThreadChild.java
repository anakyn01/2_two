/*
 * package thread.ref;
 * 
 * import java.awt.Toolkit;
 * 
 * public class ThreadChild extends Thread{
 * 
 * Thread thread = new Thread(new Runnable()) {
 * 
 * @Override public void run() { Toolkit toolkit = Toolkit.getDefaultToolkit();
 * for(int i=0; i<5; i++) { toolkit.beep(); try
 * {Thread.sleep(500);}catch(Exception e) {} } }
 * 
 * }; thread.start(); for(int i=0; i<5; i++) { System.out.println("띵"); }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */
/**
스레드 객체를 생성하는 또다른 방법은
Thread의 자식 객체로 만드는 것이다
Thread 클래스를 상속한 다음에 run 메소드를 재정의 하여
스레드가 실행할 코드를 작성하고 객체를 생성하면 된다

*/
