package day_07;

import java.io.*;

public class IOpackage_04 {
	public static void main(String[] args) throws IOException {
		// FileŬ���� �⺻ ���� �� �ֿ�޼���
		// ������ ��θ��� �ٷ�� Ŭ���� / ���� �а� ���� ����� ����.
		// ���ϰ� ���丮�� ���ٱ���, ������ �ð�, ������ ��������, ũ�� ���� ������ ���� �� �ִ� �޼ҵ带 ������ �ִ�.
				
		// FileŬ���� ������
		// File(File parent,String child): parent ���͸��� child�̸��� ���͸��� ������ ��Ÿ���� ��ü����
		// File(String pathname): pathname�� ��Ÿ���� File��ü����
		// File(String parent, String child): parent ���͸��� child�̸��� ���͸��� ������ ��Ÿ���� ��ü����
		// File(URI uri): file:URI�� �߻��θ����� ��ȯ�Ͽ� File��ü����
				
		String fname1 = args[0];
				
		File file = new File(fname1);
				
		System.out.println("���ϸ�: "+file.getName()); // ���ϸ��� �ҷ����� �޼���
		System.out.println("����������: "+file.getAbsolutePath()); 
		System.out.println("���ϻ����: "+file.getPath());
		System.out.println("���ϻ�����: "+file.length());
				
		File file2 = new File("Test", "ftest2.txt"); // �߻����� ��� / ������ ������ �������� �ʴ´�.
		System.out.println(file2.getAbsolutePath()); // �ν��Ͻ��� �����Ѱ����� ������ ������ ���� �ƴϴ�.
		System.out.println(file2.exists());
				
		System.out.println("file�� �������� ����: "+file.isFile());
		System.out.println("file2�� �������� ����: "+file2.isFile());
		System.out.println("file.txt�� �θ���: "+file.getParent());
		System.out.println("file2.txt�� �θ���: "+file2.getParent());
				
		System.out.println(file.canRead() ? "�бⰡ��":"�б�Ұ���");
		System.out.println(file2.canRead() ? "�бⰡ��":"�б�Ұ���");
		System.out.println(file.canWrite() ? "���Ⱑ��":"����Ұ���");
		System.out.println(file2.canWrite() ? "���Ⱑ��":"����Ұ���");
				
		File file3 = new File("��������", "��������"); // ��������
		file3.mkdirs(); // ���� ��������
				
		boolean ren = file3.renameTo(new File("test1")); //�̸�����
		boolean res = file3.delete(); // ����
				
		int pos = fname1.lastIndexOf('.');
		System.out.println("Ȯ���ڸ� ������ ���ϸ�: "+fname1.substring(0, pos));
		System.out.println("Ȯ����: "+fname1.substring(pos+1));
		System.out.println("���ϱ�����: "+file.separator);
		System.out.println("���ϱ�����: "+file.separatorChar);
	
		
//---------------------------------------------------------------------------------------------
System.out.println("===================================================================");
		// BufferedInputStream / BufferedOutputStream
		// ������ ����� Ŭ������ ������ ���� �аų� ���� �ϵ忡 �����ϱ� ������ ������ ���Ͻ�ų�� �־�
		// �����͸� �о� �ö� �ѹ��� �о� ���۸� �ΰų� �����͸� ���� ���ۿ� ��ΰ� �� ������ ����ϴ� ���
		
		// byte������ ������ �о�ö� ����ϴ� ��Ʈ�� / 8192byte�� ���� �ʴ� ���� �ۼ��� ��뿡 ȿ����
		// byte�� �б⶧���� �迭�� ���
	
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


		
//���θ޼���		
	}
//���� Ŭ����
}
