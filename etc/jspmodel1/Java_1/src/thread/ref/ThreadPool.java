package thread.ref;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {

	public static void main(String[] args) {
//Executorservice생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//계산작업 생성 및 처리 요청
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				//Future<T> 매개변수 submit(new Callable<T>task)
				@Override
				public Integer call() throws Exception{
					int sum = 0;
					for (int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("["+thread.getName()+"] 1~" + idx + "합 계산");
					//어떤 스레드가 계산처리를 했는지 알수 있도록 출력
					return sum;//작업 처리결과 리턴
				}
				
			});
			//Callable의 call() 메소드가 리턴한 값 얻기 
			try {
				int result = future.get();
				System.out.println("\t리턴값 : " + result);
			}catch (Exception e) {
			e.printStackTrace();
			}
		}
executorService.shutdown();
	}

}
/*
병렬 작업 처리가 많아지면 스레드의 개수가 증폭하여 cpu가 바빠지고
메모리 사용량이 늘어난다
이에 따라 애플리케이션 성능이 급격히 저하됩니다
이렇게 병렬 작업증가로 인한 스레드의 폭증을 막으려면 
스레드풀을 사용하는 것이 좋습니다
스레드풀 생성
java.util.concurrent패키지에서 ExecutorService인터페이스와
Executors클래스를 제공하고 있다 
Executors클래스 두 정적 메소드를 이용하면
간단하게 스레드풀인 ExecutorService구현 객체를 만들수 있습니다

newCachedThreadPool() : 초기수(0) 코어수 (0) 최대수(Integer.MAX_VALUE)
스레드 갯수보다 작업개수가 많으면 새 스레드를 생성시켜 작업을 처리

newFixedThreadPool(int nThreads) :

ExecutorService executorService = Executors.newFixedThreadPool(5)
초기 0이고 작업개수가 많아지면 최대 5개까지 스레드를 생성시켜 작업을 처리
이스레드풀의 특징 생성된 스레드를 제거하지 않는다

초기수(0) 코어수 (0) 최대수(nThreads)
스레드 갯수보다 작업개수가 많으면 새 스레드를 생성시켜 작업을 처리
스레드가 작업을 처리하지 않고 놀고 있더라도 스레드 개수가 줄어들지 않는다

char 와 varchar20 10 이건 mysql 

초기수는 스레드풀이 생성될때 기본적으로 생성되는 스레드수를 말하고
코어수는 스레드가 증가된후 사용되지 않은 스레드를 제거할때
최소한의 풀에서 유지하는 스레드수를 말한다
그리고 최대수는 증가되는 스레드의 한도 수이다

스레드풀 종료
기본적으로 스레드풀의 스레드는 데몬스레드가 아니기 때문에
main스레드가 종료되더라도 작업을 처리하기 위해 계속 실행상태로 남아 있다
스레드풀의 모든 스레드를 종료하려면
ExecutorService의 아래의 두 메소드중 하나를 실행해야 합니다

void => shutdown() : 현재처리중인 작업뿐만 아니라 작업큐에 대기하고 있는 모든 작업을 처리한 뒤
스레드풀을 종료한다
List<Runnable> => shutdownNow()
: 현재 작업처리중인 스레드를 interrupt해서 작업을 중지시키고 스레드풀을 종료
리턴값은 작업 큐에 있는 미처리된 작업(Runnable)의 목록이다

*/ 
