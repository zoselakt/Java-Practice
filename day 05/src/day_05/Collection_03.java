package day_05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_03 {
	public static void main(String[] args) {
		// list : 데이터를 일렬로 늘어놓은 구조
		// 순서 o, 중복 o / list인터페이스를 구현한 클래스: ArrayList, LinkedList
		// 주요 메서드
		// add(int index, E elem) / get(int index) / indexOf(Object o)
		// listiterator() / remove(int index) / set(int index, E elem)
		
		ArrayList list1 = new ArrayList(10);
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		System.out.println("초기상태:");
		System.out.println(list1);
		
		System.out.print("인덱스 1위치에 B추가:");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.print("인덱스 2위치의 값 삭제");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2위치의 값 반환: " + list1.get(2));
		
		// LinkedList
		// 요소들이 서로 연결되어있는 리스트
		ArrayList al=new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			al.add(0, String.valueOf(i));
		}
		long end= System.currentTimeMillis();
		System.out.println("ArrayList 작업시간"+(end - start));
		
		start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList 작업시간:" + (end-start));
	}
}
