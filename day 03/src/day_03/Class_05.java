package day_03;

public class Class_05 {
	public static void main(String[] args) {
		// 다형성: 한가지의 타입이 여러가지형태의 인스턴스를 가질수 있는것.
		
		// 업캐스팅 : 자식클래스의 객체가 부모클래스의 참조변수로 형 변환 되는것. 
		// 구조 
		// 부모클래스 변수 = 자식 객체 값;
		
		// 다운캐스팅 : 업 캐스팅 된 부모클래스의 객체가 자식클래스의 참조 변수로 형 변환 되는것.
		// 구조
		// 자식클래스 변수 = (자식클래스) 업 캐스팅 된 부모 참조 변수;
		// 업캐스팅 된 변수만 가능 / 명시적 형 변환
				
		// 동적 바인딩 : 컴파일 시점에선 부모클래스의 필드로 인지하나, 
		// 런타임 시점에선 자식클래스의 필드로 호출할 메서드를 묶는것.
		
//업캐스팅 
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
	void info() { //오버라이딩
		super.info();
		System.out.println("grade:" + grade);
	}
	void Study() {
		System.out.println("공부하기~");
		
	}
}

Student st1 = new Student("가길동", 20, "게임하기", 3);
st1.info();
st1.Study();

// 업캐스팅 - 업 캐스팅시 student 클래스의 info()가 호출되는 이유 : 동적바인딩!
Human h1 = new Student("나길동", 20, "롤하기", 3);
h1.info();
//h1.Study();  사용불가 // human클래스에 study를 정의하지 않아 공간 자체가 없기 때문에 출력하지 못한다. 

// 다운캐스팅 - () 안에 어떤타입으로 변환해야하는지 반드시 적어야함.
Student s1 = (Student)h1;
s1.Study();


//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");
// 다운캐스팅
class Animal{
	void breath() {System.out.println("숨쉬기");}
	}
class Lion extends Animal{
	public String toString() {
	return "사자";
	}
}
class Rabbit extends Animal {
	public String toString() {
	return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
	return "원숭이";
	}
}
class Zookeeper{
	void feed(Animal animal) {
	System.out.println(animal + "에게 먹이주기");
	}
}
Animal Lion1 = new Lion();
Animal Rabbit1 = new Rabbit();
Animal Monkey1 = new Monkey();

Zookeeper james = new Zookeeper();
james.feed(Lion1);
james.feed(Rabbit1);
james.feed(Monkey1);


}
}