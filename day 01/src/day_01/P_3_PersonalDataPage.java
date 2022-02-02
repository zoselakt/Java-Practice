package day_01;

import java.util.Scanner;

public class P_3_PersonalDataPage {
	public static void main(String[] args) {
		// �������� ���� ������
		Scanner sc = new Scanner(System.in);
		
		daoClass dao = new daoClass();
		
		int chNum;
		
		while(true) {
			System.out.println("----�����Ͻ� �۾��� ��ȣ�� �Է��ϼ���----");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.println("3. �˻�");
			System.out.println("4. ����");
			System.out.print("���α׷� ���� \n");
			
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
				System.out.println("���α׷��� �����մϴ�.");
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
						System.out.println("���̻� �������� �߰��Ҽ� �����ϴ�.");
						return;
					} else if (swit[i] == false) {
						System.out.println((i+1) + "�� �������� �ۼ� �ϽǼ� �ֽ��ϴ�. \n");
						break;
					}
				}
				System.out.print("# ����\n >>>");
				int age = sc.nextInt();
				System.out.print("# �̸�\n >>>");
				String name = sc.next();
				System.out.print("# �������\n >>>");
				String birth = sc.next();
				System.out.print("# �ּ�\n >>>");
				String address = sc.next();
				
				for(int i=0; i<dtoArr.length; i++) {
					if(swit[i] == false) {
						swit[i] = true;
						pageNum = i + 1;
						dtoArr[i] = new daoClass1();
						System.out.println("\n" + pageNum + "��° �������� �ۼ��Ǿ����ϴ�.");
						break;
					}
				}
			}
			public void delete() {
				System.out.println("\n �����ϰ� ���� å�� �ʼ��� �Է��ϼ���(1~20) \n>>>");
				pageNum= sc.nextInt();
				if(dtoArr[pageNum -1] == null) {
					System.out.println("\n �ۼ����� ���� �������Դϴ�.");
					return;
				}
				System.out.println("\n�����ϰ� ���� " + pageNum + "�������� �����Դϴ�.");
				System.out.println(dtoArr[pageNum -1].toString());
				System.out.print("�������� �����ϰ� �����ø� 'Y' �ƴϸ� 'N' �� �Է��ϼ��� \n>>>");
				check = sc.next();
				if(check.equals("y") || check.equals("Y")) {
					swit[pageNum -1] =false;
					dtoArr[pageNum -1] = null;
					System.out.println("\n �������� �����Ǿ����ϴ�.");
				} else {
					System.out.println("\n ������ ����մϴ�.");
					return;
				}
			}
			public void search() {
				System.out.println();
				System.out.print("�˻��ϰ� ���� å�� �ʼ��� �Է��ϼ��� (1~20) \n>>>");
				pageNum = sc.nextInt();
				if (dtoArr[pageNum - 1] == null) {
					System.out.println("\n �ۼ��� �������� ���� �ʼ� �Դϴ�. \n");
					return;
				}
				System.out.println("\n �˻��ϰ� ���� " + pageNum + "�������� �����Դϴ�.");
				System.out.println(dtoArr[pageNum -1].toString());
			}
			public void update() {
				System.out.println();
				System.out.println("�����ϰ� ���� å�� �ʼ��� �Է��ϼ���(1~20) \n>>>");
				pageNum = sc.nextInt();
				if(dtoArr[pageNum -1] == null) {
					System.out.println("\n �ۼ��� �������� ���� �ʼ��Դϴ�.");
					return;
				}
				System.out.println("�������� �����ϰ� ������ 'Y' �ƴϸ� 'N'�� �Է��ϼ��� \n>>>");
				check = sc.next();
				if(check.equals("y") || check.equals("Y")) {
					System.out.print("# ����\n >>>");
					int age = sc.nextInt();
					System.out.print("# �̸�\n >>>");
					String name = sc.next();
					System.out.print("# �������\n >>>");
					String birth = sc.next();
					System.out.print("# �ּ�\n >>>");
					String address = sc.next();
					
					dtoArr[pageNum -1] = new daoClass1();
					
					System.out.println("\n �������� �����Ǿ����ϴ�.");
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
