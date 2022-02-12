package day_02;

public class H_Method_01 {
	public static void main(String[] args) {
		// 메서드 (메인메서드)
		// 여러명령들의 나열된 묶음 / 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수(내부에서 처리후 결과를 출력,반환)
		// 반복적인 작업을 처리해야 하는 경우 메서드로 만들어 놓으면 이후에 필요할 때 재사용할 수있다.
		// 호출시 결과를 반환하기도 하지만 반환하지 않는 메서드도 있다.
		// 구조
		// (접근권한지정자) (static) 반환타입 메서드명(타입 변수명, 타입 변수명) {
		// 				명령1;
		// 				명령2;
		//				return값
		// 	} (return 또는 '}' )
		
		//호출 : 메서드명 ();
		// 함수 : 하나의 기능을 수행하는 일련의 코드
		// 매개변수(파라미터) : 함수의 호출부에서 구현부로전달하고 싶은 값이 있을때 전달할 값을 저장할 공간
			
		// 메소드 밖에 있는 f1 값을 static void로 새로 선언하여 값을 받아온다.
		f1(100); } // 메서드 선언
	
	// 메서드 구조만들기
	static void f1(int x) { // f1() 안에 있는 int x를 호출시 100을 전달받아서 100 출력
		System.out.println("x:" +x);
		
	// 메서드를 이용하여 사각형의 크기 구하기 
		System.out.println("사각형의 넓이 : " + calculator(10,20)); 
	}
	
	static int calculator(int a, int b) {
		System.out.println("< 계산을 시작합니다.>");
		int area= a*b;
		return area;
	}
}
