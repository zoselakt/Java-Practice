package day_06;

class MyThread8 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t3:" +i);
		}
		System.out.println("<<t1�Ϸ�>>");
	}
}
class MyThread9 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t4:" +i);
		}
		System.out.println("<<t4�Ϸ�>>");
	}
}

// ����
public class Thread_03 {
	public static void main(String[] args) {
		// join : Ư���� �����尡 �۾��� ���������Ҷ� ���
		
		MyThread8 s3 = new MyThread8();
		MyThread9 s4 = new MyThread9();
		Thread t3=new Thread(s3);
		Thread t4=new Thread(s4);
		t3.start();
		try {
			t3.join();
		}catch(InterruptedException ie) {System.out.println(ie.toString()); }
		t4.start();
		try {
			t4.join();
		}catch(InterruptedException ie) {System.out.println(ie.toString()); }
		
	for(int i =0; i<10; i++) {
		System.out.println("���ν�����:" +i);
		}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");		
	// yield() : �ڽ��� �ð��� �纸�ϴ� �޼��� 
	//           �����尡 �۾��� yield�� ������ �ڽſ��� �Ҵ�� �ð��� �������ʿ� �絵
	
	MyThread6 s1= new MyThread6();
	MyThread7 s2= new MyThread7();
	Thread t1=new Thread(s1);
	Thread t2=new Thread(s2);
	
	t1.start();
	t2.start();
	
	}
} //��������

class MyThread6 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("��");
			Thread.yield();
		}}}
class MyThread7 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("��");
		}}}
