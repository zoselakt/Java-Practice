package day_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_02 {
	public static void main(String[] args) {
	// Set
	// ��ҵ��� ���������� ��Ƴ��� �ڷᱸ�� / �ߺ�x, ������� x
	// set�� ������ Ŭ���� : Hashset / TreeSet

	// HashSet - �ߺ��� ��� add()�� false�� ��ȯ
	// HashSet()-�⺻������ /HashSet(Collection c)-�÷��ǿ�ҷ� ��ü���� / HashSet(int capacity)-capacity�뷮�� ���� ��ü ����
		
	// TreeSet - HashSet���� �ߺ��� ������ ���ı���� �߰�������
	// ����Ž��Ʈ������ : ���ص����� ���� ������ ������ ���ʿ� / ũ�ٸ� �����ʿ� ��ġ
		
			HashSet hs = new HashSet();
			hs.add("demon");
			hs.add("banana");
			hs.add("tomato");
			hs.add("apple");
			hs.add("cargo");
			
			TreeSet ts = new TreeSet();
			ts.add("demon");
			ts.add("banana");
			ts.add("tomato");
			ts.add("apple");
			ts.add("cargo");
			
			Iterator it = hs.iterator();
			System.out.println("<Hash Set>");
			
			while(it.hasNext()) {
				System.out.print(" " + it.next());
			}
			System.out.println();
			Iterator it2 = ts.iterator();
			System.out.println("<Tree Set>");
			
			while(it2.hasNext()) { // 
				System.out.print(" " + it2.next());
			}
			System.out.println();
			System.out.println("���� TreeSet�� ũ��" +ts.size());
		
			
//-------------------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------");
			// <Integer> ���� ����ȯ�Ͽ� ��¹����� Integer���� �ٽ� ��� �����ʾƵ��ȴ�. / ���׸� / new�������ʿ� ����ؾ��Ѵ�.			
			HashSet<String> A = new HashSet<String>();
			A.add("a");
			A.add("b");
			A.add("c");
			
			HashSet<String> B = new HashSet<String>();
			B.add("c");
			B.add("d");
			B.add("e");
			
			HashSet<String> C = new HashSet<String>();
			C.add("a");
			C.add("b");
			
			// containsAll
			A.containsAll(B); // �κ������� ��� true / �ƴѰ�� false 
			System.out.println(A.containsAll(C)); // 
			// addAll
			A.addAll(C); // �������� ��� true / �ƴѰ�� false
			System.out.println(A.addAll(B));
			// retainAll
			A.retainAll(B); // �������� ��� true / �ƴѰ�� false
			System.out.println(A.retainAll(B));
			// removeAll
			A.removeAll(C); // �������� ��� true / �ƴѰ�� false
			System.out.println(A.removeAll(C));
	}

}
