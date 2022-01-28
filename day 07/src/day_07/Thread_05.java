package day_07;

public class Thread_05 {

	public static void main(String[] args) {
		// join : Ư���� �����尡 �۾��� ���������Ҷ� ���
		MyThread8 s1 = new MyThread8();
		MyThread9 s2 = new MyThread9();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException ie) {System.out.println(ie.toString()); }
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException ie) {System.out.println(ie.toString()); }
		
	for(int i =0; i<10; i++) {
		System.out.println("���ν�����:" +i);
}}}
class MyThread8 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t1:" +i);
		}
		System.out.println("<<t1�Ϸ�>>");
	}}
class MyThread9 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t2:" +i);
		}
		System.out.println("<<t2�Ϸ�>>");
	}}