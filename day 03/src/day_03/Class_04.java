package day_03;

public class Class_04 {
	public static void main(String[] args) {
		// singleton 패턴
		// 
		
		// this : 생성된 인스턴스 스스로를 가리키는 예약어.
		// this를 생략하게 되면 파라미터로 사용되는 name과 age로 인식된다.
		
		// 멤버변수  (클래스 변수와 인스턴스 변수를 멤버변수라고 함.)
		// 클래스멤버 변수로 선언되어 클래스 내부에서 사용하고 , private가 아니면 다른클래스에서 사용가능
		// 메모리 : 힙 (heap) / 인스턴스가 생성될 때 힙에 생성되고, 가비지컬렉터가 수거할떄 소멸
		// class Iphone 밑 자료형+변수들은 멤버변수
		
		// 지역변수
		// 메서드(함수)내부에 선언되어 함수내부에서만 사용 / 메모리 : 스택 / 함수가 호출시 생성되고 함수가 끝나면 소멸
		// void info() - 지역변수
		
		// static변수 (클래스변수) : static예약어를 사용하여 클래스 내부에 선언, private가 아니면 다른클래스에서 사용가능
		// 메모리: 데이터영역 / 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할때 소멸
		// 지역변수는 클래스내부에 사용되어 함수가 끝나면 소멸되어 사용되지만 
		// static변수는 인스턴스생성(초기화)시 사용되어지며 공통적으로 클래스변수를 사용할수있다.
		// static이 붙으면 클래스변수 / 자료형 + 변수만으로 작성된 변수 인스턴스 변수
		
			Iphone myphone1 = new Iphone();
			Iphone myphone2 = new Iphone("iphone SE", "white", 70);
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

class Iphone{
	String model;
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
	this.model = model;
	this.color = color;
	this.capacity = capacity;}
	void info() {
		System.out.println("model:" + model);
		System.out.println("color:" + color);
		System.out.println("capacity:" + capacity);
	}
}