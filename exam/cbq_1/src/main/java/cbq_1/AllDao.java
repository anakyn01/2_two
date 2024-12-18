package cbq_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AllDao {

	private Connection conn;
	private ResultSet rs;
	
	public AllDao() {
		try {
			String dbURL = "jdbc:oracle:thin:@localhost:1521/xe";
			String dbID = "system";
			String dbPassword ="1234";
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDate() {
		String sql = "select sysdate from tbl_inout";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public int getNext() {
		int num = 0;
		String sql = "select p_nums_seq.NEXTVAL from dual";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt("NEXTVAL");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public ArrayList<Product> getList(){
		String sql = "select * from tbl_product order by p_nums asc";
		ArrayList<Product> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setP_nums(rs.getInt(1));
				product.setP_code(rs.getString(2));
				product.setP_name(rs.getString(3));
				product.setP_size(rs.getInt(4));
				product.setP_incost(rs.getInt(5));
				product.setP_outcost(rs.getInt(6));
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
}

