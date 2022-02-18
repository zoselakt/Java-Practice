<<<<<<< HEAD
package day_04;

import java.time.LocalDate;
import java.util.Calendar;

public class API_02 {
	public static void main(String[] args) {
		// java.time ��Ű��
		// java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) Ŭ����: ��¥�� �ð��� ���� ��Ÿ���� ������ LocalDatetime
		// ���� ��¥ ���� : now() �޼��� / 
		// Ư�� ��¥ ����: of() �޼���
		
		// ZonedDateTime Ŭ����: ISO-8601 �޷½ý��ۿ��� �����ϴ� ��¥�� �ð� ����
		// InstantŬ����: 1970sus 1�� 1�Ϻ��� ��������� �ð��� ���� Ŭ����
		
		// LocalDate : ��� (get) ���� year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get ���� isLeapYear (���⿩��)
		// LocalTime : ��� (get) ���� Hour / Minute / Second / Nano
		
		// ��� (with) ���� : year(int) -�� ����/ Month(int) - �� ���� 
		//                  withDayOfMonth(int) - ���� �Ϻ��� / withDayOfYear(int) - ���� �� ����
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
			

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");	
			
		// �ڹ���ƿ��Ƽ (��ƿ ��Ű��)
		// �ڹ����α׷��ֿ� ������ Ŭ������ ��Ƶ� ��.
		
		// �ð�ó��
		// system.currentTimeMills() : ���� �ü���� �ð��� longŸ������ ��ȯ
		
		// (import) java.util.Calendar : java���� �����ϴ� ��¥���� Ŭ���� 
		// �߻�Ŭ�����̹Ƿ� getInstance �޼���� ��ü����
		// �̱��� ����: ��ü���ø��� �ν��Ͻ��� �����ϴ� ���� �ƴ϶� �ϳ��� �ν��Ͻ��� ����ϴ� ���
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1��:0 ~ 12�� :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");
		System.out.print("���� ��¥��?");
		
		// (import) java.util.date : �⺻���� Ŭ���������� ���ǻ�� X
		// (import) java.text.SimpleDateFormat : y : �⵵ / M :�� / D :�� / E: ����
		// a : ����/���� / H : �ð� / m : �� / s : ��
		
	}

}
=======
package day_04;

import java.time.LocalDate;
import java.util.Calendar;

public class API_02 {
	public static void main(String[] args) {
		// java.time ��Ű��
		// java.time.format / java.time.chrono / java.time.temporal / java.time.zone

		// LocalDate(Time) Ŭ����: ��¥�� �ð��� ���� ��Ÿ���� ������ LocalDatetime
		// ���� ��¥ ���� : now() �޼��� / 
		// Ư�� ��¥ ����: of() �޼���
		
		// ZonedDateTime Ŭ����: ISO-8601 �޷½ý��ۿ��� �����ϴ� ��¥�� �ð� ����
		// InstantŬ����: 1970sus 1�� 1�Ϻ��� ��������� �ð��� ���� Ŭ����
		
		// LocalDate : ��� (get) ���� year /Month / MonthValue /DayOfYear /DayOfMonth/DayOfWeek
		//             get ���� isLeapYear (���⿩��)
		// LocalTime : ��� (get) ���� Hour / Minute / Second / Nano
		
		// ��� (with) ���� : year(int) -�� ����/ Month(int) - �� ���� 
		//                  withDayOfMonth(int) - ���� �Ϻ��� / withDayOfYear(int) - ���� �� ����
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
			

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");	
			
		// �ڹ���ƿ��Ƽ (��ƿ ��Ű��)
		// �ڹ����α׷��ֿ� ������ Ŭ������ ��Ƶ� ��.
		
		// �ð�ó��
		// system.currentTimeMills() : ���� �ü���� �ð��� longŸ������ ��ȯ
		
		// (import) java.util.Calendar : java���� �����ϴ� ��¥���� Ŭ���� 
		// �߻�Ŭ�����̹Ƿ� getInstance �޼���� ��ü����
		// �̱��� ����: ��ü���ø��� �ν��Ͻ��� �����ϴ� ���� �ƴ϶� �ϳ��� �ν��Ͻ��� ����ϴ� ���
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1��:0 ~ 12�� :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");
		System.out.print("���� ��¥��?");
		
		// (import) java.util.date : �⺻���� Ŭ���������� ���ǻ�� X
		// (import) java.text.SimpleDateFormat : y : �⵵ / M :�� / D :�� / E: ����
		// a : ����/���� / H : �ð� / m : �� / s : ��
		
	}

}
>>>>>>> 8999bce87c9d76d45fcf36eb9d488d788b0aa462
