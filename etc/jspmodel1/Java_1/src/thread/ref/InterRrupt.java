package thread.ref;

public class InterRrupt {

	public static void main(String[] args) {
		Thread thread = new PrintTh();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		thread.interrupt();
		}

}
