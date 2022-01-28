package day_05;

import java.time.LocalDate;

public class Java_time_01 {
	public static void main(String[] args) {
		// java.time ��Ű��
		// java.time / java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) Ŭ����: ��¥�� �ð��� ���� ��Ÿ���� ������ LocalDatetime
		// ���� ��¥ ���� : now() �޼��� / 
		// Ư�� ��¥ ����: of() �޼���
		
		// LocalDate : ��� (get) ���� year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get ���� isLeapYear (���⿩��)
		// LocalTime : ��� (get) ���� Hour / Minute / Second / Nano
		
		// ��� (with) ���� : year(int) -�� ����/ Month(int) - �� ���� 
		//                  whitDayOfMonth(int) - ���� �Ϻ��� / withDayOfYear(int) - ���� �� ����
		//                  Hour(int)- �ð�����/ Minute(int)- �� ����/ Second(int)- �� ���� / Nano(int) - ������ ����  
		
		LocalDate ld = LocalDate.now();
		LocalDate new_ld;
		int count = 0;
		
		for(int i=1900; i<2100; i++) {
			new_ld = ld.withYear(i);
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear() + "���� �����Դϴ�.");
				count++;
			}
		}
			System.out.println("1900�� ���� 2100�� ���� ������ ��" + count + "�� �ֽ��ϴ�.");
	}

}
