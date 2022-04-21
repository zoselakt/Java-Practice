package day_07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOpackage_05 {
	public static void main(String[] args) throws IOException {
		// DataInputStream / DataOutputStream
		// ������ �Է� ��Ʈ���� ���� �������� �����͸� ������ �Է� ��Ʈ������ ���� �ӽſ� �������� �ʰ� �����͸� ����ϴ� ��.
		// ����(primitive)�� �����͸� �Է��ϰ� ����ϴ� �� �˸´� Ŭ����
		
		// input
		// ������ : DataInputStream(InputStream in)
		// �޼��� : int read(byte[] b): ����Ʈ ������ �о b�� ���� / int read(byte[] b, int off, int len)
		// int �� readInt() / Double �� readDouble() / String �� readUTF() / static String readUTF(DataInput in) ���
		
		// output
		// ������ : DataOutputStream(OutputStream out)
		// �޼��� : void flush() - (write����), int size() - (void ����)
		// void write(byte[]b, int off, int len) / void writeInt(int v) / void writeUTF(String str) ���
		FileOutputStream fo1 = null;
		DataOutputStream dout = null;
		
		try {
			fo1 = new FileOutputStream("testData.txt");
			dout = new DataOutputStream(fo1);
			
			dout.writeInt(100);
			dout.writeFloat(10.0f);
			dout.writeBoolean(true);
			
			dout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		try {
			FileInputStream fin1 = new FileInputStream("testData.txt");
			DataInputStream din = new DataInputStream(fin1);
			
			System.out.println(din.readInt());
			System.out.println(din.readFloat());
			System.out.println(din.readBoolean());
			
			din.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//-------------------------------------------------------------------------------
System.out.println("===============================================================");
		// datainput output stream ��� ��
		// �ؽ�Ʈ ���
		int score [] = {90, 80, 100 , 80, 75};
		
		try {
			FileOutputStream fo2 = new FileOutputStream("testData1.txt");
			DataOutputStream dout1 = new DataOutputStream(fo2);
			
			for(int i=0; i<score.length; i++) {
				dout1.write(score[i]);
			}
			dout1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �ؽ�Ʈ �ҷ�����
		int sum = 0;
		int jumsu = 0;
		String fname1="testData1.txt";
		
		FileInputStream fin2 = null;
		DataInputStream din2 = null;
		
		try {
			fin2 = new FileInputStream(fname1);
			din2 = new DataInputStream(fin2);
			
			while(true) {
				jumsu = din2.readInt();
				System.out.println(jumsu);
				sum += jumsu;
			}
			
		} catch (EOFException e) {
			System.out.println("���� �հ�: " + sum + "��");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(din2 != null) {
				try {
					din2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
//		-------------------------------------------------------------------------------
System.out.println("===============================================================");
		String srcFile = "datainout.txt";
		String targerFile = "datainout.txt";
		
		FileOutputStream fo2 = new FileOutputStream(targerFile);
		DataOutputStream dout2 = new DataOutputStream(fo2);
		
		byte bt = 10;
		byte [] arr = {20, 100, 126};
		boolean bool = true;
		char ch = '��';
		String str = "�ڹٿ���";
		
		dout2.write(bt);
		dout2.write(arr, 0, arr.length);
		dout2.writeBoolean(bool);
		dout2.writeChar(ch);
		dout2.writeUTF(str);
		System.out.println("��¹���Ʈ: " + dout2.size());
		dout2.flush();
		dout2.close();
		
		DataInputStream din = new DataInputStream(new FileInputStream(srcFile));
		System.out.println("���� ����Ʈ ��: " + din.available());
		byte bt2 = din.readByte();
		int n = din.read(arr, 0, arr.length);
		boolean bool1 = din.readBoolean();
		char ch1 = din.readChar();
		String str1 = din.readUTF();
		
		System.out.println("bt2: "+bt2 +", n: "+n+", bool1: "+bool1+", ch1: "+ch1+", str1: "+str1);
		
		for(byte bt3 : arr) {
			System.out.print(bt3 + " ");
		}
//���θ޼���
	}
//����Ŭ����
}
