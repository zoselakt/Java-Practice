package day_03;

class Birth {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("날짜 오류");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

public class Class_08 {
	public static void main(String[] args) {
		// 정보은닉 (접근제어자)
		// 예약어를 사용해클래스 내부의 변수나 메서드 생성자에 대한 접근 권한을 지정할 수 있다.
		// private으로 감추고 public으로 처리 / 클래스의 무결성 제어
		
		Birth day = new Birth();
		
		day.setYear(2022);
		day.setMonth(2);
		day.setDay(30);
		
		
}}
	
		
	
		