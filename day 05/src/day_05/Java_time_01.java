package day_05;

import java.time.LocalDate;

public class Java_time_01 {
	public static void main(String[] args) {
		// java.time 패키지
		// java.time / java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) 클래스: 날짜와 시간을 같이 나타내고 싶을때 LocalDatetime
		// 현재 날짜 지정 : now() 메서드 / 
		// 특정 날짜 지정: of() 메서드
		
		// LocalDate : 모두 (get) 포함 year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get 없음 isLeapYear (윤년여부)
		// LocalTime : 모두 (get) 포함 Hour / Minute / Second / Nano
		
		// 모두 (with) 포함 : year(int) -년 변경/ Month(int) - 월 변경 
		//                  whitDayOfMonth(int) - 월의 일변경 / withDayOfYear(int) - 년의 일 변경
		//                  Hour(int)- 시간변경/ Minute(int)- 분 변경/ Second(int)- 초 변경 / Nano(int) - 나노초 변경  
		
		LocalDate ld = LocalDate.now();
		LocalDate new_ld;
		int count = 0;
		
		for(int i=1900; i<2100; i++) {
			new_ld = ld.withYear(i);
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear() + "년은 윤년입니다.");
				count++;
			}
		}
			System.out.println("1900년 부터 2100년 까지 윤년은 총" + count + "번 있습니다.");
	}

}
