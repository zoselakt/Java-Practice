package day_02;

import java.util.Scanner;

public class Switch_01 {
	public static void main(String[] args) {
		// switch-case ���� if�� ���� �ڵ尡 �� �����ϰ� �ۼ������ϴ�.
		// ���ǽ��� ����� ���� �Ǵ� ���ڿ� ���̰� �� ���� ���� ���๮�� �����ɶ� ���
		
		Scanner sc = new Scanner(System.in);
			System.out.println("�ڡ١ڡٽ�ȣ�� ���α׷��ڡ١ڡ�");
			System.out.println("������ :1 , ����� :2 , �ʷϺ� :3");
			System.out.println("��ȣ :");
			int sign =sc.nextInt();
			switch(sign) { // ()�ȿ��� ������ ����.
			case 1:
				System.out.println("�������Դϴ�. �����ϼ���");
				break;  // break�� ���������� ��ν����.
				
			case 2:
				System.out.println("������Դϴ�. �����ϼ���.");
				break;
				
			case 3:
				System.out.println("�ʷϺ��Դϴ�. ����ϼ���.");
				break;
				
			default:
				System.out.println("�߸������̽��ϴ�.");
			}

}}
