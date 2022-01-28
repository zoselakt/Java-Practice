package day_05;

import java.util.Calendar;

public class Java_util_01 {
	public static void main(String[] args) {
		// 자바유틸리티
		// 자바프로그래밍에 유용한 클래스를 모아둔 것.
		
		// 시간처리
		// system.currentTimeMills() : 현재 운영체제의 시각을 long타입으로 반환
		
		// (import) java.util.Calendar : java에서 제공하는 날짜관리 클래스 / 추상클래스이므로 getInstance 메서드로 객체생성
		// 싱글턴 패턴: 객체사용시마다 인스턴스를 생성하는 것이 아니라 하나의 인스턴스로 사용하는 방법
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1월:0 ~ 12월 :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.print("오늘 날짜는?");
		// (import) java.util.date : 기본제공 클래스이지만 거의사용 X
		// SimpleDateFormat : y : 년도 / M :월 / D :일 / E: 요일
		// a : 오전/오후 / H : 시간 / m : 분 / s : 초
	}

}
