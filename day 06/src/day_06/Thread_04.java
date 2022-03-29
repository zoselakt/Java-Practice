package day_06;

public class Thread_04 {
	public static void main(String[] args) {
		// 스레드의 동기화 : 멀티 스레드로 작업시 서로 간섭이 되지 않도록 하는 것.
		// 멀티 스레드의 문제점: 멀티 스레드 기법은 자원을 공유하는 데, 
		// 동시에 같은 자원을처리한다면 실제 처리해야하는 작업보다 더 많은 작업이 발생 할 수 있다.
		
		// synchronized 키워드 걸기
		// public synchronized void 메서드명() {
		// 수행할 작업
		// 						}
		// synchronized 영역지정하기
		// void메서드명() {
		// synchronized(스레드객체) {
		// 수행할 작업
		//			}
		//						}

// 문제 발생 
		Atm atm = new Atm();
		Thread mom = new Thread(atm,"엄마");
		Thread son = new Thread(atm,"아들");
		
		mom.start(); // 동시작업 실행
		son.start();
	//main
	}}
	class Atm implements Runnable {
		int money = 10000;
		@Override
		public void run() {
			for(int i=0; i<5; i++) {
				withdraw(1000);
				printInfo();
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) { } 
			} 
		}
		
		synchronized void withdraw(int money) { 
			Thread.yield();
			this.money-=money;
			System.out.println(Thread.currentThread().getName() + "이(가)" +money+ "원 출금함.");
		}
		void printInfo() {
			System.out.println("현재 잔액" + money + "원");
		}
	}
