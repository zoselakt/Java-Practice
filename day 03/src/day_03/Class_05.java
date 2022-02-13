package day_03;

public class Class_05 {
	public static void main(String[] args) {
		// ������: �Ѱ����� Ÿ���� �������������� �ν��Ͻ��� ������ �ִ°�.
		
		// ��ĳ���� : �ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ���������� �� ��ȯ �Ǵ°�. 
		// ���� 
		// �θ�Ŭ���� ���� = �ڽ� ��ü ��;
		
		// �ٿ�ĳ���� : �� ĳ���� �� �θ�Ŭ������ ��ü�� �ڽ�Ŭ������ ���� ������ �� ��ȯ �Ǵ°�.
		// ����
		// �ڽ�Ŭ���� ���� = (�ڽ�Ŭ����) �� ĳ���� �� �θ� ���� ����;
		// ��ĳ���� �� ������ ���� / ����� �� ��ȯ
				
		// ���� ���ε� : ������ �������� �θ�Ŭ������ �ʵ�� �����ϳ�, 
		// ��Ÿ�� �������� �ڽ�Ŭ������ �ʵ�� ȣ���� �޼��带 ���°�.
		
//��ĳ���� 
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
	void info() { //�������̵�
		super.info();
		System.out.println("grade:" + grade);
	}
	void Study() {
		System.out.println("�����ϱ�~");
		
	}
}

Student st1 = new Student("���浿", 20, "�����ϱ�", 3);
st1.info();
st1.Study();

// ��ĳ���� - �� ĳ���ý� student Ŭ������ info()�� ȣ��Ǵ� ���� : �������ε�!
Human h1 = new Student("���浿", 20, "���ϱ�", 3);
h1.info();
//h1.Study();  ���Ұ� // humanŬ������ study�� �������� �ʾ� ���� ��ü�� ���� ������ ������� ���Ѵ�. 

// �ٿ�ĳ���� - () �ȿ� �Ÿ������ ��ȯ�ؾ��ϴ��� �ݵ�� �������.
Student s1 = (Student)h1;
s1.Study();


//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");
// �ٿ�ĳ����
class Animal{
	void breath() {System.out.println("������");}
	}
class Lion extends Animal{
	public String toString() {
	return "����";
	}
}
class Rabbit extends Animal {
	public String toString() {
	return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString() {
	return "������";
	}
}
class Zookeeper{
	void feed(Animal animal) {
	System.out.println(animal + "���� �����ֱ�");
	}
}
Animal Lion1 = new Lion();
Animal Rabbit1 = new Rabbit();
Animal Monkey1 = new Monkey();

Zookeeper james = new Zookeeper();
james.feed(Lion1);
james.feed(Rabbit1);
james.feed(Monkey1);


}
}