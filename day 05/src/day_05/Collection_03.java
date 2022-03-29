package day_05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_03 {
	public static void main(String[] args) {
		// list : 데이터를 일렬로 늘어놓은 구조
		// 순서 o, 중복 o / list인터페이스를 구현한 클래스: ArrayList, LinkedList
		
		// 주요 메서드
		// add(int index, E elem): index위치에 elem추가 / get(int index): index위치에 있는 요소 반환
		// indexOf(Object o): 요소o가 있는 위치 반환 / listiterator():listiterator() 반환 
		// remove(int index):index위치 요소 삭제후 삭제값 반환 / set(int index, E elem):index위치요소를 elem으로 변경
		
		// Arraylist 요소추가시 0번 인덱스부터 차례대로 요소 저장(배열에서 발전된 형태)
		
		ArrayList list1 = new ArrayList(10); // 요소값(배열값) 10 추가
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
		// 요소들이 서로 연결되어있는 리스트 / 각 요소가 다음 요소의 주소를 저장
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			al.add(0, String.valueOf(i));
		}
		long end= System.currentTimeMillis();
		System.out.println("ArrayList 작업시간"+(end - start)); // 값 : 536
		
		start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			ll.add(0, String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList 작업시간:" + (end-start)); // 값 : 22
	}
}
