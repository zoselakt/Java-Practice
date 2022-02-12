package day_03;

public class Class_03 {
	public static void main(String[] args) {
		// 상속 : extends
		// class 클래스명 extends 부모클래스명{
		// ...
		// }
		// 자바는 다중 상속 지원 x
		// final키워드는 상속불가
		
		// 부모클래스로부터 상속받은 멤버의 접근권한이 protected일 경우 자식클래스에서는 자유롭게 접근할 수 있으므로
		// 일반멤버변수를 초기화 시키듯이 this를 사용한 초기화가 가능하다. / getter메소드를 사용하지 않아도 된다.
		
		// 부모클래스로부터 상속받은 멤버의 접근권한이 private일 경우 부모 클래스에 setter메소드가 작성되어 있다면
		// setter메소드를 사용해서 초기화 할 수 있다.
		
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