package day_02;

public class D_Switch_01 {
	public static void main(String[] args) {
		// switch-case ���� if�� ���� �ڵ尡 �� �����ϰ� �ۼ������ϴ�.
		// ���ǽ��� ����� ���� �Ǵ� ���ڿ� ���̰� �� ���� ���� ���๮�� �����ɶ� ���
		
		int month = 10;
		int day;
		
		switch(month) { // ()�ȿ��� ������ ����.
			case 1:	case 3:	case 5:	case 7:	case 8:
			case 10: case 12:
				day = 31;
				break; // break�� ���������� ��ν����.
			case 2:
				day = 28;
				break;
				
			case 4: case 6: case 9: case 11:
				day=30;
				break;
			default:
				day = 0;
				break;
		}
		System.out.println(month + "����" + day + "�� ���� �ֽ��ϴ�.");

	}}
