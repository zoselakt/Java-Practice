package day_03;

import java.util.Arrays;

public class Array_04 {
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
		System.arraycopy(a, 2, b, 3, 4);
//		System.arraycopy(src, srcpos, dest, destpos, length);
		
		System.out.println(Arrays.toString(b));

}}
