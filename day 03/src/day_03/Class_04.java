package day_03;

public class Class_04 {
	public static void main(String[] args) {
		// singleton ����
		// 
		
		// this : ������ �ν��Ͻ� �����θ� ����Ű�� �����.
		// this�� �����ϰ� �Ǹ� �Ķ���ͷ� ���Ǵ� name�� age�� �νĵȴ�.
		
		// �������  (Ŭ���� ������ �ν��Ͻ� ������ ���������� ��.)
		// Ŭ������� ������ ����Ǿ� Ŭ���� ���ο��� ����ϰ� , private�� �ƴϸ� �ٸ�Ŭ�������� ��밡��
		// �޸� : �� (heap) / �ν��Ͻ��� ������ �� ���� �����ǰ�, �������÷��Ͱ� �����ҋ� �Ҹ�
		// class Iphone �� �ڷ���+�������� �������
		
		// ��������
		// �޼���(�Լ�)���ο� ����Ǿ� �Լ����ο����� ��� / �޸� : ���� / �Լ��� ȣ��� �����ǰ� �Լ��� ������ �Ҹ�
		// void info() - ��������
		
		// static���� (Ŭ��������) : static���� ����Ͽ� Ŭ���� ���ο� ����, private�� �ƴϸ� �ٸ�Ŭ�������� ��밡��
		// �޸�: �����Ϳ��� / ���α׷��� ó�� ������ �� ����� �Բ� ������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� �����Ҷ� �Ҹ�
		// ���������� Ŭ�������ο� ���Ǿ� �Լ��� ������ �Ҹ�Ǿ� �������� 
		// static������ �ν��Ͻ�����(�ʱ�ȭ)�� ���Ǿ����� ���������� Ŭ���������� ����Ҽ��ִ�.
		// static�� ������ Ŭ�������� / �ڷ��� + ���������� �ۼ��� ���� �ν��Ͻ� ����
		
			Iphone myphone1 = new Iphone();
			Iphone myphone2 = new Iphone("iphone SE", "white", 70);
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

class Iphone{
	String model;
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
	this.model = model;
	this.color = color;
	this.capacity = capacity;}
	void info() {
		System.out.println("model:" + model);
		System.out.println("color:" + color);
		System.out.println("capacity:" + capacity);
	}
}