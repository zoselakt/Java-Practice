package day_03;

public class Method_01 {
	public static void main(String[] args) {
		// �޼���: ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
		// �Լ� : �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
		
		// �޼ҵ� �ۿ� �ִ� f1 ���� static void�� ���� �����Ͽ� ���� �޾ƿ´�.
		f1(100); }
	
	static void f1(int x) { //f1 () �ȿ� �ִ� int�Լ� : �Լ�ȣ��� 100�� ���޹޾Ƽ� 100�� ���
		System.out.println("x:" +x);
		System.out.println("�簢���� ���� : " + calculator(10,20));
	}
	
	static int calculator(int a, int b) {
		System.out.println("< ����� �����մϴ�.>");
		int area= a*b;
		return area;
	}
}
