package day_05;

import java.io.FileInputStream;
import java.util.Scanner;

public class Java_Scanner_01 {
	public static void main(String[] args) {
		// Scanner 클래스 : 문자 데이터를 읽어오는데 도움을 주는 클래스
		// Scanner 변수 = new Scanner(System.in); // system.in : 입출력 스트림과 연결
		// scanner 클래스 종류
		// nextBoolean() / nextByte() / nextDouble() / nextFloat() / nextInt() = 각 입력값으로 입력
		// nextLine() -엔터전 까지 / next() - 공백 전까지
		
		//sc.next(): 문자열로 입력받아라 / 스페이스 전까지 입력을 리턴
		//sc.nextint(): 정수값으로 입력받아라
		//sc.nextfloat(): 실수값으로 입력받아라
		//sc.nextLine(): 엔터 전까지 모든 문자열을 리턴
		//sc.nextByte(): byte 타입으로 리턴
		//sc.nextShort(): Short 타입으로 리턴
		//sc.nextDouble(): double 타입으로 리턴
		
		//파일불러오기
		try {
			FileInputStream fis = new FileInputStream("src//day_05//practice_sample.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
