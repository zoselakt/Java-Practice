package day_01;

public class Z_Practice1 {

	public static void main(String[] args) {
		
		Z_Practice vo1 = new Z_Practice();
		Z_Practice vo2 = new Z_Practice("ȫ�浿", true, "1���Դϴ�.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
		
		Z_Practice vo3 = new Z_Practice("������", false, "�̻��̿���");
		System.out.println(vo3);
		
		vo2.count =100;
		System.out.println(vo3.count);
		
		System.out.println(vo2.getName());
		vo2.setName("�Ӳ���");
		System.out.println(vo2.getName());
		
		
		
	}

}

