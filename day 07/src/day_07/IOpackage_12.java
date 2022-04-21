package day_07;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class IOpackage_12 {

	public static void main(String[] args) throws Exception {
		// RandomAccessFile: ��Ģ������ ������� ó�������� ���������� ����ó���� �� �� �ְ� �ϴ� ��Ʈ�� 
		// �ϳ��� ��Ʈ������ ���Ͽ� �Է°� ����� ��� ������ �� �ִ� ��Ʈ�� 
		// Input, Output�� ������� �ʰ� Object�� ��� �޴´�.
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
		

//���θ޼���
	}
//����Ŭ����
}
