package day_01;


public class Z_Practice1 {
	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		try {			
			System.out.println(intArray[0]);
			System.out.println(intArray[5]);
			return;
		}catch(Exception e) {
			System.out.println("intArray�迭�� ũ���" + intArray.length+"�Դϴ�.");
		}
		finally {
			System.out.println("�׻� ����Ǵ� �ڵ�");
		}
	}
}

