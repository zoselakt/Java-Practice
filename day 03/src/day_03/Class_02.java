package day_03;

public class Class_02 {
	public static void main(String[] args) {

		/*
		생성자(constructor) : 객체가 처음 생성될때 호출되어 멤버변수, 인스턴스변수 를 초기화하고 자원을 할당하기도 한다.
		메소드와 비슷하나 생성자 앞에는 접근제어자(public)만 올수있다 (static X불가) 
		반환타입이 없으므로 return이나 void를 붙일수 없다.  
		생성자를 선언하지 않으면 기본생성자를 기본으로 만들어준다. 하지만 생성자 선언하면 자동으로 생성되지 않는다.
		객체가 생성될때 자동으로 실행되며 멤버변수를 초기화할때 사용한다. (멤버변수를 초기화할 목적으로 사용)
		
		//생성자 선언방법
		class 클래스명
		public 클래스명과 동일(매개변수){
			...
		}
		
		//호출방법
		Class1 class = new Class1(); / new키워드 없어도 기본생성자는 만들어준다!
		인스턴스 객체를 생성할떄 호출 / 생성자 이름은 해당 클래스명과 동일하게 설정
		
		// 기본생성자 : 구현부 - 클래스명() {} / 호출부 - new 클래스명();
		// 매개변수생성자 : 구현부 - 클래스명(자료형 변수명...) {} / 호출부 - new 클래스명(값);
		*/ 
		
			Iphone myphone1 = new Iphone(); //방법1
			Iphone myphone2 = new Iphone("iphone SE", "white", 70); //방법2
			System.out.println(myphone1.capacity);
			System.out.println(myphone2.capacity);
}}

// this
// 생성된 인스턴스 스스로를 가리키는 예약어.
// 같은 클래스내 같은 이름을 사용하는 지역 변수와 멤버변수가 있을 경우 지역변수에 우선권을 준다.
// 그래서 this를 생략하게 되면 파라미터() 로 사용되는 변수로 인식한다.
// static메소드에서는 사용할 수 없다.

// this()
// 생성자 내부에서만 사용할 수 있으며, 같은 클래스의 다른 생성자를 호출할때 사용한다.
// this와 this()는 다른 개념.
// 생성자가 중복되어있을때 또 다른 생성자를 호출하고자 할 때 사용 / 오버로딩된 다른 생성자 메서드를 호출할 때 사용


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
