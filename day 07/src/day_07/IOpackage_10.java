package day_07;

import java.io.*;

public class IOpackage_10 {
	public static void main(String[] args) {
		// 직렬화 : 자바시스템 내부에서 사용하는 객체나 데이터를 외부의 시스템에서 사용할 수 있도록 
		//        byte 단위의 데이터로 변환시키는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술
		//        객체를 연속적인 데이터로 변환하는 것. 반대과정은 역직렬화라고 한다.
		// 사용방법 
		// class A implement Serializable{  // Serializeble를 인터페이스로 생성한다. 
		//		...
		//	}
		//	A a = new A();
		
		// 자동(역) 직렬화 메서드
		// defaultReadObject(), defaultWriteObject()
		
		marshalling(); //직렬화
		unmarshalling(); //역직렬화
//메인메서드
	}
	
	//직렬화
	public static void marshalling() {
		try {
		FileOutputStream fos = new FileOutputStream("user.ser");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream out = new ObjectOutputStream(bos); // 직렬화 생성자
		
		User User1 = new User("test", "1234", "가길동");
		out.writeObject(User1); // 직렬화: Object
		out.close();
		
		System.out.println("객체직렬화 완료!");
		} catch(IOException e) {e.printStackTrace();}
	}
	
	//역직렬화
	public static void unmarshalling() {
		try {
		FileInputStream fis = new FileInputStream("user.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis); // 직렬화 생성자
		
		User user2 = (User)in.readObject(); //역직렬화 : readObject()
		System.out.println(user2.toString());
		in.close();
		System.out.println("객체복원완료");
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
//메인클래스
}
	
class User implements Serializable{ // 직렬화 인터페이스 생성
	private String id;
	private String pw;
	private String name;
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
}
