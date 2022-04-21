package day_07;

import java.io.*;

public class IOpackage_07 {
	public static void main(String[] args) throws IOException {
		// Character 스트림 클래스
		// 문자 스트림으로 유니코드로 된 문자를 입출력하는 스트림
		// 문자로 표현되지 않는 데이터는 다루지 않음 / 이미지, 동영상 등 바이너리 데이터는 입출력 할 수 없음.
		
		// Reader: BufferedReader-LineNumberReader / CharArrayReader / InputStreamReader-FileReader
		//         FilterReader-PushbackReader / PipedReader / StringReader
		// Writer: BufferedWriter / CharArrayWriter / OutputStreamReader-FileWriter
		//         FilterWriter / PipedWriter / PipedWriter / StringWriter / FilterWriter
		
		System.out.println("FileReader / OutputStreamWriter 클래스");
		FileReader fr = null; //파일리더
		
		try {
			fr = new FileReader("reader.txt"); // 노드 스트림: 파일과 스트림의 노드 연결
			
			OutputStreamWriter osw = new OutputStreamWriter(System.out); //아웃풋스트림라이터
			
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
		// 인풋스트림리더클래스
		System.out.println("FileWriter / InputStreamReader 클래스");
		FileInputStream fi = null; 
		InputStreamReader in = null;  // 인풋스트림리더
		
		fi = new FileInputStream("reader.txt");
		in = new InputStreamReader(fi, "UTF-8");
		int ch;
		
		while((ch = fi.read()) != -1) {
			System.out.print((char)ch);
		}
		fi.close();
		
		// FileWriter 클래스
		String res = "reader.txt";
		File file = new File(res);
		FileWriter fw = new FileWriter(file);
		for(int i=0; i<10; i++) {
			fw.write("줄: "+i+"\n");
		}
		fw.close();
//메인메서드
	}
//메인클래스
}
