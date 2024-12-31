package base;

/*
키보드에는 입력된 키를 얻기 위해 System클래스에서 in을 제공한다
in 필드를 이용해서 read()메소드를 호출하면 입력된 키의 코드값을 얻을수 있다

int keyCode = System.in.read()
0 = 48
1= 49
2= 50
3= 51
enter 13 && 10

!= 13 && != 10

int speed = 0;

*/

public class Keyboard {
   public static void main(String[] args) throws Exception {
      
      int speed = 0;
      int keyCode = 0; //두변수 초기화
      
      while(true) {//Enter키를 읽지 않았을 경우만 실행
         if (keyCode != 13 && keyCode != 10) {
            //3개의 선택사항 때문에 가정법이 들어갑니다
            if (keyCode == 49) {
               speed++;//증속
            } else if (keyCode == 50) {
               speed--;//감속
            } else if (keyCode == 51) {
               break; //중지
            }
            System.out.println("-----------------");
            System.out.println("1.증속 | 2.감속 | 3.중지");
            System.out.println("-----------------");
            System.out.println("현재 속도=" + speed);
            System.out.print("선택 : ");
         }
         //키를 하나씩 읽음
         keyCode = System.in.read();
      }
      System.out.println("프로그램 종료");      
   }
}
