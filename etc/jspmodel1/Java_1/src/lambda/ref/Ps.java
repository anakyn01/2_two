package lambda.ref;

public class Ps {
	public void ordering(Vs vs) {
		String a = "김효성";
		String b = "김효성";
		
		int result = vs.compare(a, b);
		
		if(result < 0) {
			System.out.println(a + "는 " + b + "보다 앞에 옵니다");
		}else if(result == 0) {
			System.out.println(a + "는 " + b + "와 같습니다");
		}else {
			System.out.println(a + "는 " + b + "보다 뒤에 옵니다");
		}
	}

}
