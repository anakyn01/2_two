package oop;

public class Encapsulation_2 {
	
	private String name; //restricted access
	
	//Getter
	public String getName() {//변수의 값을 리턴
		return name;
	}
	//setter newName을 가져와 이를 name변수에 할당
	public void setName(String newName) {
		this.name = newName;
		//키워드 this 현재 객체를 참조하는데 사용
		//but name변수가 선언 되었으므로 이 클래스 외부에서
		//해당 변수에 엑세스 할수 없음
	}

	
}
/*
캡슐화
= "민감한 데이터가 사용자에게 숨겨지도록 하는것"
클래스안에 private[접근제어자]로 선언해야 합니다
변수값을 읽고 업데이트를 하기 위해서 get[변수값을 리턴] 및 
set[값을 설정] 메소드 사용

Modifiers = 수정자
두가지 그룹으로 나눔 (엑세스 수정자, 비엑세스 수정자)

엑세스 한정자[수정자]
public => (클래스, 속성, 메소드, 및 생성자에 대한 
엑세스 수준을 설정하는데 사용합니다
default : 동일한 패키지에서만 엑세스 따로 수정자를 지정하지 않을때 사용
private : 선언된 클래스 내에서만 엑세스
protected : 슈퍼클래스와 서브클래스 배울때 알아봅니다

비엑세스 수정자
final : 클래스가 다른 클래스에 상속될수 없음
static : 속성과 메소드는 객체가 아닌 클래스에 속함
abstract : 추상클래스 상속 및 추상화 할때 나옴
transient : 속성과 메소드가 포함된 객체를 직렬화 할때
synchronized : 한번에 하나의 스레드에서만 엑세스 
volatile : 스레드컬로 캐시되지 않으며 주메모리에서 읽혀집니다

 
 
 */

 