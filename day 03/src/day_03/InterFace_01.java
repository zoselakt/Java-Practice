package day_03;

public class InterFace_01 {
	public static void main(String[] args) {
		// �������̽�
		// Ŭ����- ���赵 / �������̽�-�԰�
		
		// �������̽��� ���
		// ��� : final Ÿ�� ������ = ��;
		// �߻�޼��� : abstract ���� Ÿ�� �޼��� ��();
		
		// �������
		// interFace �������̽��� {
		// ...
		// }
		// class Ŭ������ implements �������̽���{
		//		�߻�޼��� ����
		// }
		
		// ������ ��.
		// �������̽� �� �Ϲݸ޼��� �Ұ�
		// �������̽� �� �����Ұ� (����� ����)
		// �������̽��� ��ü �����Ұ�.
		
		B b=new B();
		b.methodA();
		b.methodB();
	
	}

}

interface Ainter{
	final int x=10;
	int y=20; //final ��������
	abstract void methodA();
	void methodB();  //abstract ��������
}
class B implements Ainter{
	@Override
	public void methodA() {
		System.out.println("methodA()");
	}
	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
}