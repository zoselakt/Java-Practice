package day_03;

public class Class_01 {
	public static void main(String[] args) {
		// ������� : (Ŭ���� ������ �ν��Ͻ� ������ ���������� ��.)
		// �޸� : �� (heap) / �ν��Ͻ��� ������ �� ���� �����ǰ�, �������÷��Ͱ� �����ҋ� �Ҹ�
		// Ŭ������� ������ ����Ǿ� Ŭ���� ���ο��� ����ϰ� , private�� �ƴϸ� �ٸ�Ŭ�������� ��밡��
		// instance������ static���� ��� �ν��Ͻ�����(�ʱ�ȭ)�� ���Ǿ�����.
		// class Car �� �ڷ���+�������� �������
		// �ʱ�ȭ�� ���� ������� default ���� ����. int�� 0, String�� null���� ����.
		// ���� Ŭ������ ����ϸ� Ŭ�������� ������ ���ִ�.
		
		// instance ����: 
		// static ���� ���� �ʰ� �ڷ��� + ���������� �ۼ��� ���� 
		
		// static����(Ŭ��������) : �޸����� : �����Ϳ���
		// ��� �ν��Ͻ��� ���� ��������� ���� - �ϳ��� ������ �ٲ㵵 ��� �ٲ��./�ν��Ͻ��������� ��밡��
		// static���� ����Ͽ� Ŭ���� ���ο� ����, private�� �ƴϸ� �ٸ�Ŭ�������� ��밡�� 
		// ���������� Ŭ�������ο� ���Ǿ� �Լ��� ������ �Ҹ�Ǿ� ��������, 
		// ���α׷��� ó�� ������ �� ����� �Բ� ������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� �����Ҷ� �Ҹ�		
		
		// Ŭ���� ��� ����
		// Class Ŭ������ {
		// 		 �Ӽ�(����)
		//       ���(�޼���)
		
		// ȣ���� 
		// ��ü(�ν��Ͻ�) ���� : �ڷ���(Ŭ������) �������� = new Ŭ������(); / Car mycar = new Car();
		// Ŭ�������� ����: ����������.�޼ҵ��(�������)
		
		// Ŭ���������ȿ��� ��������� ����Ҽ�����. (�ν��Ͻ������� ��ü�� �������ϱ� ����)
		// system.out.println : system.out = static�� ���� (Ŭ����)����
				
class Car{ // class {} �ȿ��� ������� / static�� ������ Ŭ��������
	boolean poweron; // �ν��Ͻ� ����
	String color;
	int wheel;
	int speed;
	boolean wiperon;
	
	void power() {poweron =! poweron;}  // �޼���
	void speedup() {speed++;}
//	void speedDown() {speed--;}
	void wiper() {wiperon =! wiperon;}
	}

//������ : �ν��Ͻ�(��ü)�� �����Ҷ� ȣ�� / �����ڸ��� Ŭ������� ���� / �޼���� ����ϳ� ��ȯŸ���� ������Ѵ�.
//��������� �ʱ�ȭ�Ҷ� ����Ѵ�.	
	Car mycar = new Car();  // �ν��Ͻ�����
	System.out.println("�õ� ó�� �ʱ�ȭ:" + mycar.poweron); // �ν��Ͻ� ���� ���
	System.out.println("���� ���� �ʱ�ȭ:" + mycar.color);
	System.out.println("���� �� �ʱ�ȭ:" + mycar.wheel);
	System.out.println("�ӷ� �ʱ�ȭ:" + mycar.speed);
	System.out.println("������ �ʱ�ȭ:" + mycar.wiperon);
	
	mycar.power();
	System.out.println("�õ� �޼��� ����:" + mycar.poweron);
	mycar.power();
	System.out.println("�õ� �޼��� �ٽõ���:" + mycar.poweron);
	mycar.speedup();
	System.out.println("�ӵ� ����");
//	mycar.speedDown();
//	System.out.println("�ӵ� ����");
	mycar.wiper();
	System.out.println("������ �۵�");
	
	mycar.color = "black";
	System.out.println("���� ���� ����:" + mycar.color);
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");
// Ŭ������ ������� : �Ӽ�(�ʵ�) + �޼���(������) = �Ӽ� ��Ŭ����/������� 
class Member{
	static String centerName ="Hello"; //Ŭ��������
	String name;
	int age;
	String gender;
	
	void info() {
		System.out.println("center Name:" + centerName);
		System.out.println("Name:" + name);
		System.out.println("age:" + age);
		System.out.println("gender:" + gender); }
}

Member member1 = new Member();
Member member2 = new Member();
Member member3 = new Member();
Member member4 = new Member();

member1.name="��ö��";
member1.age=32;
member1.gender="����";

member2.name="���ȣ";
member2.age=28;
member2.gender="����";

member3.name="�̿���";
member3.age=24;
member3.gender="����";

member4.name="��õ";
member4.age=32;
member4.gender="����";

Member.centerName="Bye";
System.out.println("member1------");
member1.info();
System.out.println("member2------");
member2.info();
System.out.println("member3------");
member3.info();
System.out.println("member4------");
member4.info();
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");

//��üŸ�� �迭
// ����Ŭ������ ������� �������� ���� / ��ü���� �ٸ��� �Ҽ��ִ�.
Animal animals[]= new Animal[3];
for(int i =0; i<3; i++) {
animals[i] = new Animal(); // Ŭ������ ������� ��ü�� ������ ��ü�迭 ����
}

animals[0].kind="�����";
animals[0].name="����";
animals[0].age=1;

animals[1].kind="������";
animals[1].name="����";
animals[1].age=3;

animals[2].kind="�����";
animals[2].name="����";
animals[2].age=1;

for(int i=0; i<3; i++) {
	animals[i].info(); }
}}

class Animal{
String kind;
String name;
int age;
void info() {
System.out.println("kind:" + kind);
System.out.println("name:" + name);
System.out.println("age:" + age);
}}
		



