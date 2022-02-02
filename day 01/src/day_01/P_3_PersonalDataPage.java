package day_01;

import java.util.Scanner;

public class P_3_PersonalDataPage {
	public static void main(String[] args) {
		// 개인정보 저장 페이지
		Scanner sc = new Scanner(System.in);
		
		daoClass dao = new daoClass();
		
		int chNum;
		
		while(true) {
			System.out.println("----실행하실 작업의 번호를 입력하세요----");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.print("프로그램 종료 \n");
			
			chNum = sc.nextInt();
			
			switch (chNum) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.delete();
				break;
			case 3:
				dao.search();
				break;
			case 4:
				dao.update();
				break;
			dafault:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			System.out.println();
		}



		class daoClass1{
			daoClass1 dtoArr[] = new daoClass1[20];
			
			private boolean swit[] = new boolean[20];
			private int pageNum;
			private String check;
			
			public daoClass1() {
				init();
			}
			public void init() {
				for(int i=0; i<swit.length; i++) {
					swit[i] = false;
				}
			}
			public void insert() {
				System.out.println();
				for(int i=0; i<dtoArr.length; i++) {
					if(swit[dtoArr.length - 1] == true) {
						System.out.println("더이상 페이지를 추가할수 없습니다.");
						return;
					} else if (swit[i] == false) {
						System.out.println((i+1) + "번 페이지에 작성 하실수 있습니다. \n");
						break;
					}
				}
				System.out.print("# 나이\n >>>");
				int age = sc.nextInt();
				System.out.print("# 이름\n >>>");
				String name = sc.next();
				System.out.print("# 생년월일\n >>>");
				String birth = sc.next();
				System.out.print("# 주소\n >>>");
				String address = sc.next();
				
				for(int i=0; i<dtoArr.length; i++) {
					if(swit[i] == false) {
						swit[i] = true;
						pageNum = i + 1;
						dtoArr[i] = new daoClass1();
						System.out.println("\n" + pageNum + "번째 페이지가 작성되었습니다.");
						break;
					}
				}
			}
			public void delete() {
				System.out.println("\n 삭제하고 싶은 책의 쪽수를 입력하세요(1~20) \n>>>");
				pageNum= sc.nextInt();
				if(dtoArr[pageNum -1] == null) {
					System.out.println("\n 작성되지 않은 페이지입니다.");
					return;
				}
				System.out.println("\n삭제하고 싶은 " + pageNum + "페이지의 내용입니다.");
				System.out.println(dtoArr[pageNum -1].toString());
				System.out.print("페이지를 삭제하고 싶으시면 'Y' 아니면 'N' 을 입력하세요 \n>>>");
				check = sc.next();
				if(check.equals("y") || check.equals("Y")) {
					swit[pageNum -1] =false;
					dtoArr[pageNum -1] = null;
					System.out.println("\n 페이지가 삭제되었습니다.");
				} else {
					System.out.println("\n 삭제를 취소합니다.");
					return;
				}
			}
			public void search() {
				System.out.println();
				System.out.print("검색하고 싶은 책의 쪽수를 입력하세요 (1~20) \n>>>");
				pageNum = sc.nextInt();
				if (dtoArr[pageNum - 1] == null) {
					System.out.println("\n 작성된 페이지가 없는 쪽수 입니다. \n");
					return;
				}
				System.out.println("\n 검색하고 싶은 " + pageNum + "페이지의 내용입니다.");
				System.out.println(dtoArr[pageNum -1].toString());
			}
			public void update() {
				System.out.println();
				System.out.println("수정하고 싶은 책의 쪽수를 입력하세요(1~20) \n>>>");
				pageNum = sc.nextInt();
				if(dtoArr[pageNum -1] == null) {
					System.out.println("\n 작성된 페이지가 없는 쪽수입니다.");
					return;
				}
				System.out.println("페이지를 수정하고 싶으면 'Y' 아니면 'N'을 입력하세요 \n>>>");
				check = sc.next();
				if(check.equals("y") || check.equals("Y")) {
					System.out.print("# 나이\n >>>");
					int age = sc.nextInt();
					System.out.print("# 이름\n >>>");
					String name = sc.next();
					System.out.print("# 생년월일\n >>>");
					String birth = sc.next();
					System.out.print("# 주소\n >>>");
					String address = sc.next();
					
					dtoArr[pageNum -1] = new daoClass1();
					
					System.out.println("\n 페이지가 수정되었습니다.");
				}
			}
		}
		
		class daoClass2 {
			
			private int pageNum;
			private int age;
			private String name;
			private String birth;
			private String address;
			
			public int getPageNum() {
				return pageNum;
			}
			public void setPageNum(int pageNum) {
				this.pageNum = pageNum;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getBirth() {
				return birth;
			}
			public void setBirth(String birth) {
				this.birth = birth;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}

			public daoClass2(int pageNum, int age, String name, String birth, String address) {
				super();
				this.pageNum = pageNum;
				this.age = age;
				this.name = name;
				this.birth = birth;
				this.address = address;
			}
			@Override
			public String toString() {
				return "daoClass2 [pageNum=" + pageNum + ", age=" + age + ", name=" + name + ", birth=" + birth
						+ ", address=" + address + "]";
			}

			
			
		}
	}	
	
}
