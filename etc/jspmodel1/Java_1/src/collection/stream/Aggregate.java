package collection.stream;

import java.util.Arrays;

/**
 집계는  최종처리기능으로 요소들을 처리해서 카운팅,합계,평균값,최대,최소값
 을 하나의 값으로 산출하는 것을 말한다
 대량의 데이터를 가공하여 하나의 값으로 축소하는 reduction 이다
 
 아래와 같은 처리 메소드를 제공한다
 long => count()
 OptionalXXX => findFirst()
 Optional<T> => max(Comparator<T>)
 OptionalXXX => max()
 Optional<T> => min(Comparator<T>)
 OptionalXXX => min()
 OptionalDouble => average() 요소평균
 int, long, double => sum() 요소총합
 */
public class Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,5};

//카운팅
long count = Arrays.stream(arr).filter(n -> n%2==0).count();
System.out.println("2의 배수 갯수 : " + count);

//총합
long sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
System.out.println("2의 배수의 합 : " + sum);

//평균
double avg = Arrays.stream(arr).filter(n -> n%2==0).average().getAsDouble();
System.out.println("2의 배수의 합 : " + avg);

//최대값
int max = Arrays.stream(arr).filter(n -> n%2==0).max().getAsInt();
System.out.println("최대값 : " + max);

//최소값
int min = Arrays.stream(arr).filter(n -> n%2==0).min().getAsInt();
System.out.println("최소값 : " + min);

//첫번째 요소 
int first = Arrays.stream(arr).filter(n -> n%3==0).findFirst().getAsInt();
System.out.println("첫번째 3의 배수 : " + first);	
	
	
	}

}
