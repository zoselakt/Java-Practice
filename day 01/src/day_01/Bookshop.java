package day_01;

import java.util.Date;

public class Bookshop {
	public static void main(String[] args) {
		
		BookList bookList = new BookList();
		
		BookVO book1 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		BookVO book2 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		BookVO book3 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		BookVO book4 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		BookVO book5 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		BookVO book6 = new BookVO("자바", "홍길동", "코리아아이티학원", new Date(2022, 5, 15), 35000);
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
		
		
	}
}
