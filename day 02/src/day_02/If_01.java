package day_02;

import java.util.Scanner;

public class If_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이: ");
		age= sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");	}
		
		else if(age > 13) {
			System.out.println("청소년입니다..");	}
		
		else if(age > 8) { 
			System.out.println("초등학생입니다.");	}

		else {
			System.out.println("유아입니다.");	}
//---------------------------------------------------------------------------------------
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		id=input.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id 일치!");
			System.out.print("비밀번호를 입력해주세요 : ");
			password= input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("password일치!");
				System.out.println("로그인성공!");	}
			else {
				System.out.println("password 불일치"); }
		}
		else {
			System.out.println("ID 불일치");	}
}}
