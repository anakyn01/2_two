package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Json {
	
	public static void main(String[] args) {
		JSONObject jsonob = new JSONObject();
		JSONArray jsonarr = new JSONArray();
		//임포트한 클래스를 사용하기 위해 객체 생성
		for (int i = 1; i < 3; i++) {
			JSONObject data = new JSONObject();
			
			data.put("이름","닝겐_"+i);
			data.put("나이", 10 + i);
			data.put("주소","서울 잠실"+i+"길");
			jsonarr.add(data);
		}
		jsonob.put("잠실 사람들",jsonarr);
		System.out.println(jsonob);
		
		
	}

}
