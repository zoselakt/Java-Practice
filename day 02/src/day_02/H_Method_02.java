package day_02;

public class H_Method_02 {
	public static void main(String[] args) {
		// �޼ҵ� �����ε�
		// �Ű������� ������ Ÿ���� �ٸ����� �̸��� ���� �޼��带 ������ ���� �ϴ°�.
		// ���� Ŭ������ �ż��带 ������ �����Ͽ� ���� �ٸ� ����� ����
		// �����ε� : over�ؼ� �����Ͽ���( �޼��� �ߺ�����)
		
		// �޼ҵ��� �̸��� ���ƾ� �ϸ�, �����̸��� �Լ��� ������ �ߺ��Ͽ� ���ǰ���
		// �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
		// �Ű������� ���� ����Ÿ���� �ٸ����� �����ε��� �������� �ʴ´�.
		
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
		
	//��Ģ���� �����ϱ�
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
/*
public int getAdd(int i, int j) {
	return i+j;
}

public int getAdd(int i, int j, int k) { ������ ��ȭ
	return i+j+k;
}
	
public double getAdd(double i, int j, int k) { ��ȯŸ�� ��ȭ
	return (int) i+j+k;
}

public double getAdd(int i, double j, int k) { ��ȯŸ�� ��ȭ
	return (double) i+j+k;
}
*/
	