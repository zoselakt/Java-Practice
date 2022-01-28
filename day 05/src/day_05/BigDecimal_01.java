package day_05;

import java.text.DecimalFormat;

public class BigDecimal_01 {
	public static void main(String[] args) {
		// BigDecimal Ŭ���� : ��Ȯ�� �Ҽ��� ������ �ؾ��� �� ��� / �Ҽ��� ����� ������ ���� �κ��� ����
		// BigDecimal ������ = new BigDecimal(string.valueOf(�Ǽ� ������));
		
		// formatting : �������� ������ �����ϴ� ��
		// BigDecimalFormat : ���ڸ� ����ȭ�ϴ� Ŭ����
		// # -������ ��� /0 - ������ 0���� ä�� / . - �Ҽ��� / - - ������ȣ / , - �޸� ���� /E- ������ȣ/% - �ۼ�Ʈ
		
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
