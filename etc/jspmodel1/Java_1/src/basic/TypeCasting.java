package basic;
/**
 Java TypeCasting
 확대(자동) : 작은글자가 큰글자로
 byte -> short -> char -> int -> long -> float -> double
 
 byte = 8 비트 
 축소(수동) Narrowing Casting : 큰글자가 작은 글자로 
 double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCasting {

	public static void main(String[] args) {
		// 확대
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myDouble);
		// 축소
		double newDouble = 9.78d;
		int myIn = (int) newDouble;
		
		System.out.println(myIn);

	}

}
