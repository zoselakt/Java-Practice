package day_06;

public class Thread_04 {
	public static void main(String[] args) {
		// yield() : �ڽ��� �ð��� �纸�ϴ� �޼��� / �۾��� yield�� ������ �ڽſ��� �Ҵ�� �ð��� �������ʿ� �絵
		
		MyThread6 s1= new MyThread6();
		MyThread7 s2= new MyThread7();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		
		t1.start();
		t2.start();

	}
}
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