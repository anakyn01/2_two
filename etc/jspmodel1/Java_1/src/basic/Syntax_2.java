/* 렌더 함수
자바가상머신 jvm은 main이라는 메서드를 찾아서 프로그램을 시작한다
public : Jvm이 main함수를 찾을수 있도록 한다
static : 곧바로 실행
void : 리턴이 없으면 나온다는
String[] args : 커맨드 라인등을 통해 main 함수 내부에서 사용할수 있는
string데이터를 전달할수 있다.
변수 => 변하는 수여서 변수, 많은값이 여서 변수, 하나의 값
자바에서 변수는 선언과 초기화를 거쳐야 한다
선언 => type
초기화 => 최초로 할당받는 값

자바원시타입
String[문자열], int[정수], float[부동 소수점], char[영문 단일문자], 
boolean[진실 혹은 거짓]

Syntax
type variableName = value;

변수는 예약어를 사용할수 없다
static등을 사용할수 없다
*/
package basic;

public class Syntax_2 {
    public static void main(String[] args){
System.out.println("원시적 데이터 출력");
//javascript document.write()
System.out.println("문자열은 필히 쌍따옴표");
System.out.println("모든 구문마다 세미콜론");

String firstName = "지훈";
String lastName = "황";
System.out.println("저의 이름은 " + lastName + firstName + " 입니다");

//숫자
int myNums = 15;
System.out.println(myNums);

//선언만 하고 값을 나중애 할당 할수 있음
int Number;
Number = 15;
System.out.println(Number);

//단일문자
char myA = 'A';
boolean myBool = true;
System.out.println(myA);
System.out.println(myBool);

//간단한 수식가능
System.out.println(2 * 5);
System.out.println(3 + 3);

//최종 변수 final 키워드를 사용하고 (최종 또는 상수로 선언된다)
//변경할수 없고 읽기 전용임을 의미합니다
/*final*/ int Nop = 15;
Nop = 20;
System.out.println(Nop);

//부동 소수점
float myFloatNUM = 5.99f;
System.out.println(myFloatNUM);

    }
}
