package day_03;

public class Class_Inherit_01 {
	public static void main(String[] args) {
		// class Ŭ������ extends �θ�Ŭ������{
		// ...
		// }
		// �ڹٴ� ���� ��� ���� x
		Student st=new Student();
		st.breath();
		st.learn();
		
		Teacher t=new Teacher();
		t.eat();
		t.breath();
}}

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

class Student extends Person{
	void learn() {
		System.out.println("����");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("����ġ��");
	}
}