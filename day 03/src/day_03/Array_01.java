package day_03;

import java.util.Arrays;

public class Array_01 {
	public static void main(String[] args) {
		// �迭 : ���̽��� rangeó�� 10���� ���� ��� �ϳ��� �������� 10���� ��ü�� ����� �ִ�. 
		//
		
			// �迭 : []score �� ����  / [] �� ������� 
				int scores[] = new int[3];
				scores[0] = 100;
				scores[1] = 80;
				scores[2] = 70;
				System.out.println("1��° �л��� ����: "+scores[0]+"��");
				System.out.println("2��° �л��� ����: "+scores[1]+"��");
				System.out.println("3��° �л��� ����: "+scores[2]+"��");
				
			// length
//				int []a=new int[] {10,20,4,25,18};  // ������� x
				int []b= {1,2,3,4,5,6,7};
				int c[]= new int[10];
				for(int i=0; i<c.length;i++) {
					c[i]=i;	}
				for(int i=0;i<c.length;i++) {
					System.out.print(c[i]);	}
				
				System.out.println();
				System.out.println(Arrays.toString(c));
				
				// for ������ �迭Ȱ��
				for(int i = 0; i < 3; i++) {
					System.out.println(i + 1 + "��° �л��� ����: " + scores[i] + "��");	}
}}
