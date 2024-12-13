package collection.stream;

import java.util.stream.IntStream;

public class Range {
	public static int sum;
	//정적을 위에 쓰는 이유 어떤 사물에 소속되는 것이 아닌 클래스에 fixed 있는 변수나 메소드 이기 때문에
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Hundred =100; //원시값
Integer choi = 100; //객체

IntStream stream = IntStream.rangeClosed(1, 100);
stream.forEach(a -> sum += a);
System.out.println("총합 : " + sum);
	}

}
/**숫자 범위로 스트림 얻기
매개값 start index, last index
range() : 끝수를 포함하지 않는것
rangeClosed() : 끝수를 포함하는것
 */
 