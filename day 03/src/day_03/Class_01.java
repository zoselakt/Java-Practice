package day_03;

public class Class_01 {
	public static void main(String[] args) {
		// �߻�ȭ : �������� Ư¡�� ��Ƴ�����.
		// ĸ��ȭ : ����ϴ� ����� ��ɸ� �˸�ȴ�! 
		// ������ : ���� ����� ���� ������ �ٸ� �ǹ̸� ���� �ִ� ��.
		//
		// Class Ŭ������ {
		// 		 �Ӽ�(����)
		//       ���(�޼���)
		
		// ��ü(�ν��Ͻ�)�������
		// 		Ŭ������ �������� = new Ŭ������();
		
		// ��ü�� �ʵ� ���� ��� /��ü �� ����, �޼��带 ����Ѵٴ� ��!
		//		��������.�ʵ�� / mycar.power()
		
		//�Ϲݺ���: ���� �����ϴ� ���� / �������� : �ּҸ� �����ϴ� ����
class Car{
	boolean poweron;
	String color;
	int wheel;
	int speed;
	boolean wiperon;
	
	void power() {poweron =! poweron;}
	void speedup() {speed++;}
//	void speedDown() {speed--;}
	void wiper() {wiperon =! wiperon;}
	}
	
	Car mycar = new Car(); 
	System.out.println("�õ� ó�� �ʱ�ȭ:" + mycar.poweron);
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
}}
		



