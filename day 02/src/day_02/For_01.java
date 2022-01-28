package day_02;

public class For_01 {

	public static void main(String[] args) {
		// for(int i =1; i<=10; i++) {   : 1번부터 10번 까지
		//			System.out.println(i);
		
		// for(int i =10; i >=1; i--) {  : 10번부터 1번까지
		// 			System.out.println(i + "번 컴퓨터 켜줘");
		
		// for(int i=1; i<=10; i+=2) {      : 2씩 건너뛰기  
		// 	   System.out.println(i +"번 컴퓨터 켜줘");
			
		int sum = 0;    // :  총합계산
		for(int i = 1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
//---------------------------------------------------------------------------------------
		// 2중 for, while 문

		int dan;
		int times;
		
		for(dan = 2; dan<=9; dan++) {
			for(times = 1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
		while(dan <=9) {
			times = 1;
			while(times<=9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
}}
