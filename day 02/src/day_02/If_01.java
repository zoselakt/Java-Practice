package day_02;

import java.util.Scanner;

public class If_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("����: ");
		age= sc.nextInt();
		
		if(age>19) {
			System.out.println("�����Դϴ�.");	}
		
		else if(age > 13) {
			System.out.println("û�ҳ��Դϴ�..");	}
		
		else if(age > 8) { 
			System.out.println("�ʵ��л��Դϴ�.");	}

		else {
			System.out.println("�����Դϴ�.");	}
//---------------------------------------------------------------------------------------
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ��� : ");
		id=input.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id ��ġ!");
			System.out.print("��й�ȣ�� �Է����ּ��� : ");
			password= input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("password��ġ!");
				System.out.println("�α��μ���!");	}
			else {
				System.out.println("password ����ġ"); }
		}
		else {
			System.out.println("ID ����ġ");	}
}}
