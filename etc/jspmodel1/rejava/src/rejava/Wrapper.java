package rejava;

public class Wrapper {

	//원시데이터 : byte,short,int,long,float,double,boolean,char
	//레퍼클래스 : Byte,Short,Integer,Long,Float,Double,Boolean,Character
	/*
	 래퍼클래스 특징 
	 에레이리스트에는 무조건 래퍼클래스 사용 
	ArrayList<int> => ArrayList<Integer> 
	값을 얻으려면 객체를 출력하면 된다
	 */
	
	public static void main(String[] args) {
		int nums = 5;
		char t = 'A';
		
		Integer myInt = 5;
		Character myChar = 'A';
		
		System.out.println(nums);//변수
		System.out.println(myInt);//객체
		System.out.println(t);//변수
		System.out.println(myChar);//객체
		
		
		
		
		
		
		
		
		
		
		

	}

}
