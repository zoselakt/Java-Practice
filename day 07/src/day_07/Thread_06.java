package day_07;

public class Thread_06 {
	public static void main(String[] args) {
		// �������� ����ȭ : ��Ƽ ������� �۾��� ���� ������ ���� �ʵ��� �ϴ� ��.
		// synchronized Ű���� �ɱ�
		// public synchronized void �޼����() {
		// ������ �۾�
		// 						}
		// synchronized ���������ϱ�
		// void�޼����() {
		// synchronized(�����尴ü) {
		// ������ �۾�
		//			}
		//						}

// ���� �߻� 
		Atm atm = new Atm();
		Thread mom = new Thread(atm,"����");
		Thread son = new Thread(atm,"�Ƶ�");
		
		mom.start();
		son.start();
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
			} catch(InterruptedException e) { } } }
	synchronized void withdraw(int money) { //���� : synchronized �߰� ��
		Thread.yield();
		this.money-=money;
		System.out.println(Thread.currentThread().getName() + "��(��)" +money+ "�� �����.");
	}
	void printInfo() {
		System.out.println("���� �ܾ�" + money + "��");
	}}
