package day_01;

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

public class Z_Practice {
	public static void main(String[] args) {
		Car car = new Car();	
		Car yourCar = new Car();
	}
}