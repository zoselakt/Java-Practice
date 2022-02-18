<<<<<<< HEAD
package day_04;

import java.time.LocalDate;
import java.util.Calendar;

public class API_02 {
	public static void main(String[] args) {
		// java.time 패키지
		// java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) 클래스: 날짜와 시간을 같이 나타내고 싶을때 LocalDatetime
		// 현재 날짜 지정 : now() 메서드 / 
		// 특정 날짜 지정: of() 메서드
		
		// ZonedDateTime 클래스: ISO-8601 달력시스템에서 정의하는 날짜와 시간 저장
		// Instant클래스: 1970sus 1월 1일부터 현재까지의 시간을 세는 클래스
		
		// LocalDate : 모두 (get) 포함 year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get 없음 isLeapYear (윤년여부)
		// LocalTime : 모두 (get) 포함 Hour / Minute / Second / Nano
		
		// 모두 (with) 포함 : year(int) -년 변경/ Month(int) - 월 변경 
		//                  withDayOfMonth(int) - 월의 일변경 / withDayOfYear(int) - 년의 일 변경
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
			

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");	
			
		// 자바유틸리티 (유틸 패키지)
		// 자바프로그래밍에 유용한 클래스를 모아둔 것.
		
		// 시간처리
		// system.currentTimeMills() : 현재 운영체제의 시각을 long타입으로 반환
		
		// (import) java.util.Calendar : java에서 제공하는 날짜관리 클래스 
		// 추상클래스이므로 getInstance 메서드로 객체생성
		// 싱글턴 패턴: 객체사용시마다 인스턴스를 생성하는 것이 아니라 하나의 인스턴스로 사용하는 방법
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1월:0 ~ 12월 :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.print("오늘 날짜는?");
		
		// (import) java.util.date : 기본제공 클래스이지만 거의사용 X
		// (import) java.text.SimpleDateFormat : y : 년도 / M :월 / D :일 / E: 요일
		// a : 오전/오후 / H : 시간 / m : 분 / s : 초
		
	}

}
=======
package day_04;

import java.time.LocalDate;
import java.util.Calendar;

public class API_02 {
	public static void main(String[] args) {
		// java.time 패키지
		// java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) 클래스: 날짜와 시간을 같이 나타내고 싶을때 LocalDatetime
		// 현재 날짜 지정 : now() 메서드 / 
		// 특정 날짜 지정: of() 메서드
		
		// ZonedDateTime 클래스: ISO-8601 달력시스템에서 정의하는 날짜와 시간 저장
		// Instant클래스: 1970sus 1월 1일부터 현재까지의 시간을 세는 클래스
		
		// LocalDate : 모두 (get) 포함 year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get 없음 isLeapYear (윤년여부)
		// LocalTime : 모두 (get) 포함 Hour / Minute / Second / Nano
		
		// 모두 (with) 포함 : year(int) -년 변경/ Month(int) - 월 변경 
		//                  withDayOfMonth(int) - 월의 일변경 / withDayOfYear(int) - 년의 일 변경
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
			

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");	
			
		// 자바유틸리티 (유틸 패키지)
		// 자바프로그래밍에 유용한 클래스를 모아둔 것.
		
		// 시간처리
		// system.currentTimeMills() : 현재 운영체제의 시각을 long타입으로 반환
		
		// (import) java.util.Calendar : java에서 제공하는 날짜관리 클래스 
		// 추상클래스이므로 getInstance 메서드로 객체생성
		// 싱글턴 패턴: 객체사용시마다 인스턴스를 생성하는 것이 아니라 하나의 인스턴스로 사용하는 방법
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1월:0 ~ 12월 :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.print("오늘 날짜는?");
		
		// (import) java.util.date : 기본제공 클래스이지만 거의사용 X
		// (import) java.text.SimpleDateFormat : y : 년도 / M :월 / D :일 / E: 요일
		// a : 오전/오후 / H : 시간 / m : 분 / s : 초
		
	}

}
>>>>>>> 8999bce87c9d76d45fcf36eb9d488d788b0aa462
