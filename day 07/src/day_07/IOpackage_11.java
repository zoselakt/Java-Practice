package day_07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class IOpackage_11 implements Serializable{
		// 직렬화 사용연습
	String id;
	String pw;
	String name;
	
	public IOpackage_11() {
		this("none", "1234", "james");
	}
		
	public IOpackage_11(String id, String password, String name){
		this.id= id;
		this.pw= password;
		this.name= name;
	}
	
	public String toString() {
		return id + "," + pw + "," + name;
		
	}
	
	public static void main(String[] args) throws Exception{
		//직렬화
		String fname = "obj.ser";
		FileOutputStream fo = new FileOutputStream(fname);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		ObjectOutputStream out = new ObjectOutputStream(bo);
		IOpackage_11 p1 = new IOpackage_11("idkim", "1111", "김말똥");
		IOpackage_11 p2 = new IOpackage_11("idkang", "1234", "강말똥");
		
		ArrayList al = new ArrayList();
		al.add(p1); al.add(p2);
		
		out.writeObject(p1);
		out.writeObject(p2);
		out.writeObject(al);
		out.writeObject(new Date());
		out.close(); fo.close(); bo.close();
		System.out.println("직렬화 성공");
		
//-----------------------------------------------------------------------------------
		//역직렬화
		String fname1 = "obj.ser";
		FileInputStream fo1 = new FileInputStream(fname1);
		BufferedInputStream bo1 = new BufferedInputStream(fo1);
		
		ObjectInputStream oin = new ObjectInputStream(bo1);
		
		ArrayList list = (ArrayList) oin.readObject();
		Date date = (Date)oin.readObject();

		System.out.println(list);
		System.out.println("객체가 저장된 시간: "+date.toString());
		System.out.println("현재시간: "+ new Date().toString());
		oin.close();
		
//메인메서드
	}
//메인클래스
}
