package day_07;

import java.io.*;

public class Marshalling_01 {
	public static void main(String[] args) {
		// 직렬화 : 자바시스템 내부에서 사용하는 객체나 데이터를 외부의 시스템에서 사용할 수 있도록 
		//        byte 단위의 데이터로 변환시키는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술
		// 사용방법
		// class A implement Serializable{
		//		...
		//	}
		//	A a = new A();
		marshalling();
		unmarshalling();
		
	}
	public static void marshalling() {

		try {
		FileOutputStream fos = new FileOutputStream("user.ser");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream out = new ObjectOutputStream(bos);
		
		User User1 = new User("test", "1234", "가길동");
		out.writeObject(User1);
		out.close();
		System.out.println("객체직렬화 완료!");
	}catch(IOException e) {e.printStackTrace();}
	}
	public static void unmarshalling() {
		try {
		FileInputStream fis = new FileInputStream("user.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		User user2 = (User)in.readObject();
		System.out.println(user2.toString());
		in.close();
		System.out.println("객체복원완료");
		}
		catch(Exception e) {}
	}
}
	
class User implements Serializable{
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
