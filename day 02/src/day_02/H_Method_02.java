package day_02;

public class H_Method_02 {
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 매개변수나 갯수와 타입은 다르지만 이름이 같은 메서드를 여러개 정의 하는것.
		// 같은 클래스의 매서드를 여러개 정의하여 각기 다른 기능을 구현
		// 오버로딩 : over해서 정의하였다( 메서드 중복정의)
		
		// 메소드의 이름이 같아야 하며, 같은이름의 함수를 여러번 중복하여 정의가능
		// 매개변수의 개수 또는 타입이 달라야 한다.
		// 매개변수는 같고 리턴타입이 다른경우는 오버로딩이 성립되지 않는다.
		
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
		
	//사칙연산 구현하기
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
/*
public int getAdd(int i, int j) {
	return i+j;
}

public int getAdd(int i, int j, int k) { 갯수의 변화
	return i+j+k;
}
	
public double getAdd(double i, int j, int k) { 반환타입 변화
	return (int) i+j+k;
}

public double getAdd(int i, double j, int k) { 반환타입 변화
	return (double) i+j+k;
}
*/
	