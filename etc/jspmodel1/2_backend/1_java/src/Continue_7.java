/*
continue => loop 에서 지정한 숫자만 건너뛰고 사용합니다
 */

public class Continue_7 {
    
    public static void main(String[] args) {
        //break
        for (int i=0; i < 10; i++){//start index, end index, 개별증가
            if (i == 4){//지정한 index 앞에서 멈춤 
                break;
            }
            System.out.println(i);

        }
        //continue
        for (int q=0; q<10; q++){
            if (q == 4){
                continue;
            }
            System.out.println(q);
        }
    }
}
