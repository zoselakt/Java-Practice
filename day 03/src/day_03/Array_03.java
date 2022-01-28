package day_03;

import java.util.Scanner;

public class Array_03 {
	public static void main(String[] args) {
		// 다차원 배열 [][]
		
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int [4][3];
		String subject[] = {"국어", "영어", "수학"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println(i+1 + "번 학생 점수----");
			for(int j = 0; j < 3; j++)  {
				System.out.print(subject[j] + ":");
				scores[i][j] = sc.nextInt(); }
		}
		System.out.println("\t국어 \t영어 \t수학");
		for(int i=0; i<4; i++) {
			System.out.println("번: \t");
			for(int j =0; j<3; j++) {
				System.out.print(scores[i][j]);
				System.out.println("\t");	}
			System.out.println();
		}		
		
}}
