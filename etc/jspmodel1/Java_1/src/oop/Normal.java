package oop;

class Vehicle{
	protected String brand = "Ford"; //속성
	public void Tuu() {
		System.out.println("Tuut, tuut");
	}
}

class Normal extends Vehicle{
	//클래스의 속성 == 필드
	int x = 5; //Attributes or fields.
	int y = 3;	
	int z;
	
	//생성자
	public Normal() {
		z = 10;
	}
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		Normal myObj = new Normal(); //객체 생성
		System.out.println(myObj.x + myObj.y);
		System.out.println(myObj.z);
		myObj.Tuu();
		System.out.println(myObj.brand + " " + myObj.modelName);
	}
}
