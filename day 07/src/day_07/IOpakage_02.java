package day_07;

import java.io.*;

public class IOpakage_02 {
	public static void main(String[] args) {
		// 문자 기반 스트림: 16비트의 문자나 문자열을 읽고 쓰는 스트림
		// Reader: int read() / int read(char[] cbuf) /abstract int read(char[] cbuf,int off, int len)
		// writer: void write(int c) / void write(char[] cbuf) abstract void write(char[] cbuf, int off, int len)
		// 			void write(String str) / void write(String str, int off, int len)
		// 사용 예시
		// FileReader fr = null;
		// fr = new FileReader("파일경로");
		FileReader fr;
		FileWriter fw;
		BufferedReader br;  //문자보조스트링
		BufferedWriter bw;
		
		try {
			fr=new FileReader("prac.txt");
			fw=new FileWriter("result.txt");
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			String line;
			while((line=br.readLine()) != null) {
				bw.write(line);
			}
			bw.close();
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}}
