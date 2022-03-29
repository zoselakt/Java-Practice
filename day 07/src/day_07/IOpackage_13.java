package day_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class IOpackage_13 {

	public static void main(String[] args) throws IOException {
		// StringReader / String writer / FilterWriter Ŭ����
		// StringReader: ���ڿ��� ������ �Ǵ� �񵿱������� ���� �� �ִ�. / 
		//               Read�޼��忡�� ���� ���� ���ڸ� ��Ÿ���� ���� ���� ī���͸� ������ �ִ�.
		// StringWriter: ���ڿ��� ��Ʈ���� ����ϰų� �о �� ����ϴ� Ŭ���� 
		
		String str = "StringWriter ����";
		
		StringReader strin = new StringReader(str);
		StringWriter strout = new StringWriter();
		
		int data = 0;
		
		while((data = strin.read()) != -1) {
			strout.write(data);
		}
		System.out.println("�Է¹��ڿ�: "+str);
		System.out.println("��¹��ڿ�: "+strout.toString());
		System.out.println("��¹��ڿ�: "+strout.getBuffer());
		System.out.println("��¹��ڿ�: "+strout.getBuffer().toString());
//-------------------------------------------------------------------------------------
System.out.println("====================================================================");
		// FilterWriter
		// ����ó���� ĳ���� ���� ��Ʈ���� ����ϱ� ���� �߻�Ŭ����
		String srcFile = args[0];
		String targetFile = args[1];
		
		BufferedReader bin = null;
		FileReader fin = null;
		FileWriter fo = null;
		
		fo = new FileWriter(targetFile);
		fin = new FileReader(srcFile);
		bin = new BufferedReader(fin);
		SubFilterWriter sfw = new SubFilterWriter(fo);
		
		int data1 = 0;
		while ((data1 = bin.read()) != -1) {
			sfw.write(data1);
		}
		bin.close();
		sfw.close();
//���θ޼���		
	}
//����Ŭ����
}

class SubFilterWriter extends FilterWriter{
	StringWriter sw = new StringWriter();
	boolean flag = false;
	
	public SubFilterWriter(Writer out) {
		super(out);
	}
	
	public void write(int data2) throws IOException{
		if(data2 == '<') {
			flag = true;
		}else if(data2 == '>' && flag) {
			flag = false;
			return;
		}
		
		if(flag) {
			sw.write(data2);
		} else {
			out.write(data2);
		}
	}
	public void close() throws IOException {
		super.close();
	}
}