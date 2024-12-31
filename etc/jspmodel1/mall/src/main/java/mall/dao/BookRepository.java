package mall.dao;

import java.util.ArrayList;

import mall.dto.Book;

//데이터베이스를 입력
public class BookRepository {

	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();
	
	public static BookRepository getInstance() {
		return instance;
	}
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
	
	public BookRepository() {
		/*Book book1 = new Book("ISBN1234","드래곤볼 슈퍼 드래곤볼 슈퍼 드래곤볼 슈퍼 드래곤볼 슈퍼 드래곤볼 슈퍼", 9000);
		book1.setAuthor("조산명");
		book1.setDescription("애니메이션과 내용의 흐름이 동일하다. 드래곤볼 Z: 신들의 전쟁 부분이 극장판 내용이 아닌 애니메이션 내용으로 전개되며 이 역시 내용이 엄청 생략되었고 드래곤볼 Z: 부활의 'F' 부분은 우이스가 오공에게 골든프리저를 쓰러트렸다고 방심하지 말라는 언급과 함께 아예 생략되어 있다. 그러다 4화에서 약간이나마 부활의 F 부분을 우이스의 설명과 프리저의 꿈을 통해 조금이나마 그리기도 하였다. 그 후에 제6우주편과 미래 트랭크스 편, 우주 서바이벌 편이 연재되었는데 모두 애니메이션과 세세하게 다르며, 제6우주편에서는 오공의 블루 계왕권이 안나오며, 미래 트랭크스편에서는 애니메이션에서도 안나온 초사이어인 갓 베지터가 나오기도 한다. 그리고 가장 최근 에피소드인 우주 서바이벌 편에서도 애니메이션에 안나온 파괴신들과의 배틀로얄도 나온다.");
		book1.setPublisher("서울문화사");
		book1.setCategory("저패니메이션");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2018/01/01");
		book1.setFilename("db.jpg");
		
		Book book2 = new Book("ISBN1235","닥터슬럼프", 9000);
		book2.setAuthor("조산명");
		book2.setDescription("천재 발명가인 노리마키 센베는 어느날 엄청난 힘을 가진 소녀 인조인간 노리마키 아라레를 만들게 된다.평화로운(?) 펭귄마을에서 아라레와 주민들의 유쾌한 일상, 그리고 센베 박사의 기상천외한 발명품들에 의해 일어나는 해프닝을 그린 요절복통 일상 코미디.");
		book2.setPublisher("서울문화사");
		book2.setCategory("저패니메이션");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2018/01/01");
		book2.setFilename("doctor.jpg");
		
		Book book3 = new Book("ISBN1236","슬라노덩크", 9000);
		book3.setAuthor("이노우에 다케히코");
		book3.setDescription("중학교 3년 동안 50명의 여자에게 차인 강백호. 고등학생이 된 그는 문득 말을 걸어 온 여자, 채소연에게 첫눈에 반한다.\"농구 좋아하세요?\"라는 물음과 함께 꽃길이 펼쳐진다...!?");
		book3.setPublisher("서울문화사");
		book3.setCategory("저패니메이션");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2018/01/01");
		book3.setFilename("slamdunk.jpg");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);*/
		
	
	}
	//목록을 가져오는 메소드 만들기
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}	
	
	//detail
	public Book getBookById(String bookId) {
		Book bookById = null;
		
		//개별 생성
		for (int i=0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookById= book;
				break;
			}
		}
		
		return bookById;
	}
	
	
	
	
	
	
	
	
	
	
}
