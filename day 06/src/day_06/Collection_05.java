package day_06;

import java.util.Stack;

public class Collection_05 {
	public static void main(String[] args) {
		// Stack : ���� ������ ���԰� ������ ��� �Ͼ�� ����
		// ���ð� ���õ� �޼���
		// E peek() / E pop() / E push(E item) / int search(Object O)
			Stack<String> s = new Stack<String>();
			//1. push: ������ ����
			s.push("apple");
			s.push("banana");
			s.push("tomato");
			//2. pop : ������ ����
			System.out.println("pop:" + s.pop());
			//3. peek : top�� ������ ����
			System.out.println("peek:" + s.peek());
			//4. Search()
			System.out.println(s.search("apple"));
			System.out.println(s.search("banana"));
	}

}
