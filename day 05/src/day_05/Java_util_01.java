package day_05;

import java.util.Calendar;

public class Java_util_01 {
	public static void main(String[] args) {
		// �ڹ���ƿ��Ƽ
		// �ڹ����α׷��ֿ� ������ Ŭ������ ��Ƶ� ��.
		
		// �ð�ó��
		// system.currentTimeMills() : ���� �ü���� �ð��� longŸ������ ��ȯ
		
		// (import) java.util.Calendar : java���� �����ϴ� ��¥���� Ŭ���� / �߻�Ŭ�����̹Ƿ� getInstance �޼���� ��ü����
		// �̱��� ����: ��ü���ø��� �ν��Ͻ��� �����ϴ� ���� �ƴ϶� �ϳ��� �ν��Ͻ��� ����ϴ� ���
		//
		Calendar a= Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1; // 1��:0 ~ 12�� :11
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");
		System.out.print("���� ��¥��?");
		// (import) java.util.date : �⺻���� Ŭ���������� ���ǻ�� X
		// SimpleDateFormat : y : �⵵ / M :�� / D :�� / E: ����
		// a : ����/���� / H : �ð� / m : �� / s : ��
	}

}
