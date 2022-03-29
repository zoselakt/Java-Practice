package day_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collection_05 {
	public static void main(String[] args) {
  	// Map : Ű�� ���ؼ� ���� ������ �� �ִ� ����
 	// �������̽��̱� ������ ��ĳ������ �ʿ� 
	
	// ����Ŭ���� : HashMap , TreeMap, SortedMap
	// ���� �޼���
	// boolean containsKey(Object key): �ش�Ű�� �ִ��� 
	// boolean containsValue(Object Value): �ش� ���� �ִ���
	// V get(Object key) / boolean isEmpty() / Set<key> keySet/ V pit(K key, V value)
	// V remove(Object key) / int size()
		
	// HashMap : key�� Value ������ �����͸� �����ϴ� ���� 
	// Map�� ��� �Ӽ��� ������ ������ �����ĵ� ���� / Map �������̽��� ����
	// �ؽ��̶�� �˻� �˰��� ��� / key �ߺ� x, value �ߺ� o
	// �ؽ��̶� �޸𸮳��� �ּ�ȭ�ϱ� ����, ������ �� �Է� ���� �� ������ ���ػ��ο� �ּ� ���� �����Ͽ� �޸𸮿� �����ϴ� ���
		
		
	//1. ���� : HashMap ������ = new HashMap();
	//2. ���� : ������.put(key, value)
	//3. �������� : ������.get(key)
	//4. key����Ȯ�� : ������.containsKey(key)
		
	HashMap<String, String> hm = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);
		
	//1. put(key,value)
	hm.put("apple", "���");
	hm.put("paper", "����");
	hm.put("flower", "��");
		
	String voca;
	System.out.println("�ܾ �Է��ϼ���.");
	voca= sc.nextLine();
	
	//2. containskey(key): key�� hashmap�� �����ϸ� true
	if(hm.containsKey(voca)) {
		//3. get(key) : value�� ��ȯ
		System.out.println("�ش��ϴ� ���� : " + hm.get(voca));
	}
	else {
		System.out.println("�ش� �ܾ�� �����ϴ�.");
	}
	
//----------------------------------------------------------------------------------------
	// getKey() / getValue() / entrySet()
	
	HashMap<String, /*Integer*/ String> tel = new HashMap<String, /*Integer*/ String>();
	tel.put("����", "02"); // Integer ���� ���� 8������ ��ȯ��.
	tel.put("��õ", "032");
	tel.put("���", "031");
	tel.put("�뱸", "053");
			
	/*
	System.out.println(tel.get("����"));
	System.out.println(tel.get("��õ"));
	System.out.println(tel.get("���"));
	System.out.println(tel.get("�뱸"));
	*/
			
	Set <Map.Entry<String, String>>set = tel.entrySet();
	Iterator <Map.Entry<String, String>> it = set.iterator();
			
	while(it.hasNext()) {
		Map.Entry e = it.next();
		System.out.println("������ȣ: " + e.getValue() +", ����: "+ e.getKey());
	}
	System.out.println("==================================================");
	for(Map.Entry<String, String> e:set) {
		System.out.println("������ȣ: " + e.getValue() +", ����: "+ e.getKey());
		}
	}
}
