package day_02;

public class For_01 {

	public static void main(String[] args) {
		// for(int i =1; i<=10; i++) {   : 1������ 10�� ����
		//			System.out.println(i);
		
		// for(int i =10; i >=1; i--) {  : 10������ 1������
		// 			System.out.println(i + "�� ��ǻ�� ����");
		
		// for(int i=1; i<=10; i+=2) {      : 2�� �ǳʶٱ�  
		// 	   System.out.println(i +"�� ��ǻ�� ����");
			
		int sum = 0;    // :  ���հ��
		for(int i = 1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
//---------------------------------------------------------------------------------------
		// 2�� for, while ��

		int dan;
		int times;
		
		for(dan = 2; dan<=9; dan++) {
			for(times = 1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
		while(dan <=9) {
			times = 1;
			while(times<=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
}}
