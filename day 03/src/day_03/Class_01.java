package day_03;

public class Class_01 {
	public static void main(String[] args) {
		// 클래스의 구성요소 : 속성(필드) + 메서드(생성자) = 속성 →클래스/멤버변수 
		
		// 멤버변수 : (클래스 변수와 인스턴스 변수를 멤버변수라고 함.)
		// 메모리 : 힙 (heap) / 인스턴스가 생성될 때 힙에 생성되고, 가비지컬렉터가 수거할떄 소멸
		// 클래스멤버 변수로 선언되어 클래스 내부에서 사용하고 , private가 아니면 다른클래스에서 
		// instance변수와 static변수 모두 인스턴스생성(초기화)시 사용되어진다.
		// class Car 밑 자료형+변수들은 멤버변수
		// 같은 클래스를 사용하면 클래스명을 생략할 수있다.
		
 		// instance 변수: 
		// static 예약어가 붙지 않고 자료형 + 변수만으로 작성된 변수 
		
		// static변수(클래스변수) : 메모리저장 - 데이터영역
		// 모든 인스턴스가 같은 저장공간을 공유 - 하나의 내용을 바꿔도 모두 바뀐다./인스턴스생성없이 사용가능
		// static예약어를 사용하여 클래스 내부에 선언, private가 아니면 다른클래스에서 사용가능 
		// 지역변수는 클래스내부에 사용되어 함수가 끝나면 소멸되어 사용되지만, 
		// 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할때 소멸	
		
		// local 변수 : 메모리저장- 스택
		// 메서드(함수)내부에 선언되어 멤버변수에서만 사용 / 함수가 호출시 생성되고 함수가 끝나면 소멸
		// void info() { } - {} 내부에 있는 변수를 지역변수라 한다.
		// 지역변수는 반드시 초기화를 해야한다. / String model, color, int capacity 
		
		
		// 전역변수
		
		// 일반변수: 값을 저장하는 공간 / 참조변수 : 주소를 저장하는 공간
		
		
		// 클래스 사용 구조
		// Class 클래스명 {
		// 		 속성(변수)
		//       기능(메서드)
		
		// 호출방법 
		// 객체(인스턴스) 생성 : 자료형(클래스명) 참조변수 = new 클래스명(); / Car mycar = new Car();
		// 클래스변수 생성: 참조변수명.메소드명(멤버변수)
		
		// 클래스변수안에는 멤버변수를 사용할수없다. (인스턴스변수는 객체를 만들어야하기 때문)
		// system.out.println : system.out = static이 붙은 (클래스)변수
				
class Car{ // class {} 안에는 멤버변수 / static이 붙으면 클래스변수
	boolean poweron; // 인스턴스 변수
	String color;
	int wheel;
	int speed;
	boolean wiperon;
	
	void power() {poweron =! poweron;}  // 메서드
	void speedup() {speed++;}
//	void speedDown() {speed--;}
	void wiper() {wiperon =! wiperon;}
	}

	Car mycar = new Car();  // 인스턴스생성
	System.out.println("시동 처음 초기화:" + mycar.poweron); // 인스턴스 변수 사용
	System.out.println("차의 색상 초기화:" + mycar.color);
	System.out.println("바퀴 수 초기화:" + mycar.wheel);
	System.out.println("속력 초기화:" + mycar.speed);
	System.out.println("와이퍼 초기화:" + mycar.wiperon);
	
	mycar.power();
	System.out.println("시동 메서드 동작:" + mycar.poweron);
	mycar.power();
	System.out.println("시동 메서드 다시동작:" + mycar.poweron);
	mycar.speedup();
	System.out.println("속도 증가");
//	mycar.speedDown();
//	System.out.println("속도 감소");
	mycar.wiper();
	System.out.println("와이퍼 작동");
	
	mycar.color = "black";
	System.out.println("현재 차의 색상:" + mycar.color);
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");

//객체타입 배열
// 같은클래스로 만들어진 변수들의 집합 / 객체값을 다르게 할수있다.
class Animal{
	String kind;
	String name;
	int age;
	void info() {
	System.out.println("kind:" + kind);
	System.out.println("name:" + name);
	System.out.println("age:" + age);
	}
}
	Animal animals[]= new Animal[3];
	
	for(int i =0; i<3; i++) {
	animals[i] = new Animal(); // 클래스로 만들어진 객체를 관리할 객체배열 생성
	}

	animals[0].kind="고양이";
	animals[0].name="나르";
	animals[0].age=1;
	
	animals[1].kind="강아지";
	animals[1].name="초코";
	animals[1].age=3;
	
	animals[2].kind="고양이";
	animals[2].name="나코";
	animals[2].age=1;

	for(int i=0; i<3; i++) {
		animals[i].info(); 
		}
//------------------------------------------------------------------------------------		
System.out.println("------------------------------------------------------------------------------------");

class Bclass{
	String name1;
	//생성자 오버로딩 : 여러개의 생성자를 중복정의
	Bclass() {}
	Bclass(String name2){
	System.out.println("Bclass의 매개변수 생성자");
	name1=name2;
	}
}		
		Bclass b1 = new Bclass ("가나다라마바사길동");		
		System.out.println(b1.name1);
		Bclass b = new Bclass();
		System.out.println(b);
		


}}


