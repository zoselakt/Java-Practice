package day_02;

import java.util.Random;
import java.util.Scanner;

public class E_While_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		while (answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까? (Y) ");
			answer=sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
			}}
		System.out.println("재생종료");
//------------------------------------------------------------------------------------
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

//------------------------------------------------------------------------------------
// do-while 문
int i = 100;
do {
	System.out.println(" 조건식의 결과값이 false라도 한번은 출력하고 while문 출력"); }
while (i<10); {
	System.out.println("조건식의 결과값이 거짓이라면 출력 X"); }
}}