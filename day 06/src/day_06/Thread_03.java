package day_06;

public class Thread_03 {
	public static void main(String[] args) {
		// 스레드의 라이프사이클
		// new : 스레드가 인스턴스화 된 상태
		// Runnable : 실행할 수있는 상태로 대기하게되며 스케줄러에 의해 선택되면 run()메서드를 바로 수행
		// Blocked : sleep, join메서드를 호출하게 되면, 스케쥴러에 의해서 선택받을 수 없다.
		// Dead : 할당받은 메모리와 정보 모두 삭제된다.
		SleepThread	t= new SleepThread();
		t.start();
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