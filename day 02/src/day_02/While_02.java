package day_02;

import java.util.*; //util �� �ִ� ��� Ŭ���� ����Ʈ

public class While_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
// ------------------------------------------------------------------------------------
		// do-while ��
		int i = 100;
		do {
			System.out.println(" ���ǽ��� ������� false�� �ѹ��� ����ϰ� while�� ���"); }
		while (i<10); {
			System.out.println("���ǽ��� ������� �����̶�� ��� X"); }
}}
