package day_05;

import java.io.FileInputStream;
import java.util.Scanner;

public class Java_Scanner_01 {
	public static void main(String[] args) {
		// Scanner Ŭ���� : ���� �����͸� �о���µ� ������ �ִ� Ŭ����
		// Scanner ���� = new Scanner(System.in); // system.in : ����� ��Ʈ���� ����
		// scanner Ŭ���� ����
		// nextBoolean() / nextByte() / nextDouble() / nextFloat() / nextInt() = �� �Է°����� �Է�
		// nextLine() -������ ���� / next() - ���� ������
		
		//sc.next(): ���ڿ��� �Է¹޾ƶ� / �����̽� ������ �Է��� ����
		//sc.nextint(): ���������� �Է¹޾ƶ�
		//sc.nextfloat(): �Ǽ������� �Է¹޾ƶ�
		//sc.nextLine(): ���� ������ ��� ���ڿ��� ����
		//sc.nextByte(): byte Ÿ������ ����
		//sc.nextShort(): Short Ÿ������ ����
		//sc.nextDouble(): double Ÿ������ ����
		
		//���Ϻҷ�����
		try {
			FileInputStream fis = new FileInputStream("src//day_05//practice_sample.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
