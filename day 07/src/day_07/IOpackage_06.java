package day_07;

import java.io.File;

public class IOpackage_06 {
	public static void main(String[] args) {
		//	filelist
		String dName = args[0];
		File dir = new File(dName);
		String filelist[] = dir.list();// ������ ���ϸ���� �迭�� ��ȯ
		
		for(String f : filelist) {
			System.out.print(f);
		}
		
		System.out.println("");
		for(int i=0; i<filelist.length; i++) {
			System.out.print(filelist[i]);
		}
		System.out.println("");
		
		System.out.println("--------------------------------");
		System.out.println("����/���� \t\t ũ��");
		System.out.println("--------------------------------");
		
		File [] filelist2 = dir.listFiles();
		for(File f : filelist2) {
			String str = f.getName();
			
			if(f.isDirectory()) {
				System.out.println(str+"\t\t");
				System.out.print("DIR \n");
			} else {
				if(str.endsWith(".txt"))
					System.out.println(str+"\t\t"+f.length()+"����Ʈ\n");
			}
		}
		
		
//-------------------------------------------------------------------------------------
System.out.println("===================================================================");
		//
		File f1 = new File("C:\\java_kgd\\testData.txt");
		File f2 = new File("C:\\java_kgd\\.metadata");
		
		String res;
		if(f1.isFile()) {
			res = "����";
		}else {
			res = "����";
		}
		System.out.println(f1.getPath()+"��(��)"+res+" �Դϴ�.");
		if(!f2.exists()) {
			f2.mkdir();
		}
		if(f2.isFile()) {
			res="����";
		}else {
			res="����";
		}
		System.out.println(f2.getPath()+"��(��)"+res+" �Դϴ�.");

//���θ޼���
	}
	//
	public static void dir(File file) {
		String[] fname = file.list();
		
		for(String str : fname) {
			File f = new File(file, str);
			long t = f.lastModified();  // ������¥�� ���´�
			System.out.print(str);
			System.out.print("\t����ũ��: "+f.length());
			System.out.printf("\t�����ѽð�: %tb %td %ta %tT \n");
			
		}
	}
	
	
//����Ŭ����
}
