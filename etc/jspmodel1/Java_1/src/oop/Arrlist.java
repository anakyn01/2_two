package oop;

import java.util.ArrayList;
/*
 .add = add item
 .get(index) = access
 .set(index, change) = modify
 .remove(index) = content delete
 .clear(); = all delete
 .size() = element ea
 
 */

public class Arrlist {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add(0, "Mazda");//추가 색인 번호
		cars.set(1, "Opel");
		cars.remove(2);
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		//바꾸기 
		cars.clear();
		System.out.println(cars);
	}
	

}
