package day_05;

public class Collection_01 {
	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ : �ڹٿ��� �����ϴ� �ڷᱸ�� / collection�� Map �� ��ģ ���� 
		// �����͸� ȿ�������� �ٷ�� ���� Ŭ�������� ����.
		
		// �ڷᱸ��
		// �ڷ���� �����Ҷ�, ȿ������ ������ �����ϴ� ��.
		
		// ����
		// collection �������̽��� �����ϴ� Ŭ����: Set, List, Queue
		// Map Ŭ���� : Hashtable, HashMap, SortedMap
		
		// ���׸� (Generic)
		// Ŭ������ �ٷ� ��ü�� �̸� ����ϴ� ��� / ���׸� == �Ϲ�ȭ 
		// Ŭ�������ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ��� / 
		// ��������� Ÿ���� �ٷ� �� �ֵ���, Ŭ������ �޼��带 Ÿ�ԸŰ������� �̿��Ͽ� ������ ���
		
		// ����� : Ŭ���� �� �ڿ� <E>,<K>,<V> �� ���� �������� ��� / <>������ ���ĺ�, ���� Ŭ������ ���� �ִ�.
		// �Ű����� : E(Element) - �迭, ������ ���Ÿ������ / T(Type) - ������ �ڷ����� ���� Ÿ���� ����
		// 			s,u(...) - �������� ���׸� ����� ����� �� ��� / k(Key) - ŰŸ�������� 
		// 			v(Value) - ��Ÿ��������
		// ����
		// Ŭ������ <�Ű�����> ���׸��� = new Ŭ������ <�Ű�����>();
		// ȣ��
		// ���׸���.������ �޼����()
		
	Value v = new Value();
	v.<Integer>typeSearch(3);  
	v.typeSearch(3.14);
	v.typeSearch(3.14f);
	v.typeSearch('a');
	v.typeSearch("hello");
	v.typeSearch(true);

//-------------------------------------------------------------------------------
	System.out.println("---------------------------------------------------------");
	// ���� ���׸� ��� ������
	
	// <Integer> ���� ����ȯ�Ͽ� ��¹����� Integer���� �ٽ� ��� �����ʾƵ��ȴ�. / ���׸� / new�������ʿ� ����ؾ��Ѵ�.
	Person1 /*<StudentData1, Integer>*/ p1 = new Person1/*<StudentData1, Integer>*/(new StudentData("ȫ�浿"), new Integer(20140001));
	System.out.println(p1.data + ":" + p1.id);
	
//main_end
	}
}
//instanceOf ������ : ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ������
class Value{
	public <T> void typeSearch(T x) { // T(type)�� ���� x �Ű�����
		if(x instanceof Integer) {
			System.out.println(x+ "��(��) �����Դϴ�.");
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
//-------------------------------------------------------------------------------
// ���� ���׸�
class StudentData{
	public String name;
	StudentData(String name){
		this.name = name;
	}
	public String toString() { // ���θ޼��忡 ���׸������� name�� ����
		return name;
	}
}

class Person1<T, E>{ // ������ ���׸�
	public T data;
	public E id;
	Person1(T data, E id){
		this.data = data;
		this.id = id;
	}
	public <T> void getInfo(T data) {
		System.out.println(data);
	}
}