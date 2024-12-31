package oop;

public class Constructor {
	//class에서 속성을 물려 받을때는 무조건 객체를 생성
	int x;
	
	public Constructor(int y) {
		x= y;
	}
	int Nop = 2024;
	
	int modelYear;
	String modelName;//변수 선언
	
	public Constructor(int year, String name) {//생성자명 자바는 클래스와 동일 자바스크립트 constructor
		modelYear = year;
		modelName = name;
		//생성자에는 클래스 필드에 선언한 변수에 생성자 매개변수를 대입
		
	}

	public static void main(String[] args) {
		System.out.println("자바 생성자는 : 객체를 초기화 하는데 사용하는 특수 메소드");
		//객체를 만들때는 클래스명 객체명
		Constructor constructor = new Constructor(1968, "Mustang");
		Constructor con = new Constructor(5);
		System.out.println(constructor);
		System.out.println(con);
		System.out.println("내 차의 년도는 "+ constructor.modelYear + "모델명은 " + constructor.modelName + "입니다");
        System.out.println(con.x);
        
		
	}

}
