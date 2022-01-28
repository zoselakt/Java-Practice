package day_01;

public class Operater_01 {
	public static void main(String[] args) {
		
		// 자동형변환
		int s=65;
		float t=s;  
		System.out.println(t);
		//결과 : 65.0
		
		// 강제형변환
		char u= (char)65; 
		System.out.println(u); 
		//결과 : A
		
		// 변수의 상수화- 변하지않는값
		final double PI = 3.14; // 변수명은 대문자로 작성
//---------------------------------------------------------------------------------------
		
		// 연산자
		int a=10;
		int b=3;
		double doubleB=3; 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		System.out.println(a/doubleB); // 정수/실수 = 실수
		System.out.println(a%doubleB); // 정수%실수 = 실수
		System.out.println(doubleB%b); // 실수%정수 = 실수
		
		// boolean 형
		boolean c=true;
		boolean d=false;
		boolean e=!d;
		
		System.out.println(c);
		System.out.println(!c);
		
		System.out.println(d);
		System.out.println(e);
		
		// 증감형
		int f=1;
		System.out.println(f);
		
		f++;
		System.out.println(f);
		System.out.println(++f); //전위형: f값이 증가한 후 변수에 대입
		System.out.println(f++); //후위형: 변수에 f값을 먼저 대입한 후 다음에 출력
		System.out.println(f); //후위형 출력
		
		//비교형
		int g=10;
		int h=20;
		int i=30;
		
		System.out.println(g<h);
		System.out.println(g>h);
		System.out.println(g+h <= i);
		System.out.println(g+h >= i);
		
		double j = 3.14;
		double k = 5.14;
		System.out.println(j==k);
		System.out.println(j!=k);
		
		String c1="Hello Java!";
		System.out.println(c1 == "Hello Java!"); //true
		System.out.println(c1.equals("Hello Java!")); // equals = 문자열 비교 / ==는 사용 x
		System.out.println(c1.equals("hello java"));
		
		// 논리형
		// and 연산자 : &&
		// or 연산자 : ||
		// not 연산자 : !
		boolean l = true;
		boolean m = false;
		boolean n = true;
		
		System.out.println(l && m);
		System.out.println((2<4) && (4<5));
		
		System.out.println(l || m);
		System.out.println(m || n);
		
		System.out.println(!l);
		
		//비트형 : 비트연산자는 정수에만 사용할 수 있다.
		// 비트and : & 
		// 비트or : |
		// 비트 XOR : ^
		// 비트 not : ~ 
		int o = 15; // 1111(2)
		int p = 5; //  0101(2)
		
		System.out.println(o&p);
		System.out.println(o|p);
		System.out.println(o^p);
		System.out.println(~p);
		
		//비트 쉬프트 연산자
		System.out.println(o>>2);
		System.out.println(p<<4);
		
		//삼항연산자 // 삼항연산자 연습파일작성
		int age = 17; 
		System.out.println(age > 19? "성인입니다." : "청소년입니다.");
		
		// 대입연산자
		int q=10;
		q = q+10;
		System.out.println(q);
		
		int r = 10;
		r +=10;
		System.out.println(r);
		
}}
