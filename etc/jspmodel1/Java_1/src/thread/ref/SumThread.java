package thread.ref;

public class SumThread extends Thread{
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int z=1; z<=100; z++) {
			sum += z;//기존에 있던 값에 더한다
			
		}
	}

}
