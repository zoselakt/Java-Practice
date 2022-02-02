package day_02;

import java.util.Scanner;

public class F_Continue_Break_01 {
	public static void main(String[] args) {
		// new 생성자
		// 별도의 생성자를 만들지 않았을 때 컴파일러에 의해 자동으로 생성자가 만들어진다 이를 기본 생성자라 한다.
		// continue : 반복문을 계속수행하는데 특정조건에서는 수행하지 않고 건너뛰어야할때 사용
		// break: 반복문을 사용하지않고 반복문을 빠져나올때 사용
		
		int money =10000;
		System.out.println("현재 10000원 입니다.");
		Scanner sc = new Scanner(System.in);
	//  자료형 참조값 = 기본생성자 메모리 할당  생성자호출 ()
		while(true) {
			System.out.println("얼마를 사용하겠습니까?");
			int i=sc.nextInt();
			if(!(0<=i &&i <=money)) {
				System.out.println("다시 입력해 주세요");
				continue;
			}
			System.out.printf("%d 원 남았습니다. \n", money -=i);
			if(money==0) {
				break;
			}				
		}
		System.out.println("모든 돈을 사용했습니다.");
}}
