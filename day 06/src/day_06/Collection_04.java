package day_06;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_04 {
	public static void main(String[] args) {
		// Queue : 한쪽 끝에서는 삽입이 다른쪽 끝에서는 삭제가 일어나는 구조
		//  		front:삭제 / rear: 삽입
		// 큐 관련 메서드 : boolean add(E e) / E element() / E remove() / boolean offer(E e) / E peek() / E poll()
		// 사용법 : Queue<Element> q = new LinkedList<Element>();  = 주로 사용
		// 		  Queue<Element> q = new Array<Element>();
		
		Queue<String> q= new LinkedList<>(); // 넣은 순서대로 출력
		// 1. add = rear 에 내용추가
		q.add("apple");
		q.add("banana");
		q.add("tomato");
		System.out.println(q);
		//2. E element = 큐 내용 최상단값 출력
		System.out.println("element:" + q.element());
		//3. remove = front에 위치한 데이터를 반환후 삭제
		System.out.println("remove:" + q.remove());
		//4. offer = rear위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		//5. peek = front 위치에 있는 데이터의 값 반환
		System.out.println("peek:" + q.peek());
		//6. poll = front에 위치한 데이터를 반환후 삭제
		System.out.println("poll"+q.poll());
		
	}
}
