package day_03;

public class Class_08 {
	public static void main(String[] args) {
		// 내부 클래스
		// 내부 클래스는 선언된 위치에 따라 인스턴스, 스태틱, 지역, 익명 클래스로 구분 
		// 클래스 간 관계가 긴밀할때 사용하여 코드를 간결하게 하기 위해 사용
		
		// 구조
		// class OuterClass {
		// 			class InnerClass{
		//					... 
		//  		}
		// }
		
		// 인스턴스내부 클래스 접근 (외부클래스 객체생성 - 외부클래스객체로 내부클래스 객체생성 - 내부클래스 객체로 메서드호출)
		// 외부클래스 객체 생성
		// OuterClass oc2 = new OuterClass();
		// 외부클래스 객체로 내부클래스의 객체를 생성하는 방법
		// 외부클래스.내부클래스명 객체명 = new 외부클래스 생성자(), 내부클래스생성자();
		//							외부클래스객체, 내부클래스생성자();
		// 내부클래스 객체로 메서드 호출
		// i.InnerMethod();
		
		// instance 클래스
		// 외부클래스에서 멤버변수위치에 선언
		// 클래스 내부에서 인스턴스멤버처럼 다뤄지며, 인스턴스 멤버들과 상호작용 가능

		// static 클래스 (정적(static) 메서드)
		// 외부클래스에서 멤버변수위치에선언 / 메서드에 static 키워드를 사용하여 구현
		// 클래스 내부에서 스테틱 멤버처럼 다뤄지며 다른 멤버들과 상호작용 가능.
		// static메서드에서 인스턴스 변수를 사용할 수 없음.
		// 클래스 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 실행할 수있다.
		
		// local 클래스
		// 메서드 내부 지역변수 위치에 선언
		// 메서드나 초기화블록의 내부에서 다뤄지며 선언된 영역 내부에서 사용

		OuterClass oc= new OuterClass();
		System.out.println("OuterClass의 a의 값: " + oc.a);
		System.out.println("OuterClass의 b의 값: " + OuterClass.b);
		
		System.out.println("===inner 클래스 접근하기 ====");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 c의 값:" + i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 :" +si.d);
		
		si.staticMethod(); // 객체를 사용하지 않고 클래스명을 사용해서 호출가능
		OuterClass.StaticInner.staticMethod();
}}

class OuterClass{
	int a=3; 
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
	}	
}
	
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}