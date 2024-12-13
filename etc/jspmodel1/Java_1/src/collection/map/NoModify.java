package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoModify {

	public static void main(String[] args) {

	//list 불변
	List<String> noAdd= List.of("A","B","C");
	//noAdd.add("D");
	System.out.println(noAdd);
	
	//Set 불변
	Set<String> nochange = Set.of("A","B","C");
	
	//Map 불변
	Map<Integer, String> Nop = Map.of(
	1, "A",
	2, "B",
	3, "C"
		);
	//Nop.put(4, "D");
	
	//copy.of 
	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	List<String> upanddownCopy = List.copyOf(list);
	
	Set<String> set = new HashSet<>();
	set.add("A");
	set.add("B");
	set.add("C");
	Set<String> upanddownCopy2 = Set.copyOf(set);
	
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	Map<Integer, String> upanddownCopy3 = Map.copyOf(map);
	
	//배열로 부터 list불변 컬렉션 생성
	String[] arr = {"A","B","C"};
	List<String> nomodList = Arrays.asList(arr);
		
		String nopMod = "수정할수 없는 컬렉션\n" +
		"수정할수없는 컬렉션이란 요소를 추가 삭제할수 없는 컬렉션을 말한다\n" +
		"컬렉션 생성시에 저장된 요소를 변경하고 싶지 않을때 유용하다\n" +
		"여러가지 방법으로 만들수 있는데\n" +
		"1) list,set,map 를 정적메소드인 of로 생성할수 있다\n" +
		"2) list,set,map 를 정적메소드인 copyof로 생성할 수 있다\n" +
		"3) list,set,map 를 asList로 만든다";
		
		System.out.println(nopMod);
		
	}

}
