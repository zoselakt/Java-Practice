package day_02;

import java.util.Arrays;
import java.util.Scanner;

public class G_Array_02 {
	public static void main(String[] args) {
		// 배열의 복제
		// system.array(src, srcPos, dest, destPos, length);
		// src: 복사할 배열  / srcPos 복사 시작할 위치
		// dest: 덮어쓸 배열 / destPos: 덮어쓰기 시작할 위치
		// length: 복사할길이
		
		int [] a= {1,2,3,4,5,6};   
		int [] b= {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//복제
		System.arraycopy(a,      2,     b,     3,       4);
//		System.arraycopy(src, srcpos, dest, destpos, length);
		System.out.println(Arrays.toString(b)); // a를 b에 복사하는거라 b로 출력해야함.
		
//---------------------------------------------------------------------------------------
// for each 문
		// 배열을 순환할 시 반복문 보다 편리하게 순환할 수있도록 새로운 문법을 제공
		// 구조
		// for(자료형 변수명 : 배열명) {
		//	변수가 배열을 순환하면서 반복할 명령
		//	}
		Scanner sc = new Scanner(System.in);
		// String 형
		String c[] = {"java", "hello", "programming"};
		for(String i:c) {
			System.out.println(i);	}
		String fruits[] = new String[3];
		// int형
		int d[] = {1,2,3,4,5};
		for(int i:d) {
			System.out.print(i);
		}
		System.out.println("");
		
		// 과일주문프로그램
		for(int i=0; i<3; i++) {
			System.out.print("주문할 과일:");
			fruits[i] = sc.next();	}
		System.out.println("----주문받은 과일----");
		
		for(String eachFruit:fruits) {
			System.out.print(eachFruit+" ");}
}}
