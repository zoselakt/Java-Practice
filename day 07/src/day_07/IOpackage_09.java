package day_07;

import java.io.*;

public class IOpackage_09 {

	public static void main(String[] args) throws IOException {
		// ǥ������� ��Ʈ��
		// ��� ��Ʈ��: system.in / system.out / system.err
		// �긮�� ��Ʈ��: InputStreamReader, OutputStreamWriter
		
		InputStream is = System.in;
		PrintStream po = System.out;
		PrintStream pe = System.err;
		
		InputStreamReader ir = new InputStreamReader(is);
		OutputStreamWriter ow = new OutputStreamWriter(po);
		OutputStreamWriter oe = new OutputStreamWriter(pe);
		
		int data = 0;
		
		while((data = ir.read()) != -1) {
			ow.write(data);
			ow.flush();
		}
		
		ir.close();
		ow.close();
		oe.close();
		is.close();
		po.close();
		pe.close();

//-------------------------------------------------------------------------------------
System.out.println("==================================================================");
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		InputStreamReader ir1 = new InputStreamReader(System.in);
		OutputStreamWriter ow1 = new OutputStreamWriter(System.out);
		
		br = new BufferedReader(ir1);
		bw = new BufferedWriter(ow1);
		
		String res = "";
		
		while((res = br.readLine()) != null) {
			bw.write(res);
			bw.flush();
		}
		bw.close();
		br.close();
		ir1.close();
		ow1.close();
//-------------------------------------------------------------------------------------
System.out.println("==================================================================");
		PrintStream ps = null;
		FileOutputStream fo = null;
		
		fo = new FileOutputStream("standardTest.txt");
		ps = new PrintStream(fo);
				
		System.setOut(ps);
		
		System.out.println("ǥ��������׽�Ʈ1");
		System.out.println("ǥ��������׽�Ʈ2");
//���θ޼���
	}
//����Ŭ����
}
