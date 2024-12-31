package rejava;

public class Casting {

/*
형 변환은 한 기본 데이터 유형의 값을 다른 유형에 할당하는 것을 말합니다.
자바에는 두 가지 유형의 캐스팅이 있습니다.

와이드닝 캐스팅 (자동) - 작은 글자를 큰 글자 크기로 변환
byte-> short-> char-> int-> long-> float->double

Narrowing Casting (수동) - 더 큰 글자를 더 작은 크기의 글자로 변환
double-> float-> long-> int-> char-> short->byte
*/
	public static void main(String[] args) {

		//자동 캐스팅
		int myInt = 9;
		double myDouble = myInt;
				
		System.out.println(myInt);		
		System.out.println(myDouble);//별다른 조치 없이 자동으로 수행
		
	//큰애가 쪼맨이 될때
	double myD = 9.78d;
	int myI = (int) myD;//수동 캐스팅 앞에다가 괄호치고 암시
		
	//축소 캐스팅
	System.out.println(myD);		
	System.out.println(myI);//별다른 조치 없이 자동으로 수행	
		
		
		
		
		

	}

}
