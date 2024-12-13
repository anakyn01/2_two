package mysql.ref;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsert {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/bbs",
			"root", "1234"
			);
		String sql = "" +
			"INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"+
			"VALUES(?,?,?,now(),?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(
		sql, Statement.RETURN_GENERATED_KEYS		
		);//이전과 다르게 두번째 매개값이 등장 boardnumber => bno, bid
		//두번째 매개사마는 insert문이 실행된후 가져올 키값으로 자동 증가된 bno값을 가져온다 sql문이 실행되기 전까지 bno값을 모르기 때문에 bnq컬럼에 실제로 저장된 값을 얻는다
		pstmt.setString(1, "눈물의 여왕");
		pstmt.setString(2, "함박눈이 내림");
		pstmt.setString(3, "픽사베이");
		pstmt.setString(4, "eye.jpg");
		pstmt.setBlob(5, new FileInputStream("C:\\app_hwang\\workspace\\Java_1\\img\\eye.jpg"));
		
		int rows = pstmt.executeUpdate();
		System.out.println("저장된 행 수 : " + rows);
		
		if(rows == 1) {
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				int bno = rs.getInt(1);
				System.out.println(" 저장된 bno : " + bno);
			}
			rs.close();
		}
		
		pstmt.close();
		} catch(Exception e) {
		e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
			conn.close();		
				}catch(SQLException e) {
					
				}
			}
		}

	}

}
