package collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class parallelism {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {//1억개의 Integer객체 저장
			scores.add(random.nextInt(101));
		}
		
		//변수 초기화 값이 변동되기에 
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream.mapToInt(i ->i.intValue()).average().getAsDouble();
		
		endTime = System.nanoTime();
		
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 일반 스트림 처리시간 : " + time + "ns");
	
		Stream<Integer> parallelStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 병렬 스트림 처리시간 : " + time + "ns");
	
	}

}
/**
 멀티 스레드는 동시성 또는 병렬성으로 실행되기 때문에
 이들 용어에 대해 정확히 이해하는것이 좋다
 동시성은 멀티작업을 위해 멀티스레드가 하나의 코어에서 번갈아 가며 실행하는 것을 말하고
 - 동시성은 한시점에서 하나의 작업만 실행
 번갈아 작업을 실행하는것이 워낙 빠르다 보니 동시에 처리되는 것 처럼 보일 뿐이다
 - 병렬성은 한 시점에서 여러개의 작업을 병렬로 실행하기 때문에 동시성 보다 좋은 성능을 낸다
 병렬성은 데이터 병렬성과 작업 병렬성으로 구분할수 있다
 
 데이터 병렬성 : 전체 데이터를 분할해서 서브 데이터셋으로 만들고 이 서브 데이터셋들을
 병렬처리를 해서 작업을 빨리 끝내는 것을 말한다
 자바 병렬스트림은 데이터 병렬성을 구현한 것이다
 
 작업 병렬성 
 서로 다른 작업을 병렬 처리하는것을 말한다
 작업 병렬성의 대표적인 예는 서버 프로그램
 서버는 각각의 클라이언트에서 요청한 내용을 개별 스레드에서 병렬로 처리한다
 
 포크조인 프레임 워크 
 자바 병렬스트림은 요소들을 병렬 처리하기 위해 포크조인 프레임워크를 사용한다
 포크조인 프레임워크는 포크단계에서 전체 전체요소들을 서브 요소셋으로 분할하고
 각각의 서브 요소셋을 멀티코어에서 병렬로 처리한다
 
 병렬스트림 
 자바 병렬 스트림을 이용할 경우 백그라운드에서 포크조인 프레임워크가 사용되게 때문에
 개발자는 매우 쉽게 병렬처리를 할 수 있습니다
 병렬 스트림은 아래에 두가지 메소드로 얻을 수 있습니다
 
 Stream => parallelStream()
 Stream, IntStream, LongStream, DoubleStream
 parallel()
 
 
 병렬성은 멀티 작업을 위해 멀티 코어를 각각 이용해서 병렬로 실행하는것을 말한다
 
 
 */