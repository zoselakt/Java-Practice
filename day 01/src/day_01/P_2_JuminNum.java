package day_01;

import java.util.Scanner;

public class P_2_JuminNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리를 '-'없이 입력하세요");
		String juminNo = sc.nextLine();
		
// 주민등록번호: 8  3  0  4  2  2  1  1  8  5  6  0  0 		
//           *  *  *  *  *  *  *  *  *  *  *  *   
// 가중치 :    2  3  4  5  6  7  8  9  2  3  4  5
//			 =  =  =  =  =  =  =  =  =  =  =  = 
//           16 9  0 20 12 14  8  9  16 15 24 0 = 143
		
// 143 % 11 = 0    11 - 0 = 11  11에서 나머지를 뺀 결과가 2자리면 10자리는 버리고 1자리만 취한다.
//            1         1 = 10
//            2         2 =  9
		
		String check = "234567892345";
		int sum = 0;
		for(int i=0; i<12; i++) {
//		sum += (juminNo.charAt(i)-48) * (check.charAt(i) - '0'); // 문자를 곱셈연산하면 문자의 유니코드 값으로 곱한다.
		sum += (juminNo.charAt(i) - 48) * (i < 8 ? i+2 : i-6);
		}
		int result = (11 - sum % 11) %10;
		if(result == juminNo.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
	}
}
