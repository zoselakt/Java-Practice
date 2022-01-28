package day_05;

public class BasicAPI_01 {
	public static void main(String[] args) {
		// API : Application Programming Interface
		// 

		// object 클래스 종류
		// clone() / equals() / finalize() / getClass() / hashcode() / notify() 
		// notufiAll() / toString() / wait() / wait(longtimeout) / wait(longtimeout, int nanos)
		
		// 문자열 클래스 종류
		// String : concat(문자열) / substring(시작위치, 지정한 끝위치 전까지)=슬라이싱 / length() /
		// 		   toUpperCase() / toLowerCase() / charAt(인덱스) / indexOf(문자열) / equals(문자열) / 
		// 		   replace(기존문자열 , 대체할 문자열) / replaceAll(변환할 문자열, 변환된 문자열) /trim()
		// StringBuffer : string 클래스는 변하지 않는 객체이기 때문에 새로운 객체를 만들지 않는 변할수있는 객체를 만든다. 
 		//				  append() / reverse() / insert(int pos, Object obj)
		//				  delete(int start, int end) / deleteCharAt(int index)
		// Stringtokenizer : 문자열을 구분문자열을 기준으로 분리할 때 사용한다. ex) 전화번호 (-)기준으로 구분 등
		//					 nextToken() / hasMoreTokens() / countTokens()
		
		// wrapper 클래스
		// 기본 자료형들을 객체로 다루는데 사용 / 기본에서 앞글자가 대문자로 바뀐다.
		// Boolean / Character / Byte / Short / Integer / Long / Double / Float 클래스
		// Wrapper클래스명 객체명  = new Wrapper클래스명 (값);
		
		// auto boxing
		Integer i = 10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c ='A'; 
		
		// auto unboxing
		int ii = i;
		double dd = d;
		float ff = f;
		char cc = c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
		
		// Random 클래스
		// 무작위값을 얻고 싶을때 사용
		// Random 객체명 = new Random();
		// 생성자 : Random() / Random(int seed)
		// 메서드 : int nextInt() / int nextInt(int n) / boolean nextBoolean() / long nextLong()
		// 		  double nextDouble, float nextFloat()

	}
}
