package day_03;

public class Class_02_Singleton {
	public static void main(String[] args) {
		// singleton 패턴
		// 
		
		// 지역변수 : 메모리- 스택
		// 메서드(함수)내부에 선언되어 멤버변수에서만 사용 / 함수가 호출시 생성되고 함수가 끝나면 소멸
		// void info() { } - {} 내부에 있는 변수를 지역변수라 한다.
		// 지역변수는 반드시 초기화를 해야한다. / String model, color, int capacity 
		
		
		// 전역변수
		
		// 일반변수: 값을 저장하는 공간 / 참조변수 : 주소를 저장하는 공간
		
		// this : 생성된 인스턴스 스스로를 가리키는 예약어.
		// this를 생략하게 되면 파라미터로 사용되는 name과 age로 인식된다.
		// 현재 객체를 지칭하기 위한 키워드 / 매개변수의 변수 명과 객체내 변수의 이름이 같을경우 사용하여 구분
		
			Iphone myphone1 = new Iphone(); //방법1
			Iphone myphone2 = new Iphone("iphone SE", "white", 70); //방법2
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

class Iphone{ 
	String model; // 지역변수 초기화
	String color;
	int capacity;
	Iphone(){}
	Iphone(String model, String color, int capacity){
	this.model = model;
	this.color = color;
	this.capacity = capacity;
	}
	void info() { // 지역변수 사용
		System.out.println("model:" + model);
		System.out.println("color:" + color);
		System.out.println("capacity:" + capacity);
		}
	}
