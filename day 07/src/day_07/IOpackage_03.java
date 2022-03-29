package day_07;

import java.io.*;
import java.util.Arrays;

public class IOpackage_03 extends Thread{

	public static void main(String[] args) throws IOException {
		// ByteArrayInputStream / ByteArrayoutputStream
		// ����Ʈ�迭�� �����͸� ������ϴµ� ���Ǵ� ��Ʈ���̴�. 
		// �ַ� �ٸ����� ������ϱ� ���� �����͸� �ӽ÷� ����Ʈ�迭�� ��Ƽ� ��ȯ ���� �۾��� �ϴµ� ���ȴ�
		
		byte[] input = {0,1,2,3,4,5,6,7,8,9};
		byte[] output = null;
		
		ByteArrayInputStream ins = null;
		ByteArrayOutputStream outs = null;
		
		ins = new ByteArrayInputStream(input);
		outs = new ByteArrayOutputStream();
		
		int n = 0;
		
		byte [] buff = new byte[10];
		ins.read(buff, 0, input.length);
		outs.write(buff, 4, 5); // 4��°���� 5������
		
		output = outs.toByteArray();
		System.out.println(Arrays.toString(output));
		
		// pipedInputStream / pipedoutputStream
		// �ַ� ��Ƽ ������ó���� ����Ѵ� / �ϳ��� �����尡 �о� ���� ������ �ٸ� �����忡�� �����ϰ��� �Ҷ� ����Ѵ�.
		
		PipedInputStream pin = new PipedInputStream();
		PipedOutputStream po = new PipedOutputStream();
		
		pin.connect(po);
		
		IOpackage_03 t1 = new IOpackage_03(System.in, po);
		IOpackage_03 t2 = new IOpackage_03(pin, System.out);
		
		t1.start();
		t2.start();
//����		
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
//����Ŭ����
}
