package day_01;

import java.util.Scanner;

public class DataType_01 {
	public static void main(String[] args) {
		// void : return�Ǵ� Ÿ���� ������ �ǹ� / �ƹ��͵� �������� ������ �������ִ� �Ͱ� ����.
		
// ����Ű����: 
// �޼��� �ڵ��ϼ�: ctrl + space
// �ڵ�����üũ:    alt + v
// �ڵ�import:   ctrl + shift + o
// ���ٻ���:		ctrl + D
			 
		// ��¸޼���
		// print : ���๮�� ��� x / 
		System.out.print("���ڿ���"); //���ڿ�
		System.out.print("A"); // ������
		System.out.print("100"); //������
		System.out.print("3.14"); //�Ǽ���
		
		//printf(print format) : ���� o (�Ҽ��� ����) 
		System.out.printf("%s", "���ڿ���");
		System.out.printf("%c", 'A'); // �ֵ���ǥ�ϸ� ����
		System.out.printf("%d", 100); // 10����
		System.out.printf("%f", 3.14);
		// System.out.printf("%o", 15); 8���� ����
		// System.out.printf("%x", 15); 16���� ���� (�ҹ��� ���)
		// System.out.printf("%X", 15); 16���� ���� (�빮�� ���)
		// System.out.printf("%b", --); boolean ���� ���
		// %e : ����ǥ������������ ���
		// %- : ����� ��ü�ڸ����� ������ ��� ���ʿ� ���� ����Ѵ�.
		// %0 : ����� ��ü �ڸ����� ������ ��� ���ʿ� �����ڸ��� 0�� ä�� ����Ѵ�.
		// %n : ����� ��ü �ڸ���
		// % .m: �Ҽ��� �Ʒ� �ڸ���, �߸��� �ڸ����� �ݿø� ���� ����Ѵ�.
		
		// println(print line) : ������ �ٹٲ޹��ڸ� �߰� / ���� x(�Ҽ��� ���� ��) / 
		// ū����ǥ�� ������ ��� ���������� ����Ѵ�. / ���ڿ�+������ �� �������� ���
		System.out.println("���ڿ���"); //���ڿ�
		System.out.println("A"); // ������
		System.out.println("100"); //������
		System.out.println("3.14"); //�Ǽ���
//---------------------------------------------------------------------------------------		
		// ����
		// ������ ���� 
		int i = 100;
		// �Ǽ��� ����
		float f=3.14f;
		double d= 3.14;
		// ������ ����
		char c = 'c';
		// ���ڿ� ����
		String s = "hello";
		// ������ ����
		boolean b= true;
		
		System.out.println(i);
		System.out.println(f); 
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(b);

// ������ ����Ǵ� ������ Ư��
// ������: byte- 1byte / short-2byte / int- 4byte / long- 8byte
//		int num = 1234; // 1234�� 4�� = 4byte
//		long number=123456789; // 
	
// ������: char- 2byte
//		char ch='A'; // �������� ��� ���������� ���������� �ۼ��Ǿ� �־� char��ȯ���� ���. 
		
// �Ǽ���: float- 4byte / double- 8byte
//		double dNum = 3.14;
//		float fNum = 3.14F; // double�� ó�� ���� ������. �ڿ� f�ݵ�� �ٿ�����!
		
// ������: boolean- 1byte
			
}}