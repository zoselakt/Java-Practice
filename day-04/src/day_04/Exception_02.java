package day_04;

public class Exception_02 {
	public static void main(String[] args) {
		// throw
		// ���Ƿ� ���ܸ� �߻� ��ų�� ����ϴ� ���
		
		// ����
		// Exception e = new Exception("Exception");
		// throw e;
		
		// throws 
		// ���ܰ� �߻����� ��� ���� �޼��� ��� ȣ���� ������ ����ó���� ���� å���� �ѱ�� ��.
		// ����
		// void method() throws Exception { ... }
		
		// ���� ����Ŭ������ ǥ���� �Ұ����� ��� extends�� ��ӽ��� �޾Ƽ� ����Ѵ�.
		try {
			System.out.println("�ܺ� try...");
			
			try {
				System.out.println("���� try...");
				Exception e = new Exception();
				throw e;
			}
			catch(Exception e) {
				System.out.println("(���� try-catch) exception: " + e);
				System.out.println("���ܴ����� �ѹ���");
				throw e;
			}
			finally {
				System.out.println("finally ����");
			}
		}
		catch(Exception e) {
			System.out.println("(�ܺ� try-catch) exception: " + e);
		}
		System.out.println("����");
		
		//�ܺ�try �泻�� try �� ����catch �� ����finally �� �ܺ�catch
	}
}
