package day_02;

import java.util.Random;
import java.util.Scanner;

public class E_While_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		while (answer.equals("Y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�? (Y) ");
			answer=sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("������ %d�� ����߽��ϴ�.\n", ++count);
			}}
		System.out.println("�������");
//------------------------------------------------------------------------------------
Random random = new Random();
int num = random.nextInt(100) + 1;
int user =-1;
while (user!=num) {
	System.out.println("���� �Է� :");
	user = sc.nextInt();
	if(user==num) {
		System.out.println("�����Դϴ�!");
	}
	else if(user > num) {
		System.out.println("down!");
	}
	else {
		System.out.println("up!");
	}}

//------------------------------------------------------------------------------------
// do-while ��
int i = 100;
do {
	System.out.println(" ���ǽ��� ������� false�� �ѹ��� ����ϰ� while�� ���"); }
while (i<10); {
	System.out.println("���ǽ��� ������� �����̶�� ��� X"); }
}}