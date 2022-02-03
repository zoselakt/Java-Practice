package day_03;

public class Class_Inherit_01 {
	public static void main(String[] args) {
		// class 클래스명 extends 부모클래스명{
		// ...
		// }
		// 자바는 다중 상속 지원 x
		Student st=new Student();
		st.breath();
		st.learn();
		
		Teacher t=new Teacher();
		t.eat();
		t.breath();
}}

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

class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}