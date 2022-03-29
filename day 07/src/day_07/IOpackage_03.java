package day_07;

import java.io.*;
import java.util.Arrays;

public class IOpackage_03 extends Thread{

	public static void main(String[] args) throws IOException {
		// ByteArrayInputStream / ByteArrayoutputStream
		// 바이트배열에 데이터를 입출력하는데 사용되는 스트림이다. 
		// 주로 다른곳에 입출력하기 전에 데이터를 임시로 바이트배열에 담아서 변환 등의 작업을 하는데 사용된다
		
		byte[] input = {0,1,2,3,4,5,6,7,8,9};
		byte[] output = null;
		
		ByteArrayInputStream ins = null;
		ByteArrayOutputStream outs = null;
		
		ins = new ByteArrayInputStream(input);
		outs = new ByteArrayOutputStream();
		
		int n = 0;
		
		byte [] buff = new byte[10];
		ins.read(buff, 0, input.length);
		outs.write(buff, 4, 5); // 4번째부터 5개까지
		
		output = outs.toByteArray();
		System.out.println(Arrays.toString(output));
		
		// pipedInputStream / pipedoutputStream
		// 주로 멀티 스레드처리에 사용한다 / 하나의 스레드가 읽어 들인 내용을 다른 스레드에게 전달하고자 할때 사용한다.
		
		PipedInputStream pin = new PipedInputStream();
		PipedOutputStream po = new PipedOutputStream();
		
		pin.connect(po);
		
		IOpackage_03 t1 = new IOpackage_03(System.in, po);
		IOpackage_03 t2 = new IOpackage_03(pin, System.out);
		
		t1.start();
		t2.start();
//메인		
	}
	InputStream input;
	OutputStream output;
	
	IOpackage_03(InputStream in, OutputStream out){
		input = in;
		output = out;
	}
	public void run() {
		byte [] buff = new byte[1024];
		int data = 0;
		
		while(true) {
			try {
				data = input.read(buff);
				if(data != -1) {
					output.write(buff, 0, data);
				}else {
					return;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
//메인클래스
}
