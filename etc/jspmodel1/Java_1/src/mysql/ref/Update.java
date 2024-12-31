package mysql.ref;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] Update) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//드라이버 등록
			//연결하기
			conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/bbs",
			"root",
			"1234"		
			);
			
			//매개변수화된 sql문 작성
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?,")
					.append("bcontent=?,")
					.append("bfilename=?,")
					.append("bfiledata=?")
					.append("WHERE bno=?")
					.toString();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "웃음의 여왕");
			pstmt.setString(2, "비가 내림");
			pstmt.setString(3, "snow.jpg");
			pstmt.setBlob(4, new FileInputStream("C:\\app_hwang\\workspace\\Java_1\\img\\snow.jpg"));
			pstmt.setInt(5, 1);//게시물
			
			//sql문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//데이터 수정이 성공하든 실패하든 꼭 보장받아야 하는 일을
			if(conn != null) {// 접속을 하였다면 
				try {
					//연결 끊기
					conn.close();
				}catch (SQLException e) {}
				
			}
		}

	}

}
/*
DriverManager : jdbc드라이버를 관리하며 DB와 연결해서
Connection 구현 객체를 생성한다
Connection : 인터페이스 (Statement,preparedStatement,CallableStatement)
구현객체를 생성하고 트랜잭션 처리 및 DB연결을 끊을때 사용한다

Statement : DDL과 DML을 실행할때 사용한다 주로변경되지 않는 정적 sql문을 실행할때 사용
PreparedStatement : Statement와 동일하게 sql의 DDL,DML문을 실행할때 사용합니다
CallableStatement : DB에 저장되어 있는 프로시저와 함수를 호출할때 사용한다
ResultSet : DB에서 가져온 데이터를 읽을때 사용한다	

*/ 
 