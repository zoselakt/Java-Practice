package day_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P_3_CustomerManage{
	
	static HashMap<String, String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("◇◆◇◆◇◆전화번호부◇◆◇◆◇◆");
			System.out.println("1. 고객정보 저장");
			System.out.println("2. 고객정보 검색");
			System.out.println("3. 고객정보 출력");
			System.out.println("4. 끝내기");
			System.out.println("번호 입력: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("◇◆◇◆고객정보 저장◇◆◇◆");
				insert();
			}else if(choice == 2) {
				System.out.println("◇◆◇◆고객정보 검색◇◆◇◆");
				search();
			}else if(choice == 3) {
				System.out.println("◇◆◇◆고객정보 출력◇◆◇◆");
				show();
			}else if(choice == 4) {
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
		}
		
	}

	public static void insert() {
		String name, phone;
		System.out.println("저장할 고객의 이름: ");
		name = sc.next();
		
		//중복불가 처리
		if(hm.containsKey(name)) {
			System.out.println("이미 존재하는 이름입니다.");
			return;
		}else {
			System.out.println("저장할 고객의 번호: ");
			phone = sc.next();
			hm.put(name, phone);
			System.out.println("저장 완료!");
		}
		
	}
	public static void search() {
		String searchName;
		System.out.println("검색할 이름: ");
		searchName = sc.next();
		
		if(hm.containsKey(searchName)) {
			System.out.println("검색 완료!");
			System.out.println("검색된 전화번호: "+ hm.get(searchName));
		}else {
			System.out.println("검색된 이름이 존재하지않습니다.");
		}
	}
	public static void show() {
		Set<String> keyset = hm.keySet();
		Iterator i = keyset.iterator();
		while(i.hasNext()) {
			String curName =(String) i.next(); // 명시적 형변환 / 다운캐스팅
			System.out.println("name: " + curName+ ", phone: " +hm.get(curName));
		}
	}
}