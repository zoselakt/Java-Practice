package day_02;

import java.util.Scanner;

public class F_Continue_Break_01 {
	public static void main(String[] args) {
		// new ������
		// ������ �����ڸ� ������ �ʾ��� �� �����Ϸ��� ���� �ڵ����� �����ڰ� ��������� �̸� �⺻ �����ڶ� �Ѵ�.
		// continue : �ݺ����� ��Ӽ����ϴµ� Ư�����ǿ����� �������� �ʰ� �ǳʶپ���Ҷ� ���
		// break: �ݺ����� ��������ʰ� �ݺ����� �������ö� ���
		
		int money =10000;
		System.out.println("���� 10000�� �Դϴ�.");
		Scanner sc = new Scanner(System.in);
	//  �ڷ��� ������ = �⺻������ �޸� �Ҵ�  ������ȣ�� ()
		while(true) {
			System.out.println("�󸶸� ����ϰڽ��ϱ�?");
			int i=sc.nextInt();
			if(!(0<=i &&i <=money)) {
				System.out.println("�ٽ� �Է��� �ּ���");
				continue;
			}
			System.out.printf("%d �� ���ҽ��ϴ�. \n", money -=i);
			if(money==0) {
				break;
			}				
		}
		System.out.println("��� ���� ����߽��ϴ�.");
}}
