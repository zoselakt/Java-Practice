package day_05;

public class Collection_01 {
	public static void main(String[] args) {
		// 컬렉션 프레임워크 : 자바에서 제공하는 자료구조 / collection과 Map 를 합친 개념 
		// 데이터를 효율적으로 다루기 위한 클래스들의 집합.
		
		// 자료구조
		// 자료들을 저장할때, 효율적인 구조로 저장하는 것.
		
		// 종류
		// collection 인터페이스를 구현하는 클래스: Set, List, Queue
		// Map 클래스 : Hashtable, HashMap, SortedMap
		
		// 제네릭 (Generic)
		// 클래스가 다룰 객체를 미리 명시하는 기법 / 제네릭 == 일반화 
		// 클래스내부에서 사용할 데이터 타입을 외부에서 지정하는 방법 / 
		// 모든종류의 타입을 다룰 수 있도록, 클래스나 메서드를 타입매개변수를 이용하여 선언한 기법
		
		// 사용방법 : 클래스 명 뒤에 <E>,<K>,<V> 와 같은 형식으로 사용 / <>구현시 알파벳, 사용시 클래스만 들어갈수 있다.
		// 매개변수 : E(Element) - 배열, 집합의 요소타입지정 / T(Type) - 변수의 자료형과 같은 타입을 지정
		// 			s,u(...) - 여러개의 제네릭 기법을 사용할 때 사용 / k(Key) - 키타입지정시 
		// 			v(Value) - 값타입지정시
		// 구조
		// 클래스명 <매개변수> 제네릭명 = new 클래스명 <매개변수>();
		// 호출
		// 제네릭명.가져올 메서드명()
		
	Value v = new Value();
	v.<Integer>typeSearch(3);  
	v.typeSearch(3.14);
	v.typeSearch(3.14f);
	v.typeSearch('a');
	v.typeSearch("hello");
	v.typeSearch(true);

//-------------------------------------------------------------------------------
	System.out.println("---------------------------------------------------------");
	// 복수 제네릭 사용 생성자
	
	// <Integer> 으로 형변환하여 출력문에서 Integer으로 다시 명시 하지않아도된다. / 제네릭 / new생성자쪽에 명시해야한다.
	Person1 /*<StudentData1, Integer>*/ p1 = new Person1/*<StudentData1, Integer>*/(new StudentData("홍길동"), new Integer(20140001));
	System.out.println(p1.data + ":" + p1.id);
	
//main_end
	}
}
//instanceOf 연산자 : 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보는 연산자
class Value{
	public <T> void typeSearch(T x) { // T(type)를 갖는 x 매개변수
		if(x instanceof Integer) {
			System.out.println(x+ "은(는) 정수입니다.");
		}
		else if (x instanceof Double|| x instanceof Float) {
			System.out.println(x+ "는 실수 입니다.");
		}
		else if (x instanceof Character) {
			System.out.println(x+ "는 문자형 입니다.");
		}
		else if (x instanceof String) {
			System.out.println(x+ "는 문자열 입니다.");
		}
		else if (x instanceof Boolean) {
			System.out.println(x+ "는 논리형 입니다.");
		}

	}
}
//-------------------------------------------------------------------------------
// 복수 제네릭
class StudentData{
	public String name;
	StudentData(String name){
		this.name = name;
	}
	public String toString() { // 메인메서드에 제네릭생략시 name값 리턴
		return name;
	}
}

class Person1<T, E>{ // 복수의 제네릭
	public T data;
	public E id;
	Person1(T data, E id){
		this.data = data;
		this.id = id;
	}
	public <T> void getInfo(T data) {
		System.out.println(data);
	}
}