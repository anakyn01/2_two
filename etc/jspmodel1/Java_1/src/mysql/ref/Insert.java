package mysql.ref;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] sqls[]) {
		Connection conn = null;
		try {
			//jdbc driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");//JDBC연결 클래스를 'String' 타입으로 불러옵니다
			//연결하기
			conn = DriverManager.getConnection(
					//드라이버매니저에 미리 저장했던 연결url과 db계정 정보를 담아 연결설정한다
			"jdbc:mysql://localhost:3306/bbs","root","1234"		
			);//uri, id, password
			
			//매개변수화된 sql문 작성
			String sql = "" +
			"INSERT INTO user(userID, userName, userPassword, userGender, userage, userEmail)" + 
			"VALUES(?,?,?,?,?,?)";
			
			//preparedStatement 얻기 및 값 지정
			/*
			Connection = 연결
			PreparedStatement = 설정 및 실행
			Resultest = 결과값
			dbURL = mysql db와 연결시켜주는 주소
			dbId = mysql 계정 따로 설정하지 않으면 root
			dbPassword = 1234
			*/
			PreparedStatement pstmt = conn.prepareStatement(sql);//preparedStatment얻기
			//값지정
			pstmt.setString(1,"choi");
			pstmt.setString(2,"최");
			pstmt.setString(3,"12345");
			pstmt.setString(4,"형");
			pstmt.setInt(5,35);
			pstmt.setString(6,"email@email.com");
			//sql문 실행
			int rows = pstmt.executeUpdate(); //한줄이 정상적으로실행되면 1
			System.out.println("저장된 행수 : " + rows);//터미네이트
			pstmt.close();
			
		}catch (ClassNotFoundException e) {//클래스 찾을수 없음 예외
			e.printStackTrace();
		}catch (SQLException e) {//sql 예외 
			e.printStackTrace();
		}finally {//성공하든 실패하든 연결을 끊어주는 보장을 받음
			try {
				//연결 끊기
				conn.close();
			}catch(SQLException e) {}
		}
	}

}
/*
두가지 방법
oldboy
String sql = ""+
"INSERT INTO user(userID, userName, userPassword, userage, userEmail)" + 
"VALUES(?,?,?,?,?)";
"string " + 3 + 4
string " + (3 + 4)

finally

String sql = new StringBuilder().append("INSERT INTO user(userID, userName, userPassword, userage, userEmail)").append("VALUES(?,?,?,?,?)").toString();
메소드체이닝 (구문을 길어지는걸 방지)

매개변수화된 sql문을 실행하려면 PreparedStatement가 필요하다 
아래와 같이 preparedStatement() 메소드로 PreparedStatement를 얻는다

PreparedStatement pstmt = conn.preparedStatement(sql)

그리고 ?에 들어갈 값을 지정해 주는데
?는 순서에 따라 1번부터 번호가 부여됩니다
값의 타입에 따라 setter메소드를 선택한후 첫번째 ? (순번), 두번째에는 값을 지정해 준다
pstmt.setString(1, "callbackfunctionhell");
pstmt.setString(2, "콜백함수지옥");
pstmt.setString(3, "12345");
pstmt.setString(4, 25);
pstmt.setString(5, "콜백함수지옥@들여쓰기.닷컴");

값을 지정한후 executeUpdate()메소드를 호출하면
sql문이 실행되면서 user테이블에 1개에 행이 저장된다

executeUpdate() 메소드가 리턴하는 값은 저장된 행 수인데
정상적으로 실행되었을 경우 1을 리턴한다

int rows = pstmt.executeUpdate(); => 1

PreparedStatement를 더이상 사용하지 않을경우
close()메소드를 호출하여
PreparedStatement가 사용하지 않을 경우에 사용했던 메모리를 해제한다

pstmt.close();
dto = &dto
int * ptr = 위에 변수
*/





/*
데이터 저장 
이번에는 jdbc를 이용하여 insert문을 실행하는 방법을 알아봅니다
INSERT INTO 테이블명(데이터를 담는 필드 ) 
VALUES(필드 값?
)

insert into user(userID, userName, userPassword, userage, userEmail)
values(?,?,?,?,?)

*/ 
