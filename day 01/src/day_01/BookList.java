package day_01;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookList {

	private ArrayList<BookVO> bookList = new ArrayList<>();

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "도서명 저자명 출판사명 출판일 가격 \n";
		str += "====================================\n";
		
		double total = 0.0;
		/*
		for(int i=0; i<bookList.size(); i++) {
			str+=bookList.get(i) + "\n";
			total += bookList.get(i).getPrice();
		}
		*/
		for(BookVO book : bookList) {
			str += book + "\n" ;
			total += book.getPrice();
		}
		str += "====================================\n";
		DecimalFormat df = new DecimalFormat("#,##0원");
		str += "합계 금액 : " + df.format(total) + "\n";
		str += "====================================\n";
		return str;
	}
	//booklist에 bookvo클래스객체를 저장하는 메서드
	public void addBook(BookVO book) {
		bookList.add(book);

	}
}
