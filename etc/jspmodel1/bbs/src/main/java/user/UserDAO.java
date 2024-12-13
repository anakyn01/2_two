package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {//기본 생성자 dao가 실행되면 자동으로 생성되는 부분
		try {
			String dbURL = "jdbc:mysql://localhost:3306/bbs";
			String dbID = "root";
			String dbPassword ="1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//로그인 구현 메소드 1[로그인 성공],0[비밀번호 틀림],-1[아이디 없음],-2[네트워크 오류]
	public int login(String userID, String userPassword) {
		String sql = "select userPassword from user where userID = ?";
		try {
			pstmt = conn.prepareStatement(sql);//sql쿼리문 대기
			pstmt.setString(1, userID);//첫번째 '?'매개 변수를 받아온 userID대입
			rs=pstmt.executeQuery();
			if(rs.next()) {//결과값이 존재 한다면
				if(rs.getString(1).equals(userPassword)) {
					return 1; //로그인 성공
				}else
					return 0; //비밀번호 틀림
			}
			return -1; //아이디 없음
		} catch(Exception e) {
			e.printStackTrace();
		}		
		return -2;//네트워크 오류
	}
	
	   public int join(User user) {
		      String sql = "insert into user values(?,?,?,?,?)";
		      try {
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setString(1, user.getUserID());
		         pstmt.setString(2, user.getUserPassword());
		         pstmt.setString(3, user.getUserName());
		         pstmt.setString(4, user.getUserGender());
		         pstmt.setString(5, user.getUserEmail());
		         return pstmt.executeUpdate();
		      }catch(Exception e) {
		         e.printStackTrace();
		      }
		      return -1;
		   }
		   
	
	
	
	
	
	
}
