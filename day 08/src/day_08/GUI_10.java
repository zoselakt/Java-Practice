package day_08;

public class GUI_10 {
	
	String str = "��� ���� str";
	public void method() {
		int aa = 100;
		
		class LocalInner{
			String str1 = "local Inner Ŭ������ ����";
			
			public void show() {
				System.out.println("GUI_10�� ���� str: "+ str ); //����Ŭ���� ����
				System.out.println("LocalInner�� ���� str1: " + str1); // ����Ŭ���� ����
				System.out.println("method�� ���� aa: "+ aa);
			}
		}
		LocalInner li = new LocalInner();
		li.show();
	}

	public static void main(String[] args) {
		// ���� Ŭ���� - local Ŭ���� 
		
		GUI_10 local = new GUI_10();
		local.method();
		
//----------------------------------------------------------------------------------------	
System.out.println("=====================================================================");
		Outer1 ot1 = new Outer1();
		Outer1.Inner oi = ot1.new Inner();
		oi.InnerFunc();
		
//���θ޼���
	}
//����Ŭ����
}

class Outer1{
	int value = 100;
	
	class Inner{
		int value = 200;
		
		void InnerFunc() {
			int value = 300;
			System.out.println("InnerFunc�� value: "+ value); 
			System.out.println("InnerŬ������ value: "+ this.value);
			System.out.println("OuterŬ������ value: "+ Outer1.this.value);
		}
	}
}