package day_03;

public class InterFace_01 {
	public static void main(String[] args) {
		// 인터페이스
		// 클래스- 설계도 / 인터페이스-규격
		
		// 인터페이스의 멤버
		// 상수 : final 타입 변수명 = 값;
		// 추상메서드 : abstract 리턴 타입 메서드 명();
		
		// 구현방법
		// interFace 인터페이스명 {
		// ...
		// }
		// class 클래스명 implements 인터페이스명{
		//		추상메서드 구현
		// }
		
		// 주의할 점.
		// 인터페이스 내 일반메서드 불가
		// 인터페이스 내 변수불가 (상수만 가능)
		// 인터페이스로 객체 생성불가.
		
		B b=new B();
		b.methodA();
		b.methodB();
	
	}

}

interface Ainter{
	final int x=10;
	int y=20; //final 생략가능
	abstract void methodA();
	void methodB();  //abstract 생략가능
}
class B implements Ainter{
	@Override
	public void methodA() {
		System.out.println("methodA()");
	}
	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
}