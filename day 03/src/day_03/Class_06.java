package day_03;

public class Class_06 {
	public static void main(String[] args) {
		// �͸�Ŭ����
		// �͸�Ŭ������ ��ȸ���̹Ƿ� ��ü�� �ٽ� �����ϰ� ȣ���ϸ� outerClass�� ���ǵ� �޼��尡 ȣ��
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("���Ӱ� ���ǵ� �͸�Ŭ���� �޼��� �Դϴ�.");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a();  // �͸�Ŭ������ 1ȸ��
}}

class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}