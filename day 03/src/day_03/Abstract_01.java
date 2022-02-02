package day_03;

public class Abstract_01 {

	public static void main(String[] args) {
		// 추상클래스: 선언부만 정의하고 구체적인 내용은 비워놓은 메서드
		// 자식클래스는 반드시 부모클래스의 추상메서드를 구현해야한다.
		// abstract 리턴타입 매서드명();
		// 객체생성불가.
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
		System.out.println("사각형을 그리다.");	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다.");}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다.");}
}