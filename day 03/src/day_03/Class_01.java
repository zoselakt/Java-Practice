package day_03;

public class Class_01 {
	public static void main(String[] args) {
		// 추상화 : 공통적인 특징을 모아놓은것.
		// 캡슐화 : 사용하는 사람은 기능만 알면된다! 
		// 다형성 : 같은 모양을 갖고 있으나 다른 의미를 갖고 있는 것.
		//
		// Class 클래스명 {
		// 		 속성(변수)
		//       기능(메서드)
		
		// 객체(인스턴스)생성방법
		// 		클래스명 참조변수 = new 클래스명();
		
		// 객체내 필드 접근 방법 /객체 내 변수, 메서드를 사용한다는 것!
		//		참조변수.필드명 / mycar.power()
		
		//일반변수: 값을 저장하는 공간 / 참조변수 : 주소를 저장하는 공간
class Car{
	boolean poweron;
	String color;
	int wheel;
	int speed;
	boolean wiperon;
	
	void power() {poweron =! poweron;}
	void speedup() {speed++;}
//	void speedDown() {speed--;}
	void wiper() {wiperon =! wiperon;}
	}
	
	Car mycar = new Car(); 
	System.out.println("시동 처음 초기화:" + mycar.poweron);
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
}}
		



