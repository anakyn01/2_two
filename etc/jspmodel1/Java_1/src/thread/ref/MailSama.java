package thread.ref;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MailSama {

	public static void main(String[] args) {
		String[][] mails = new String[1000][3];//배열의 사이즈
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "상품입고";
		}
ExecutorService executorService = Executors.newFixedThreadPool(5);

	//이메일 천개 보내기
	for(int i=0; i<1000; i++) {
		final int idx = i;
		executorService.execute(new Runnable() {
			@Override
			public void run() {
Thread thread = Thread.currentThread();
//현재 스레드 무슨 작업을 하는지 확인하고 싶다면
String from = mails[idx][0];
String to = mails[idx][1];
String content = mails[idx][2];
System.out.println("["+thread.getName()+"]"+from+"==>"+to+": "+content);
		}
		});
	}
	executorService.shutdown();

	}

}
