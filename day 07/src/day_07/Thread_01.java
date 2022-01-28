package day_07;

public class Thread_01 {
	public static void main(String[] args) {
		// thread : 하나의 프로세스 안세어 두가지 이상의 일을 하도록 하는것.
		// 프로세스 : 실행중인 프로그램
		// 스래드 : 프로세스에서 작업을 수행하는 것.
		// 멀티 스레드 프로세스 : 두가지 이상의 작업을 하는 프로세스
		
		// 스래드 생성 : Thread 클래스 상속 / Runnable 인터페이스 구현
		// Thread 클래스 상속
		// class T1 extends thread{
		// 			public void run(){ 
		//								작업할 내용
		// 							}
		//  }
		
		// Runnable 인터페이스 구현
		// class T2 implements Runnable{
		// 			public void run(){ 
		//								작업할 내용
		// 							}
		//  }
		
		// 스레드 코드 실행하도록 JVM요청
		// Tread 클래스를 상속받은 클래스
		// Th1 t1 = new Th1(); ← 인스턴스 생성
		// t1.start();
		
		// Runnable 인터페이스 구현한 클래스
		// Th2 t2 = new Th2();
		// Thread t= new Thread(t2):
		// 
		// t.start();
		
		// JVM 스레드 요청
		// 1) 쓰레드 클래스 상속받은 클래스의 스레드를 요청
		MyThread th1=new MyThread();
		th1.start();
		// 2) Runnable 인터페이스를 구현한 클래스의 스레드를 요청
		MyThread2 th2 =new MyThread2();
		Thread t = new Thread(th2);
		t.start();
		
		for(int i =0; i<10; i++) {
			System.out.println("메인함수진행중~" + i);
		}
	}
}
// 쓰래드 클래스 상속받아 작업을 구현
class MyThread extends Thread{
	// run() 메서드 오버라이딩
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("쓰레드 진행중" + i);
		}
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("러너블 진행중" + i);
		}	
	}
}
