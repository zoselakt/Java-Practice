package day_06;

import java.util.HashMap;
import java.util.Scanner;

public class Collection_06 {
	public static void main(String[] args) {
		// Map : 키를 통해서 값을 참조할 수 있는 구조
		// 대표 클래스 : HashMap , TreeMap
		// 관련 메서드
		// boolean containsKey(Object key) /boolean containsValue(Object Value)
		// V get(Object key) / boolean isEmpty() / Set<key> keySet/ V pit(K key, V value)
		// V remove(Object key) / int size()
		
		// HashMap : key와 Value 값으로 데이터를 저장하는 형태 / Map의 모든 속성을 가지고 있으며 저장방식도 동일
		// 해싱이라는 검색 알고리즘 사용 / key 중복 x, value 중복 o
		// 해싱이란 메모리낭비를 최소화하기 위해, 저장할 값 입력 받을 시 연산을 통해새로운 주소 값을 생성하여 메모리에 저장하는 기법
		
		//1. 생성 : HashMap 변수명 = new HashMap();
		//2. 삽입 : 변수명.put(key, value)
		//3. 가져오기 : 변수명.get(key)
		//4. key존재확인 : 변수명.containsKey(key)
		
		HashMap<String, String> hm=new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		//1. put(key,value)
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		
		String voca;
		System.out.println("단어를 입력하세요.");
		voca= sc.nextLine();
		//2. containskey(key): key가 hashmap에 존재하면 true
		if(hm.containsKey(voca)) {
			//3. get(key) : value값 반환
			System.out.println("해당하는 뜻은 : " + hm.get(voca));
		}
		else {
			System.out.println("해당 단어는 없습니다.");
		}
	}

}
