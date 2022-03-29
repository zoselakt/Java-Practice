package day_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection_04 {
	public static void main(String[] args) {
		// Queue : ���� �������� ������ �ٸ��� �������� ������ �Ͼ�� ���� / ���Լ���
		//  		front:���� / rear: ����
		// ť�� �������̽��̹Ƿ� ����Ϸ��� ��ĳ���� �ʿ�!
		
		// ť ���� �޼��� : boolean add(E e) / E element() / E remove() / boolean offer(E e) / E peek() / E poll()
		// ���� : Queue<Element> q = new LinkedList<Element>();  = �ַ� ���
		// 		  Queue<Element> q = new Array<Element>();
		
		Queue<String> q= new LinkedList<>(); // ���� ������� ��� / ��ĳ����
		// 1. add = rear �� �����߰�
		q.add("apple");
		q.add("banana");
		q.add("tomato");
		System.out.println(q);
		//2. E element = ť ���� �ֻ�ܰ� ���
		System.out.println("element:" + q.element()); // apple
		//3. remove = front�� ��ġ�� �����͸� ��ȯ�� ����
		System.out.println("remove:" + q.remove()); // apple ��ȯ�� ����
		//4. offer = rear��ġ�� ������ ����
		q.offer("peach"); 
		System.out.println(q);
		//5. peek = front ��ġ�� �ִ� �������� �� ��ȯ
		System.out.println("peek:" + q.peek());  // banana
		//6. poll = front�� ��ġ�� �����͸� ��ȯ�� ����
		System.out.println("poll"+q.poll()); // banana ��ȯ�� ����
		
		
		// Stack : ���� ������ ���԰� ������ ��� �Ͼ�� ���� / ���Լ���
		// 		top: ����, ���� / vertor�� �ڽ�Ŭ����
		
		// ���ð� ���õ� �޼���
		// E peek() / E pop() / E push(E item) / int search(Object O)
		
		Stack<String> s = new Stack<String>();
		//1. push: ������ ����
		s.push("apple");
		s.push("banana");
		s.push("tomato");
		//2. pop : ������ ����
		System.out.println("pop:" + s.pop()); // tomato ����
		//3. peek : top�� ������ ����
		System.out.println("peek:" + s.peek()); //banana
		//4. Search()
		System.out.println(s.search("apple")); // 1 / ������ ��ȣ�� 1���� �����Ѵ�!!!
		System.out.println(s.search("banana")); // 2 
	}
}
