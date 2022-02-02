package day_01;

import java.util.Scanner;

public class P_2_Week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ��, ��, ���� �Է�:");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		//�Է³⵵�� ���⵵ 12�� 31�� ���� ����Ѵ�.
		//4�⸶�� ����, 100�⸶�� 1���� ������ �����Ͽ� ����Ѵ�.
		int sum = (year - 1) * 365 + (year -1) / 4 - (year -1) / 100 + (year - 1) / 400; 
		
		//���⵵ 12�� 31�ϱ��� ���� ��¥���� ���� ���ޱ��� ���� ��¥�� ���Ѵ�.
		//for �� �ۼ�
		for(int i=1; i<month; i++) {
			switch (i) {
				case 2:
					sum += year % 4 == 0 && year % 100 ==0 || year %400 == 0 ? 29 : 28;
					break;
				case 4: case 6: case 9: case 11: //�F����
					sum += 30;
					break;
				default:						//���
					sum += 31; 
					break;
			}}
		
		// �迭 �ۼ�
/*			int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			d[1] = sum += year % 4 == 0 && year % 100 ==0 || year %400 == 0 ? 29 : 28;
			for(int i=1; i<month; i++) {
				sum += d[i-1];
			}*/

		// ���ޱ��� ���� ������ ���� ���Ѵ�.
		sum += day;
		// ������¥�� �հ踦 7�� ���� �������� 0�̸� �Ͽ��� 1-������ ... 6 -�����
		// ����ġ������ �ۼ�
		/*
		switch(sum%7) {
			case 0: System.out.println("�Ͽ���"); break;
			case 1: System.out.println("������"); break;
			case 2: System.out.println("ȭ����"); break;
			case 3: System.out.println("������"); break;
			case 4: System.out.println("�����"); break;
			case 5: System.out.println("�ݿ���"); break;
			case 6: System.out.println("�����"); break;
			}	*/
		// �迭�� �ۼ�
		
		String week[] = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
//		char week[] = {'��','��','ȭ','��','��','��','��'}
//		System.out.println(week[sum%7]+"����");
		System.out.println(week[sum%7]);
		
	}		
}
		
