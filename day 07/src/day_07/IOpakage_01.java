package day_07;

import java.io.*;

public class IOpakage_01 {
	public static void main(String[] args) throws IOException{
		// 입출력, 자바의 IO 패키지
		// 스트림 : 데이터의 흐름 / 단방향 / byte기반과 문자단위로 분류
		
		// byte기반 스트림 : 바이트 단위로 데이터를 입출력하는 스트림
		// input: abstract int read() / int read(byte[] b) / int read(byte []b, int off, int len)
		// output: abstract int write() / int write(byte[] b) / int write(byte []b, int off, int len)
		// ex) 파일입출력
		// FileInputStream fis = null;
		// fis = new FileInputStream("파일위치");
		// fis.read();
				
				FileInputStream fis=null;
				FileOutputStream fos=null;
				fis=new FileInputStream("prac.txt"); // 존재하는 파일과 연결
				fos=new FileOutputStream("result.txt"); // 존재하지 않으면 파일생성, 존재하면 파일 덮어쓰기
				
				BufferedInputStream bis = new BufferedInputStream(fis); //보조바이트스트림
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				int data;
				while((data=fis.read()) !=-1) {
					//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때까지
					// while 의 마지막 -1은 end of file의 의미
					bos.write(data);
				}
				//파이썬의 open / 파일과의 연결을 닫는 작업
				bos.close();
				bis.close(); 
	}}
