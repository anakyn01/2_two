package mysql.ref;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
	Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//연결하기
		conn=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bbs",
				"root",
				"1234"
		);
		
		//매개변수화된 sql문 작성
		String sql = "DELETE FROM boards WHERE bwriter=?";
		//preparedStatement 얻기 및 값지정
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "픽사베이");
		
		//sql문 실행
		int rows = pstmt.executeUpdate();
		System.out.println("삭제된 행수 : " + rows);
		
		pstmt.close();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(conn != null) {
			try {
				conn.close();
			} catch(SQLException e) {}
		}
	}
	
	}

}
/*
데이터 삭제
boards 테이블에서 bwriter가 픽사베이인 모든 게시물을 삭제하는 delete문은 아래와 같다
DELETE FROM boards WHERE bwriter='픽사베이'
DELETE FROM boards WHERE bwriter=?;
리턴된 값은 삭제된 행수다
*/