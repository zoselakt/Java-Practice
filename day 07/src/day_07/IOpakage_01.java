package day_07;

import java.io.*;

public class IOpakage_01 {
	public static void main(String[] args) throws IOException{
		// �����, �ڹ��� IO ��Ű��
		// ��Ʈ�� : �������� �帧 / �ܹ��� / byte��ݰ� ���ڴ����� �з�
		
		// byte��� ��Ʈ�� : ����Ʈ ������ �����͸� ������ϴ� ��Ʈ��
		// input: abstract int read() / int read(byte[] b) / int read(byte []b, int off, int len)
		// output: abstract int write() / int write(byte[] b) / int write(byte []b, int off, int len)
		// ex) ���������
		// FileInputStream fis = null;
		// fis = new FileInputStream("������ġ");
		// fis.read();
				
				FileInputStream fis=null;
				FileOutputStream fos=null;
				fis=new FileInputStream("prac.txt"); // �����ϴ� ���ϰ� ����
				fos=new FileOutputStream("result.txt"); // �������� ������ ���ϻ���, �����ϸ� ���� �����
				
				BufferedInputStream bis = new BufferedInputStream(fis); //��������Ʈ��Ʈ��
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				int data;
				while((data=fis.read()) !=-1) {
					//data�� �о�� ����Ʈ�� �����ϴµ�, data�� ���� -1�� �ƴҶ�����
					// while �� ������ -1�� end of file�� �ǹ�
					bos.write(data);
				}
				//���̽��� open / ���ϰ��� ������ �ݴ� �۾�
				bos.close();
				bis.close(); 
	}}
