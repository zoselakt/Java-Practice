package day_01;

import java.util.Scanner;

// ������ �缭 ���α׷�
		class Book {
			private String isbn;
			private String title;
			private String author;
			private String publisher;
			private double price;
			private String desc;
			
			public Book() {} ;
			
			public Book(String isbn, String title, String author, String publisher, double price, String desc) {
				super();
				this.isbn = isbn;
				this.title = title;
				this.author = author;
				this.publisher = publisher;
				this.price = price;
				this.desc = desc;
			}

			public String getIsbn() {
				return isbn;
			}

			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public String getPublisher() {
				return publisher;
			}

			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public String getDesc() {
				return desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
			public String toString() {
				return isbn+ "," +title+ "," +author+ "," +publisher+ "," +price+ "," +desc;
			}
	}
		class Magazine extends Book {
			private int year;
			private int month;
			
			public Magazine(String isbn, String title, String author, String publisher, double price, String desc, int year, int month) {
				super(isbn, title, author, publisher, price, desc);
				this.year = year;
				this.month = month;
			}

			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				this.month = month;
			}
			public String toString() {
				return super.toString() + "," + year+ ","+ month;
			}
		}
		
		class BookManager {
			Book[] bList;
			int numberOfBooks;
			
			public BookManager(int numberOfBooks) {
				bList = new Book[numberOfBooks];
			}
			public int getNumberOfBooks() {
				return numberOfBooks;
			}
			public void insertBook(Book newBook) {
				for(int i=0; i<bList.length; i++) {
					if(bList[i] == null) {
						bList[i] = newBook;
						numberOfBooks++;
						break;
					}
				}
			}
		public Book[] getAllBook() {
			Book[] temp = new Book[numberOfBooks];
			int i=0;
			for(Book b: bList) {
				if(b==null) {
					continue;
				}
				else if(b.equals(bList[i])) {
					temp[i] = b;
				}
				i++;
			}
			return temp;
		}
		public Book searchBook(String isbn) {
			Book temp = null;
			for(Book b:bList) {
				if(b != null) {
					if(b.getIsbn().equals(isbn)) {
						temp = b;
					}
				}
			}
			return temp;
		}
		public Book[] searchBookByTitle(String title) {
			int count = 0;
			int i = 0;
			Book[] temp1 = new Book[numberOfBooks];
			for(Book b : bList) {
				if(b !=null) {
					if(b.getTitle().equals(title)) {
						temp1[i++] = b;
						count++;
					}
				}
			}
			Book[] temp2 = new Book[count];
			for(int j=0; j<count; j++) {
				if(temp1[j] != null) {
					temp2[j] = temp1[j];
				}
			}
			return temp2;
		}
		public Book[] searchBookBypublisher(String publisher) {
			int count =0;
			int i = 0;
			Book[] temp1 = new Book[numberOfBooks];
			for(Book b: bList) {
				if(b != null) {
					if(b.getPublisher().equals(publisher)) {
						temp1[i++] =b;
						count++;
					}
				}
			}
			Book[] temp2 = new Book[count];
			for(int j=0; j<count; j++) {
				if(temp1[j] != null) {
					temp2[j] = temp1[j];
				}
			}
			return temp2;
		}
		public Book[] searchBook(double price) {
			int count = 0;
			int i=0;
			Book[] temp1 = new Book[numberOfBooks];
			for(Book b:bList) {
				if(b != null) {
					if(b.getPrice() == price) {
						temp1[i++] = b;
						count++;
					}
				}
			}
			Book[] temp2 = new Book[count];
			for(int j=0; j<count; j++) {
				temp2[j] = temp1[j];
			}
			return temp2;
		}
		
		public double getSumPriceOfBooks() {
			int total = 0;
			for(Book b : bList) {
				if(b != null) total += b.getPrice();
			}
			return total;
		}
		public double getAveragePriceOfBooks() {
			return getSumPriceOfBooks() / numberOfBooks;
		}
	}
		
		public class P_3_Libraryan {
			public static void main(String[] args) {
			
			Book a = new Book("9788954620512", "���̾�", "�츣�� �켼", "������", 8500.0, "�Ҿ��� ������ ��ġ�� ��ȥ�� �ڼ���");
			Book b = new Book("9788954620512", "���̾�", "�츣�� �켼", "������", 8500.0, "�Ҿ��� ������ ��ġ�� ��ȥ�� �ڼ���");
			Book c = new Magazine("9788954620260", "��� ���е���", "������", "���ƻ��̾�", 8500.0, "�ʵ��л��� ���� �Ѵ޿� �� �� �����ϴ� ���и�ȭ ����", 2020, 3);
			Book d = new Book("9771975252008", "�ð� ����", "�̳���", "���е���", 9900.0, "�� 13ȸ ���е��� ��� ���л� ������");
			Book e = new Magazine("9771228402006", "����21", "������", "����21", 3800.0, "���ѹα��� ��ȭ ���� ����", 2020, 4);
			
			Book[] bs = {a,b,c,d,e};
			
			printBooks(bs);
		}
		public static void printBooks(Book[] bs) {
			BookManager service = new BookManager(100);
			
			for(int i=0; i<bs.length; i++) {
				service.insertBook(bs[i]);
			}
			boolean menu = true;
			while(menu == true) {
				System.out.println("===============================");
				System.out.println("S ���� ���� ������ ���� �������Դϴ�.");
				System.out.println("1. ������ ��ü ����å ��ȸ");
				System.out.println("2. ������ ����å �߰�");
				System.out.println("3. å ã��");
				System.out.println("4. ��üå ���� �հ� �� ��� ��ȸ");
				System.out.println("===============================");
				
				Scanner sc= new Scanner(System.in);
				int choice = sc.nextInt();
				
				if(choice ==1) {
					System.out.println("��ü ����å �� "+service.getNumberOfBooks()+"��");
					for(Book b:service.getAllBook()) {
						System.out.println(b);
					}
				}
				else if(choice ==2) {
					System.out.println("ISBN�� �Է��ϼ���."); 
					String isbn = sc.next(); 
					System.out.println("å ������ �Է��ϼ���."); sc.nextLine();
					String title = sc.nextLine();
					System.out.println("�۰��� �Է��ϼ���.");
					String author = sc.nextLine();
					System.out.println("���ǻ縦 �Է��ϼ���.");
					String publisher = sc.nextLine();
					System.out.println("������ �Է��ϼ���.");
					Double price = sc.nextDouble(); sc.nextLine();
					System.out.println("������ ������ �Է��ϼ���.");
					String desc = sc.nextLine();
					System.out.println("�Ϲݵ����̸� true, �����̸� false�� �Է��ϼ���."); 
					Boolean bkOrMaga = sc.nextBoolean();
					if(bkOrMaga.equals(true)) {
						service.insertBook(new Book(isbn, title, author, publisher, price, desc));
					}					
					else if(bkOrMaga.equals(false)) {
						System.out.println("�Ⱓ������ �Է��ϼ���.");
						int year = sc.nextInt();
						System.out.println("�Ⱓ���� �Է��ϼ���.");
						int month = sc.nextInt();
						service.insertBook(new Magazine(isbn, title, author, publisher, price, desc, year, month));
					}
					System.out.println("����å�� �߰��Ǿ����ϴ�.");
				}
				else if(choice ==3) {
					System.out.println("===============================");
					System.out.println("� ������� å�� ã�ڽ��ϱ�?");
					System.out.println("1. ISBN���� å ã��");
					System.out.println("2. å �������� å ã��");
					System.out.println("3. ���ǻ�� å ã��");
					System.out.println("4. �������� å ã��");
					System.out.println("5. ��������");
					System.out.println("===============================");
					sc.nextLine();
					int search = sc.nextInt(); 
					if(search==1) {
						System.out.println("ISBN�� �Է��ϼ���.");
						String isbn = sc.next(); sc.nextLine();
						if(service.searchBook(isbn) == null) System.out.println("��ġ�ϴ� å�� �����ϴ�.");
						else System.out.println(service.searchBook(isbn));
					}
					else if(search ==2) {
						System.out.println("å ������ �Է��ϼ���.");  sc.nextLine();
						String title = sc.nextLine(); 
						int count =0;
						for(Book b: service.searchBookByTitle(title)) {
							if(b != null) System.out.println(b);
							else count++;
						}
						if(count == service.searchBookByTitle(title).length) {
							System.out.println("��ġ�ϴ� å�� �����ϴ�.");
						}
					}
					else if(search == 3) {
						System.out.println("���ǻ縦 �Է��ϼ���.");
						String publisher = sc.next();
						int count =0;
						for(Book b : service.searchBookBypublisher(publisher)) {
							if(b != null) System.out.println(b);
							else count++;
						}
						if(count == service.searchBookBypublisher(publisher).length) {
							System.out.println("��ġ�ϴ� å�� �����ϴ�.");
						}
					}
					else if(search == 4) {
						System.out.println("������ �Է��ϼ���.");
						double price = sc.nextDouble(); sc.nextLine();
						int count =0;
						for(Book b : service.searchBook((double)price)) {
							if(b != null) System.out.println(b);
							else count++;
						}
						if(count == service.searchBook((double)price).length) {
							System.out.println("��ġ�ϴ� å�� �����ϴ�.");
						}
					}
					else if(search == 5) menu = true;
					else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				else if(choice == 4) {
						System.out.println("��üå ���� �հ� : " + service.getSumPriceOfBooks());
						System.out.println("��üå ���� ��� : " + service.getAveragePriceOfBooks());
				}
				else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
			
			}
	}
}

	
	


	
