package day_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOpackage_02 {
	public static void main(String[] args) throws IOException{
		// InputStream (System.in)
		// 개별 바이트나 문자열인 데이터의 원천 파일을 읽거나 쓸때, 쓰이는 추상적인 개념
		//
		
		/*		
		int i=0;
		int cnt=0;
		
		try {
			while(true) { // a 입력 : 97 (a값), 13(read 값), 10(ln의 값-줄바꿈)
				i = System.in.read(); // 키보드로부터 입력을 받겠다.
				System.out.println(i);
			cnt++;
				if(i=='z' || i=='Z') {
					break;
				}
			}
			System.out.println(cnt+ "바이트read ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
//-------------------------------------------------------------------------------
		
		// 배열사용 InputStream 
		byte[] input = new byte[256];
		
		int i1 = 0; //0번째부터
		int cnt1 = 0;
		int tot = 0;
		
		try {
			while((i1= System.in.read(input)) !=-1) { // 글자수+\r+\n 포함 출력 / InputStream입력 → InputStream\r\n = 13
													  // \r: 캐리지리턴 / \n: 라인피드(line feed)
				cnt1++;
				tot += i1;
				System.out.println("i1: "+i1); // 출력: 13
				System.out.write(input, 0, i1); // write : 출력스트림 / 
				System.in.close();
				System.out.close();
			}
			System.out.println("cnt1: " + cnt1); //cmd상 컴파일후 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//-------------------------------------------------------------------------------
System.out.println("--------------------------------------------------------");
/*
	// 파일입출력 스트림을 이용한 파일내용 복사
		String src = "camera01.jpg"; // 소스파일
		String target = "camera02.jpg"; // 타겟파일
		
		FileInputStream fn = null;
		FileOutputStream fo = null;
		
		int n = 0;
		int tot1 = 0;
		int cnt2 = 0;
				
				fn = new FileInputStream(src); //파일 스트림은 노드 스트림이라고도 한다.
				fo = new FileOutputStream(target);
				
				byte buf [] = new byte[1024];
				
				while((n=fn.read(buf)) !=-1) {
						fo.write(buf, 0, n);
						fo.flush();
						cnt2++;
						tot1 =+ n;
					}
				
				System.out.println("카운트 수: " + cnt2);
				System.out.println("읽은 바이트: " + tot1);
			
			fn.close();
			fo.close();

*/
//메인
	}
}
