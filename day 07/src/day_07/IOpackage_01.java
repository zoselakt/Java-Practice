package day_07;

import java.io.*;

public class IOpackage_01 {
	public static void main(String[] args) throws IOException{
		// 입출력, 자바의 IO 패키지
		// 스트림 : 입출력장치와 자바 응용프로그램을 연결하는 통로 / 데이터의 흐름  / 데이터가 오고가는 통로
		// 단방향 / byte기반과 문자단위로 분류 / 선입선출구조
		
		// 종류 :바이트입출력스트림, 문자입출력 스트림, 케릭터 스트림
		
		// byte기반 스트림 : 바이트 단위로 데이터를 입출력하는 스트림
		// input스트림: abstract int read() / int read(byte[] b) / int read(byte []b, int off, int len)
		// output스트림: abstract int write() / int write(byte[] b) / int write(byte []b, int off, int len)
		
		// ex) 파일입출력
		// FileInputStream fis = null;
		// fis = new FileInputStream("파일위치");
		// fis.read();
				
		// 존재하는 파일과 연결
		FileInputStream fis=null;
		fis = new FileInputStream("prac.txt"); 
		
		// 존재하지 않으면 파일생성, 존재하면 파일 덮어쓰기
		FileOutputStream fos=null;
		fos=new FileOutputStream("result.txt", true); 
				
		 //보조바이트스트림
		BufferedInputStream bis = new BufferedInputStream(fis); //보조바이트스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);
				
		System.out.println("내용을 입력하세요: ");
		int data;
		// data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때까지
		// while 의 마지막 -1은 end of file의 의미
		while((data=fis.read()) !=-1) { 
			bos.write(data);
			bos.flush(); // 스트림에 있는 데이터를 출력하는 과정
		}
		//파이썬의 open / 파일과의 연결을 닫는 작업
		bos.close();
		bis.close();
				
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");				
				
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
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
	// 배열사용 파일읽기
		String fname = args[0];
		
		try {
			FileInputStream fn = new FileInputStream(fname);
			fn = new FileInputStream("prac.txt"); 
			
			int n = 0;
			byte bb[] = new byte[1024];
			
			while((n = fn.read(bb)) !=-1) {
				System.out.write(bb,0,n);
			}
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
//main
	}
}
