package day_01;

import java.util.Random;

public class P_1_poketmon {
	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println("�ڡ١ڡ�Random Choosing Pokemon�ڡ١ڡ�");
		System.out.println("1. ��ī��: ����Ӽ�");
		System.out.println("2. ���α�: ���Ӽ�");
		System.out.println("3. �̻��ؾ�: Ǯ�Ӽ�");
		int mypokemon = random.nextInt(3) + 1;
		switch(mypokemon) {
		case 1:
			System.out.println("��ī�� ����");
			break;
		case 2:
			System.out.println("���α� ����");
			break;
		case 3:
			System.out.println("�̻��ؾ� ����");
			break;
		}

}}
