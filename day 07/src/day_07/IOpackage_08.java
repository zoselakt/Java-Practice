package day_07;

import java.io.*;

public class IOpackage_08 {

	public static void main(String[] args) throws IOException {
		//FileReader / FileWriter�� �̿��� ���Ϻ���
		File fsrc = new File("practice.txt"); // �ҽ�����
		File ftarget = new File("fileTarget.txt"); // Ÿ������
		
		FileReader fr = null; 
		FileWriter fw = null;
		
		BufferedReader buffin = null;
		BufferedWriter buffout = null;
		
		int n;
		
		try {
			fr = new FileReader(fsrc);
			fw = new FileWriter(ftarget);
			
			buffin = new BufferedReader(fr);
			buffout = new BufferedWriter(fw);
			
			while((n = buffin.read()) != -1) {
				buffout.write((char)n);
			}
			
			buffin.close();
			buffout.close();
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//-----------------------------------------------------------------------------------------
		// 
		InputStreamReader ir = null;
		FileReader fr1 = null;
		FileWriter fw1 = null;
		
		System.out.println("������ ���ϸ��� �Է��ϼ���.");
		
		ir = new InputStreamReader(System.in);
		
		char ch[] = new char[100]; //�����̸��迭
		String fsrc1 = "";
		int n1 = ir.read(ch, 0, ch.length);
		
		fsrc1 = new String(ch, 0, n1-2);
		System.out.println(fsrc1+ "�� �����մϴ�.");
		System.out.println("Ÿ�������� �Է��ϼ���.");
		
		n = ir.read(ch, 0, ch.length);
		String ftarget1 = new String(ch, 0 , n-2);
		System.out.println(ftarget1+"�� �ٿ��ֱ⸦ �߽��ϴ�.");
		
		fr1 = new FileReader(fsrc1);
		fw1 = new FileWriter(ftarget1);
		
		int data = 0;
		while ((data = fr1.read()) != -1) {
			fw1.write(data);
			System.out.print((char)data);
		}
		System.out.println("����Ϸ�!");
		
		ir.close();
		fr1.close();
		fw1.close();
		
//���θ޼���		
	}
//����Ŭ����
}
