package day_01;

import java.util.Scanner;

public class P_2_Magicsquare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("�迭�� ������ Ȧ���� �Է��ϼ��� : ");
			n = sc.nextInt();
			if(n % 2 ==1) {
				break;
			}
			System.out.println("Ȧ���� �Է��ؾߵ�!!!");
		}
		
		// �Է¹��� �迭�� ������ŭ �迭�� �����Ѵ�.
		int data[][] = new int [n][n];
		// �������� ù ��° ���ڰ� ä������ ù�� ����ڸ�
		int i=0, j = (n-1) / 2;
		
		//Math.pow : x�� y���� ����Ѵ�. 5�� 5��
		for(int k=1; k<=Math.pow(n, 2); k++) {
			data[i][j] = k;
			//�迭�� ä�� ����(k)rk 5�� ����� ���� ���ڰ� ä���� ��ġ�� �ุ 1 ������Ų��.
			//5�ǹ���� �ƴϸ� ������ �� �������� ���� ���ڰ� ä������. (���� -1, ���� +1)
			if(k%n == 0) {
				i++;
			} else {
				if(--i<0) {
					// ���� �迭�� ������ ����� ������ ������ �����Ѵ�.
					i= n-1;
				}
				if(++j==n) {
					// ���� �迭�� ������ ����� ù ��°���� �����Ѵ�.
					j= 0;
				}
			}
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.printf("%3d ", data[i][j]);
				
			}
			System.out.println();
		}

	}
}