package day_07;

import java.io.File;

public class IOpackage_06 {
	public static void main(String[] args) {
		//	filelist
		String dName = args[0];
		File dir = new File(dName);
		String filelist[] = dir.list();// 폴더의 파일목록을 배열로 반환
		
		for(String f : filelist) {
			System.out.print(f);
		}
		
		System.out.println("");
		for(int i=0; i<filelist.length; i++) {
			System.out.print(filelist[i]);
		}
		System.out.println("");
		
		System.out.println("--------------------------------");
		System.out.println("파일/폴더 \t\t 크기");
		System.out.println("--------------------------------");
		
		File [] filelist2 = dir.listFiles();
		for(File f : filelist2) {
			String str = f.getName();
			
			if(f.isDirectory()) {
				System.out.println(str+"\t\t");
				System.out.print("DIR \n");
			} else {
				if(str.endsWith(".txt"))
					System.out.println(str+"\t\t"+f.length()+"바이트\n");
			}
		}
		
		
//-------------------------------------------------------------------------------------
System.out.println("===================================================================");
		//
		File f1 = new File("C:\\java_kgd\\testData.txt");
		File f2 = new File("C:\\java_kgd\\.metadata");
		
		String res;
		if(f1.isFile()) {
			res = "파일";
		}else {
			res = "폴더";
		}
		System.out.println(f1.getPath()+"은(는)"+res+" 입니다.");
		if(!f2.exists()) {
			f2.mkdir();
		}
		if(f2.isFile()) {
			res="파일";
		}else {
			res="폴더";
		}
		System.out.println(f2.getPath()+"은(는)"+res+" 입니다.");

//메인메서드
	}
	//
	public static void dir(File file) {
		String[] fname = file.list();
		
		for(String str : fname) {
			File f = new File(file, str);
			long t = f.lastModified();  // 수정날짜를 얻어온다
			System.out.print(str);
			System.out.print("\t파일크기: "+f.length());
			System.out.printf("\t수정한시간: %tb %td %ta %tT \n");
			
		}
	}
	
	
//메인클래스
}
