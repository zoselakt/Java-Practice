package day_07;

public class Thread_02 {
	public static void main(String[] args) {
		// �������� �켱����  1~10���� �ο�����
		// �켱���� ���� �޼���
		// void setPriorty(int newPriority) : �켱���� ����
		// int getPriority() : �켱������ȯ
		// �۾������ �߿��� ������� ����ϰ� ������, �߿��� �۾��� �켱������ ���� �ָ��
		Runnable t = new MyThread3();
		Thread t1 = new Thread(t, "thread1");
		t1.setPriority(1);
		System.out.println("t1�� �켱������:" + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		System.out.println("t2�� �켱������:" + t2.getPriority());
		
		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);
		System.out.println("t3�� �켱������:" + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread3 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("<" + Thread.currentThread().getName()+ ">");
		}
		for(int i=0; i<1000; i++);
	}	
}