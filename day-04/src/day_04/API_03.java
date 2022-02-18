package day_04;

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class API_03 {
	public static void main(String[] args) {
		// Scanner 클래스 : 문자 데이터를 읽어오는데 도움을 주는 클래스
		// Scanner 변수 = new Scanner(System.in); // system.in : 입출력 스트림과 연결
		//  
		
		// scanner 클래스 종류
		// sc.next(): 문자열로 입력받아라 / 스페이스(공백) 전까지 입력을 리턴 
		// sc.nextint(): 정수값으로 입력받아라
		// sc.nextfloat(): 실수값으로 입력받아라
		// sc.nextLine(): 엔터 전까지 모든 문자열을 리턴
		// sc.nextByte(): byte 타입으로 리턴
		// sc.nextShort(): Short 타입으로 리턴
		// sc.nextDouble(): double 타입으로 리턴
		
		// FileInputStream : 파일불러오기
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
		
		// BigDecimal 클래스 : 정확한 소수점 연산을 해야할 때 사용 / 소수점 연산시 오차가 나는 부분을 보완
		// BigDecimal 변수명 = new BigDecimal(string.valueOf(실수 변수명));
		
		// formatting : 데이터의 형식을 지정하는 것
		// DecimalFormat : 숫자를 형식화하는 클래스
		// #- 있으면 출력 /0- 없으면 0으로 채움 / . - 소수점 / - - 음수기호 / , - 콤마 넣음 /E- 지수기호 /% - 퍼센트
		
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
