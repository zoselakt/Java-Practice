package day_08;

public class GUI_10 {
	
	String str = "멤버 변수 str";
	public void method() {
		int aa = 100;
		
		class LocalInner{
			String str1 = "local Inner 클래스의 변수";
			
			public void show() {
				System.out.println("GUI_10의 변수 str: "+ str ); //메인클래스 변수
				System.out.println("LocalInner의 변수 str1: " + str1); // 내부클래스 변수
				System.out.println("method의 변수 aa: "+ aa);
			}
		}
		LocalInner li = new LocalInner();
		li.show();
	}

	public static void main(String[] args) {
		// 내부 클래스 - local 클래스 
		
		GUI_10 local = new GUI_10();
		local.method();
		
//----------------------------------------------------------------------------------------	
System.out.println("=====================================================================");
		Outer1 ot1 = new Outer1();
		Outer1.Inner oi = ot1.new Inner();
		oi.InnerFunc();
		
//메인메서드
	}
//메인클래스
}

class Outer1{
	int value = 100;
	
	class Inner{
		int value = 200;
		
		void InnerFunc() {
			int value = 300;
			System.out.println("InnerFunc의 value: "+ value); 
			System.out.println("Inner클래스의 value: "+ this.value);
			System.out.println("Outer클래스의 value: "+ Outer1.this.value);
		}
	}
}