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
				System.out.println("��¥ ����");
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
		// �������� (����������)
		// ���� �����Ŭ���� ������ ������ �޼��� �����ڿ� ���� ���� ������ ������ �� �ִ�.
		// private���� ���߰� public���� ó�� / Ŭ������ ���Ἲ ����
		
		Birth day = new Birth();
		
		day.setYear(2022);
		day.setMonth(2);
		day.setDay(30);
		
		
}}
	
		
	
		