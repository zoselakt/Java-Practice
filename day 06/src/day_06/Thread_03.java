package day_06;

public class Thread_03 {
	public static void main(String[] args) {
		// �������� ����������Ŭ
		// new : �����尡 �ν��Ͻ�ȭ �� ����
		// Runnable : ������ ���ִ� ���·� ����ϰԵǸ� �����ٷ��� ���� ���õǸ� run()�޼��带 �ٷ� ����
		// Blocked : sleep, join�޼��带 ȣ���ϰ� �Ǹ�, �����췯�� ���ؼ� ���ù��� �� ����.
		// Dead : �Ҵ���� �޸𸮿� ���� ��� �����ȴ�.
		SleepThread	t= new SleepThread();
		t.start();
	}
}

class SleepThread extends Thread{
	public void run() {
		System.out.println("ī��Ʈ �ٿ� 5��");
		for(int i=5; i>=0; i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ie) {
					System.err.println(ie.toString());
				}
			}
		}
		System.out.println("����");
	}
}