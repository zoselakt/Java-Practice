package day_04;

public class API_05{
	/*
	public static final int PLATINUM_MEMBER = 1;
	public static final int GOLD_MEMBER = 2;
	public static final int SILVER_MEMBER = 3;
	public static final int BRONZE_MEMBER = 4;
	*/
	
	public static void main(String[] args) {
		//enum Ŭ����: ������ Ŭ���� / ������ ������� ����
		// �����ڸ� ������ �ִ� / ���������ڴ� private�� ������.
		// �������Ҷ� �ڵ����� �����ڸ� ������ش� / �����ڷ� ��ü�� ������ �� ����.
		// enumŬ������ value�޼ҵ带 ȣ���ϸ� enumŬ������ ��� ����� �����Ѵ�.
		
		/*
		ȸ����� ������
		1. �÷�Ƽ��
		2. ���
		3. �ǹ�
		4. �����
		*/

		/*
		A grade = A.PLATINUM_MEMBER;
		switch (grade) {
		case PLATINUM_MEMBER:
			System.out.println(30+"% ����");
			break;
		case GOLD_MEMBER:
			System.out.println(20+"% ����");
			break;
		case SILVER_MEMBER:
			System.out.println(10+"% ����");
			break;
		case BRONZE_MEMBER:
			System.out.println(5+"% ����");
			break;
		}*/
		
		A a = A.GOLD_MEMBER;
		System.out.println(a);
		String str = a.getDiscount();
		System.out.println(str);
		System.out.println("============================");
		for(A ar : a.values()) {
			System.out.println(ar + ": " + ar.getDiscount());
		}
//����		
}}
/*
interface LEVEL{
	int PLATINUM_MEMBER = 1,  GOLD_MEMBER = 2, SILVER_MEMBER = 3, BRONZE_MEMBER = 4;
}*/

enum A{
	PLATINUM_MEMBER(30),  GOLD_MEMBER(20), SILVER_MEMBER(10), BRONZE_MEMBER(5); //
	int discount;
	A(int discount){
		this.discount = discount;
	}
	public String getDiscount() {
		return discount + "% ����";
	}
	/*
	A(){
		System.out.println("������ ���: "+this); //ȸ����޸�ŭ ����
	}
	*/
}