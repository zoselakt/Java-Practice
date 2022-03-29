package day_05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_03 {
	public static void main(String[] args) {
		// list : �����͸� �Ϸķ� �þ���� ����
		// ���� o, �ߺ� o / list�������̽��� ������ Ŭ����: ArrayList, LinkedList
		
		// �ֿ� �޼���
		// add(int index, E elem): index��ġ�� elem�߰� / get(int index): index��ġ�� �ִ� ��� ��ȯ
		// indexOf(Object o): ���o�� �ִ� ��ġ ��ȯ / listiterator():listiterator() ��ȯ 
		// remove(int index):index��ġ ��� ������ ������ ��ȯ / set(int index, E elem):index��ġ��Ҹ� elem���� ����
		
		// Arraylist ����߰��� 0�� �ε������� ���ʴ�� ��� ����(�迭���� ������ ����)
		
		ArrayList list1 = new ArrayList(10); // ��Ұ�(�迭��) 10 �߰�
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.println("�ʱ����:");
		System.out.println(list1);
		
		System.out.print("�ε��� 1��ġ�� B�߰�:");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.print("�ε��� 2��ġ�� �� ����");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("�ε��� 2��ġ�� �� ��ȯ: " + list1.get(2));
		
		// LinkedList
		// ��ҵ��� ���� ����Ǿ��ִ� ����Ʈ / �� ��Ұ� ���� ����� �ּҸ� ����
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			al.add(0, String.valueOf(i));
		}
		long end= System.currentTimeMillis();
		System.out.println("ArrayList �۾��ð�"+(end - start)); // �� : 536
		
		start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList �۾��ð�:" + (end-start)); // �� : 22
	}
}
