package basic;

public class Math2 {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		//큰값또는 작은값
		long v3 = Math.max(3,7);
		long v4 = Math.min(3,7);
		//소수 이하 두자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 /100.0;
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		System.out.println("v5="+v5);
		
	}

}
