package day_04;


public class API_04 {
	public static void main(String[] args) {
		// object 클래스 
		// 최상위 클래스이며, 모든 클래스는 기본적으로 object를 상속받고 있다.
		// 클래스로서 가지고 있어야할 기본적인 기능을 제공하기 위해서 기본적으로 object클래스를 상속하고 있다.
		// clone() / equals() / finalize() / getClass() / hashcode() / notify() 
		// notufiAll() / toString() / wait() / wait(longtimeout) / wait(longtimeout, int nanos)
		
		// 주로 사용하는 메서드
		// toString()메소드: 현재 개체를 나타내는 문자열을 반환
		// toStrign()메소드가 자동으로 호출되는 경우
		// System.out.println()메소드에 객체가 매개변수로 들어가는 경우
		// 객체에 문자열 더하기 연산을 하는 경우
		
		// equals()메소드: 지정된 객체가 현재 객체와 같은지 확인
		// hashcode()메소드: 객체의 해시코드 값을 리턴
		
		// toString 연습
			API_04 obj = new API_04();
			obj.toStringFunc(obj);
			
System.out.println("====================================");			
		// Equals 연습
			
		// equals메소드가 object클래스에 있는 경우는 주소값을 비교한다.
		// String 객체의 equals 메소드는 오버라이딩 된 메소드여서 내용을 비교한다.
			
		String str1 = new String("하이 자바");
		String str2 = "하이 자바";
					
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 서로 같다");
		}else {
			System.out.println("서로 다르다.");
		}

		Value va1 = new Value(10);
		Value va2 = new Value(10);
			
		if(va1.equals(va2)) {
			System.out.println("va1과 va2는 서로 같다");
		}else {
			System.out.println("va1과 va2는 서로 다르다.");
		}
		
System.out.println("====================================");		
		//hash코드 / 내용이 같은 경우 출력값도 동일
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//hash코드 / 내용이 다른경우 출력값은 다름
		System.out.println(va1.hashCode());
		System.out.println(va2.hashCode());
	
//메인
	}
	
	//toString 연습
	public void toStringFunc(API_04 obj) {
		System.out.println(this);
		System.out.println(toString()); // toString
		System.out.println("하이" + this);
	}
	// toString 연습
	public String toString() {
		return "toString 연습";
	}
}

// Equals 연습
class Value{
	int a;
	public Value(int a) {
		this.a = a;
	}
}
