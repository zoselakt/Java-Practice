package day_03;

import java.util.Scanner;

public class Array_03 {
	public static void main(String[] args) {
		// ������ �迭 [][]
		
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int [4][3];
		String subject[] = {"����", "����", "����"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i+1 + "�� �л� ����----");
			for(int j = 0; j < 3; j++)  {
				System.out.print(subject[j] + ":");
				scores[i][j] = sc.nextInt(); }
		}
		System.out.println("\t���� \t���� \t����");
		for(int i=0; i<4; i++) {
			System.out.println("��: \t");
			for(int j =0; j<3; j++) {
				System.out.print(scores[i][j]);
				System.out.println("\t");	}
			System.out.println();
		}		
		
}}
