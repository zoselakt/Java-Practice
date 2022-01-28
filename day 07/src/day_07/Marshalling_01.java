package day_07;

import java.io.*;

public class Marshalling_01 {
	public static void main(String[] args) {
		// ����ȭ : �ڹٽý��� ���ο��� ����ϴ� ��ü�� �����͸� �ܺ��� �ý��ۿ��� ����� �� �ֵ��� 
		//        byte ������ �����ͷ� ��ȯ��Ű�� ����� ����Ʈ�� ��ȯ�� �����͸� �ٽ� ��ü�� ��ȯ�ϴ� ���
		// �����
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
		
		User User1 = new User("test", "1234", "���浿");
		out.writeObject(User1);
		out.close();
		System.out.println("��ü����ȭ �Ϸ�!");
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
		System.out.println("��ü�����Ϸ�");
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
