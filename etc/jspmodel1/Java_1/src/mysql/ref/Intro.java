package mysql.ref;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Intro {

	public static void main(String[] args) {
		//연결해 보아요
		Connection conn = null;
		try {
			//jdbc driver등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bbs","root","1234"
					);
			System.out.println("연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					//연결 끊기
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {}
			}
		}

	}

}
/*
db 연결 jdbc드라이버를 빌드패스하고
Class.forName("com.mysql.cj.jdbc.Driver");로
객체 등록

Connection conn = DriverManager.getConnection(jdbc:mysql://localhost:3306/bbs)


클라이언트 프로그램에서 db와 연결하려면
해당 dbms의 jdbc driver
또한 연결에 필요한 4가지 정보가 있어야 한다

ip주소, 포트번호, 사용자 계정 및 비밀번호, 사용하고자 하는 db명

jdbc driver 설치


callback function : 콜백은 다른함수에 매개변수로 넘겨준 함수를 말한다
함수를 명시적으로 호출하는 방식이 아니라 특정이벤트가 발생했을때
시스템에 의해 호출

다른함수(a)의 전달인자 (argument)로 넘겨주는 함수 b를 말한다
매개변수를 넘겨받은 함수 (a)는 call back함수 (b)를 필요에 따라
즉시실행(synchronously[동기])할수도 있고
나중에(asynchrously) 실행할수도 있다

자칫하면 콜백지옥에 빠진다
비동기 프로그래밍시 발생하는 문제로 함수의 매개변수로 넘겨지는 
콜백함수가 반복되어 코드의 들여쓰기 수준이 감당하기 힘들정도로
깊어지는 현상을 얘기한다

step1(function (value1){
	step2(function (value2){
		step3(function (value3){
			step4(function (value4)
			}
		}	
	}
}		
*/