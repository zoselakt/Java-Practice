package day_03;

public class Class_07 {
	public static void main(String[] args) {
		// 인터페이스 : 상호작용 할 수있도록 하는 매개역할
		// 클래스- 설계도 / 인터페이스-규격
		// 상수만 가능
		
		// 인터페이스의 멤버
		// 상수 : final 타입 변수명 = 값;
		// 추상메서드 : abstract 리턴 타입 메서드 명();
		
		// 구현방법
		// interface 인터페이스명 {
		// 		필드(멤버)
		// }
		
		// interface 인터페이스명 {
		//
		//	}
		// class 클래스명 implements 인터페이스명{
		//		추상메서드 구현
		// }
		
		// 주의할 점.
		// 인터페이스 내 일반메서드 불가
		// 인터페이스 내 변수불가 (상수만 가능)
		// 인터페이스로 객체 생성불가.
		
		
		// 인터페이스의 다중구현
		// 인터페이스를 사용하여 여러기능으로 정의된 인터페이스를 다중구현
		// class 클래스명 implements 인터1, 인터2, 인터3 ...{
		// 		모든 추상 메서드 구현
	    // }
		
		// 구조
		// interface 인터페이스1{}
		// interface 인터페이스2{}
		// interface 인터페이스3{}
		
		// class 클래스명 implements 인터페이스1, 인터페이스2, 인터페이스3...{
		//			모든 추상메서드 구현
		// }
		
		MyCellPhone phone1=new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3= new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5=new MyCellPhone();
		PhoneUser user1=new PhoneUser();
		
		user1.call(phone1); // O
		//user1.call(phone2); // X 인터페이스 내에 없음
		user1.call(phone3); // O
		//user1.call(phone4); // X 인터페이스 내에 없음
		//user1.call(phone5); // X 인터페이스 내에 없음	
	}
}

interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock{
	@Override
	public void clock() {
		System.out.println("clock()");
	}
	@Override
	public void write() {
		System.out.println("write");
	}
	@Override
	public void calling() {
		System.out.println("calling");
	}
	@Override
	public void photo() {
		System.out.println("photo");
	}
}
class PhoneUser{
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}