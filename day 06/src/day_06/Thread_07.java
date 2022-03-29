package day_06;

public class Thread_07 {
	public static void main(String[] args) {
		// wait / notify
		// 메서드
		// void wait()- 호출될때 까지 대기 / void wait(long timeout)- timeout시간만큼 대기 
		// notify()- 대기중인 한 스레드만 깨움 / notifyAll()- 모든 스레드를 깨움
			Account account = new Account();
			Son son = new Son(account);
			Mom mom = new Mom(account);
			son.start();
			mom.start();
}}	
class Account{
	int money=0;
	public int showMoney() {
		return money;
}
	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
			}catch(InterruptedException ie) {System.out.println(ie.toString()); }
		this.money+=2000;
		System.out.println("용돈 입금했습니다. 현재잔액:" + this.showMoney());
		this.notify();
}
	public synchronized void getMoney() {
		while(money<=0) {
			try {
				System.out.println("잔고 없음");
				this.wait();
			}catch(InterruptedException i) {}
		}
		this.money-=2000;
		System.out.println("용돈 출금했습니다. 현재잔액:"+this.showMoney());
	}  
}

class Son extends Thread{
	private Account account;
	Son(Account account){
		this.account=account;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			account.getMoney();
			}  
	}  
}

class Mom extends Thread{
	private Account account;
	Mom(Account account) {
		this.account=account;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			account.setMoney();
			}  
	}  
}