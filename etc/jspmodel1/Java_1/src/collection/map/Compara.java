package collection.map;

import java.util.TreeSet;

public class Compara {
/*
Comparable과 Comparator
TreeSet에 저장되는 객체와 TreeMap에 저장되는 키 객체는
저장과 동시에 오름차순으로 정렬되는데
어떤 객체든 정렬될수 있는 것이 아니라
객체가 Comparable 인터페이스를 구현하고 있어야 가능합니다
타입중에 Integer, Double, String 타입은 모두 Comparable을 구현하기에 
상관없지만 
사용자 정의 객체를 저장할때에는 반드시 Comparable을 구현하고 있어야 한다
Comparable 인터페이스에는  ComparaTo() 메소드가 정의되어 있어야 한다
따라서 사용자 정의 클래스에서 이 메소드를 재정의해서 비교 결과를
정수로 리턴한다

int 
compare(T o) => 주어진 객체와 같으면 0을 리턴
객체보다 적으면 음수, 크면 양수를 리턴
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("홍길동", 25));
		treeSet.add(new Person("홍길동", 31));
		
		for (Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
		
		
		

	}

}
