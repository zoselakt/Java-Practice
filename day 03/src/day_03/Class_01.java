package day_03;

public class Class_01 {
	public static void main(String[] args) {
		// Ŭ������ ������� : �Ӽ�(�ʵ�) + �޼���(������) = �Ӽ� ��Ŭ����/������� 
		
		// ������� : (Ŭ���� ������ �ν��Ͻ� ������ ���������� ��.)
		// �޸� : �� (heap) / �ν��Ͻ��� ������ �� ���� �����ǰ�, �������÷��Ͱ� �����ҋ� �Ҹ�
		// Ŭ������� ������ ����Ǿ� Ŭ���� ���ο��� ����ϰ� , private�� �ƴϸ� �ٸ�Ŭ�������� 
		// instance������ static���� ��� �ν��Ͻ�����(�ʱ�ȭ)�� ���Ǿ�����.
		// class Car �� �ڷ���+�������� �������
		// ���� Ŭ������ ����ϸ� Ŭ�������� ������ ���ִ�.
		
 		// instance ����: 
		// static ���� ���� �ʰ� �ڷ��� + ���������� �ۼ��� ���� 
		
		// static����(Ŭ��������) : �޸����� - �����Ϳ���
		// ��� �ν��Ͻ��� ���� ��������� ���� - �ϳ��� ������ �ٲ㵵 ��� �ٲ��./�ν��Ͻ��������� ��밡��
		// static���� ����Ͽ� Ŭ���� ���ο� ����, private�� �ƴϸ� �ٸ�Ŭ�������� ��밡�� 
		// ���������� Ŭ�������ο� ���Ǿ� �Լ��� ������ �Ҹ�Ǿ� ��������, 
		// ���α׷��� ó�� ������ �� ����� �Բ� ������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� �����Ҷ� �Ҹ�	
		
		// local ���� : �޸�����- ����
		// �޼���(�Լ�)���ο� ����Ǿ� ������������� ��� / �Լ��� ȣ��� �����ǰ� �Լ��� ������ �Ҹ�
		// void info() { } - {} ���ο� �ִ� ������ ���������� �Ѵ�.
		// ���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�. / String model, color, int capacity 
		
		
		// ��������
		
		// �Ϲݺ���: ���� �����ϴ� ���� / �������� : �ּҸ� �����ϴ� ����
		
		
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

//��üŸ�� �迭
// ����Ŭ������ ������� �������� ���� / ��ü���� �ٸ��� �Ҽ��ִ�.
class Animal{
	String kind;
	String name;
	int age;
	void info() {
	System.out.println("kind:" + kind);
	System.out.println("name:" + name);
	System.out.println("age:" + age);
	}
}
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
		animals[i].info(); 
		}
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");

class Bclass{
	String name1;
	//������ �����ε� : �������� �����ڸ� �ߺ�����
	Bclass() {}
	Bclass(String name2){
	System.out.println("Bclass�� �Ű����� ������");
	name1=name2;
	}
}		
		Bclass b1 = new Bclass ("�����ٶ󸶹ٻ�浿");		
		System.out.println(b1.name1);
		Bclass b = new Bclass();
		System.out.println(b);
		


}}


