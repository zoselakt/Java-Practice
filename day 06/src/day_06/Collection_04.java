package day_06;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_04 {
	public static void main(String[] args) {
		// Queue : ���� �������� ������ �ٸ��� �������� ������ �Ͼ�� ����
		//  		front:���� / rear: ����
		// ť ���� �޼��� : boolean add(E e) / E element() / E remove() / boolean offer(E e) / E peek() / E poll()
		// ���� : Queue<Element> q = new LinkedList<Element>();  = �ַ� ���
		// 		  Queue<Element> q = new Array<Element>();
		
		Queue<String> q= new LinkedList<>(); // ���� ������� ���
		// 1. add = rear �� �����߰�
		q.add("apple");
		q.add("banana");
		q.add("tomato");
		System.out.println(q);
		//2. E element = ť ���� �ֻ�ܰ� ���
		System.out.println("element:" + q.element());
		//3. remove = front�� ��ġ�� �����͸� ��ȯ�� ����
		System.out.println("remove:" + q.remove());
		//4. offer = rear��ġ�� ������ ����
		q.offer("peach");
		System.out.println(q);
		//5. peek = front ��ġ�� �ִ� �������� �� ��ȯ
		System.out.println("peek:" + q.peek());
		//6. poll = front�� ��ġ�� �����͸� ��ȯ�� ����
		System.out.println("poll"+q.poll());
		
	}
}
