package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sync {
/*
컬렉션 프레임 워크의 대부분 클래스는 싱글 스레드 환경에서 사용할수록 설계
되어서 의도치 않은 에러를 생성하는데
Vector와 hashtable은 동기화가 되지만 
ArrayList와 HashSet, HashMap은 멀티스레드 환경에서 안전하지 않다
그래서 비동기를 동기화로 랩핑하는
synchronizedXXX메소드를 제공한다
*/
	public static void main(String[] args) {
		//맵 동기화 컬렉션에 적용하고자하는 컬렉션 랩핑
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

	}

}
