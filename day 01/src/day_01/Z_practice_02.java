package day_01;

import java.util.*;

public class Z_practice_02 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ������ ���α׷�
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int lottoAr[] = new int[6];
			int userAr[] = new int[6];
			
			int bonus;
			int bonusUser;
			int count = 0;
			
			//�ζ� �迭�� 6���� �������� ����
			for(int i=0; i<6; i++) {
			lottoAr[0]=random.nextInt(45) + 1;
			}
			//bonus
			bonus=random.nextInt(45)+1;
			
			//����ڿ��� 6���� ���� �Է�
			System.out.println("���ڸ� �Է��ϼ���");
			for(int i=0; i<6; i++) {
				userAr[i]=sc.nextInt();
			}
			System.out.print("���ʽ� ���ڸ� �Է��ϼ���");
			bonusUser = sc.nextInt();
			
			//�ζǹ迭�� ���� ����� �迭�� �� �� ���� ���̸ �ִ��� ī����
			for(int i=0; i<6; i++) {
				for(int j =0; j<6; j++) {
					if(lottoAr[j] == userAr[i]) {
						count++;
					}
				}	
			}
			if (count ==6) {
				System.out.println("1���Դϴ�!");
			}
			else if (count ==5) {
				if(bonus == bonusUser) {
				System.out.println("2���Դϴ�.");
			}
				else {
					System.out.println("3���Դϴ�.");
					}
			}
			else if(count==4) {
				System.out.println("4���Դϴ�.");
			}
			else if(count==3) {
				System.out.println("5���Դϴ�.");
			}
			else {
				System.out.println("Ż��");
				
			}
	}
}