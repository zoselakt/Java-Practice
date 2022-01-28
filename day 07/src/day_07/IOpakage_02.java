package day_07;

import java.io.*;

public class IOpakage_02 {
	public static void main(String[] args) {
		// ���� ��� ��Ʈ��: 16��Ʈ�� ���ڳ� ���ڿ��� �а� ���� ��Ʈ��
		// Reader: int read() / int read(char[] cbuf) /abstract int read(char[] cbuf,int off, int len)
		// writer: void write(int c) / void write(char[] cbuf) abstract void write(char[] cbuf, int off, int len)
		// 			void write(String str) / void write(String str, int off, int len)
		// ��� ����
		// FileReader fr = null;
		// fr = new FileReader("���ϰ��");
		FileReader fr;
		FileWriter fw;
		BufferedReader br;  //���ں�����Ʈ��
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
