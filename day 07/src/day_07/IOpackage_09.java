package day_07;

import java.io.*;

public class IOpackage_09 {

	public static void main(String[] args) throws IOException {
		// 표준입출력 스트림
		// 노드 스트림: system.in / system.out / system.err
		// 브리지 스트림: InputStreamReader, OutputStreamWriter
		
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
		
		System.out.println("표준입출력테스트1");
		System.out.println("표준입출력테스트2");
//메인메서드
	}
//메인클래스
}
