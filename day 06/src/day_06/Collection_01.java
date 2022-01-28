package day_06;

public class Collection_01 {
	public static void main(String[] args) {
		// 컬렉션 프레임워크
		// 데이터를 효율적으로 다루기 위한 클래스들의 집합.
		// collection 인터페이스를 구현하는 클래스: Set, List, Queue, Map
		
		// 제네릭
		// 클래스가 다룰 객체를 미리 명시하는 기법 / 제네릭 == 일반화 
		// 모든종류의 타입을 다룰 수 있도록, 클래스나 메서드를 타입매개변수를 이용하여 선언한 기법
		// 사용방법 : 클래스 명 뒤에 <E>,<K>,<V> 와 같은 형식으로 사용 / <>구현시 알파벳, 사용시 클래스만 들어갈수 있다.
		// 매개변수 : E(Element) - 배열, 집합의 요소타입지정 / T(Type) - 변수의 자료형과 같은 타입을 지정
		// 			s,u(...) - 여러개의 제네릭 기법을 사용할 때 사용 / k(Key) - 키타입지정시 v(Value) - 값타입지정시
	Value v = new Value();
	v.<Integer>typeSearch(3);
	v.typeSearch(3.14);
	v.typeSearch(3.14f);
	v.typeSearch('a');
	v.typeSearch("hello");
	v.typeSearch(true);
	}
}
class Value{
	public <T> void typeSearch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+ "는 정수입니다.");
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