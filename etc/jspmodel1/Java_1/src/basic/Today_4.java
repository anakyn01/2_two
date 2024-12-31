package basic;
public class Today_4 {
    
    //1)렌더 함수 표기
    //2)나의 이름나이 를 함수명 Iam 실행
    //3)오버로딩으로 3+4, 3.5 + 4.3
    static void Iam(String fn, String ln, int age){
        System.out.println(" 나의 이름은" + fn + ln + "나이는" + age + "입니다");
    }
    static int Plus(int x, int y){
        return x + y;
    }
    public static void main(String[] args){
        //Iam("황","지훈","25");  
    }
}
