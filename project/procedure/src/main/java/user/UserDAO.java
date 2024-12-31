package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	private Connection conn;//�ڹٿ� ������ ���̽� [����]
	private PreparedStatement pstmt;//������ ��� �� [���� �� ����]
	private ResultSet rs;//[�����] �޾ƿ���
	
	//�⺻ ������
	public UserDAO() {
		try {
			String dbURL = "jdbc:oracle:thin:@localhost:1521/xe";
			String dbID = "TEST_USER";
			String dbPassword = "1234";
			Class.forName("oracle.jdbc.OracleDriver");
			//ojdbc���� Ŭ������ StringŸ������ �ҷ��ɴϴ�
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�α��� �������� �������и� ���� �����ϳĸ� ���ڷ� ���� 
	//�α��� ����(1) �н�����Ʋ��(0), ���̵� ����(-1), -2(����)
	public int login(String userID, String userPassword) {
		String sql = "select userPassword from usr where userID = ?";
		//������ db���� �Է��� �������� 'sql'������ �̸� ��ƵӴϴ�
		//���õ� �������̵� �н����带 ����
		try {
			pstmt = conn.prepareStatement(sql); //sql�������� ���
			pstmt.setString(1, userID);// ù��° '?'�� �Ű������� �޾ƿ� 'userID'�� ����
			rs=pstmt.executeQuery();//���� ������ ����� rs�� ����
			if(rs.next()) {//������� �����Ѵٸ� �ش� ������� ������ �ִ�
				if(rs.getString(1).equals(userPassword)) {
					return 1;//�α��� ����
				}else
					return 0;//��й�ȣ Ʋ��
			}
			return -1; //���̵� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -2;//����
	}
	
	//ȸ������
	public int join(Usr user) {
		String sql = "insert into usr values(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  user.getUserID());
			pstmt.setString(2,  user.getUserPassword());
			pstmt.setString(3,  user.getUserName());
			pstmt.setString(4,  user.getUserGender());
			pstmt.setString(5,  user.getUserEmail());
			return pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	
	
	
	
}
