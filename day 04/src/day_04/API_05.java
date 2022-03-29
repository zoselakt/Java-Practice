package day_04;

public class API_05{
	/*
	public static final int PLATINUM_MEMBER = 1;
	public static final int GOLD_MEMBER = 2;
	public static final int SILVER_MEMBER = 3;
	public static final int BRONZE_MEMBER = 4;
	*/
	
	public static void main(String[] args) {
		//enum 클래스: 열거형 클래스 / 연관된 상수들의 집합
		// 생성자를 가질수 있다 / 접근제어자는 private만 가진다.
		// 컴파일할때 자동으로 생성자를 만들어준다 / 생성자로 객체를 생성할 수 없다.
		// enum클래스의 value메소드를 호출하면 enum클래스내 모든 상수를 리턴한다.
		
		/*
		회원등급 할인율
		1. 플레티넘
		2. 골드
		3. 실버
		4. 브론즈
		*/

		/*
		A grade = A.PLATINUM_MEMBER;
		switch (grade) {
		case PLATINUM_MEMBER:
			System.out.println(30+"% 할인");
			break;
		case GOLD_MEMBER:
			System.out.println(20+"% 할인");
			break;
		case SILVER_MEMBER:
			System.out.println(10+"% 할인");
			break;
		case BRONZE_MEMBER:
			System.out.println(5+"% 할인");
			break;
		}*/
		
		A a = A.GOLD_MEMBER;
		System.out.println(a);
		String str = a.getDiscount();
		System.out.println(str);
		System.out.println("============================");
		for(A ar : a.values()) {
			System.out.println(ar + ": " + ar.getDiscount());
		}
//메인		
}}
/*
interface LEVEL{
	int PLATINUM_MEMBER = 1,  GOLD_MEMBER = 2, SILVER_MEMBER = 3, BRONZE_MEMBER = 4;
}*/

enum A{
	PLATINUM_MEMBER(30),  GOLD_MEMBER(20), SILVER_MEMBER(10), BRONZE_MEMBER(5); //
	int discount;
	A(int discount){
		this.discount = discount;
	}
	public String getDiscount() {
		return discount + "% 할인";
	}
	/*
	A(){
		System.out.println("생성자 등급: "+this); //회원등급만큼 증가
	}
	*/
}