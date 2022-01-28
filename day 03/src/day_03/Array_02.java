package day_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	public static void main(String[] args) {
		// 배열 - 로또 프로그램
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int lottoAr[]= new int[6];
		int userAr[]=new int[6];
		int bonus, bonusUser;  // 동일한 형태면 콤마로 구분해서 사용가능
		int count = 0;
		
		for(int i=0; i<6; i++) {
			lottoAr[i]=random.nextInt(45)+1;}
		bonus = random.nextInt(45)+1;
		
		System.out.println("lotto : "+ Arrays.toString(lottoAr) + ", bonus:" + bonus);
		System.out.println("숫자 입력 :");
		
		for(int i=0; i<6; i++ ) {
			userAr[i]=sc.nextInt();	}
		
		System.out.println("보너스 값 입력:");
		
		bonusUser = sc.nextInt();
		
		System.out.println("User:" + Arrays.toString(userAr) + ", bonus:" + bonusUser);
		
		for(int j=0; j<6; j++) {
			for(int i = 0; i<6; i++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
		}		}		}
		System.out.println("총 맞춘 갯수:" +count);
		
		if(count==6 ) {
			System.out.println("1등 당첨입니다");	}
		else if(count ==5) {
			if(bonus == bonusUser) {
				System.out.println("2등 당첨입니다.");	}
			else {
				System.out.println("3등 당첨입니다.");	}
		}
		else if (count==4) {
			System.out.println("4등 당첨입니다."); }
		else if (count==3) {
			System.out.println("5등 당첨입니다."); }
		else {
			System.out.println("다음기회에..."); }
	
	
}}
