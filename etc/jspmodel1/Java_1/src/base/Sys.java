package base;

/*
JDK (java virtual Machine, JVM) 자바컴파일러 디버깅,
JRE (java runtime Environment) 

컴파일러 : 전체를 스캔하여 모두 기계어로 번역 .자바
인터프리터 : 프로그램 실행시 한번에 한문장씩 .파이썬

자바프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상머신(jvm)에서
실행된다 그래서 운영체제의 모든 기능을 자바 코드로 직접 접근하기가 어렵다
그래서 java.lang패키지에 속하는 System클래스를 이용하면
운영체제의 일부 기능을 이용할수 있다

System 클래스의 정적(static)필드와 메소드를 이용하면 프로그램종료
키보드 입력, 콘솔 모니터 출력, 현재시간, 시스템 프로퍼티 읽기가 가능하다

필드
out: 콘솔모니터에 문자출력
err: 콘솔모니터에 에러출력 (but 빨간색)
in: 키보드입력
*/

public class Sys {
	
	public static void main(String[] args) {
		
	}

}
