package day_03;

public class Class_06 {

	public static void main(String[] args) {
		// �߻�޼���: ����θ� �����ϰ� ��ü���� ������ ������� �޼���
		//			�ڽ�Ŭ������ �ݵ�� �θ�Ŭ������ �߻�޼��带 �����ؾ��Ѵ�.
		//			{} ����� ������ �ʴ´� : public void move() {} �� �� �κ� x / ������ ;
		
		// �߻�Ŭ���� : �߻� Ŭ������ �߻� �޼��带 ����� ���� Ŭ����
		//			�߻�Ŭ������ �߻�޼��带 �ݵ�� �ϳ��� ������ �ؾ��Ѵ�.
		//			����� ���� �ҿ����� Ŭ���� / ��ü �����Ұ� / ��ӹ��� �� �ݵ�� �������̵��ؾ��Ѵ�.
		
		// ����
		// abstract class Ŭ������{
		// 		...
		// 		abstract ����Ÿ�� �ż����(); 
		// }

		Shape Shapes[] = new Shape[3];
		Shapes[0] = new Rect();
		Shapes[1] = new Circle();
		Shapes[2] = new Line();
		
		for(int i=0;i<3;i++) {
			Shapes[i].draw();
		}
		//--------------------------------------------------------------------------------------		
		Pokemon pokemon = new Pikachu();
		System.out.println("�� ���ϸ���: " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon = new Squirtle();
		System.out.println("�� ���ϸ���: " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
}}

abstract class Shape{
	abstract void draw();
}
class Rect extends Shape{
	void draw() {
		System.out.println("�簢���� �׸���.");	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("���� �׸���.");}
}
class Line extends Shape{
	void draw() {
		System.out.println("���� �׸���.");}
}

//-------------------------------------------------------------------------------------

abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon{
	Pikachu() {
		this.name="��ī��";
	}

	@Override
	void attack() {
		System.out.println("�鸸 ��Ʈ!");
		
	}

	@Override
	void sound() {
		System.out.println("��ī��ī!!");
	}
}

class Squirtle extends Pokemon {
	Squirtle() {
		this.name = "���α�";
		
	}

	@Override
	void attack() {
		System.out.println("������!");
		
	}

	@Override
	void sound() {
		System.out.println("���ϲ���");
		
	}
}