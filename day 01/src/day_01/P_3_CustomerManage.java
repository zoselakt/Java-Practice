package day_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P_3_CustomerManage{
	
	static HashMap<String, String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("�ޡߡޡߡޡ���ȭ��ȣ�Ρޡߡޡߡޡ�");
			System.out.println("1. ������ ����");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ���");
			System.out.println("4. ������");
			System.out.println("��ȣ �Է�: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("�ޡߡޡ߰����� ����ޡߡޡ�");
				insert();
			}else if(choice == 2) {
				System.out.println("�ޡߡޡ߰����� �˻��ޡߡޡ�");
				search();
			}else if(choice == 3) {
				System.out.println("�ޡߡޡ߰����� ��¡ޡߡޡ�");
				show();
			}else if(choice == 4) {
				System.out.println("���α׷� ����!");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;
			}
		}
		
	}

	public static void insert() {
		String name, phone;
		System.out.println("������ ���� �̸�: ");
		name = sc.next();
		
		//�ߺ��Ұ� ó��
		if(hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			return;
		}else {
			System.out.println("������ ���� ��ȣ: ");
			phone = sc.next();
			hm.put(name, phone);
			System.out.println("���� �Ϸ�!");
		}
		
	}
	public static void search() {
		String searchName;
		System.out.println("�˻��� �̸�: ");
		searchName = sc.next();
		
		if(hm.containsKey(searchName)) {
			System.out.println("�˻� �Ϸ�!");
			System.out.println("�˻��� ��ȭ��ȣ: "+ hm.get(searchName));
		}else {
			System.out.println("�˻��� �̸��� ���������ʽ��ϴ�.");
		}
	}
	public static void show() {
		Set<String> keyset = hm.keySet();
		Iterator i = keyset.iterator();
		while(i.hasNext()) {
			String curName =(String) i.next(); // ����� ����ȯ / �ٿ�ĳ����
			System.out.println("name: " + curName+ ", phone: " +hm.get(curName));
		}
	}
}