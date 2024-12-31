package thread.ref;

import java.awt.Toolkit;
import java.util.Iterator;

/*작업 스레드 생성과 실행
병렬 inline 한줄에 여러개가 같이 있는 것
멀티 스레드로 실행하는 프로그램을 개발하려고 하면
먼저 몇개의 작업을 병렬로 실행할지 결정하고 각 작업별로 스레드를 생성해야 한다
예를 들어 스레드를 2개인지 3개인지
메인스레드 (프로그램시작) 스레드1(네트워크) 스레드2(드로잉)

자바프로그램은 메인스레드가 반드시 존재하기 때문에 메인작업 이외에 추가적인
작업수만큼 스레드를 생성하면 됩니다
자바는 작업스레드도 객체를 관리하므로 클래스가 필요합니다
Thread클래스로 직접 개체를 생성해도 되지만
하위 클래스로 만들어 생성할수도 있습니다

Thread 클래스로 직접생성
Thread thread = new Thread(Runnable target);

Runnable 스레드가 작업을 실행할 때 사용하는 인터페이스이다.
Runnable은 run()메소드가 정의되어 있다
class Task implements Runnalbe {
@Override
public void run(){
//스레드가 실행할 코드
}

작업스레드 객체가 생성되었다고 해서 바로 작업스레드가 실행되지 않는다
작업 스레드를 실행하려면 스레드 객체의 start()메소드를 아래와 같이 호출해야 한다
thread.start();

main thread -> new Thread(task) => class task implements Runnable{
start() 메소드 호출 => public void run(){

*/
public class Con1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();//Toolkit 객체얻기
		for(int i =0; i<5; i++)
			toolkit.beep();//비프음 발생
			try {Thread.sleep(500);} catch (Exception e) {}
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {Thread.sleep(500);} catch (Exception e) {}
			}

	}

}
