package day_05;

import java.text.DecimalFormat;

public class BigDecimal_01 {
	public static void main(String[] args) {
		// BigDecimal 클래스 : 정확한 소수점 연산을 해야할 때 사용 / 소수점 연산시 오차가 나는 부분을 보완
		// BigDecimal 변수명 = new BigDecimal(string.valueOf(실수 변수명));
		
		// formatting : 데이터의 형식을 지정하는 것
		// BigDecimalFormat : 숫자를 형식화하는 클래스
		// # -있으면 출력 /0 - 없으면 0으로 채움 / . - 소수점 / - - 음수기호 / , - 콤마 넣음 /E- 지수기호/% - 퍼센트
		
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
