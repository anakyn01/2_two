package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonData {

	public static void main(String[] args) throws IOException {
		//JSON객체 생성
		JSONObject root = new JSONObject();
		//속성추가
		root.put("id", "winter");
		root.put("name", "초여름");
		root.put("age", 30);
		root.put("student",true);
		
		//객체속성추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel",tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("jam");
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill",skill);
		
		//JSON 얻기
		String json = root.toString();
		
		//콘솔에 출력
		System.out.println(json);
		
		//파일로 저장
		Writer writer = new FileWriter("C:/Temp/member.json", Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
		
	}

}
/*
네트워크로 전달하는 데이터가 복잡할수록 구조화된 형식이 필요하다
네트워크 통신에서가장 많이 사용되는 형식은 json
객체표기{"속성명":속성값 }
배열표기[항목,항목]
{
"id":"winter",
"tel":{"home":"02-123-1234", "mobile":"010-123-1234"},
"skill":["java","jamjava","c","c++"]

}
라이브러리를 빌드패스 해줘야 됩니다

json표기법과 관련된 클래스
JSONObject : 객체표기를 생성하거나 파싱할때 사용(분해와 분석후 목적에 맞춰 구조를 결정)할때 사용
JSONArray : 배열표기를 생성하거나 파싱할때 사용 
*/
