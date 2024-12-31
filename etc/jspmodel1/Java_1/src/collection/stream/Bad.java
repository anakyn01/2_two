package collection.stream;

import java.util.ArrayList;

public class Bad {

	public static void main(String[] args) {
		// Bad
		String result2 = "프로그래밍 - ";
		String java = "잠을 자바";
		String android = "안드로이드";
		String result = java + android;
		result2 += java += android;
		System.out.println(result);
		System.out.println(result2);
		
		//good
		StringBuilder str = new StringBuilder();
		str.append("문자열").append("더하기").append("입니다");
		String txt = str.toString();
		System.out.println(str);
		System.out.println(txt);
		
		//반복해서 출력할때
		StringBuilder re = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for (int i = 0; i < list.size(); i++) {
			re.append(list.get(i));
		}
		System.out.println(re);
	}
	

}
