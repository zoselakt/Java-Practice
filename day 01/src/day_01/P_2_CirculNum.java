package day_01;

import java.util.Scanner;

public class P_2_CirculNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ������ Ȧ���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
//		count: ������������, i:��, j:��, sw: ��ȣ����, k:�ݺ�Ƚ��
		int count = 0, i=0, j=-1, sw = 1, k = n;
		
		while(true) {
		//�� ���� ä���
			for(int p=0; p<k; p++) {
				j += sw;
				a[i][j] = ++count;
			}
			if(--k == 0) {
				break;
			}
		// �� ���� ä���
			for(int p=0; p<k; p++) {
				i += sw;
				a[i][j] = ++count;
			}
			sw *= -1;
		}
		for(i=0; i<n; i++) {  // i �� j �� �̹� ����Ǿ� ������ ���� ����Ÿ���� �����
			for(j=0; j<n; j++) { // ������ �����ߴ� ���� while���� ������������ ��� �ߴ°�.
				System.out.printf("%3d  ", a[i][j]);
			}
			System.out.println();
		}
	}
}