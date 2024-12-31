package collection.Intro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Intro {
	public static void main(String[] args) {
		String collection = "컬렉션 프레임워크\n" +
		"자바는 널리 알려준 잘려구조로 (data struct)를 바탕으로 객체들을 효율적으로\n"+
		"추가,삭제,검색할수 있도록 관련된 인터페이스와 클래스들을 java.util패키지에 포함시켜 놓았다\n"+
		"이들을 총칭해서 컬렉션 프레임워크라 한다\n"+
		"컬렉션 프레임워크는 몇가지 인터페이스를 통해 다양한 컬렉션 클래스를 이용할수 있도록 설계되어 있다\n"+
		"주요인터페이스로는\n" +
		"list(ArrayList,Vector,LinkedList)\n"+
		"set(HashSet, TreeSet)\n"+
		"Map(HashMap,Hashtable.TreeMap,Properties)입니다\n"+
		"List와 set은 객체를추가, 삭제, 검색하는방법에 있어서 공통점이 있기 때문에\n"+
		"공통된 메소드만 따로모아 Collection인터페이스로 정의해 두고 이것을 상속한다\n"+
		"Map은 키와 값을 하나의 쌍으로 묶어서 관리하는 구조로 되어 있어서 List 및 Set과는 사용법이 다르다\n"+
		"아래는 각 인터페이스의 컬렉션 특징으로 정리하였다\n"+
		"List : 순서를 유지하고 저장,중복저장가능\n"+
		"Set : 순서를 유지하지 않고 저장, 중복저장 안됨\n"+
		"Map : 키와 값으로 구성된 엔트리 저장, 키는 중복저장 안됨\n";
		System.out.println(collection);
	}

}
