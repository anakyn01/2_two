package base;

import java.util.HashSet;

public class HashSetExe {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"최가영");
		hashSet.add(s1);
		System.out.println("저장된 객체수 " + hashSet.size());
		
		Student s2 = new Student(2,"최가영");
		hashSet.add(s2);
		System.out.println("저장된 객체수 " + hashSet.size());
		
		Student s3 = new Student(3,"이은성");
		hashSet.add(s3);
		System.out.println("저장된 객체수 " + hashSet.size());

		System.out.println("Hashset은 중복을 허용하지 않습니다");
		
	}

}
