package day_01;

import java.util.Scanner;

public class P_2_JuminNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ 13�ڸ��� '-'���� �Է��ϼ���");
		String juminNo = sc.nextLine();
		
// �ֹε�Ϲ�ȣ: 8  3  0  4  2  2  1  1  8  5  6  0  0 		
//           *  *  *  *  *  *  *  *  *  *  *  *   
// ����ġ :    2  3  4  5  6  7  8  9  2  3  4  5
//			 =  =  =  =  =  =  =  =  =  =  =  = 
//           16 9  0 20 12 14  8  9  16 15 24 0 = 143
		
// 143 % 11 = 0    11 - 0 = 11  11���� �������� �� ����� 2�ڸ��� 10�ڸ��� ������ 1�ڸ��� ���Ѵ�.
//            1         1 = 10
//            2         2 =  9
		
		String check = "234567892345";
		int sum = 0;
		for(int i=0; i<12; i++) {
//		sum += (juminNo.charAt(i)-48) * (check.charAt(i) - '0'); // ���ڸ� ���������ϸ� ������ �����ڵ� ������ ���Ѵ�.
		sum += (juminNo.charAt(i) - 48) * (i < 8 ? i+2 : i-6);
		}
		int result = (11 - sum % 11) %10;
		if(result == juminNo.charAt(12) - 48) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}
