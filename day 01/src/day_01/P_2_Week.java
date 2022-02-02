package day_01;

import java.util.Scanner;

public class P_2_Week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 계산할 년, 월, 일을 입력:");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		//입력년도의 전년도 12월 31일 까지 계산한다.
		//4년마다 윤년, 100년마다 1번씩 윤년을 포함하여 계산한다.
		int sum = (year - 1) * 365 + (year -1) / 4 - (year -1) / 100 + (year - 1) / 400; 
		
		//전년도 12월 31일까지 지난 날짜수에 올해 전달까지 지난 날짜를 더한다.
		//for 문 작성
		for(int i=1; i<month; i++) {
			switch (i) {
				case 2:
					sum += year % 4 == 0 && year % 100 ==0 || year %400 == 0 ? 29 : 28;
					break;
				case 4: case 6: case 9: case 11: //짦은달
					sum += 30;
					break;
				default:						//긴달
					sum += 31; 
					break;
			}}
		
		// 배열 작성
/*			int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			d[1] = sum += year % 4 == 0 && year % 100 ==0 || year %400 == 0 ? 29 : 28;
			for(int i=1; i<month; i++) {
				sum += d[i-1];
			}*/

		// 전달까지 지난 날수에 일을 더한다.
		sum += day;
		// 지날날짜의 합계를 7로 나눈 나머지가 0이면 일요일 1-월요일 ... 6 -토요일
		// 스위치문으로 작성
		/*
		switch(sum%7) {
			case 0: System.out.println("일요일"); break;
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
			}	*/
		// 배열로 작성
		
		String week[] = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
//		char week[] = {'일','월','화','수','목','금','토'}
//		System.out.println(week[sum%7]+"요일");
		System.out.println(week[sum%7]);
		
	}		
}
		
