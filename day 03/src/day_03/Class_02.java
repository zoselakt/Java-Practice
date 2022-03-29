package day_03;

public class Class_02 {
	public static void main(String[] args) {

		/*
		������(constructor) : ��ü�� ó�� �����ɶ� ȣ��Ǿ� �������, �ν��Ͻ����� �� �ʱ�ȭ�ϰ� �ڿ��� �Ҵ��ϱ⵵ �Ѵ�.
		�޼ҵ�� ����ϳ� ������ �տ��� ����������(public)�� �ü��ִ� (static X�Ұ�) 
		��ȯŸ���� �����Ƿ� return�̳� void�� ���ϼ� ����.  
		�����ڸ� �������� ������ �⺻�����ڸ� �⺻���� ������ش�. ������ ������ �����ϸ� �ڵ����� �������� �ʴ´�.
		��ü�� �����ɶ� �ڵ����� ����Ǹ� ��������� �ʱ�ȭ�Ҷ� ����Ѵ�. (��������� �ʱ�ȭ�� �������� ���)
		
		//������ ������
		class Ŭ������
		public Ŭ������� ����(�Ű�����){
			...
		}
		
		//ȣ����
		Class1 class = new Class1(); / newŰ���� ��� �⺻�����ڴ� ������ش�!
		�ν��Ͻ� ��ü�� �����ҋ� ȣ�� / ������ �̸��� �ش� Ŭ������� �����ϰ� ����
		
		// �⺻������ : ������ - Ŭ������() {} / ȣ��� - new Ŭ������();
		// �Ű����������� : ������ - Ŭ������(�ڷ��� ������...) {} / ȣ��� - new Ŭ������(��);
		*/ 
		
			Iphone myphone1 = new Iphone(); //���1
			Iphone myphone2 = new Iphone("iphone SE", "white", 70); //���2
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

// this
// ������ �ν��Ͻ� �����θ� ����Ű�� �����.
// ���� Ŭ������ ���� �̸��� ����ϴ� ���� ������ ��������� ���� ��� ���������� �켱���� �ش�.
// �׷��� this�� �����ϰ� �Ǹ� �Ķ����() �� ���Ǵ� ������ �ν��Ѵ�.
// static�޼ҵ忡���� ����� �� ����.

// this()
// ������ ���ο����� ����� �� ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���Ҷ� ����Ѵ�.
// this�� this()�� �ٸ� ����.
// �����ڰ� �ߺ��Ǿ������� �� �ٸ� �����ڸ� ȣ���ϰ��� �� �� ��� / �����ε��� �ٸ� ������ �޼��带 ȣ���� �� ���


class Iphone{ 
	String model; // �������� �ʱ�ȭ
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
	this.model = model;
	this.color = color;
	this.capacity = capacity;
	}
	void info() { // �������� ���
		System.out.println("model:" + model);
		System.out.println("color:" + color);
		System.out.println("capacity:" + capacity);
		}
	}
