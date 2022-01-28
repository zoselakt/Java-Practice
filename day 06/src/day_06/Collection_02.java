package day_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_02 {
	public static void main(String[] args) {
		// Set
		// ��ҵ��� ���������� ��Ƴ��� �ڷᱸ�� / �ߺ�x, ������� x
		// set�� ������ Ŭ���� : Hashset / TreeSet

		// HashSet - �ߺ��� ��� add()�� false�� ��ȯ
		// HashSet() /HashSet(Collection c) / HashSet(int capacity)  
		// TreeSet - HashSet���� ���ı���� �߰�������
		// ���ص����� ���� ������ ������ ���ʿ� / ũ�ٸ� �����ʿ� ��ġ
		
			HashSet hs = new HashSet();
			hs.add("demon");
			hs.add("banana");
			hs.add("tomato");
			hs.add("apple");
			hs.add("cargo");
			
			TreeSet ts= new TreeSet();
			ts.add("demon");
			ts.add("banana");
			ts.add("tomato");
			ts.add("apple");
			ts.add("cargo");
			
			Iterator it=hs.iterator();
			System.out.println("<Hash Set>");
			while(it.hasNext()) {
				System.out.print(" " + it.next());
			}
			System.out.println();
			Iterator it2 = ts.iterator();
			System.out.println("<Tree Set>");
			while(it2.hasNext()) {
				System.out.print(" " + it2.next());
			}
			System.out.println();
			System.out.println("���� TreeSet�� ũ��" +ts.size());
	}

}
