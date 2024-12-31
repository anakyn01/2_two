package mall.dao;

import java.util.ArrayList;

import mall.dto.Book;

//�����ͺ��̽��� �Է�
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
		/*Book book1 = new Book("ISBN1234","�巡�ﺼ ���� �巡�ﺼ ���� �巡�ﺼ ���� �巡�ﺼ ���� �巡�ﺼ ����", 9000);
		book1.setAuthor("�����");
		book1.setDescription("�ִϸ��̼ǰ� ������ �帧�� �����ϴ�. �巡�ﺼ Z: �ŵ��� ���� �κ��� ������ ������ �ƴ� �ִϸ��̼� �������� �����Ǹ� �� ���� ������ ��û �����Ǿ��� �巡�ﺼ Z: ��Ȱ�� 'F' �κ��� ���̽��� �������� ����������� ����Ʈ�ȴٰ� ������� ����� ��ް� �Բ� �ƿ� �����Ǿ� �ִ�. �׷��� 4ȭ���� �ణ�̳��� ��Ȱ�� F �κ��� ���̽��� ����� �������� ���� ���� �����̳��� �׸��⵵ �Ͽ���. �� �Ŀ� ��6������� �̷� Ʈ��ũ�� ��, ���� �����̹� ���� ����Ǿ��µ� ��� �ִϸ��̼ǰ� �����ϰ� �ٸ���, ��6���������� ������ ��� ��ձ��� �ȳ�����, �̷� Ʈ��ũ�������� �ִϸ��̼ǿ����� �ȳ��� �ʻ��̾��� �� �����Ͱ� �����⵵ �Ѵ�. �׸��� ���� �ֱ� ���Ǽҵ��� ���� �����̹� ������ �ִϸ��̼ǿ� �ȳ��� �ı��ŵ���� ��Ʋ�ξ⵵ ���´�.");
		book1.setPublisher("���﹮ȭ��");
		book1.setCategory("���дϸ��̼�");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2018/01/01");
		book1.setFilename("db.jpg");
		
		Book book2 = new Book("ISBN1235","���ͽ�����", 9000);
		book2.setAuthor("�����");
		book2.setDescription("õ�� �߸��� �븮��Ű ������ ����� ��û�� ���� ���� �ҳ� �����ΰ� �븮��Ű �ƶ󷹸� ����� �ȴ�.��ȭ�ο�(?) ��ϸ������� �ƶ󷹿� �ֹε��� ������ �ϻ�, �׸��� ���� �ڻ��� ���õ���� �߸�ǰ�鿡 ���� �Ͼ�� �������� �׸� �������� �ϻ� �ڹ̵�.");
		book2.setPublisher("���﹮ȭ��");
		book2.setCategory("���дϸ��̼�");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2018/01/01");
		book2.setFilename("doctor.jpg");
		
		Book book3 = new Book("ISBN1236","����뵢ũ", 9000);
		book3.setAuthor("�̳�쿡 ��������");
		book3.setDescription("���б� 3�� ���� 50���� ���ڿ��� ���� ����ȣ. ����л��� �� �״� ���� ���� �ɾ� �� ����, ä�ҿ����� ù���� ���Ѵ�.\"�� �����ϼ���?\"��� ������ �Բ� �ɱ��� ��������...!?");
		book3.setPublisher("���﹮ȭ��");
		book3.setCategory("���дϸ��̼�");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2018/01/01");
		book3.setFilename("slamdunk.jpg");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);*/
		
	
	}
	//����� �������� �޼ҵ� �����
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}	
	
	//detail
	public Book getBookById(String bookId) {
		Book bookById = null;
		
		//���� ����
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
