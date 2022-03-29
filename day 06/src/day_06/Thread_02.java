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

//메인
public class Thread_02 {
	public static void main(String[] args) {
		// 스레드의 우선순위  1~10까지 부여가능
		// 우선순위 지정 메서드
		// void setPriorty(int newPriority) : 우선순위 지정
		// int getPriority() : 우선순위반환
		// 작업수행시 중요한 순서대로 출력하고 싶을때, 중요한 작업에 우선순위를 높게 주면됨
		
		Runnable t = new MyThread3(); //업 캐스팅
		Thread t1 = new Thread(t, "thread1");
		t1.setPriority(1); // 우선순쉬 1로 지정
		System.out.println("t1의 우선순위는:" + t1.getPriority());
		
		Thread t2 = new Thread(t, "thread2");
		System.out.println("t2의 우선순위는:" + t2.getPriority()); //순위지정x → 우선순위: 5 디폴트
		
		Thread t3 = new Thread(t, "thread3");
		t3.setPriority(10);
		System.out.println("t3의 우선순위는:" + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
		
		// 스레드의 라이프사이클
		// new : 스레드가 인스턴스화 된 상태 /Runnable이 될 수 있는 상태
		// Runnable : start() 메서드가 호출되면 new 상태에서 Runnable 상태가 된다.
		//            Runnable상태가 되면 실행할 수있는 상태로 대기하게되며 스케줄러에 의해 선택되면 run()메서드를 바로 수행
		// Blocked : 실행중인 스레드가 sleep, join메서드를 호출하게 되면, Blocked상태가된다. 
		//           Blcoed상태가 되면 스케쥴러에 의해서 선택받을 수 없다.
		// Dead : run()메서드의 실행을 모두 완료하게 되면 스레드는 Dead 상태가된다. 할당받은 메모리와 정보 모두 삭제된다

		SleepThread	s= new SleepThread();
		s.start();
		
	}
}
class SleepThread extends Thread{
	public void run() {
		System.out.println("카운트 다운 5초");
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
		System.out.println("종료");
	}
}
