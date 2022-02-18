package day_04;

public class API_01 {
	public static void main(String[] args) {
	// API : Application Programming Interface
		
	// java.lang : �ڹ� ���α׷����� ���� ���� �⺻���� Ŭ������ ����
	// java.util: ���α׷��� �����ϱ� ���� Ŭ������ �����͸� ȿ�������� �����ϱ� ���� Ŭ�������� ��� �ִ�.
	// java.io: Ű����, �����, ������,���� ���� ������ �� �ִ� Ŭ�������� ����
	// java.net: ����� ���� ��ɵ��� ����ִ�.

	// object Ŭ����  
	// clone() / equals() / finalize() / getClass() / hashcode() / notify() 
	// notufiAll() / toString() / wait() / wait(longtimeout) / wait(longtimeout, int nanos)
		
	// ���ڿ� Ŭ���� ����
	// StringŬ���� 
	// ��ǥŬ����: length, charAt, indexOf, equals, replace 
	// concat(���ڿ�) : ���ڿ��� ���� / substring(������ġ, ������ ����ġ ������)=�����̽� 
	// length(): ���� / toUpperCase() / toLowerCase() / charAt(�ε���): �ε����� �ش��ϴ� ���� ��ȯ 
	// indexOf(���ڿ�): ���ڿ��� ��ġ��ȯ / equals(���ڿ�): ���ڿ��� ������ �Ҹ�����ȯ / trim():�յڰ�������
	// replace(�������ڿ� , ��ü�� ���ڿ�) / replaceAll(��ȯ�� ���ڿ�, ��ȯ�� ���ڿ�)
		
	// StringBuffer : string Ŭ������ ������ �ʴ� ��ü�̱� ������ ���ο� ��ü�� ������ �ʴ� ���Ҽ��ִ� ��ü�� �����. 
	//				  append() / reverse() / insert(int pos, Object obj)
	//				  delete(int start, int end) / deleteCharAt(int index)
		
	// Stringtokenizer : ���ڿ��� ���й��ڿ��� �������� �и��� �� ����Ѵ�. ex) ��ȭ��ȣ (-)�������� ���� ��
	//					 nextToken() / hasMoreTokens() / countTokens()
		
	// wrapper Ŭ����
	// �⺻ �ڷ������� ��ü�� �ٷ�µ� ��� / �⺻���� �ձ��ڰ� �빮�ڷ� �ٲ��.
	// Boolean / Character / Byte / Short / Integer / Long / Double / Float Ŭ����
	// WrapperŬ������ ��ü��  = new WrapperŬ������ (��);
		
		// auto boxing: �⺻ �ڷ��� ���� �ڵ����� WrapperŬ������ ��ü�� ��ȯ���� �ִ°�.
		Integer i = 10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c ='A'; 
		
		// auto unboxing: Wrapper Ŭ������ ��ü���� �ڵ����� �⺻ �ڷ��� ������ ��ȯ���� �ִ°�.
		int ii = i;
		double dd = d;
		float ff = f;
		char cc = c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
		
		// Random Ŭ���� : ���������� ��� ������ ���
		// Random ��ü�� = new Random();
		// ������ : Random() / Random(int seed)
		// �޼��� : int nextInt() / int nextInt(int n) / boolean nextBoolean() / long nextLong()
		// 		  double nextDouble, float nextFloat()

	}
}