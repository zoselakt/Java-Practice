package day_06;

public class Thread_01 {
	public static void main(String[] args) {
		// thread : �ϳ��� ���μ��� �ȿ��� �ΰ��� �̻��� ���� �ϵ��� �ϴ°�.
		// ���μ��� : ���������� ����ǰ� �ִ� ���α׷�
		// ������ : ���μ������� �۾��� �����ϴ� ��.
		// ��Ƽ ������ ���μ��� : �ΰ��� �̻��� �۾��� �ϴ� ���μ���
		
		// ���μ����� ����Ǵ� ���
		// �ð� ���� ���: ��� ���μ������� ������ �ð��� �Ҵ��ϰ� ���� ����Ǵ� ���
		// ������ ���: ������ ���μ������� �켱 ������ �ο��ϰ� �켱������ ���� ������ ����Ǵ� ���
		
		// 1.������ ���� : 1) Thread Ŭ���� ��� / 2) Runnable �������̽� ����
		// Thread Ŭ���� ���
		// class T1 extends thread{
		// 			public void run(){ /run�޼��� �������̵�
		//					�۾��� ����
		// 					}
		//  }
		
		// Runnable �������̽� ����
		// class T2 implements Runnable{
		// 			public void run(){ /run�޼��� �������̵� �ʼ�
		//					�۾��� ����
		// 					}
		//  }
		
		// 2. ������ �ڵ� �����ϵ��� JVM��û : 1) ThreadŬ������ ��ӹ��� Ŭ���� / 2)Runnable�������̽� ������ Ŭ����
		// Thread Ŭ������ ��ӹ��� Ŭ����
		// Th1 t1 = new Th1(); �� �ν��Ͻ� ����
		//
		// t1.start();
		
		// Runnable �������̽� ������ Ŭ����
		// Th2 t2 = new Th2();
		// Thread t= new Thread(t2):
		// 
		// t.start();
		
		// JVM ������ ��û
		// 1) ������ Ŭ���� ��ӹ��� Ŭ������ �����带 ��û
		MyThread th1 = new MyThread();
		th1.start();
		// 2) Runnable �������̽��� ������ Ŭ������ �����带 ��û
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2); // Thread(Runnable target)
		t.start();
		
		for(int i =0; i<10; i++) {
			System.out.println("�����Լ�������~" + i);
		}
	}
}

// ������ Ŭ���� ��ӹ޾� �۾��� ����
class MyThread extends Thread{
	// run() �޼��� �������̵�
	public void run() {
		//�����尡 �ؾ��� �۾� ����
		for(int i=0; i<10; i++) {
			System.out.println("������ ������" + i);
		}
	}
}
// Runnable �������̽��� �����Ͽ� �۾��� ����
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("���ʺ� ������" + i);
		}	
	}
}
