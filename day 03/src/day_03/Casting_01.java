package day_03;

public class Casting_01 {
	public static void main(String[] args) {
		// ������: �Ѱ����� Ÿ���� �������������� �ν��Ͻ��� ������ �ִ°�.
		// ��ĳ���� : �ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ���������� �� ��ȯ �Ǵ°�. / �θ�Ŭ���� ���� = �ڽ� ��ü ��;
		// �ٿ�ĳ���� : �� ĳ���� �� �θ�Ŭ������ ��ü�� �ڽ�Ŭ������ ���� ������ �� ��ȯ �Ǵ°�. / 
		// �ڽ�Ŭ���� ���� = (�ڽ�Ŭ������) �� ĳ���� �� �θ� ��������;
		// ���� ���ε� : ������ �������� �θ�Ŭ������ �ʵ�� �����ϳ�, ��Ÿ�� �������� �ڽ�Ŭ������ �ʵ�� ȣ���� �޼��带 ���°�.
		Student st1 = new Student("���浿", 20, "�����ϱ�", 3);
		st1.info();
		st1.Study();
		// ��ĳ����
	}	
		Human h1 = new Student("���浿", 20, "���ϱ�", 3);
		h1.info();
//		h1.Study();  # ���Ұ�
		// �ٿ�ĳ����
		Student s1=(Student)h1;
		s1.Study();
		
}
class Human{
	String name;
	int age;
	String hobby;
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("hobby:" + hobby);
	}
}
class Student extends Human{
	int grade;
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}
	void info() {
		super.info();
		System.out.println("grade:" + grade);
	}
	void Study() {
		System.out.println("�����ϱ�~");
		
	}
}