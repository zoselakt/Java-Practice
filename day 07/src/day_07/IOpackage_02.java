package day_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOpackage_02 {
	public static void main(String[] args) throws IOException{
		// InputStream (System.in)
		// ���� ����Ʈ�� ���ڿ��� �������� ��õ ������ �аų� ����, ���̴� �߻����� ����
		//
		
		/*		
		int i=0;
		int cnt=0;
		
		try {
			while(true) { // a �Է� : 97 (a��), 13(read ��), 10(ln�� ��-�ٹٲ�)
				i = System.in.read(); // Ű����κ��� �Է��� �ްڴ�.
				System.out.println(i);
			cnt++;
				if(i=='z' || i=='Z') {
					break;
				}
			}
			System.out.println(cnt+ "����Ʈread ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
//-------------------------------------------------------------------------------
		
		// �迭��� InputStream 
		byte[] input = new byte[256];
		
		int i1 = 0; //0��°����
		int cnt1 = 0;
		int tot = 0;
		
		try {
			while((i1= System.in.read(input)) !=-1) { // ���ڼ�+\r+\n ���� ��� / InputStream�Է� �� InputStream\r\n = 13
													  // \r: ĳ�������� / \n: �����ǵ�(line feed)
				cnt1++;
				tot += i1;
				System.out.println("i1: "+i1); // ���: 13
				System.out.write(input, 0, i1); // write : ��½�Ʈ�� / 
				System.in.close();
				System.out.close();
			}
			System.out.println("cnt1: " + cnt1); //cmd�� �������� ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
/*
	// ��������� ��Ʈ���� �̿��� ���ϳ��� ����
		String src = "camera01.jpg"; // �ҽ�����
		String target = "camera02.jpg"; // Ÿ������
		
		FileInputStream fn = null;
		FileOutputStream fo = null;
		
		int n = 0;
		int tot1 = 0;
		int cnt2 = 0;
				
				fn = new FileInputStream(src); //���� ��Ʈ���� ��� ��Ʈ���̶�� �Ѵ�.
				fo = new FileOutputStream(target);
				
				byte buf [] = new byte[1024];
				
				while((n=fn.read(buf)) !=-1) {
						fo.write(buf, 0, n);
						fo.flush();
						cnt2++;
						tot1 =+ n;
					}
				
				System.out.println("ī��Ʈ ��: " + cnt2);
				System.out.println("���� ����Ʈ: " + tot1);
			
			fn.close();
			fo.close();

*/
//����
	}
}
