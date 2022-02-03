package day_02;

import java.util.Arrays;
import java.util.Scanner;

public class G_Array_01 {
	public static void main(String[] args) {
		// 배열 : 파이썬의 range처럼 10개의 변수 대신 하나의 명령으로 10개의 객체를 만들수 있다. 
		
			// 배열 : []score 도 가능  / [] 는 저장공간 
				int score[] = new int[3];
				score[0] = 100;
				score[1] = 80;
				score[2] = 70;
				System.out.println("1번째 학생의 점수: "+score[0]+"점");
				System.out.println("2번째 학생의 점수: "+score[1]+"점");
				System.out.println("3번째 학생의 점수: "+score[2]+"점");
				
			// length
//				int []a=new int[] {10,20,4,25,18};  // 순서상관 x
//				int []b= {1,2,3,4,5,6,7};
				
				int c[]= new int[10];
				for(int i=0; i<c.length;i++) {
					c[i]=i;	}
				for(int i=0;i<c.length;i++) {
					System.out.print(c[i]);	}
				System.out.println(Arrays.toString(c));
				
				// for 문으로 배열활용
				for(int i = 0; i < 3; i++) {
					System.out.println(i + 1 + "번째 학생의 점수: " + score[i] + "점");	}

//---------------------------------------------------------------------------------------

// 다차원 배열 
// int ar1[][] = new int [2][5]
// [묶음갯수][각요소의 갯수] / 표만들기와 유사
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