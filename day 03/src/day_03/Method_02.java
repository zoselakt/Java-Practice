package day_03;

public class Method_02 {
	public static void main(String[] args) {
		// �޼ҵ� �����ε�
		// �����̸��� �Լ��� ������ �ߺ��Ͽ� ���ǰ���
		// �Ű������� ������ Ÿ���� �ٸ��� �ϸ� �ۼ�����
		// �޼ҵ��� �̸��� ���ƾ� �ϸ�, �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
			sum(10, 20);
			sum(1.23, 3.12);
			sum(10,20,30);
	}
	//�޼����� �Ű����� Ÿ�Կ� ��ȭ
	static void sum(int x, double y) {
		System.out.println((x+y));	}
	
	static void sum(double x, double y) {
		System.out.println(x+y);	}
	
	// �޼����� �Ű����� ������ ��ȭ
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);	
		
	
	System.out.println("sum(10, 20):" +sum(10, 20));
	System.out.println("sub(10, 20):" +sub(10, 20));
	System.out.println("mul(10, 20):" +mul(10, 20));
	System.out.println("div(10, 20):" +div(10, 20));
	}
	
	static int sum(int x, int y) {return x+y;}
	static int sub(int x, int y) {return x-y;}
	static int mul(int x, int y) {return x*y;}
	static int div(int x, int y) {return x/y;}
}
