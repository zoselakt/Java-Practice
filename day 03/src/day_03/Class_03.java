package day_03;

public class Class_03 {
	public static void main(String[] args) {
		// ��� : extends
		// class Ŭ������ extends �θ�Ŭ������{
		// ...
		// }
		// �ڹٴ� ���� ��� ���� x
		// finalŰ����� ��ӺҰ�
		
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