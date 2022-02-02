package day_03;

public class InterFace_02 {
	public static void main(String[] args) {
		// 인터페이스의 다중구현
		// 인터페이스를 사용하여 여러기능으로 정의된 인터페이스를 다중구현
		// class 클래스명 implements 인터1, 인터2, 인터3 ...{
		// 		모든 추상 메서드 구현
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