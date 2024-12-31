/*
if 지정된 조건이 참인 경우 실행할 코드블록을 지정하는데 사용합니다
else 첫번째 조건이 맞지 않은 경우 실행할 코드블록을 지정
else if 첫번째 또는 두번째 조건이 맞지 않을 경우 실행할 코드블록을 지정

파이썬에서는 elif  =  else if

syntax
if(condition) {

}else{

}
코드 영역이 길고 가독성이 떨어질때 그럴때 switch
각파트마다 코드가 맞으면 멈춰야 해서 break; 중지
=> break 중지
=> continue 건너뛰고 실행

else if Statement
if(condition1){

}else if (condition 2){

}else{

}
짧은 short => Terary Operators

변수 = (condition) ? expressionTrue : expressionFalse

 */
package basic;

public class IfElse_5 {
    public static void main(String[] args) {
       int time = 22; 
        //basic
        if(time < 10) {
            System.out.println("good morning");
        } else if(time < 18){
            System.out.println("good day");
        } else {
            System.out.println("good evening");
        }

        //삼항 연산자
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //현실에서의 적용
        int doorCode = 1337;

        if(doorCode == 1337){
            System.out.println("open");
        }else{
            System.out.println("close");
        }

        int myAge = 25;
        int votingAge = 18;
        if(myAge >= votingAge){
            System.out.println("ok");
        } else{
            System.out.println("no");
        }

        //짝수 인지 아닌지
        int myNum = 5;
        if(myNum %2 == 0){//모든 자바계열은 짝수가 0부터 홀수가1부터
            System.out.println(myNum + " is even ");
        }else{
            System.out.println(myNum + " is odd");
        }

    }
}