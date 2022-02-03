package day_03;

public class Class_overriding_01 {
	public static void main(String[] args) {
		// 오버라이딩(메서드 재정의)
		// 자식클래스가 부모클래스의 메서드를 다시 정의하는것.
		// 부모클래스 사용 :super
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
	Car(String color){
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color, int speedLimit) {  //오류해결방법: 부모클래스에 car메서드생성 or 자식클래스에 생성자 생성
		this.color=color;
		this.speedLimit=speedLimit;
	}
}