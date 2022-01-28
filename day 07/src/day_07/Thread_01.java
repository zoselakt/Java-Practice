package day_07;

public class Thread_01 {
	public static void main(String[] args) {
		// thread : �ϳ��� ���μ��� �ȼ��� �ΰ��� �̻��� ���� �ϵ��� �ϴ°�.
		// ���μ��� : �������� ���α׷�
		// ������ : ���μ������� �۾��� �����ϴ� ��.
		// ��Ƽ ������ ���μ��� : �ΰ��� �̻��� �۾��� �ϴ� ���μ���
		
		// ������ ���� : Thread Ŭ���� ��� / Runnable �������̽� ����
		// Thread Ŭ���� ���
		// class T1 extends thread{
		// 			public void run(){ 
		//								�۾��� ����
		// 							}
		//  }
		
		// Runnable �������̽� ����
		// class T2 implements Runnable{
		// 			public void run(){ 
		//								�۾��� ����
		// 							}
		//  }
		
		// ������ �ڵ� �����ϵ��� JVM��û
		// Tread Ŭ������ ��ӹ��� Ŭ����
		// Th1 t1 = new Th1(); �� �ν��Ͻ� ����
		// t1.start();
		
		// Runnable �������̽� ������ Ŭ����
		// Th2 t2 = new Th2();
		// Thread t= new Thread(t2):
		// 
		// t.start();
		
		// JVM ������ ��û
		// 1) ������ Ŭ���� ��ӹ��� Ŭ������ �����带 ��û
		MyThread th1=new MyThread();
		th1.start();
		// 2) Runnable �������̽��� ������ Ŭ������ �����带 ��û
		MyThread2 th2 =new MyThread2();
		Thread t = new Thread(th2);
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
		for(int i=0; i<10;i++) {
			System.out.println("������ ������" + i);
		}
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("���ʺ� ������" + i);
		}	
	}
}
