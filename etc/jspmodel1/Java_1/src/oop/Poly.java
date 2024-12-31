package oop;
/*
자바 다형성
"다양한 형태"를 의미하며 상속을 통해 서로 관련된
클래스가 많을때 발생합니다
앞전파일에서 상속을 통해서 다른 클래스의 속성과
메서드를 상속받을수 있었습니다
다형성은 이러한 방법을 사용하여 다양한 작업을 수행합니다 
1) 슈퍼클래스 있어야함
2) 서브클래스가 다수
*/
class Animal{
	public void animalSound() {
		System.out.println("동물의 소리");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("꿀꿀");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("멍멍");
	}
}

class Poly {
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		//상속과 다형성을 사용하는 이유와 시기는 무엇입니까
		//새클래스를 생성할때 기존 클래스의 속성과 메서드를
		//재사용 -> 코드 재사용
	}
}
