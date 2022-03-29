package day_03;

public class Class_09 {
	public static void main(String[] args) {
		// 익명클래스
		// 익명클래스는 일회성이므로 객체를 다시 생성하고 호출하면 outerClass에 정의된 메서드가 호출
		// 인터페이스는 객체를 생성할수 없으므로 익명클래스를 사용하여 1회성으로 구현할 수 있다.
		
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드 입니다.");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a();  // 익명클래스는 1회성
}}

class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}