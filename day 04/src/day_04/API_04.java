package day_04;


public class API_04 {
	public static void main(String[] args) {
		// object Ŭ���� 
		// �ֻ��� Ŭ�����̸�, ��� Ŭ������ �⺻������ object�� ��ӹް� �ִ�.
		// Ŭ�����μ� ������ �־���� �⺻���� ����� �����ϱ� ���ؼ� �⺻������ objectŬ������ ����ϰ� �ִ�.
		// clone() / equals() / finalize() / getClass() / hashcode() / notify() 
		// notufiAll() / toString() / wait() / wait(longtimeout) / wait(longtimeout, int nanos)
		
		// �ַ� ����ϴ� �޼���
		// toString()�޼ҵ�: ���� ��ü�� ��Ÿ���� ���ڿ��� ��ȯ
		// toStrign()�޼ҵ尡 �ڵ����� ȣ��Ǵ� ���
		// System.out.println()�޼ҵ忡 ��ü�� �Ű������� ���� ���
		// ��ü�� ���ڿ� ���ϱ� ������ �ϴ� ���
		
		// equals()�޼ҵ�: ������ ��ü�� ���� ��ü�� ������ Ȯ��
		// hashcode()�޼ҵ�: ��ü�� �ؽ��ڵ� ���� ����
		
		// toString ����
			API_04 obj = new API_04();
			obj.toStringFunc(obj);
			
System.out.println("====================================");			
		// Equals ����
			
		// equals�޼ҵ尡 objectŬ������ �ִ� ���� �ּҰ��� ���Ѵ�.
		// String ��ü�� equals �޼ҵ�� �������̵� �� �޼ҵ忩�� ������ ���Ѵ�.
			
		String str1 = new String("���� �ڹ�");
		String str2 = "���� �ڹ�";
					
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� ����");
		}else {
			System.out.println("���� �ٸ���.");
		}

		Value va1 = new Value(10);
		Value va2 = new Value(10);
			
		if(va1.equals(va2)) {
			System.out.println("va1�� va2�� ���� ����");
		}else {
			System.out.println("va1�� va2�� ���� �ٸ���.");
		}
		
System.out.println("====================================");		
		//hash�ڵ� / ������ ���� ��� ��°��� ����
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//hash�ڵ� / ������ �ٸ���� ��°��� �ٸ�
		System.out.println(va1.hashCode());
		System.out.println(va2.hashCode());
	
//����
	}
	
	//toString ����
	public void toStringFunc(API_04 obj) {
		System.out.println(this);
		System.out.println(toString()); // toString
		System.out.println("����" + this);
	}
	// toString ����
	public String toString() {
		return "toString ����";
	}
}

// Equals ����
class Value{
	int a;
	public Value(int a) {
		this.a = a;
	}
}
