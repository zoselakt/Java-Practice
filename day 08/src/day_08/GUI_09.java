package day_08;

public class GUI_09 {
	public static void main(String[] args) {
		// 내부클래스 - Member클래스
		
		Outer ot = new Outer();
		System.out.println("outer의 aa값 ="+ot.aa);
		System.out.println("outer의 bb값 ="+Outer.bb );		
		ot.method();
		System.out.println("-----------Inner클래스 --------------");
		
/*		
		Outer ot2 = new Outer();
		Outer.Inner oi = ot2.new Inner();
		System.out.println("Inner의 cc값 = " + oi.cc);
		oi.subFunc();
	*/	
		Outer.Inner oi2 = new Outer().new Inner(); // 두 줄을 한줄로 바꾸기
		System.out.println("Inner의 cc값 = " + oi2.cc);
		oi2.subFunc();
		
		Outer.StaticInner os = new Outer.StaticInner();
		System.out.println("StaticInner의 dd값 =" + os.dd);
		os.subFunc1();
		os.subFunc2();
		Outer.StaticInner.subFunc2();
		
		
//메인메소드
	}
//메인클래스
}

class Outer{
	int aa = 100;
	static int bb = 200;
	
	
	public void method(){
		System.out.println("-----일반 메소드-----");
	}
	
	class Inner{
		int cc = 10;
		public void subFunc() {
			System.out.println("-----내부 클래스-------(non-static)-----");
			System.out.println("외부클래스의 변수 aa:" +aa);
			System.out.println("외부클래스의 변수 bb:" +bb);
			method();
		}
	}
	static class StaticInner{
		int dd = 20;
		public void subFunc1() {			
			System.out.println("-----내부 클래스-------(static)-----");
		}
		public static void subFunc2() { // 서브클래스내 내부 메서드
			System.out.println("InnerClass(static2)");
		}
	}
}