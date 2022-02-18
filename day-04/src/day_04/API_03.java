package day_04;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class API_03 {
	public static void main(String[] args) {
		// Scanner Ŭ���� : ���� �����͸� �о���µ� ������ �ִ� Ŭ����
		// Scanner ���� = new Scanner(System.in); // system.in : ����� ��Ʈ���� ����
		//  
		
		// scanner Ŭ���� ����
		// sc.next(): ���ڿ��� �Է¹޾ƶ� / �����̽�(����) ������ �Է��� ���� 
		// sc.nextint(): ���������� �Է¹޾ƶ�
		// sc.nextfloat(): �Ǽ������� �Է¹޾ƶ�
		// sc.nextLine(): ���� ������ ��� ���ڿ��� ����
		// sc.nextByte(): byte Ÿ������ ����
		// sc.nextShort(): Short Ÿ������ ����
		// sc.nextDouble(): double Ÿ������ ����
		
		// FileInputStream : ���Ϻҷ�����
		try {
			FileInputStream fis = new FileInputStream("src//day_05//practice_sample.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");	
		
		// BigDecimal Ŭ���� : ��Ȯ�� �Ҽ��� ������ �ؾ��� �� ��� / �Ҽ��� ����� ������ ���� �κ��� ����
		// BigDecimal ������ = new BigDecimal(string.valueOf(�Ǽ� ������));
		
		// formatting : �������� ������ �����ϴ� ��
		// DecimalFormat : ���ڸ� ����ȭ�ϴ� Ŭ����
		// #- ������ ��� /0- ������ 0���� ä�� / . - �Ҽ��� / - - ������ȣ / , - �޸� ���� /E- ������ȣ /% - �ۼ�Ʈ
		
		String [] pattern = {
				"###.###",
				"000.000",
				"-###.###",
				"0000.00%"};
		double [] arr= {1.3, 3.33, 124.243, 242};
		
		for(int p=0; p<pattern.length;p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("<<<" + pattern[p]+ ">>>");
			for(int i=0;i<arr.length; i++) {
				System.out.println(d.format(arr[i]));
			}
		}
		
	}
}
