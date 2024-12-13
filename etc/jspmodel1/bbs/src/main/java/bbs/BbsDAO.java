package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {

   private Connection conn;
   private ResultSet rs;
   
   public BbsDAO() {//기본 생성자
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
   //작성일자 메소드 => 현재시간을 가져옴
   public String getDate() {
      String sql ="select now()";
      try {
      PreparedStatement pstmt = conn.prepareStatement(sql);   
      rs = pstmt.executeQuery();
      if(rs.next()) {
         return rs.getString(1);
      }
      }catch(Exception e) {
         e.printStackTrace();
      }      
      return ""; //데이터 베이스 오류
   }
   //게시글 번호 부여 메소드
   public int getNext() {
      //현재 게시글을 내림차순으로 조회하여 가장 마지막글의 번호를 구한다
      String sql ="select bbsID from bbs order by bbsID desc";
      try {
         PreparedStatement pstmt = conn.prepareStatement(sql);   
         rs = pstmt.executeQuery();
         if(rs.next()) {
            return rs.getInt(1) + 1;
            //가장 상위의 게시글의 번호를 구해서 예를들어 3번이면 + 1 => 4
         }
         return 1;
      }catch(Exception e) {
         e.printStackTrace();
      }      
      return -1; //데이터 베이스 오류
   }
   //글쓰기 메소드
   public int write(String bbsTitle, String userID, String bbsContent) {
   //글제목,사용자ID,글내용을 전달받아 DB에 새로운 데이터 입력 순서대로 세팅하고 데이터베이스로 전송합니다
      String sql ="insert into bbs values(?, ?, ?, ?, ?, ?)";
      try {
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, getNext());
         pstmt.setString(2, bbsTitle);
         pstmt.setString(3, userID);
         pstmt.setString(4, getDate());
         pstmt.setString(5, bbsContent);
         pstmt.setInt(6, 1); //글의 유효번호
         return pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }      
      return -1; //데이터 베이스 오류
   }
   //게시글 리스트 메소드 - 존재하는 게시글 리스트를 불러오는 메소드
   /*
   ArrayList<Bbs> getList(int pageNumber) 현재 페이지의 게시글 목록을 
   리스트 형태로 받아옵니다
   
   "select * from bbs where bbsID <? and bbsAvailable = 1 order by bbsID desc limit 10"
   모든 게시글을 조회합니다, 현재 유효번호가 존재하고 새롭게 작성될 게시글 번호보다 작은 모든 게시글
   번호를 내림차순으로 10개 까지 조회합니다
   
   getNext() 14 - (pageNumber - 1) * 10
   
   만약현재글이 5개라면 getNext() = 6, 1페이지 이기 때문에 결과값은 6이 나온다
   6보다 작은 5개의 게시글이 출력
   
   ASC(오름차순), DESC(내림차순)
   */
   public ArrayList<Bbs> getList(int pageNumber){
	   String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1 order by bbsID desc limit 10";
	   //한페이지당 게시글 10개 출력 
	   ArrayList<Bbs> list = new ArrayList<Bbs>();
	   try {
		   PreparedStatement pstmt = conn.prepareStatement(sql);
		   pstmt.setInt(1, getNext() - (pageNumber - 1) * 10); //11 - (11-1) * 10
		   rs = pstmt.executeQuery();
		   while(rs.next()) {
			   Bbs bbs = new Bbs();
			   bbs.setBbsID(rs.getInt(1));
			   bbs.setBbsTitle(rs.getString(2));
			   bbs.setUserID(rs.getString(3));
			   bbs.setBbsDate(rs.getString(4));
			   bbs.setBbsContent(rs.getString(5));
			   bbs.setBbsAvailable(rs.getInt(6));
			   list.add(bbs);
		   }
	   } catch (Exception e) {
		e.printStackTrace();
	}
	return list;
   }
   /*페이징 처리 메소드 특정한 페이지가 존재하는지 조회하는 메소드 
   게시글이 10개에서 11개로 넘어갈때 '다음'버튼을 만들어 페이징 처리를 위한 기능
   */
   public boolean nextPage(int pageNumber) {
	   String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1";
	   try {
		   PreparedStatement pstmt = conn.prepareStatement(sql);
		   pstmt.setInt(1, getNext() - (pageNumber - 1) * 10); //11 - (11-1) * 10
		   rs = pstmt.executeQuery();
		   if(rs.next()) {
			   return true;
		   }
		} catch (Exception e) {
			e.printStackTrace();
		}
	   return false;
   }
   
   /*view or detail
    하나의 게시글을 보는 메소드
    매개변수로 넘어온 'bbsID'에 데이터가 존재한다면
    그 데이터에 맞는 실객체 'Bbs 인스턴스를 ' 생성하고
    해당 내용들을 모두 불러와 정보를 리턴하는 메소드
    */
   public Bbs getBbs(int bbsID) {
	   String sql = "select * from bbs where bbsID = ?";
	   
	   try {
		   PreparedStatement pstmt = conn.prepareStatement(sql);
		   pstmt.setInt(1, bbsID);
		   rs = pstmt.executeQuery();
		   if(rs.next()) {
			   Bbs bbs = new Bbs();
			   bbs.setBbsID(rs.getInt(1));
			   bbs.setBbsTitle(rs.getString(2));
			   bbs.setUserID(rs.getString(3));
			   bbs.setBbsDate(rs.getString(4));
			   bbs.setBbsContent(rs.getString(5));
			   bbs.setBbsAvailable(rs.getInt(6));			   
			   return bbs;
		   }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
   }
   
   /*게시글 수정 메소드
     매개변수로 게시글번호, 글제목, 글내용을 받아와서 데이터 수정을 해주는 메소드
     */
   public int update(int bbsID, String bbsTitle, String bbsContent) {
	   String sql = "update bbs set bbsTitle =?, bbsContent =? where bbsID =? ";
	   try {
		   PreparedStatement pstmt = conn.prepareStatement(sql);
		   pstmt.setString(1, bbsTitle);
		   pstmt.setString(2, bbsContent);
		   pstmt.setInt(3, bbsID);
		   return pstmt.executeUpdate();
	   } catch (Exception e) {
		e.printStackTrace();
	}
	return -1;
   }
   
   /*게시글 삭제 메소드
   실제 데이터를 삭제하는것이 아니라 게시글 유효숫자를 '0'으로 수정
   */
   public int delete(int bbsID) {
	   String sql = "update bbs set bbsAvailable = 0 where bbsID =? ";//실제 삭제가 아니라 유효숫자를 '0'으로 수정
	   try {
		   PreparedStatement pstmt = conn.prepareStatement(sql);
		   pstmt.setInt(1, bbsID);
		   return pstmt.executeUpdate();
	   } catch (Exception e) {
			e.printStackTrace();
		}  
	   	return -1;
   }
   
   
   
   
   
   
   
   
   
   
}
