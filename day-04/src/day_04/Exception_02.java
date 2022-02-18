package day_04;

public class Exception_02 {
	public static void main(String[] args) {
		// throw
		// 고의로 예외를 발생 시킬때 사용하는 방법
		
		// 구조
		// Exception e = new Exception("Exception");
		// throw e;
		
		// throws 
		// 예외가 발생했을 경우 현재 메서드 대신 호출한 쪽으로 예외처리에 대한 책임을 넘기는 것.
		// 구조
		// void method() throws Exception { ... }
		
		// 기존 예외클래스로 표현이 불가능한 경우 extends로 상속시켜 받아서 사용한다.
		try {
			System.out.println("외부 try...");
			
			try {
				System.out.println("내부 try...");
				Exception e = new Exception();
				throw e;
			}
			catch(Exception e) {
				System.out.println("(내부 try-catch) exception: " + e);
				System.out.println("예외던지기 한번더");
				throw e;
			}
			finally {
				System.out.println("finally 구문");
			}
		}
		catch(Exception e) {
			System.out.println("(외부 try-catch) exception: " + e);
		}
		System.out.println("종료");
		
		//외부try →내부 try → 내부catch → 내부finally → 외부catch
	}
}
