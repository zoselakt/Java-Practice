package day_01;

import java.util.Scanner;

public class Z_practice_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ī���ֹ����α׷�
		// C, R : �ֹ��ϱ�
		// 1. �޴���� / 2.�޴��Է� / 3. �޴������Է�/ 4.�޴��� �߰�/ 5. �ֹ������� �Ѱ� ����.
		// U : ����ϱ�
		// 1. �ֹ��� �޴�����Ʈ ��� / 2. ��Ҹ޴����/ 3. �Է¹��� �ֹ��� �ֹ�����Ʈ���� ���� / 4. �� �ݾ׿��� ġ��
		// 5. �ֹ��� ���� �Ѱ� ����
		// D : �����ϱ�
		// 1. �����ؾ��� �� �ݾ� ��� /2. ������ �ݾ��� �Է¹޴´�. /3. ������ �ݾװ� �ѱݾ��� �񱳰���Ѵ�.
		// 4. ����� �Ϸ�Ǿ����� �� �ݾ���0������ �ֹ�����Ʈ�� ����ش�./5. ��ü ������ �ʱ�ȭ�Ѵ�.
		
		int count = 0; // �ֹ�����
		String OrderList[]=new String[5]; //�ֹ��� 5������ ���� 
		int total =0; //�� �ݾ�
		
		while(true) {
			System.out.println("�� �١ڡ١ڡ١� ��Cafe�� �١ڡ١ڡ١� ��");
			System.out.println("1. �ֹ��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�Է�:");
			int num= sc.nextInt();
			if(num==1) {
				String menuName;
				int menuPrice;
				System.out.println("1. �Ƹ޸�ī�� /t 3800��");
				System.out.println("2. ī���ī /t 4200��");
				System.out.println("3. ī��� /t 4200��");
				System.out.println("4. ī��Ḷ���ƶ� /t 4500��");
				System.out.print("�ֹ��� �޴���ȣ:");
				int menuNum = sc.nextInt();
				if(menuNum==1) {
					menuName="�Ƹ޸�ī��";
					menuPrice = 3800;
				}
				else if (menuNum==2) {
					menuName="ī���ī";
					menuPrice = 4200;
				}
				else if (menuNum==3) {
					menuName="ī���";
					menuPrice = 4200;
				}
				else if (menuNum==4) {
					menuName="ī��Ḷ���ƶ�";
					menuPrice = 4500;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				total += menuPrice;
				OrderList[count] = menuName; // �ֹ� ���� 
				count++;
				System.out.println("�ֹ��� �޴�:" + menuName +"����:"+menuPrice+"�Դϴ�.");
			}
			else if(num==2) { // ����ϱ� ��ϸ޴� 
				
				System.out.println("�ֹ� ���"); // ���
				for(int i=0; i<count; i++) {
					System.out.println(i+ 1+ "," +OrderList[i]);;
				}
				System.out.println("����� �޴� ��ȣ:"); // �ֹ����
				int cancelNum = sc.nextInt();
				if(1<=cancelNum && cancelNum <=count) {
					String delMenu = OrderList[cancelNum - 1];
					System.out.println(delMenu + "�޴�����!");
					for(int i=cancelNum-1; i<count; i++) {
						OrderList[i] =OrderList[i+1]; 
					}
					if(delMenu.equals("�Ƹ޸�ī��")) {
						total-=3800;
					}
					else if(delMenu.equals("ī���ī")) {
						total -= 4200;
					}
					else if(delMenu.equals("ī���")) {
						total -= 4200;
					}
					else if(delMenu.equals("��ũƼ" )) {
						total -= 4500;
					}
					count--;
				}
			}
			else if(num==3) {
				System.out.println("������ �ݾ�:" + total + "��");
				System.out.println("������ �ݾ�:");
				int money = sc.nextInt();
				if(money<total) {
					System.out.println("�ݾ��� �����մϴ�.");
					continue;
				}
				else {
					System.out.println("���� �ݾ��� " + (money-total) + "�� �Դϴ�.");
					total = 0;
					for(int i=0; i<5; i++) {
						OrderList[i] = "";
					}
					count =0;
				}
			}
			else if(num==4) {
				System.out.println("�ֹ�����");
				break;
			}
			else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		}
	}
}