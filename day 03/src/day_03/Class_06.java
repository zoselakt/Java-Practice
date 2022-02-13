package day_03;

public class Class_06 {

	public static void main(String[] args) {
		// 추상메서드: 선언부만 정의하고 구체적인 내용은 비워놓은 메서드
		//			자식클래스는 반드시 부모클래스의 추상메서드를 구현해야한다.
		//			{} 블록을 가지지 않는다 : public void move() {} ← 이 부분 x / 마지막 ;
		
		// 추상클래스 : 추상 클래스는 추상 메서드를 멤버로 갖는 클래스
		//			추상클래스는 추상메서드를 반드시 하나라도 포함을 해야한다.
		//			상속을 위한 불완전한 클래스 / 객체 생성불가 / 상속받은 후 반드시 오버라이드해야한다.
		
		// 구조
		// abstract class 클래스명{
		// 		...
		// 		abstract 리턴타입 매서드명(); 
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
		System.out.println("이 포켓몬은: " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon = new Squirtle();
		System.out.println("이 포켓몬은: " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
}}

abstract class Shape{
	abstract void draw();
}
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
		this.name="피카츄";
	}

	@Override
	void attack() {
		System.out.println("백만 볼트!");
		
	}

	@Override
	void sound() {
		System.out.println("피카피카!!");
	}
}

class Squirtle extends Pokemon {
	Squirtle() {
		this.name = "꼬부기";
		
	}

	@Override
	void attack() {
		System.out.println("물대포!");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북");
		
	}
}