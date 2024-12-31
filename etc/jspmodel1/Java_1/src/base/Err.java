package base;

/*
try = 정상적인 실행
catch = 오류발생시 메세지
finally = 결과에 상관없이 보장
 */
public class Err {
	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("100");
			System.out.println(value);
		}catch(NumberFormatException e){
			System.err.println("[에러가 났으므니다]");
		}finally { //결과에 상관없이 출력
			System.out.println("바 아 아 보");
		}
	}
}
