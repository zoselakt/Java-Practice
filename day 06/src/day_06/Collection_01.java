package day_06;

public class Collection_01 {
	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ
		// �����͸� ȿ�������� �ٷ�� ���� Ŭ�������� ����.
		// collection �������̽��� �����ϴ� Ŭ����: Set, List, Queue, Map
		
		// ���׸�
		// Ŭ������ �ٷ� ��ü�� �̸� ����ϴ� ��� / ���׸� == �Ϲ�ȭ 
		// ��������� Ÿ���� �ٷ� �� �ֵ���, Ŭ������ �޼��带 Ÿ�ԸŰ������� �̿��Ͽ� ������ ���
		// ����� : Ŭ���� �� �ڿ� <E>,<K>,<V> �� ���� �������� ��� / <>������ ���ĺ�, ���� Ŭ������ ���� �ִ�.
		// �Ű����� : E(Element) - �迭, ������ ���Ÿ������ / T(Type) - ������ �ڷ����� ���� Ÿ���� ����
		// 			s,u(...) - �������� ���׸� ����� ����� �� ��� / k(Key) - ŰŸ�������� v(Value) - ��Ÿ��������
	Value v = new Value();
	v.<Integer>typeSearch(3);
	v.typeSearch(3.14);
	v.typeSearch(3.14f);
	v.typeSearch('a');
	v.typeSearch("hello");
	v.typeSearch(true);
	}
}
class Value{
	public <T> void typeSearch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+ "�� �����Դϴ�.");
		}
		else if (x instanceof Double|| x instanceof Float) {
			System.out.println(x+ "�� �Ǽ� �Դϴ�.");
		}
		else if (x instanceof Character) {
			System.out.println(x+ "�� ������ �Դϴ�.");
		}
		else if (x instanceof String) {
			System.out.println(x+ "�� ���ڿ� �Դϴ�.");
		}
		else if (x instanceof Boolean) {
			System.out.println(x+ "�� ���� �Դϴ�.");
		}

	}
}