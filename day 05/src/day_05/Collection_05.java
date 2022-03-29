package day_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collection_05 {
	public static void main(String[] args) {
  	// Map : 키를 통해서 값을 참조할 수 있는 구조
 	// 인터페이스이기 때문에 업캐스팅이 필요 
	
	// 관련클래스 : HashMap , TreeMap, SortedMap
	// 관련 메서드
	// boolean containsKey(Object key): 해당키가 있는지 
	// boolean containsValue(Object Value): 해당 값이 있는지
	// V get(Object key) / boolean isEmpty() / Set<key> keySet/ V pit(K key, V value)
	// V remove(Object key) / int size()
		
	// HashMap : key와 Value 값으로 데이터를 저장하는 형태 
	// Map의 모든 속성을 가지고 있으며 저장방식도 동일 / Map 인터페이스의 종류
	// 해싱이라는 검색 알고리즘 사용 / key 중복 x, value 중복 o
	// 해싱이란 메모리낭비를 최소화하기 위해, 저장할 값 입력 받을 시 연산을 통해새로운 주소 값을 생성하여 메모리에 저장하는 기법
		
		
	//1. 생성 : HashMap 변수명 = new HashMap();
	//2. 삽입 : 변수명.put(key, value)
	//3. 가져오기 : 변수명.get(key)
	//4. key존재확인 : 변수명.containsKey(key)
		
	HashMap<String, String> hm = new HashMap<String, String>();
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
	
//----------------------------------------------------------------------------------------
	// getKey() / getValue() / entrySet()
	
	HashMap<String, /*Integer*/ String> tel = new HashMap<String, /*Integer*/ String>();
	tel.put("서울", "02"); // Integer 형식 사용시 8진수로 변환됨.
	tel.put("인천", "032");
	tel.put("경기", "031");
	tel.put("대구", "053");
			
	/*
	System.out.println(tel.get("서울"));
	System.out.println(tel.get("인천"));
	System.out.println(tel.get("경기"));
	System.out.println(tel.get("대구"));
	*/
			
	Set <Map.Entry<String, String>>set = tel.entrySet();
	Iterator <Map.Entry<String, String>> it = set.iterator();
			
	while(it.hasNext()) {
		Map.Entry e = it.next();
		System.out.println("지역번호: " + e.getValue() +", 지역: "+ e.getKey());
	}
	System.out.println("==================================================");
	for(Map.Entry<String, String> e:set) {
		System.out.println("지역번호: " + e.getValue() +", 지역: "+ e.getKey());
		}
	}
}
