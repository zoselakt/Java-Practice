package day_04;

public class API_01 {
	public static void main(String[] args) {
	// API : Application Programming Interface
		
	// java.lang : 자바 프로그래밍을 위한 가장 기본적인 클래스를 포함
	// java.util: 프로그램을 제어하기 위한 클래스와 데이터를 효율적으로 저장하기 위한 클래스들을 담고 있다.
	// java.io: 키보드, 모니터, 프린터,파일 등을 제어할 수 있는 클래스들의 모음
	// java.net: 통신을 위한 기능들을 담고있다.
		
	// 문자열 클래스 종류
	// String클래스 
	// 대표클래스: length, charAt, indexOf, equals, replace 
	// concat(문자열) : 문자열을 연결 / substring(시작위치, 지정한 끝위치 전까지)=슬라이싱 
	// length(): 길이 / toUpperCase() / toLowerCase() / charAt(인덱스): 인덱스에 해당하는 글자 반환 
	// indexOf(문자열): 문자열의 위치반환 / equals(문자열): 문자열이 같은지 불린값반환 / trim():앞뒤공백제거
	// replace(기존문자열 , 대체할 문자열) / replaceAll(변환할 문자열, 변환된 문자열)
		
	// StringBuffer : string 클래스는 변하지 않는 객체이기 때문에 새로운 객체를 만들지 않는 변할수있는 객체를 만든다. 
	//				  append() / reverse() / insert(int pos, Object obj)
	//				  delete(int start, int end) / deleteCharAt(int index)
		
	// Stringtokenizer : 문자열을 구분문자열을 기준으로 분리할 때 사용한다. ex) 전화번호 (-)기준으로 구분 등
	//					 nextToken() / hasMoreTokens() / countTokens()
		
	// wrapper 클래스
	// 기본 자료형들을 객체로 다루는데 사용 / 기본에서 앞글자가 대문자로 바뀐다.
	// Boolean / Character / Byte / Short / Integer / Long / Double / Float 클래스
	// Wrapper클래스명 객체명  = new Wrapper클래스명 (값);
		
		// auto boxing: 기본 자료형 값을 자동으로 Wrapper클래스의 객체로 변환시켜 주는것.
		Integer i = 10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c ='A'; 
		
		// auto unboxing: Wrapper 클래스의 객체값을 자동으로 기본 자료형 값으로 변환시켜 주는것.
		int ii = i;
		double dd = d;
		float ff = f;
		char cc = c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
		
		// Wrapper 클래스 생성자
		Integer aa = new Integer(100);
		Integer aa1 = new Integer("100");
		
		System.out.println(aa.equals(aa1)); //true
		
		// 여러가지 Wrapper클래스 활용
		// toString
		System.out.println(aa.toString()); //100
		System.out.println("aa.toString()="+aa);
		
		// parseInt
		String str = "100";
		int in = Integer.parseInt(str);
		System.out.println(in); // 100
		
		// toBinaryString
		String str2 = Integer.toBinaryString(200);
		System.out.println(str2); //11001000
		
		// intValue : Integer객체를 기본형인 int형으로 바꿈
		Integer intg = new Integer(150);
		int intg1 = intg.intValue();		
		System.out.println(intg1); // 150
		
		// Random 클래스 : 무작위값을 얻고 싶을때 사용
		// Random 객체명 = new Random();
		// 생성자 : Random() / Random(int seed)
		// 메서드 : int nextInt() / int nextInt(int n) / boolean nextBoolean() / long nextLong()
		// 		  double nextDouble, float nextFloat()

	}
}