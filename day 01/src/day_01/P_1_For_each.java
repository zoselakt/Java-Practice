package day_01;

import java.util.Scanner;

public class P_1_For_each {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ֹ����α׷� - for each ��
								
				String fruits[] = new String[3];
				
				for(int i=0; i<3; i++) {
					System.out.print("�ֹ��� ����:");
					fruits[i] = sc.next();	}
				
				System.out.println("----�ֹ����� ����----");
				for(String eachFruit:fruits) {
					System.out.print(eachFruit+" ");}

	}

}
