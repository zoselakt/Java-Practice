package day_07;

import java.io.*;

public class IOpackage_07 {
	public static void main(String[] args) throws IOException {
		// Character ��Ʈ�� Ŭ����
		// ���� ��Ʈ������ �����ڵ�� �� ���ڸ� ������ϴ� ��Ʈ��
		// ���ڷ� ǥ������ �ʴ� �����ʹ� �ٷ��� ���� / �̹���, ������ �� ���̳ʸ� �����ʹ� ����� �� �� ����.
		
		// Reader: BufferedReader-LineNumberReader / CharArrayReader / InputStreamReader-FileReader
		//         FilterReader-PushbackReader / PipedReader / StringReader
		// Writer: BufferedWriter / CharArrayWriter / OutputStreamReader-FileWriter
		//         FilterWriter / PipedWriter / PipedWriter / StringWriter / FilterWriter
		
		System.out.println("FileReader / OutputStreamWriter Ŭ����");
		FileReader fr = null; //���ϸ���
		
		try {
			fr = new FileReader("reader.txt"); // ��� ��Ʈ��: ���ϰ� ��Ʈ���� ��� ����
			
			OutputStreamWriter osw = new OutputStreamWriter(System.out); //�ƿ�ǲ��Ʈ��������
			
			int n;
			char[] buff = new char[100];
			
			/*
			while((n=fr.read()) != -1) {
				System.out.println(n);
			}
			fr.close();
			*/
			
			while((n=fr.read(buff, 0, buff.length)) != -1) {
				osw.write(buff, 0, n);
				osw.flush();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//--------------------------------------------------------------------------------------------
System.out.println("\n=======================================================================");
		// ��ǲ��Ʈ������Ŭ����
		System.out.println("FileWriter / InputStreamReader Ŭ����");
		FileInputStream fi = null; 
		InputStreamReader in = null;  // ��ǲ��Ʈ������
		
		fi = new FileInputStream("reader.txt");
		in = new InputStreamReader(fi, "UTF-8");
		int ch;
		
		while((ch = fi.read()) != -1) {
			System.out.print((char)ch);
		}
		fi.close();
		
		// FileWriter Ŭ����
		String res = "reader.txt";
		File file = new File(res);
		FileWriter fw = new FileWriter(file);
		for(int i=0; i<10; i++) {
			fw.write("��: "+i+"\n");
		}
		fw.close();
//���θ޼���
	}
//����Ŭ����
}
