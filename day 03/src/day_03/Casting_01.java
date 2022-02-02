package day_03;

public class Casting_01 {
	public static void main(String[] args) {
		// 다형성: 한가지의 타입이 여러가지형태의 인스턴스를 가질수 있는것.
		// 업캐스팅 : 자식클래스의 객체가 부모클래스의 참조변수로 형 변환 되는것. / 부모클래스 변수 = 자식 객체 값;
		// 다운캐스팅 : 업 캐스팅 된 부모클래스의 객체가 자식클래스의 참조 변수로 형 변환 되는것. / 
		// 자식클래스 변수 = (자식클래스명) 업 캐스팅 된 부모 참조변수;
		// 동적 바인딩 : 컴파일 시점에선 부모클래스의 필드로 인지하나, 런타임 시점에선 자식클래스의 필드로 호출할 메서드를 묶는것.
		Student st1 = new Student("가길동", 20, "게임하기", 3);
		st1.info();
		st1.Study();
		// 업캐스팅
	}	
		Human h1 = new Student("나길동", 20, "롤하기", 3);
		h1.info();
//		h1.Study();  # 사용불가
		// 다운캐스팅
		Student s1=(Student)h1;
		s1.Study();
		
}
class Human{
	String name;
	int age;
	String hobby;
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("hobby:" + hobby);
	}
}
class Student extends Human{
	int grade;
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}
	void info() {
		super.info();
		System.out.println("grade:" + grade);
	}
	void Study() {
		System.out.println("공부하기~");
		
	}
}