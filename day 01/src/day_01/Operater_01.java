package day_01;

public class Operater_01 {
	public static void main(String[] args) {
		
		// �ڵ�����ȯ
		int s=65;
		float t=s;  
		System.out.println(t);
		//��� : 65.0
		
		// ��������ȯ
		char u= (char)65; 
		System.out.println(u); 
		//��� : A
		
		// ������ ���ȭ- �������ʴ°�
		final double PI = 3.14; // �������� �빮�ڷ� �ۼ�
//---------------------------------------------------------------------------------------
		
		// ������
		int a=10;
		int b=3;
		double doubleB=3; 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		System.out.println(a/doubleB); // ����/�Ǽ� = �Ǽ�
		System.out.println(a%doubleB); // ����%�Ǽ� = �Ǽ�
		System.out.println(doubleB%b); // �Ǽ�%���� = �Ǽ�
		
		// boolean ��
		boolean c=true;
		boolean d=false;
		boolean e=!d;
		
		System.out.println(c);
		System.out.println(!c);
		
		System.out.println(d);
		System.out.println(e);
		
		// ������
		int f=1;
		System.out.println(f);
		
		f++;
		System.out.println(f);
		System.out.println(++f); //������: f���� ������ �� ������ ����
		System.out.println(f++); //������: ������ f���� ���� ������ �� ������ ���
		System.out.println(f); //������ ���
		
		//����
		int g=10;
		int h=20;
		int i=30;
		
		System.out.println(g<h);
		System.out.println(g>h);
		System.out.println(g+h <= i);
		System.out.println(g+h >= i);
		
		double j = 3.14;
		double k = 5.14;
		System.out.println(j==k);
		System.out.println(j!=k);
		
		String c1="Hello Java!";
		System.out.println(c1 == "Hello Java!"); //true
		System.out.println(c1.equals("Hello Java!")); // equals = ���ڿ� �� / ==�� ��� x
		System.out.println(c1.equals("hello java"));
		
		// ����
		// and ������ : &&
		// or ������ : ||
		// not ������ : !
		boolean l = true;
		boolean m = false;
		boolean n = true;
		
		System.out.println(l && m);
		System.out.println((2<4) && (4<5));
		
		System.out.println(l || m);
		System.out.println(m || n);
		
		System.out.println(!l);
		
		//��Ʈ�� : ��Ʈ�����ڴ� �������� ����� �� �ִ�.
		// ��Ʈand : & 
		// ��Ʈor : |
		// ��Ʈ XOR : ^
		// ��Ʈ not : ~ 
		int o = 15; // 1111(2)
		int p = 5; //  0101(2)
		
		System.out.println(o&p);
		System.out.println(o|p);
		System.out.println(o^p);
		System.out.println(~p);
		
		//��Ʈ ����Ʈ ������
		System.out.println(o>>2);
		System.out.println(p<<4);
		
		//���׿����� // ���׿����� ���������ۼ�
		int age = 17; 
		System.out.println(age > 19? "�����Դϴ�." : "û�ҳ��Դϴ�.");
		
		// ���Կ�����
		int q=10;
		q = q+10;
		System.out.println(q);
		
		int r = 10;
		r +=10;
		System.out.println(r);
		
}}
