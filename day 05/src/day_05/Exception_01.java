package day_05;

public class Exception_01 {
	public static void main(String[] args) {
		// ����ó��
		// ������ ����: �����Ͻ� �߻��ϴ� ���� / ��Ÿ, �߸��� �ڷ��� ��
		// ��Ÿ�� ����: ���α׷� ���൵�߿� �߻��ϴ� ����
		// ���� ����: ������ ������ �ǵ��� �ٸ��� �����ϴ� ����
		// ����: �ٸ� ������� ó�������� ���� / �Է°�����, ��Ʈ��ũ ���� ��
		
		// try- catch ��
		// try{
//				���ܰ� �߻��� �� �ִ� ���;
		// }
		// catch(�߻��� �� �ִ� ���� Ŭ������) {
		// 			���ܹ߻��� ������ ���:
		//								}
			// �ܺη� ����
			int a=0;
			int b=2;
			try {
				System.out.println("�ܺη� ����");
				int c=b/a;
			}
		
		catch(ArithmeticException e) {
			System.out.println("������� �߻�");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭 ���� ���� �߻�");
//		}
		
		//finally �� : ���������� �߰��� �� �ִ� �������� ������ �߻��ϵ� ���� �ʵ� ������ �����ϴ� ����
		//finally {
		//				������ �����ϴ� ����
		//									}
		// finally�� N/W ����� �ܺο��� ������ �����ϴ� �۾��� �ַ� ���
		finally {
			System.out.println("������ ���� ����");
		}
	}
}
