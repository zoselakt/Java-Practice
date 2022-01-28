package day_02;

import java.util.Scanner;

public class Switch_01 {
	public static void main(String[] args) {
		// switch-case 문은 if문 보다 코드가 더 간결하게 작성가능하다.
		// 조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행문이 결정될때 사용
		
		Scanner sc = new Scanner(System.in);
			System.out.println("★☆★☆신호등 프로그램★☆★☆");
			System.out.println("빨간불 :1 , 노란불 :2 , 초록불 :3");
			System.out.println("신호 :");
			int sign =sc.nextInt();
			switch(sign) { // ()안에는 변수가 들어간다.
			case 1:
				System.out.println("빨간불입니다. 정지하세요");
				break;  // break를 하지않으면 모두실행됨.
				
			case 2:
				System.out.println("노란불입니다. 감속하세요.");
				break;
				
			case 3:
				System.out.println("초록불입니다. 출발하세요.");
				break;
				
			default:
				System.out.println("잘못누르셨습니다.");
			}

}}
