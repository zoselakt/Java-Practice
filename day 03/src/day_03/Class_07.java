package day_03;

public class Class_07 {
	public static void main(String[] args) {
		// �������̽� : ��ȣ�ۿ� �� ���ֵ��� �ϴ� �Ű�����
		// Ŭ����- ���赵 / �������̽�-�԰�
		// ����� ����
		
		// �������̽��� ���
		// ��� : final Ÿ�� ������ = ��;
		// �߻�޼��� : abstract ���� Ÿ�� �޼��� ��();
		
		// �������
		// interface �������̽��� {
		// 		�ʵ�(���)
		// }
		
		// interface �������̽��� {
		//
		//	}
		// class Ŭ������ implements �������̽���{
		//		�߻�޼��� ����
		// }
		
		// ������ ��.
		// �������̽� �� �Ϲݸ޼��� �Ұ�
		// �������̽� �� �����Ұ� (����� ����)
		// �������̽��� ��ü �����Ұ�.
		
		
		// �������̽��� ���߱���
		// �������̽��� ����Ͽ� ����������� ���ǵ� �������̽��� ���߱���
		// class Ŭ������ implements ����1, ����2, ����3 ...{
		// 		��� �߻� �޼��� ����
	    // }
		
		// ����
		// interface �������̽�1{}
		// interface �������̽�2{}
		// interface �������̽�3{}
		
		// class Ŭ������ implements �������̽�1, �������̽�2, �������̽�3...{
		//			��� �߻�޼��� ����
		// }
		
		MyCellPhone phone1=new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3= new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5=new MyCellPhone();
		PhoneUser user1=new PhoneUser();
		
		user1.call(phone1); // O
		//user1.call(phone2); // X �������̽� ���� ����
		user1.call(phone3); // O
		//user1.call(phone4); // X �������̽� ���� ����
		//user1.call(phone5); // X �������̽� ���� ����	
	}
}

interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock{
	@Override
	public void clock() {
		System.out.println("clock()");
	}
	@Override
	public void write() {
		System.out.println("write");
	}
	@Override
	public void calling() {
		System.out.println("calling");
	}
	@Override
	public void photo() {
		System.out.println("photo");
	}
}
class PhoneUser{
	void call(Call c) {
		System.out.println("��ȭ�� �ɾ����ϴ�.");
	}
}