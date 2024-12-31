/*
if else 에서 많은 문을 작성할 경우 코드의 가독성이 떨어집니다
그럴때 switch 명령문을 사용하면 실행할 여러코드블록중에 하나를
선택할 수 있습니다

syntax
switch(expression){
    case x :
    code block
    break;
    case y :
    code block
    break;

    default : 모든 컨디션이 맞지 않는 경우에 사용
}
 */

public class Switch_6 {


    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 0:
                System.out.println("일요일");
                break;
        
            case 1:
                System.out.println("월요일");
                break;
            default:
            System.out.println("짜파게티 먹는날");
            

        }
    }
}
