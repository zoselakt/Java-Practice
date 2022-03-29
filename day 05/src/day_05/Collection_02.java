package day_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_02 {
	public static void main(String[] args) {
	// Set
	// 요소들을 집합적으로 모아놓은 자료구조 / 중복x, 저장순서 x
	// set을 구현한 클래스 : Hashset / TreeSet

	// HashSet - 중복된 요소 add()시 false값 반환
	// HashSet()-기본생성자 /HashSet(Collection c)-컬렉션요소로 객체생성 / HashSet(int capacity)-capacity용량을 갖는 객체 생성
		
	// TreeSet - HashSet에서 중복은 없으나 정렬기능이 추가된형태
	// 이진탐색트리구조 : 기준데이터 보다 작으면 기준의 왼쪽에 / 크다면 오른쪽에 위치
		
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
			System.out.println("현재 TreeSet의 크기" +ts.size());
		
			
//-------------------------------------------------------------------------------------
System.out.println("-------------------------------------------------------------------");
			// <Integer> 으로 형변환하여 출력문에서 Integer으로 다시 명시 하지않아도된다. / 제네릭 / new생성자쪽에 명시해야한다.			
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
			A.containsAll(B); // 부분집합인 경우 true / 아닌경우 false 
			System.out.println(A.containsAll(C)); // 
			// addAll
			A.addAll(C); // 합집합인 경우 true / 아닌경우 false
			System.out.println(A.addAll(B));
			// retainAll
			A.retainAll(B); // 교집합인 경우 true / 아닌경우 false
			System.out.println(A.retainAll(B));
			// removeAll
			A.removeAll(C); // 차집합인 경우 true / 아닌경우 false
			System.out.println(A.removeAll(C));
	}

}
