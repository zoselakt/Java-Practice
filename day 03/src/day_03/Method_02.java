package day_03;

public class Method_02 {
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 같은이름의 함수를 여러번 중복하여 정의가능
		// 매개변수의 갯수나 타입을 다르게 하면 작성가능
		// 메소드의 이름이 같아야 하며, 매개변수의 개수 또는 타입이 달라야 한다.
			sum(10, 20);
			sum(1.23, 3.12);
			sum(10,20,30);
	}
	//메서드의 매개변수 타입에 변화
	static void sum(int x, double y) {
		System.out.println((x+y));	}
	
	static void sum(double x, double y) {
		System.out.println(x+y);	}
	
	// 메서드의 매개변수 갯수에 변화
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);	
		
	
	System.out.println("sum(10, 20):" +sum(10, 20));
	System.out.println("sub(10, 20):" +sub(10, 20));
	System.out.println("mul(10, 20):" +mul(10, 20));
	System.out.println("div(10, 20):" +div(10, 20));
	}
	
	static int sum(int x, int y) {return x+y;}
	static int sub(int x, int y) {return x-y;}
	static int mul(int x, int y) {return x*y;}
	static int div(int x, int y) {return x/y;}
}
