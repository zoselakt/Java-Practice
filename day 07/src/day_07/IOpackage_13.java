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
		// StringReader / String writer / FilterWriter 클래스
		// StringReader: 문자열을 동기적 또는 비동기적으로 읽을 수 있다. / 
		//               Read메서드에서 다음 읽을 문자를 나타내기 위해 내부 카운터를 가지고 있다.
		// StringWriter: 문자열을 스트림에 기록하거나 읽어낼 때 사용하는 클래스 
		
		String str = "StringWriter 연습";
		
		StringReader strin = new StringReader(str);
		StringWriter strout = new StringWriter();
		
		int data = 0;
		
		while((data = strin.read()) != -1) {
			strout.write(data);
		}
		System.out.println("입력문자열: "+str);
		System.out.println("출력문자열: "+strout.toString());
		System.out.println("출력문자열: "+strout.getBuffer());
		System.out.println("출력문자열: "+strout.getBuffer().toString());
//-------------------------------------------------------------------------------------
System.out.println("====================================================================");
		// FilterWriter
		// 필터처리된 캐릭터 라인 스트림을 출력하기 위한 추상클래스
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
//메인메서드		
	}
//메인클래스
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