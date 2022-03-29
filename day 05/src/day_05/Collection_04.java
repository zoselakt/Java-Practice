package day_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection_04 {
	public static void main(String[] args) {
		// Queue : 한쪽 끝에서는 삽입이 다른쪽 끝에서는 삭제가 일어나는 구조 / 선입선출
		//  		front:삭제 / rear: 삽입
		// 큐는 인터페이스이므로 사용하려면 업캐스팅 필요!
		
		// 큐 관련 메서드 : boolean add(E e) / E element() / E remove() / boolean offer(E e) / E peek() / E poll()
		// 사용법 : Queue<Element> q = new LinkedList<Element>();  = 주로 사용
		// 		  Queue<Element> q = new Array<Element>();
		
		Queue<String> q= new LinkedList<>(); // 넣은 순서대로 출력 / 업캐스팅
		// 1. add = rear 에 내용추가
		q.add("apple");
		q.add("banana");
		q.add("tomato");
		System.out.println(q);
		//2. E element = 큐 내용 최상단값 출력
		System.out.println("element:" + q.element()); // apple
		//3. remove = front에 위치한 데이터를 반환후 삭제
		System.out.println("remove:" + q.remove()); // apple 반환후 삭제
		//4. offer = rear위치에 데이터 삽입
		q.offer("peach"); 
		System.out.println(q);
		//5. peek = front 위치에 있는 데이터의 값 반환
		System.out.println("peek:" + q.peek());  // banana
		//6. poll = front에 위치한 데이터를 반환후 삭제
		System.out.println("poll"+q.poll()); // banana 반환후 삭제
		
		
		// Stack : 한쪽 끝에서 삽입과 삭제가 모두 일어나는 구조 / 후입선출
		// 		top: 삽입, 삭제 / vertor의 자식클래스
		
		// 스택과 관련된 메서드
		// E peek() / E pop() / E push(E item) / int search(Object O)
		
		Stack<String> s = new Stack<String>();
		//1. push: 데이터 삽입
		s.push("apple");
		s.push("banana");
		s.push("tomato");
		//2. pop : 데이터 삭제
		System.out.println("pop:" + s.pop()); // tomato 삭제
		//3. peek : top의 데이터 보기
		System.out.println("peek:" + s.peek()); //banana
		//4. Search()
		System.out.println(s.search("apple")); // 1 / 스택은 번호가 1부터 시작한다!!!
		System.out.println(s.search("banana")); // 2 
	}
}
