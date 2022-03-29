package day_06;

class MyThread3 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("<" + Thread.currentThread().getName()+ ">");
		}
		for(int i=0; i<1000; i++);
	}	
}

//����
public class Thread_02 {
	public static void main(String[] args) {
		// �������� �켱����  1~10���� �ο�����
		// �켱���� ���� �޼���
		// void setPriorty(int newPriority) : �켱���� ����
		// int getPriority() : �켱������ȯ
		// �۾������ �߿��� ������� ����ϰ� ������, �߿��� �۾��� �켱������ ���� �ָ��
		
		Runnable t = new MyThread3(); //�� ĳ����
		Thread t1 = new Thread(t, "thread1");
		t1.setPriority(1); // �켱���� 1�� ����
		System.out.println("t1�� �켱������:" + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		System.out.println("t2�� �켱������:" + t2.getPriority()); //��������x �� �켱����: 5 ����Ʈ
		
		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);
		System.out.println("t3�� �켱������:" + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
		
		// �������� ����������Ŭ
		// new : �����尡 �ν��Ͻ�ȭ �� ���� /Runnable�� �� �� �ִ� ����
		// Runnable : start() �޼��尡 ȣ��Ǹ� new ���¿��� Runnable ���°� �ȴ�.
		//            Runnable���°� �Ǹ� ������ ���ִ� ���·� ����ϰԵǸ� �����ٷ��� ���� ���õǸ� run()�޼��带 �ٷ� ����
		// Blocked : �������� �����尡 sleep, join�޼��带 ȣ���ϰ� �Ǹ�, Blocked���°��ȴ�. 
		//           Blcoed���°� �Ǹ� �����췯�� ���ؼ� ���ù��� �� ����.
		// Dead : run()�޼����� ������ ��� �Ϸ��ϰ� �Ǹ� ������� Dead ���°��ȴ�. �Ҵ���� �޸𸮿� ���� ��� �����ȴ�

		SleepThread	s= new SleepThread();
		s.start();
		
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
