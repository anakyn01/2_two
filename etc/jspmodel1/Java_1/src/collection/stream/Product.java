package collection.stream;

public class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product(int pno,String name,String company,int price) {
		this.pno=pno;
		this.name=name;
		this.company=company;
		this.price=price;
	}
	
	public int getPno() {return pno;}
	public String getName() {return name;}
	public String getCompany() {return company;}
	public int getPrice() {return price;}
	
	@Override
	public String toString() { //많은 문자열을 연결하면 중간 문자열 객체가 생성되서 비효율적인 코드가 생성된다
		//한번 생성되면 내용을 바꿀수 없다는 얘기 하나의 문자열을 다른 문자열과 연결하면 새문자열이 생성되고 이전 문자열 가비지 컬렉터로 들어간다
		//100만개의 문자열을 연결한다면 이걸 백만번 수행해야 하니 이런 문제를 해결하는게 아래의 스트링 빌더이다 스트링을 합치는 하나의 대안
		return new StringBuilder()
			.append("{")
			.append("pno :" + pno + ", ")
			.append("company : " + company + ", ")
			.append("price : " + price)
			.append("}")
			.toString();
	}
	
	
	public void setPno(int pno) {this.pno = pno;}	
	public void setName(String name) {this.name = name;}
	public void setCompany(String company) {this.company = company;}
	public void setPrice(int price) {this.price = price;}


}
