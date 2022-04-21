package day_07;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IOpackage_12 {

	public static void main(String[] args) throws Exception {
		// RandomAccessFile: 원칙적으로 순서대로 처리되지만 예외적으로 접근처리를 할 수 있게 하는 스트림 
		// 하나의 스트림으로 파일에 입력과 출력을 모두 수행할 수 있는 스트림 
		// Input, Output을 상속하지 않고 Object를 상속 받는다.
		RandomAccessFile ra = new RandomAccessFile("random.txt","rw");
		
		System.out.println(ra.getFilePointer());
		ra.writeInt(100);
		System.out.println(ra.getFilePointer());
		ra.writeLong(1000L);
		System.out.println(ra.getFilePointer());
		ra.writeChar('a');
		System.out.println(ra.getFilePointer());
		
		System.out.println(ra.length()+"bytes");
		System.out.println(ra.read());
		
		ra.seek(0);
		System.out.println(ra.readInt());
		
		int[] jumsu = {100, 80, 90,
				88, 99, 77,
				60, 70, 80,
				65, 75, 90,
				85, 95, 71};
		
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		
		for(int i=0; i<jumsu.length; i++) {
			ra.writeInt(jumsu[i]);
		}
		System.out.println("================================================");
		int pnt = (int)ra.getFilePointer();
		System.out.println(pnt);
		for(int i=pnt; i>0; i-=4) {
			ra.seek(i-4);
			System.out.println(ra.readInt());
		}
		

//메인메서드
	}
//메인클래스
}
