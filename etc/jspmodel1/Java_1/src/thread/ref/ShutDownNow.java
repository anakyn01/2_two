package thread.ref;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownNow {

	public static void main(String[] args) {
//스레드풀 생성
ExecutorService executorService = Executors.newFixedThreadPool(5);
//작업생성과 처리 요청 하나의 작업은 Runnable 또는 Callable구현 객체로 표현합니다
//Runnalbe과 Callable의 차이점은 작업처리 완료후 리턴값이 있느냐 없느
//스레드풀 종료
executorService.shutdownNow();

	}

}
/*
new Runnalbe(){
@Override
public void run(){
}
}

new Callable<T>(){
@Override
public T call() throws Exception{
return T;




*/