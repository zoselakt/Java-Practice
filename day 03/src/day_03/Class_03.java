package day_03;

public class Class_03 {
	public static void main(String[] args) {
		// ��� : extends
		// class Ŭ������ extends �θ�Ŭ������{
		// ...
		// }
		// �ڹٴ� ���� ��� ���� x
		// finalŰ����� ��ӺҰ�
		
		// �θ�Ŭ�����κ��� ��ӹ��� ����� ���ٱ����� protected�� ��� �ڽ�Ŭ���������� �����Ӱ� ������ �� �����Ƿ�
		// �Ϲݸ�������� �ʱ�ȭ ��Ű���� this�� ����� �ʱ�ȭ�� �����ϴ�. / getter�޼ҵ带 ������� �ʾƵ� �ȴ�.
		
		// �θ�Ŭ�����κ��� ��ӹ��� ����� ���ٱ����� private�� ��� �θ� Ŭ������ setter�޼ҵ尡 �ۼ��Ǿ� �ִٸ�
		// setter�޼ҵ带 ����ؼ� �ʱ�ȭ �� �� �ִ�.
		
		Studentt st = new Studentt();
		st.breath();
		st.learn();

		Teacher t = new Teacher();
		t.eat();
		t.breath();
	}
}

class Person{
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}

class Studentt extends Person{
	void learn() {
		System.out.println("����");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("����ġ��");
	}
}