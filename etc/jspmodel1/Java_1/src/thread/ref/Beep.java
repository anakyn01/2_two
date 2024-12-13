package thread.ref;

import java.awt.Toolkit;

public class Beep {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit  = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		thread.start();
		//문자열 출력하는 장치를 포함합니다
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}//0.5초간 자바
			//javascript setInterval 
		}
	}

}
