package day_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_02 {
	public static void main(String[] args) {
		// Set
		// 요소들을 집합적으로 모아놓은 자료구조 / 중복x, 저장순서 x
		// set을 구현한 클래스 : Hashset / TreeSet

		// HashSet - 중복된 요소 add()시 false값 반환
		// HashSet() /HashSet(Collection c) / HashSet(int capacity)  
		// TreeSet - HashSet에서 정렬기능이 추가된형태
		// 기준데이터 보다 작으면 기준의 왼쪽에 / 크다면 오른쪽에 위치
		
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
			System.out.println("현재 TreeSet의 크기" +ts.size());
	}

}
