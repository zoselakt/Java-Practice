package day_07;

import java.io.*;

public class IOpackage_04 {
	public static void main(String[] args) throws IOException {
		// File클래스 기본 개념 및 주요메서드
		// 파일의 경로명을 다루는 클래스 / 파일 읽고 쓰는 기능은 없다.
		// 파일과 디렉토리의 접근권한, 생성된 시간, 마지막 수정일자, 크기 등의 정보를 얻을 수 있는 메소드를 가지고 있다.
				
		// File클래스 생성자
		// File(File parent,String child): parent 디렉터리에 child이름의 디렉터리나 파일을 나타내는 객체생성
		// File(String pathname): pathname이 나타내는 File객체생성
		// File(String parent, String child): parent 디렉터리에 child이름의 디렉터리나 파일을 나타내는 객체생성
		// File(URI uri): file:URI를 추상경로명으로 변환하여 File객체생성
				
		String fname1 = args[0];
				
		File file = new File(fname1);
				
		System.out.println("파일명: "+file.getName()); // 파일명을 불러오는 메서드
		System.out.println("파일절대경로: "+file.getAbsolutePath()); 
		System.out.println("파일상대경로: "+file.getPath());
		System.out.println("파일사이즈: "+file.length());
				
		File file2 = new File("Test", "ftest2.txt"); // 추상적인 경로 / 실제로 파일은 존재하지 않는다.
		System.out.println(file2.getAbsolutePath()); // 인스턴스만 생성한것으로 실제로 생성된 것은 아니다.
		System.out.println(file2.exists());
				
		System.out.println("file이 파일인지 여부: "+file.isFile());
		System.out.println("file2이 파일인지 여부: "+file2.isFile());
		System.out.println("file.txt의 부모경로: "+file.getParent());
		System.out.println("file2.txt의 부모경로: "+file2.getParent());
				
		System.out.println(file.canRead() ? "읽기가능":"읽기불가능");
		System.out.println(file2.canRead() ? "읽기가능":"읽기불가능");
		System.out.println(file.canWrite() ? "쓰기가능":"쓰기불가능");
		System.out.println(file2.canWrite() ? "쓰기가능":"쓰기불가능");
				
		File file3 = new File("상위폴더", "하위폴더"); // 폴더생성
		file3.mkdirs(); // 여러 폴더생성
				
		boolean ren = file3.renameTo(new File("test1")); //이름변경
		boolean res = file3.delete(); // 삭제
				
		int pos = fname1.lastIndexOf('.');
		System.out.println("확장자를 제외한 파일명: "+fname1.substring(0, pos));
		System.out.println("확장자: "+fname1.substring(pos+1));
		System.out.println("파일구분자: "+file.separator);
		System.out.println("파일구분자: "+file.separatorChar);
	
		
//---------------------------------------------------------------------------------------------
System.out.println("===================================================================");
		// BufferedInputStream / BufferedOutputStream
		// 기존의 입출력 클래스는 파일을 직접 읽거나 직접 하드에 접근하기 때문에 성능을 저하시킬수 있어
		// 데이터를 읽어 올때 한번에 읽어 버퍼를 두거나 데이터를 쓸때 버퍼에 써두고 한 꺼번에 출력하는 방식
		
		// byte단위로 파일을 읽어올때 사용하는 스트림 / 8192byte를 넘지 않는 파일 작성시 사용에 효과적
		// byte로 읽기때문에 배열을 사용
	
		String fname = args[0];
		
		BufferedInputStream bin = null;
		BufferedOutputStream bo = null, bo1=null;
		
		FileInputStream fin = new FileInputStream(fname);
		FileOutputStream fo = new FileOutputStream("java1.txt", true);
		
		bin = new BufferedInputStream(fin);
		bo = new BufferedOutputStream(System.out);
		bo1 = new BufferedOutputStream(fo);
		
		int n = 0;
		byte []buf = new byte[500];
		
		while((n = bin.read(buf)) != -1) {
			bo.write(buf, 0, n);
			bo.flush();
			
			bo1.write(buf, 0, n);
			bo1.flush();
		}
		
		bin.close(); bo.close(); bo1.close();
		fin.close(); fo.close(); System.in.close();
		System.out.close();


		
//메인메서드		
	}
//메인 클래스
}
