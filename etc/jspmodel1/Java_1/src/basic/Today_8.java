/*
1) 일요일은 짜파게티 먹는날 switch 구문으로 하는데
2) if else if else 사용해서 현재시간은 아직 퇴근전 입니다
 */
package basic;

public class Today_8 {
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
                System.out.println("짜파게티먹는날");
                break;
        }
    
    int time = 22;
    if(time < 10) {
        System.out.println("ww");
    }else if(time < 18){
        System.out.println("wwww");
    }else {
        System.out.println("퇴근전");
    }
    
    
    }
}
