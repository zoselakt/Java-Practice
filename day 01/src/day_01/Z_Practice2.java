package day_01;

import java.util.ArrayList;

public class Z_Practice2{
	public static void main(String[] args) {
	char ch [][] = new char[3][];
	
	System.out.println("ch�迭�� ���� ũ�� :" + ch.length);
	ch[0] = new char[3];
	System.out.println("ch[0]�迭�� ����ũ�� : " + ch[0].length);
	ch[1] = new char[2];
	System.out.println("ch[0]�迭�� ����ũ�� : " + ch[1].length);
	ch[2] = new char[1];
	
	ch[0][0] = 'A';
	ch[0][1] = 'B';
	ch[0][2] = 'C';
	ch[1][0] = 'D';
	ch[1][1] = 'E';
	ch[2][0] = 'F';
	
	for(int i=0;i<ch.length; i++) {
		for(int j=0; j<ch[i].length; j++) {
			System.out.print(ch[i][j] + " ");
		}
		System.out.println();
	}
//-------------------------------------------------------------------------------
	System.out.println("--------------------------------------------------------");
	
	String [][] asia_nations = {
			{"�ѱ�", "�߱�", "�Ϻ�"}, {"�±�","��Ʈ��","�ʸ���"}
			};
	
	System.out.println(asia_nations[0][0]);
	System.out.println(asia_nations.length);
	System.out.println(asia_nations[0].length);
	System.out.println(asia_nations[1].length);
	
	for(int i=0; i<asia_nations.length; i++) {
		for(int j=0; j < asia_nations[i].length; j++) 
			System.out.print(asia_nations[i][j] + " ");
		System.out.println();
	}
	
	//charAt() �޼��� : �ش��ε����� �ִ� ���� ��ȯ 
	String[] strAr= {"hong", "kim", "park"};
	System.out.println(strAr[0].charAt(2)); 
	System.out.println(strAr[1].charAt(1)); 
	System.out.println(strAr[2].charAt(0)); 
	//-------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------");
		
	
	//return
	public int getAdd (int i, int j) {
		return i+j; // �Ķ���Ϳ� �ִ� ���� �ٷ� ������� �ʰ� ��������ϰ��� �Ҷ� return���
	}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
	
// �ѹ� ������ �迭�� ���α׷����� ũ�⸦ ������ �� ����.
int [] data = new int[10];

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");

/*
<E> : ���׸��̶� �θ��� ArrayList�� ������ �ڷ����� �ݵ�� Ŭ������ ���´�.
ArrayList�� ������ �ڷᰡ �⺻ �ڷ����̸� �⺻ �ڷ����� Ŭ����ȭ ���ѳ��� ���� Ŭ������ ����Ѵ�.
����Ŭ������ �⺻ �ڷ����� ù ���ڸ� �빮�ڷ� ������ǰ� Character�� integer�� Ǯ����������Ѵ�.
*/

ArrayList<Z_Practice2> list = new ArrayList<>();

list.add(new Z_Practice2("ȫ�浿", 20)); // add(value): ArrayList�� Value�� �ǵڿ� ����Ѵ�.
System.out.println(list.size() + ":" + list);

System.out.println(list.get(1)); //get(index) : ArrayList�� index��° ��ġ�� value�� ���´�.

list.set(2, new Z_Practice2("������", 16));
System.out.println(list.size()+ ":" + list);

list.remove(2); //ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
list.clear(); // ��絥���͸� �����Ѵ�.


class Z_Practice2{
	private String name;
	private int age;
	
	public Z_Practice2() {
		this("����", 0);
	}
	public Z_Practice2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Z_Practice2 [name=" + name + ", age=" + age + "]";
	}
}

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");

// �������� �ΰ��� ���� �ѱ�� ���! - �迭
public static int[] testMethod() {
	int num1 = 100;
	int num2 = 200;	
	return new int[] {num1, num2};
}
	int result[] = testMethod();
	
	System.out.println(result[0]);
	
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
// <String>���� ����ȯ�Ͽ� ��¹����� String���� �� ��ȯ �� �ʿ����! / ���׸�!!
ArrayList<String> al = new ArrayList<String>(); 
al.add("���");
al.add("��");
al.add("����");

for(int i=0; i<al.size(); i++) {
	String str = al.get(i);
	
	System.out.println(str);
	}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");

}}