package day_03;

public class Class_03 {
	public static void main(String[] args) {
		// 상속 : extends
		// class 클래스명 extends 부모클래스명{
		// ...
		// }
		// 자바는 다중 상속 지원 x
		// final키워드는 상속불가
		
		Studentt st = new Studentt();
		st.breath();
		st.learn();

		Teacher t = new Teacher();
		t.eat();
		t.breath();
	}
}

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Studentt extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}