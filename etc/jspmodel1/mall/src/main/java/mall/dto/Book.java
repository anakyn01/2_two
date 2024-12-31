package mall.dto;

import java.io.Serializable;

public class Book implements Serializable{
private static final long serialVersionUID = -4274700572038677000L;
/*
����ȭ => �ڹ� �ý��� ���ο��� ���Ǵ� ��ü �Ǵ� �����͵��� �ܺ��� �ڹٽý��ۿ����� ��� �Ҽ� �ֵ���
����Ʈ(byte) ���·� �����͸� ��ȯ�ϴ� ���
������ȭ => ����Ʈ�� ��ȯ�� �����͸� �ٽ� ��ü�� ��ȯ�ϴ�

����ȭ ���� 
csv(��ǥ�� ����), xml, json
serialVersionUID�� ����ȭ(implements Serializable)�� �Ҷ� ����Ѵ�
���� IDE����  Serializable�������̽��� �����ϸ� serialVersionUID�� ���� �Ҵ��϶�� �Ѵ�
serialVersionUID�� �����̰� �� �Ҵ��� �ؾ� �ϳ���?

 Serializable�� ����ϴ� Ŭ������ ��� class�� versioning�뵵�� 
 serialVersionUID�� ������ ����Ѵ� 
 �̶� serialVersionUID���� ��������� �������� ������ compiler�� ����� ���� �ο��ϴµ�
Serializable class�Ǵ� outerŬ������ ������ ������ 
serialVersionUID ���� �ٲ�� �ȴ�
�������� ������ Serialize�� �Ҷ��� DeSerialize�Ҷ� 
serialVersionUID���� �ٸ��� invalidClassException�� �߻��Ͽ� ����� ���� ��ü�� restore�Ҽ� ����
*/
public Book() {
	super();
}
//�������丮�� ������
public Book(String bookId, String name, Integer unitPrice) {
	this.bookId = bookId;
	this.name = name;
	this.unitPrice = unitPrice;
}



private String bookId;
private String name;
private int unitPrice;
private String author;
private String description;
private String publisher;
private String category;
private long unitsInStock;
private String releaseDate;
private String condition;
private String filename;

public void setBookId(String bookId) {this.bookId = bookId;}
public void setName(String name) {this.name = name;}
public void setUnitPrice(int unitPrice) {this.unitPrice = unitPrice;}
public void setAuthor(String author) {this.author = author;}
public void setDescription(String description) {this.description = description;}
public void setPublisher(String publisher) {this.publisher = publisher;}
public void setCategory(String category) {this.category = category;}
public void setUnitsInStock(long unitsInStock) {this.unitsInStock = unitsInStock;}
public void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate;}
public void setCondition(String condition) {this.condition = condition;}
public void setFilename(String filename) {this.filename = filename;}

public String getBookId() {return bookId;}
public String getName() {return name;}
public int getUnitPrice() {return unitPrice;}
public String getAuthor() {return author;}
public String getDescription() {return description;}
public String getPublisher() {return publisher;}
public String getCategory() {return category;}
public long getUnitsInStock() {return unitsInStock;}
public String getCondition() {return condition;}
public String getReleaseDate() {return releaseDate;}
public String getFilename() {return filename;}












}
