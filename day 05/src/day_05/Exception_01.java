package day_05;

public class Exception_01 {
	public static void main(String[] args) {
		// 예외처리
		// 컴파일 에러: 컴파일시 발생하는 에러 / 오타, 잘못된 자료형 등
		// 런타임 에러: 프로그램 실행도중에 발생하는 에러
		// 로직 에러: 실행은 되지만 의도와 다르게 동작하는 에러
		// 예외: 다른 방식으로 처리가능한 오류 / 입력값오류, 네트워크 문제 등
		
		// try- catch 문
		// try{
//				예외가 발생할 수 있는 명령;
		// }
		// catch(발생할 수 있는 예외 클래스명) {
		// 			예외발생시 실행할 명령:
		//								}
			// 외부로 접근
			int a=0;
			int b=2;
			try {
				System.out.println("외부로 접속");
				int c=b/a;
			}
		
		catch(ArithmeticException e) {
			System.out.println("산술오류 발생");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 길이 오류 발생");
//		}
		
		//finally 문 : 선택적으로 추가할 수 있는 문법으로 오류가 발생하든 하지 않든 무조건 실행하는 구문
		//finally {
		//				무조건 실행하는 구문
		//									}
		// finally는 N/W 연결시 외부와의 연결을 종료하는 작업에 주로 사용
		finally {
			System.out.println("무조건 연결 해제");
		}
	}
}
