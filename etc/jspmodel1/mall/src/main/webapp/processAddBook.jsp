<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="mall.dto.Book"%>
<%@ page import="mall.dao.BookRepository"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%
request.setCharacterEncoding("UTF-8");

//파일네임 초기화
String filename ="";
String realFolder = "C:\\dev\\jspmodel1\\mall\\src\\main\\webapp\\images";//실질적으로 이미지가 올라가는 패스
int maxSize = 5 * 1024 * 1024; //5메가
String encType="utf-8"; //인코딩 유형

//객체 생성
MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
//new DefaultFileRenamePolicy() 같은 이름으로 파일명이 올라올 경우 => yse yse(1)
String bookId = multi.getParameter("bookId");
String name = multi.getParameter("name");
String unitPrice = multi.getParameter("unitPrice");
String author = multi.getParameter("author");
String publisher = multi.getParameter("publisher");
String releaseDate = multi.getParameter("releaseDate");
String description = multi.getParameter("description");
String category = multi.getParameter("category");
String unitsInStock = multi.getParameter("unitsInStock");
String condition = multi.getParameter("condition");
//형식이 숫자여도 결국 리턴은 파싱으로 스트링
/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double 자동캐스팅

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte 수동캐스팅
*/

Enumeration files = multi.getFileNames();//Enumeration객체타입의 getFileNames 메소드 작성
String fname = (String) files.nextElement();//없던부분 선언
String fileName = multi.getFilesystemName(fname);//변수파일 네임에 fname대입

//입력 항목에 아무것도 표기하지 않을경우 가격과 재고수량에 입력을 하지않을 경우에 설정
Integer price; //래퍼틀래스 로 가격 선언 바로 표현할수 있는 장점이 있음

if(unitPrice.isEmpty()) price=0; else price=Integer.valueOf(unitPrice);

long stock;
if(unitsInStock.isEmpty()) stock=0; else stock=Long.valueOf(unitsInStock);

//입력할때의 정의와 변수가 발생했을때 를 정의한것

//객체를 실질적으로 활용하는 실객체 instance설정
BookRepository dao = BookRepository.getInstance();

Book newBook = new Book();
newBook.setBookId(bookId);
newBook.setName(name);
newBook.setUnitPrice(price);
newBook.setAuthor(author);
newBook.setPublisher(publisher);
newBook.setReleaseDate(releaseDate);
newBook.setDescription(description);
newBook.setCategory(category);
newBook.setUnitsInStock(stock);
newBook.setCondition(condition);
newBook.setFilename(fileName);

dao.addBook(newBook);

response.sendRedirect("books.jsp");
%>