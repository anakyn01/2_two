package oop;

/*
 키와 벨류 가지는 배열
 HashMap<String, String> capitalCities = new HashMap<String, String>();
 */
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		 HashMap<String, String> capitalCities = new HashMap<String, String>();
		 capitalCities.put("England", "London");
		 capitalCities.put("Germany", "Berlin");
		 capitalCities.put("USA", "DC");
		 System.out.println(capitalCities.size());
		 System.out.println(capitalCities);
		 //항목에 접근 get()
		 System.out.println(capitalCities.get("England"));
		 //항목에 제거 remove()
		 System.out.println(capitalCities.remove("Germany"));
		 //싹제거 clear()
		 capitalCities.clear();
		 System.out.println(capitalCities);
		 //수량을 알아볼때는 size()
	}

}
