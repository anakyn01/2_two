package base;

/*
객체 해시코드
객체 식별하는 정수를 말함
Object의 해시코드 메소드는 객체의 메모리 번지를 이용하여
해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴합니다
hashCode() 메소드의 용도는 equals() 와 비슷한데
두 객체가 동등한지를 비교할때 주로 사용
hashCode() 메소드 역시 객체의 데이터를 기준으로 재정의해서(
@Override 새로운 정수값을 리턴
)
 */

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name; //접근제어자 no = 인수 no
		//
		
	}
	public int getNo() {}
	public String getName() {return name;}

	//Object의 해시코드를 재정의해서 학생번호와 이름 해시코드를 합한 새로운 해시코드를 리턴
	//번호와 이름이 같으면 동일한 해시코드가 생성됨
	@Override//no + name을 더하기 위해 클래스를 재정의
	public int hashCode() {
		int hashCode = no + name.hashCode();
		//변수 해시코드 = no + name 해시코드를 할당
		return hashCode;
		//해시코드 반환
		
	}
	
	//비교하기위해서 클래스 재정의
	/*
	 instanceof : 객체타입을 확인하는 연산자
	 객체가 어떤클래스 인지 어떤 클래스를 상속받았는지
	 참조변수가 참조하고 있는 인스턴스의 실제타입
	 자식객체가 여러 타입의 경우 특정클래스가 맞는지 확인하기 위해서
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {//만약에 검사하는 타겟이
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}//얻는 번호와 얻는 이름이 같다면 return true
		}
		return false; //아니라면
		
	}
	/*
	 이상황에서 return을 사용하면 어떻게 할건지 정하지 않았기에 0을 리턴.동문서답.  
	 return true : 값을 true로 정함
	 return false : 값을 false로 정함
	 */
}
