package day_03;

public class Class_overriding_01 {
	public static void main(String[] args) {
		// �������̵�(�޼��� ������)
		// �ڽ�Ŭ������ �θ�Ŭ������ �޼��带 �ٽ� �����ϴ°�.
		// �θ�Ŭ���� ��� :super
		// �ڽ�Ŭ���� ��� :this
		
		// toString(): ��ü������ ���ڿ� ���
		// equals(): �� ��ü�� �����Ѱ��� ��
		// getClass(): ��ü�� Ŭ���������� ������
		Leader leader = new Leader();
		leader.say();
		

	}

}
// student �� �ۼ��ϸ� package �ȿ� ������ �������ִٰ� ��µǾ� ������ ��.
class Student2{
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("�ȳ��ϼ���");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() { //�޼��� �������̵�
		System.out.println("�λ�!");
	}
}
//------------------------------------------------------------------------------------
// super, this ���� 
class Car{
	int wheel;
	int speed;
	String color;
	Car(String color){
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color, int speedLimit) {  //�����ذ���: �θ�Ŭ������ car�޼������ or �ڽ�Ŭ������ ������ ����
		this.color=color;
		this.speedLimit=speedLimit;
	}
}