package day_03;

import java.util.Scanner;

public class For_each {
	public static void main(String[] args) {
		String a[] = {"java", "hello", "programming"};
		for(String i:a) {
			System.out.println(i);	}
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.print("�ֹ��� ����:");
			fruits[i] = sc.next();	}
		System.out.println("----�ֹ����� ����----");
		
		for(String eachFruit:fruits) {
			System.out.print(eachFruit+" ");}
	
}}
