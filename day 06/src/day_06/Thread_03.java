package day_06;

class MyThread8 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t3:" +i);
		}
		System.out.println("<<t1완료>>");
	}
}
class MyThread9 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t4:" +i);
		}
		System.out.println("<<t4완료>>");
	}
}

// 메인
public class Thread_03 {
	public static void main(String[] args) {
		// join : 특정한 스레드가 작업을 먼저수행할때 사용
		
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
		System.out.println("메인스레드:" +i);
		}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");		
	// yield() : 자신의 시간을 양보하는 메서드 
	//           스래드가 작업중 yield를 만나면 자신에게 할당된 시간을 다음차례에 양도
	
	MyThread6 s1= new MyThread6();
	MyThread7 s2= new MyThread7();
	Thread t1=new Thread(s1);
	Thread t2=new Thread(s2);
	
	t1.start();
	t2.start();
	
	}
} //메인종료

class MyThread6 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("★");
			Thread.yield();
		}}}
class MyThread7 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("☆");
		}}}
