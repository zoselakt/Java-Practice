package day_03;

public class Method_01 {
	public static void main(String[] args) {
		// 메서드: 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수
		// 함수 : 하나의 기능을 수행하는 일련의 코드
		
		// 메소드 밖에 있는 f1 값을 static void로 새로 선언하여 값을 받아온다.
		f1(100); }
	
	static void f1(int x) { //f1 () 안에 있는 int함수 : 함수호출시 100을 전달받아서 100을 출력
		System.out.println("x:" +x);
		System.out.println("사각형의 넓이 : " + calculator(10,20));
	}
	
	static int calculator(int a, int b) {
		System.out.println("< 계산을 시작합니다.>");
		int area= a*b;
		return area;
	}
}
