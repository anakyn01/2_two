package collection.stream;

import java.nio.charset.Charset; //캐릭터 인코딩
import java.nio.file.Files; //lines() => 텍스트 파일의 행단위의 스트림을 얻는다
import java.nio.file.Path; // 파일의 경로를 얻는것을 의미
import java.nio.file.Paths;
import java.util.stream.Stream;


public class File {

	public static void main(String[] args) throws Exception{
		Path path = Paths.get(File.class.getResource("data.txt").toURI());
		//data.txt 파일의 경로를 가져옴
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		//Path로 부터 파일을 열고 한 행씩 읽으면서 문자열 스트림생성
		stream.forEach(line -> System.out.println(line));
		stream.close();
	
	}
	
}


