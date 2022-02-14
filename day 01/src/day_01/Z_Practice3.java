package day_01;

class Point{
	int x, y;
	public void move() {}
}
class Shape {
	public static final double PI = 3.141592;
	public void draw() {}
	public void erase() {}
}

interface Draw {
	public static final double PI = 3.141592;
	int LIMIT = 1000;
	public abstract void move();
	void erase();
}
interface Graphic {
	void rotate();
	void resize();
}

class Line extends Point implements Draw, Graphic{

	@Override
	public void rotate() {
		
	}

	@Override
	public void resize() {
		
	}

	@Override
	public void erase() {
		
	}
	
}

public class Z_Practice3{
	public static void main(String[] args) {
		System.out.println(Shape.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
	}
}
