package day_02;

import java.util.Arrays;
import java.util.Scanner;

public class G_Array_02 {
	public static void main(String[] args) {
		// �迭�� ����
		// system.array(src, srcPos, dest, destPos, length);
		// src: ������ �迭  / srcPos ���� ������ ��ġ
		// dest: ��� �迭 / destPos: ����� ������ ��ġ
		// length: �����ұ���
		
		int [] a= {1,2,3,4,5,6};   
		int [] b= {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//����
		System.arraycopy(a,      2,     b,     3,       4);
//		System.arraycopy(src, srcpos, dest, destpos, length);
		System.out.println(Arrays.toString(b)); // a�� b�� �����ϴ°Ŷ� b�� ����ؾ���.
		
//---------------------------------------------------------------------------------------
// for each ��
		// �迭�� ��ȯ�� �� �ݺ��� ���� ���ϰ� ��ȯ�� ���ֵ��� ���ο� ������ ����
		// ����
		// for(�ڷ��� ������ : �迭��) {
		//	������ �迭�� ��ȯ�ϸ鼭 �ݺ��� ���
		//	}
		Scanner sc = new Scanner(System.in);
		// String ��
		String c[] = {"java", "hello", "programming"};
		for(String i:c) {
			System.out.println(i);	}
		String fruits[] = new String[3];
		// int��
		int d[] = {1,2,3,4,5};
		for(int i:d) {
			System.out.print(i);
		}
		System.out.println("");
		
		// �����ֹ����α׷�
		for(int i=0; i<3; i++) {
			System.out.print("�ֹ��� ����:");
			fruits[i] = sc.next();	}
		System.out.println("----�ֹ����� ����----");
		
		for(String eachFruit:fruits) {
			System.out.print(eachFruit+" ");}
}}
