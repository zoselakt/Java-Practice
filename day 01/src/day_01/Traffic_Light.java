package day_01;

import java.util.Scanner;

public class Traffic_Light {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�١ڡ١ڽ�ȣ�� ���α׷�");
		System.out.println("��ȣ�� �Է��ϼ��� ~");
		System.out.println("������ : 1, �ʷϺ�:2, �����:3");
		int sign = sc.nextInt();
		String result=sign==1?"�����ϼ���":sign == 2?"����ϼ���~" : "�����ϼ���~";
		System.out.println(result);
		
}}

