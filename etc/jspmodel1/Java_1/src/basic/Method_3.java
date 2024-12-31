/*
자바 메소드 (function)
- 호출할때만 실행되는 코드블록
- 매개변수라고하는 데이터를 메서드에 전달
(자바스크립트와 다르게 매개변수에도 형을 지정)
- 메소드는 특정작업을 수행하는데 사용되며 함수라고 합니다
- 메소드를 사용하는 이유 =>
코드를 한번정의하고 여러번 사용하기 위함입니다
- 메소드는 렌더 함수 위에서 사용된다
- 스스로를 호출하는걸 재귀함수라 한다
- 메소드는 리턴값을 가지지 않으면 void를 사용
메소드 오버로딩 => 메소드명이 같으나 형은 틀린형태
 */
package basic;

public class Method_3 {

    static void firstM(){
     System.out.println("i just call...");   
    } 
    //myName 함수
    static void myName(String fname, String lname, int age){
        System.out.println(" 저의 이름은 : " + lname + fname + "입니다" + age);
    }
    //메소드 오버로딩 (메소드 명칭을 같이사용하며 type만 다른경우)
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }



    public static void main(String[] args) {
        firstM();
        myName("황", "지훈",25);
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
    
}
