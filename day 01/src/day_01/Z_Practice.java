package day_01;

import java.util.Random;
import java.util.Scanner;

public class Z_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int RottoAr[] = new int[6];
		int UserAr[] = new int[6];
				
		int Bonus;
		int UserBonus;
		int count = 0;
		
		for(int i=0; i<6; i++) {
			RottoAr[0] = random.nextInt(45) + 1;
		}
		Bonus = random.nextInt(45) + 1;
		System.out.println("���ڸ� �Է��ϼ��� :");
		for(int i=0; i<6; i++) {
			UserAr[i] = sc.nextInt();
		}
		System.out.println("���ʽ� ���ڸ� �Է��ϼ��� :");
		UserBonus = sc.nextInt();
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if( RottoAr[j] == UserAr[i]) {
					count++;
		}}}
		if (count == 6) {
			System.out.println("1��");
		}
		else if(count == 5) {
			if (Bonus == UserBonus){
				System.out.println("2��");
			}
		
			 else {
			System.out.println("3��");
			}
		}
		else if(count == 4) {
			System.out.println("4��");
		}
		else if (count == 3) {
			System.out.println("5��");
		}
		else {
			System.out.println("Ż��");
		}
	}
}
