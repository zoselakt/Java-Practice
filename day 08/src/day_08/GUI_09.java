package day_08;

public class GUI_09 {
	public static void main(String[] args) {
		// ����Ŭ���� - MemberŬ����
		
		Outer ot = new Outer();
		System.out.println("outer�� aa�� ="+ot.aa);
		System.out.println("outer�� bb�� ="+Outer.bb );		
		ot.method();
		System.out.println("-----------InnerŬ���� --------------");
		
/*		
		Outer ot2 = new Outer();
		Outer.Inner oi = ot2.new Inner();
		System.out.println("Inner�� cc�� = " + oi.cc);
		oi.subFunc();
	*/	
		Outer.Inner oi2 = new Outer().new Inner(); // �� ���� ���ٷ� �ٲٱ�
		System.out.println("Inner�� cc�� = " + oi2.cc);
		oi2.subFunc();
		
		Outer.StaticInner os = new Outer.StaticInner();
		System.out.println("StaticInner�� dd�� =" + os.dd);
		os.subFunc1();
		os.subFunc2();
		Outer.StaticInner.subFunc2();
		
		
//���θ޼ҵ�
	}
//����Ŭ����
}

class Outer{
	int aa = 100;
	static int bb = 200;
	
	
	public void method(){
		System.out.println("-----�Ϲ� �޼ҵ�-----");
	}
	
	class Inner{
		int cc = 10;
		public void subFunc() {
			System.out.println("-----���� Ŭ����-------(non-static)-----");
			System.out.println("�ܺ�Ŭ������ ���� aa:" +aa);
			System.out.println("�ܺ�Ŭ������ ���� bb:" +bb);
			method();
		}
	}
	static class StaticInner{
		int dd = 20;
		public void subFunc1() {			
			System.out.println("-----���� Ŭ����-------(static)-----");
		}
		public static void subFunc2() { // ����Ŭ������ ���� �޼���
			System.out.println("InnerClass(static2)");
		}
	}
}