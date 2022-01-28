package day_02;

import java.util.*; //util 에 있는 모든 클래스 임포트

public class While_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100) + 1;
		int user =-1;
		while (user!=num) {
			System.out.println("숫자 입력 :");
			user = sc.nextInt();
			if(user==num) {
				System.out.println("정답입니다!");
			}
			else if(user > num) {
				System.out.println("down!");
			}
			else {
				System.out.println("up!");
			}}
		
// ------------------------------------------------------------------------------------
		// do-while 문
		int i = 100;
		do {
			System.out.println(" 조건식의 결과값이 false라도 한번은 출력하고 while문 출력"); }
		while (i<10); {
			System.out.println("조건식의 결과값이 거짓이라면 출력 X"); }
}}
