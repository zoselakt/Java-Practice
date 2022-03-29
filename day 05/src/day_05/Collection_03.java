package day_05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_03 {
	public static void main(String[] args) {
		// list : �����͸� �Ϸķ� �þ���� ����
		// ���� o, �ߺ� o / list�������̽��� ������ Ŭ����: ArrayList, LinkedList
		// �ֿ� �޼���
		// add(int index, E elem) / get(int index) / indexOf(Object o)
		// listiterator() / remove(int index) / set(int index, E elem)
		
		ArrayList list1 = new ArrayList(10);
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
		// ��ҵ��� ���� ����Ǿ��ִ� ����Ʈ
		ArrayList al=new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			al.add(0, String.valueOf(i));
		}
		long end= System.currentTimeMillis();
		System.out.println("ArrayList �۾��ð�"+(end - start));
		
		start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList �۾��ð�:" + (end-start));
	}
}
