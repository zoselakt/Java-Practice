package day_07;

import java.io.*;

public class IOpackage_01 {
	public static void main(String[] args) throws IOException{
		// �����, �ڹ��� IO ��Ű��
		// ��Ʈ�� : �������ġ�� �ڹ� �������α׷��� �����ϴ� ��� / �������� �帧  / �����Ͱ� ������ ���
		// �ܹ��� / byte��ݰ� ���ڴ����� �з� / ���Լ��ⱸ��
		
		// ���� :����Ʈ����½�Ʈ��, ��������� ��Ʈ��, �ɸ��� ��Ʈ��
		
		// byte��� ��Ʈ�� : ����Ʈ ������ �����͸� ������ϴ� ��Ʈ��
		// input��Ʈ��: abstract int read() / int read(byte[] b) / int read(byte []b, int off, int len)
		// output��Ʈ��: abstract int write() / int write(byte[] b) / int write(byte []b, int off, int len)
		
		// ex) ���������
		// FileInputStream fis = null;
		// fis = new FileInputStream("������ġ");
		// fis.read();
				
		// �����ϴ� ���ϰ� ����
		FileInputStream fis=null;
		fis = new FileInputStream("prac.txt"); 
		
		// �������� ������ ���ϻ���, �����ϸ� ���� �����
		FileOutputStream fos=null;
		fos=new FileOutputStream("result.txt", true); 
				
		 //��������Ʈ��Ʈ��
		BufferedInputStream bis = new BufferedInputStream(fis); //��������Ʈ��Ʈ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
				
		System.out.println("������ �Է��ϼ���: ");
		int data;
		// data�� �о�� ����Ʈ�� �����ϴµ�, data�� ���� -1�� �ƴҶ�����
		// while �� ������ -1�� end of file�� �ǹ�
		while((data=fis.read()) !=-1) { 
			bos.write(data);
			bos.flush(); // ��Ʈ���� �ִ� �����͸� ����ϴ� ����
		}
		//���̽��� open / ���ϰ��� ������ �ݴ� �۾�
		bos.close();
		bis.close();
				
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");				
				
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
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
	// �迭��� �����б�
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
