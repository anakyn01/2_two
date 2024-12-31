package oop;

//사용자 입력을 얻는데 사용하는 Scanner클래스를 사용합니다
import java.util.Scanner;//package.name.클래스명
/*
API
:java 개발 환경에 포함되어 무료로 사용할수 있는 미리 작성된 클래스 라이브러리 
전체목록은 Oracle 사이트에 있습니다
내장패키지 (java API패키지)
사용자 정의패키지 (자신만의 패키지)
라이브러리는 패키지와 클래스로 구분됩니다
import로 불러옵니다

System 클래스
자바프로그램은 운영체제상에서 바로 실행되는 것이 아니라
JVM(자바가상머신) 위해서 실행되기 때문에
모든 코드를 자바코드로 직접 접근하기는 어렵습니다
그래서 시스템 클래스의
static 필드 out,err,in
메소드 exit(int status) 정상 exit(0), 비정상 exit(-1)
기타 다른것들이 있습니다

를 이용하면 프로그램 종료, 키보드 입력 콘솔 모니터 출력
등이 가능하다

패키지
java.lang = 언어의 기본 클래스를 제공
Object
System
문자열 관련
String, StringBuffer
StringTokenozer
패킹관련 
Byte, short, Character, Integer, Float, Double
Boolean


java.util = 자료구조와 관련된 컬렉션
java.text = 날짜/숫자를 원하는 형태의 문자열로 만들어주는 포멧 클래스를 제공
java.time = 날짜 및 시간을 조작
java.io = 일출력 스트림 클래스 제공
java.net = 네트워크 통신과 관련된 클래스를 제공
java.nio = 데이터 저장을 위한 buffer 및 새로운 입출력 클래스를 제공


*/
public class Api_3 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);//객체 
		System.out.println("Enter username");
		
		String userName = myObj.nextLine();
		System.out.println("Username is : " + userName);
	}

}
