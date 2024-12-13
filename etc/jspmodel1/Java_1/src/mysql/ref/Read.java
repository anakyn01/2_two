package mysql.ref;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/bbs","root","1234"		
			);
			String sql ="" +
			/*"SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
			"From boards " +
			"WHERE bwriter=?";*/
			"SELECT userid, username, userpassword, userage, useremail " +
			"From users " +
			"WHERE userid=?";
			//
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "최");
			
			//sql문을 실행후에 ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {//1개의 데이터 행을 가져왔을 경우
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt(4));//컬럼 순번을 이용
				user.setUserEmail(rs.getString(5));
				System.out.println(user);
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			
			pstmt.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}

	}

}
/*
데이터 읽기
PreparedStatement를 생성할때 SQL문이
INSERT, UPDATE, DELETE일 경우에는 executeUpdate메소드를
호출하지만
데이터를 가져오는 select문일 경우에는
executeQuery()메소드를 호출해야 한다
executeQuery()메소드는 가져온 데이터를 ResultSet에
저장하고 리턴한다 

ResultSet rs = pstmt.executeQuery();

ResultSet구조
SELECT문에 기술된 컬럼으로 구성된 행의 집합이다
예를 들어 다음 select문은 
userid, username, userage 컬럼으로 구성된 ResultSet을 리턴한다

SELECT userid, username, userage FROM users
ResultSet 커서가 있는 행의 데이터만 읽을수 있다는 것이다
여기서 커서는 행을 가리키는 포인터를 말한다
ResultSet 실제 가져온 데이터의 행의 앞과 뒤에
beforeFirst행과 afterLast행이 붙는데
최초 커서는 beforeFirst를 가르킨다
따라서 첫번째 데이터행인 First행을 읽을려 하면
커서를 이동시켜야 한다

boolean result = rs.next(); 데이터가 있어야 이동
커서를 다음 행으로 이동시키는데 이동한 행에 데이터가 있으면 true
없으면 false를 리턴
First행에서 Last행까지는 true를 리턴하고
afterLast =>sms false를 리턴합니다

만약 select문으로 가져온 데이터 행이 없다면
beforeFirst afterLast이 붙어있어서 false를 리턴

rs.close();

커서가 있는 데이터 행에서 각 칼럼의 값은 Getter메소드로 읽을수 있다
ResultSet에서 컬럼순번은 1부터 시작하기 때문에
userId =1,
userName = 2,
userAge = 3

String userId = rs.getString(1);
String userName = rs.getString(2);
int userAge = rs.getInt(3);
*/