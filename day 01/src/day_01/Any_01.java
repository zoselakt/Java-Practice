package day_01;

public class Any_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}}

// 접근제한자 클래스선언 Any_01(클래스명) {
//	접근제한자 static 반환타입 (메인)메서드(파라미터 = (문자열 [배열] 변수명) {
// }}

//1. 접근제한자 : public, private, protected, default
//			   public : 어떤 클래스에서도 접근이 가능할 수있도록 열어 놓는다는 의미.
//			   public메소드를 통해 private 멤버에 접근할 수 있다. public과 private사이 인터페이스 역할을 수행하기도 함.
//2. 파라미터 : 메서드(함수) 호출시 파라미터 값을 넣어서 호출할 수 있음. / String 값으로[]안에 인수들값을 받는다.
//			 args는 argument로 컴퓨터 쪽 용어로 인수, 독립변수의 뜻을 가지고 있음. 
//3. 반환타입(리턴타입) : 반환할 값이 있다 없다 → 없으면 void / 특별한 반환값이 없이 작동만 수행시키기위하여 사용
//4. static: static 선언된 함수(메서드)나 변수는 인스턴스 객체의 생성없이 호출을 할 수 있다.
// 			 클래스 (메서드) : 공장 / 인스턴스(객체) : 객체 / 
//			 static으로 지정된 메서드가 여러개인 경우 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
//			 그 후, main 으로 만들어진 메서드를 찾아서 그 메서드를 가장먼저 호출한다.
//5. void : return되는 타입이 없음을 의미 / 아무것도 리턴하지 않음을 선언해주는 것과 같다.

//------------------------------------------------------------------------------------
// 객체 : 프로그램의 대상, 생성된 인스턴스
// 클래스: 객체를 코드로 만든상태
// 인스턴스: 클래스가 메모리에 생성된 상태
// 멤버변수: 클래스의 속성, 특성
// 메서드: 멤버변수를 이용하여 특정한 동작이나 작업, 클래스의 기능을 구현하는것
// 참조변수: 메모리에 생성된 인스턴스를 가리키는 변수
// 참조 값: 생성된 인스턴스의 메모리 주소값
//------------------------------------------------------------------------------------
/*
- 각 타입의 비트 크기계산
System.out.println(Byte.BYTES); //바이트 계산 
System.out.println(Byte.SIZE); // 비트계산
System.out.println((Short.BYTES) + " " +(Short.SIZE));
System.out.println("byte" + Byte.BYTES +"(바이트)"+ "-->" + Byte.SIZE + "(비트)" + Byte.MIN_VALUE+ "~" +Byte.MAX_VALUE);
System.out.println("Short" + Short.BYTES +"(바이트)"+ "-->" + Short.SIZE + "(비트)" + Short.MIN_VALUE+ "~" +Short.MAX_VALUE);
System.out.println("Int" + Integer.BYTES +"(바이트)"+ "-->" + Integer.SIZE + "(비트)" + Integer.MIN_VALUE+ "~" +Integer.MAX_VALUE);
System.out.println("Long" + Long.BYTES +"(바이트)"+ "-->" + Long.SIZE + "(비트)" + Long.MIN_VALUE+ "~" +Long.MAX_VALUE);
System.out.println("Char" + Character.BYTES +"(바이트)"+ "-->" + Character.SIZE + "(비트)" + (int)Character.MIN_VALUE+ "~" +(int)Character.MAX_VALUE);
*/
//---------------------------------------------------------------------------------------		
/*
// 변수
// 정수형 변수 
	byte b = 100;
	short s = 100;
	int i = 100;
	long l = 100L; // 맨뒤 L 을 붙여야한다. 
// 실수형 변수
	float f=3.14f; // 맨뒤 f 를 붙여야한다. 
	double d= 3.14;
// 문자형 변수
	char c = 'c';
// 문자열 변수
	String s = "hello";
// 논리형 변수
	boolean b = true;
*/

//변수가 저장되는 공간의 특성
//정수형: byte- 1byte / short-2byte / int- 4byte / long- 8byte
//		int num = 1234; // 1234가 4개 = 4byte
//		long number=123456789; // 
	
//문자형: char- 2byte
//		char ch='A'; // 문자형의 경우 내부적으로 정수값으로 작성되어 있어 char변환시켜 출력. 
		
//실수형: float- 4byte / double- 8byte
//		double dNum = 3.14;
//		float fNum = 3.14F; // double형 처럼 쓰면 오류뜸. 뒤에 f반드시 붙여야함!
		
//논리형: boolean- 1byte

// 최우선연산자 :(), [], . (점)
// 단항연산자: +, -, ~, !, (), ++, --
// 산술연산자: +, -, %, *, /
// 쉬프트연산자: <<, >>, >>>
// 관계연산자: >, <, >=, <=, ==, !=
// 논리연산자: &, ^, |, &&, ||
// 삼항연산자: ?:
// 대입연산자: =, +=, /=, &=, *=, -=, <<=, >>=, >>>= ^=, !=, %=
			
//------------------------------------------------------------------------------------
// printf(print format) : 가변 o (소수점 변경) 
// %s : 문자열
// %c : 'A'  쌍따옴표하면 오류
// %f : 3.14 : 실수형
// %d, 100 : 10진수 정수
// %o, 15 : 8진수 정수
// %x, 15 : 16진수 정수 (소문자 출력)
// %X, 15 : 16진수 정수 (대문자 출력)
// %b, -- : boolean 형식 출력
// %e : 지수표현식형식으로 출력
// %- : 출력할 전체자리수가 지정된 경우 왼쪽에 맞춰 출력한다.
// %0 : 출력할 전체 자리수가 지정된 경우 왼쪽에 남는자리에 0을 채워 출력한다.
// %n : 출력할 전체 자리수
// % .m: 소수점 아래 자릿수, 잘리는 자리에서 반올림 시켜 출력한다.
// %t : 탭
// %n : 줄바꿈
// %
//------------------------------------------------------------------------------------
// 변수작성시 오류가 뜨는것은 변수선언만 하면 어떤 내용이 저장되어있는지 모르기 때문에 반드시 사용하기전에 초기화를 시켜야한다.
// int sum; (오류)  → int sum = 0; (정상)

// System.exit(0) → 강제프로그램종료
// 문자를 곱셈연산하면 문자의 유니코드 값으로 곱한다.
// sc.nextInt 와 sc.nextLine() 사이  sc.nextLine() 를 입력하여 키보드 버퍼를 비운다.

// 삼항연산자 형변환
//int hour = 16;
//String number = hour <= 12 ? "오전" : "오후";
//System.out.println(number);
