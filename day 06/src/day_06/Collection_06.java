package day_06;

import java.util.HashMap;
import java.util.Scanner;

public class Collection_06 {
	public static void main(String[] args) {
		// Map : Ű�� ���ؼ� ���� ������ �� �ִ� ����
		// ��ǥ Ŭ���� : HashMap , TreeMap
		// ���� �޼���
		// boolean containsKey(Object key) /boolean containsValue(Object Value)
		// V get(Object key) / boolean isEmpty() / Set<key> keySet/ V pit(K key, V value)
		// V remove(Object key) / int size()
		
		// HashMap : key�� Value ������ �����͸� �����ϴ� ���� / Map�� ��� �Ӽ��� ������ ������ �����ĵ� ����
		// �ؽ��̶�� �˻� �˰��� ��� / key �ߺ� x, value �ߺ� o
		// �ؽ��̶� �޸𸮳��� �ּ�ȭ�ϱ� ����, ������ �� �Է� ���� �� ������ ���ػ��ο� �ּ� ���� �����Ͽ� �޸𸮿� �����ϴ� ���
		
		//1. ���� : HashMap ������ = new HashMap();
		//2. ���� : ������.put(key, value)
		//3. �������� : ������.get(key)
		//4. key����Ȯ�� : ������.containsKey(key)
		
		HashMap<String, String> hm=new HashMap<String, String>();
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
	}

}
