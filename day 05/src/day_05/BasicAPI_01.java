package day_05;

public class BasicAPI_01 {
	public static void main(String[] args) {
		// API : Application Programming Interface
		// 

		// object Ŭ���� ����
		// clone() / equals() / finalize() / getClass() / hashcode() / notify() 
		// notufiAll() / toString() / wait() / wait(longtimeout) / wait(longtimeout, int nanos)
		
		// ���ڿ� Ŭ���� ����
		// String : concat(���ڿ�) / substring(������ġ, ������ ����ġ ������)=�����̽� / length() /
		// 		   toUpperCase() / toLowerCase() / charAt(�ε���) / indexOf(���ڿ�) / equals(���ڿ�) / 
		// 		   replace(�������ڿ� , ��ü�� ���ڿ�) / replaceAll(��ȯ�� ���ڿ�, ��ȯ�� ���ڿ�) /trim()
		// StringBuffer : string Ŭ������ ������ �ʴ� ��ü�̱� ������ ���ο� ��ü�� ������ �ʴ� ���Ҽ��ִ� ��ü�� �����. 
 		//				  append() / reverse() / insert(int pos, Object obj)
		//				  delete(int start, int end) / deleteCharAt(int index)
		// Stringtokenizer : ���ڿ��� ���й��ڿ��� �������� �и��� �� ����Ѵ�. ex) ��ȭ��ȣ (-)�������� ���� ��
		//					 nextToken() / hasMoreTokens() / countTokens()
		
		// wrapper Ŭ����
		// �⺻ �ڷ������� ��ü�� �ٷ�µ� ��� / �⺻���� �ձ��ڰ� �빮�ڷ� �ٲ��.
		// Boolean / Character / Byte / Short / Integer / Long / Double / Float Ŭ����
		// WrapperŬ������ ��ü��  = new WrapperŬ������ (��);
		
		// auto boxing
		Integer i = 10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c ='A'; 
		
		// auto unboxing
		int ii = i;
		double dd = d;
		float ff = f;
		char cc = c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
		
		// Random Ŭ����
		// ���������� ��� ������ ���
		// Random ��ü�� = new Random();
		// ������ : Random() / Random(int seed)
		// �޼��� : int nextInt() / int nextInt(int n) / boolean nextBoolean() / long nextLong()
		// 		  double nextDouble, float nextFloat()

	}
}
