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
		str += "������ ���ڸ� ���ǻ�� ������ ���� \n";
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
		DecimalFormat df = new DecimalFormat("#,##0��");
		str += "�հ� �ݾ� : " + df.format(total) + "\n";
		str += "====================================\n";
		return str;
	}
	//booklist�� bookvoŬ������ü�� �����ϴ� �޼���
	public void addBook(BookVO book) {
		bookList.add(book);

	}
}
