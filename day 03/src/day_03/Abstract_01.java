package day_03;

public class Abstract_01 {

	public static void main(String[] args) {
		// �߻�Ŭ����: ����θ� �����ϰ� ��ü���� ������ ������� �޼���
		// �ڽ�Ŭ������ �ݵ�� �θ�Ŭ������ �߻�޼��带 �����ؾ��Ѵ�.
		// abstract ����Ÿ�� �ż����();
		// ��ü�����Ұ�.
		Shape Shapes[] = new Shape[3];
		Shapes[0] = new Rect();
		Shapes[1] = new Circle();
		Shapes[2] = new Line();
		
		for(int i=0;i<3;i++) {
			Shapes[i].draw();
		}
}}

abstract class Shape{
	abstract void draw();}
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