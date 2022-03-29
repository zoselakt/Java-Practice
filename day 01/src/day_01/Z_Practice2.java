package day_01;

import java.util.ArrayList;

public class Z_Practice2{
	public static void main(String[] args) {
	char ch [][] = new char[3][];
	
	System.out.println("ch배열의 행의 크기 :" + ch.length);
	ch[0] = new char[3];
	System.out.println("ch[0]배열의 열의크기 : " + ch[0].length);
	ch[1] = new char[2];
	System.out.println("ch[0]배열의 열의크기 : " + ch[1].length);
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
			{"한국", "중국", "일본"}, {"태국","베트남","필리핀"}
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
	
	//charAt() 메서드 : 해당인덱스에 있는 값을 반환 
	String[] strAr= {"hong", "kim", "park"};
	System.out.println(strAr[0].charAt(2)); 
	System.out.println(strAr[1].charAt(1)); 
	System.out.println(strAr[2].charAt(0)); 
	//-------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------------");
		
	
	//return
	public int getAdd (int i, int j) {
		return i+j; // 파라미터에 있는 값을 바로 출력하지 않고 계속진행하고자 할때 return사용
	}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
	
// 한번 선언한 배열은 프로그램에서 크기를 변경할 수 없다.
int [] data = new int[10];

//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");

/*
<E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다.
ArrayList에 저장할 자료가 기본 자료형이면 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용한다.
랩퍼클래스는 기본 자료형의 첫 문자만 대문자로 적으면되고 Character와 integer는 풀네임을사용한다.
*/

ArrayList<Z_Practice2> list = new ArrayList<>();

list.add(new Z_Practice2("홍길동", 20)); // add(value): ArrayList에 Value를 맨뒤에 출력한다.
System.out.println(list.size() + ":" + list);

System.out.println(list.get(1)); //get(index) : ArrayList의 index번째 위치에 value를 얻어온다.

list.set(2, new Z_Practice2("성춘향", 16));
System.out.println(list.size()+ ":" + list);

list.remove(2); //ArrayList의 index번째 위치에 value를 제거한다.
list.clear(); // 모든데이터를 제거한다.


class Z_Practice2{
	private String name;
	private int age;
	
	public Z_Practice2() {
		this("무명씨", 0);
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

// 리턴으로 두개의 값을 넘기는 방법! - 배열
public static int[] testMethod() {
	int num1 = 100;
	int num2 = 200;	
	return new int[] {num1, num2};
}
	int result[] = testMethod();
	
	System.out.println(result[0]);
	
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
// <String>으로 형변환하여 출력문에서 String으로 형 변환 할 필요없다! / 제네릭!!
ArrayList<String> al = new ArrayList<String>(); 
al.add("사과");
al.add("배");
al.add("수박");

for(int i=0; i<al.size(); i++) {
	String str = al.get(i);
	
	System.out.println(str);
	}
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");

}}