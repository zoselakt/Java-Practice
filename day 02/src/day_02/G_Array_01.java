package day_02;

import java.util.Arrays;
import java.util.Scanner;

public class G_Array_01 {
	public static void main(String[] args) {
		// �迭 : ���̽��� rangeó�� 10���� ���� ��� �ϳ��� ������� 10���� ��ü�� ����� �ִ�. 
		
			// �迭 : []score �� ����  / [] �� ������� 
				int score[] = new int[3];
				score[0] = 100;
				score[1] = 80;
				score[2] = 70;
				System.out.println("1��° �л��� ����: "+score[0]+"��");
				System.out.println("2��° �л��� ����: "+score[1]+"��");
				System.out.println("3��° �л��� ����: "+score[2]+"��");
				
			// length
//				int []a=new int[] {10,20,4,25,18};  // ������� x
//				int []b= {1,2,3,4,5,6,7};
				
				int c[]= new int[10];
				for(int i=0; i<c.length;i++) {
					c[i]=i;	}
				for(int i=0;i<c.length;i++) {
					System.out.print(c[i]);	}
				System.out.println(Arrays.toString(c));
				
				// for ������ �迭Ȱ��
				for(int i = 0; i < 3; i++) {
					System.out.println(i + 1 + "��° �л��� ����: " + score[i] + "��");	}

//---------------------------------------------------------------------------------------

// ������ �迭 
// int ar1[][] = new int [2][5]
// [��������][������� ����] / ǥ������ ����
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