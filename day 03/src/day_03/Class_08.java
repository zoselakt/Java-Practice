package day_03;

public class Class_08 {
	public static void main(String[] args) {
		// ���� Ŭ����
		// ���� Ŭ������ ����� ��ġ�� ���� �ν��Ͻ�, ����ƽ, ����, �͸� Ŭ������ ���� 
		// Ŭ���� �� ���谡 ����Ҷ� ����Ͽ� �ڵ带 �����ϰ� �ϱ� ���� ���
		
		// ����
		// class OuterClass {
		// 			class InnerClass{
		//					... 
		//  		}
		// }
		
		// �ν��Ͻ����� Ŭ���� ���� (�ܺ�Ŭ���� ��ü���� - �ܺ�Ŭ������ü�� ����Ŭ���� ��ü���� - ����Ŭ���� ��ü�� �޼���ȣ��)
		// �ܺ�Ŭ���� ��ü ����
		// OuterClass oc2 = new OuterClass();
		// �ܺ�Ŭ���� ��ü�� ����Ŭ������ ��ü�� �����ϴ� ���
		// �ܺ�Ŭ����.����Ŭ������ ��ü�� = new �ܺ�Ŭ���� ������(), ����Ŭ����������();
		//							�ܺ�Ŭ������ü, ����Ŭ����������();
		// ����Ŭ���� ��ü�� �޼��� ȣ��
		// i.InnerMethod();
		
		// instance Ŭ����
		// �ܺ�Ŭ�������� ���������ġ�� ����
		// Ŭ���� ���ο��� �ν��Ͻ����ó�� �ٷ�����, �ν��Ͻ� ������ ��ȣ�ۿ� ����

		// static Ŭ���� (����(static) �޼���)
		// �ܺ�Ŭ�������� ���������ġ������ / �޼��忡 static Ű���带 ����Ͽ� ����
		// Ŭ���� ���ο��� ����ƽ ���ó�� �ٷ����� �ٸ� ������ ��ȣ�ۿ� ����.
		// static�޼��忡�� �ν��Ͻ� ������ ����� �� ����.
		// Ŭ���� ��ü�� �������� �ʰ� Ŭ���� �̸��� "."�� �� ������ ���ִ�.
		
		// local Ŭ����
		// �޼��� ���� �������� ��ġ�� ����
		// �޼��峪 �ʱ�ȭ����� ���ο��� �ٷ����� ����� ���� ���ο��� ���

		OuterClass oc= new OuterClass();
		System.out.println("OuterClass�� a�� ��: " + oc.a);
		System.out.println("OuterClass�� b�� ��: " + OuterClass.b);
		
		System.out.println("===inner Ŭ���� �����ϱ� ====");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner�� c�� ��:" + i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� �� :" +si.d);
		
		si.staticMethod(); // ��ü�� ������� �ʰ� Ŭ�������� ����ؼ� ȣ�Ⱑ��
		OuterClass.StaticInner.staticMethod();
}}

class OuterClass{
	int a=3; 
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
	}	
}
	
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}