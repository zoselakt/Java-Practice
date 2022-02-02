package day_01;

import java.util.Scanner;

public class P_1_For_each {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 주문프로그램 - for each 문
								
				String fruits[] = new String[3];
				
				for(int i=0; i<3; i++) {
					System.out.print("주문할 과일:");
					fruits[i] = sc.next();	}
				
				System.out.println("----주문받은 과일----");
				for(String eachFruit:fruits) {
					System.out.print(eachFruit+" ");}

	}

}
