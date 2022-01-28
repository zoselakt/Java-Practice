package day_06;

import java.util.Stack;

public class Collection_05 {
	public static void main(String[] args) {
		// Stack : 한쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
		// 스택과 관련된 메서드
		// E peek() / E pop() / E push(E item) / int search(Object O)
			Stack<String> s = new Stack<String>();
			//1. push: 데이터 삽입
			s.push("apple");
			s.push("banana");
			s.push("tomato");
			//2. pop : 데이터 삭제
			System.out.println("pop:" + s.pop());
			//3. peek : top의 데이터 보기
			System.out.println("peek:" + s.peek());
			//4. Search()
			System.out.println(s.search("apple"));
			System.out.println(s.search("banana"));
	}

}
