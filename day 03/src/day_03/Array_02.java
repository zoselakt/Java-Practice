package day_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	public static void main(String[] args) {
		// �迭 - �ζ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int lottoAr[]= new int[6];
		int userAr[]=new int[6];
		int bonus, bonusUser;  // ������ ���¸� �޸��� �����ؼ� ��밡��
		int count = 0;
		
		for(int i=0; i<6; i++) {
			lottoAr[i]=random.nextInt(45)+1;}
		bonus = random.nextInt(45)+1;
		
		System.out.println("lotto : "+ Arrays.toString(lottoAr) + ", bonus:" + bonus);
		System.out.println("���� �Է� :");
		
		for(int i=0; i<6; i++ ) {
			userAr[i]=sc.nextInt();	}
		
		System.out.println("���ʽ� �� �Է�:");
		
		bonusUser = sc.nextInt();
		
		System.out.println("User:" + Arrays.toString(userAr) + ", bonus:" + bonusUser);
		
		for(int j=0; j<6; j++) {
			for(int i = 0; i<6; i++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
		}		}		}
		System.out.println("�� ���� ����:" +count);
		
		if(count==6 ) {
			System.out.println("1�� ��÷�Դϴ�");	}
		else if(count ==5) {
			if(bonus == bonusUser) {
				System.out.println("2�� ��÷�Դϴ�.");	}
			else {
				System.out.println("3�� ��÷�Դϴ�.");	}
		}
		else if (count==4) {
			System.out.println("4�� ��÷�Դϴ�."); }
		else if (count==3) {
			System.out.println("5�� ��÷�Դϴ�."); }
		else {
			System.out.println("������ȸ��..."); }
	
	
}}
