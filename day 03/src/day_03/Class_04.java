package day_03;

public class Class_04 {
	public static void main(String[] args) {
		// 오버라이딩(메서드 재정의)
		// 자식클래스가 부모클래스의 메서드를 다시 정의하는것. / 자식클래스에 맞는 기능으로 맞춰 동작하기 위해
		// super와 this는 반드시 생성자의 첫줄에 코딩해야한다.
		
		// 부모클래스 사용 :super / 생략하면 컴파일러가 자동으로 넣어준다.
		// 자식클래스 사용 :this
		
		// toString(): 객체정보를 문자열 출력
		// equals(): 두 객체가 동일한가를 비교
		// getClass(): 객체의 클래스정보를 가져옴
		Leader leader = new Leader();
		leader.say();
	}
}
// student 로 작성하면 package 안에 동일한 내용이있다고 출력되어 오류가 뜸.
class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("안녕하세요");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() { //메서드 오버라이딩
		System.out.println("인사!");
	}
}
//------------------------------------------------------------------------------------
// super, this 연습 
class Car{
	int wheel;
	int speed;
	String color;
//	Car(){} // 자식클래스 오류 - 기본생성자
	Car(String color){
		this.color=color;
	}
}

class SportsCar extends Car{
	int speedLimit;
	SportsCar (String color, int speedLimit) {  //부모클래스에 car 기본생성자 or 자식클래스에 super
		super(color); // 자식클래스 오류
		this.color=color;
		this.speedLimit=speedLimit;
	}
}
