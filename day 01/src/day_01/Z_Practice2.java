package day_01;

public class Z_Practice2{
	public static void main(String[] args) {
	char ch [][] = new char[3][];
	
	System.out.println("ch�迭�� ���� ũ�� :" + ch.length);
	ch[0] = new char[3];
	System.out.println("ch[0]�迭�� ����ũ�� : " + ch[0].length);
	ch[1] = new char[2];
	System.out.println("ch[0]�迭�� ����ũ�� : " + ch[1].length);
	ch[2] = new char[1];
	
	ch[0][0] = 'A';
	ch[0][1] = 'B';
	ch[0][2] = 'C';
	ch[1][0] = 'D';
	ch[1][1] = 'E';
	ch[2][0] = 'F';
	
	for(int i=0;i<ch.length; i++) {
		for(int j=0; j<ch[i].length; j++) {
			System.out.print(ch[i][j] + " ");
		}
		System.out.println();
	}
	
	
	String [][] asia_nations = {
			{"�ѱ�", "�߱�", "�Ϻ�"}, {"�±�","��Ʈ��","�ʸ���"}
			};
	
	System.out.println(asia_nations[0][0]);
	System.out.println(asia_nations.length);
	System.out.println(asia_nations[0].length);
	System.out.println(asia_nations[1].length);
	
	for(int i=0; i<asia_nations.length; i++) {
		for(int j=0; j < asia_nations[i].length; j++) 
			System.out.print(asia_nations[i][j] + " ");
		System.out.println();
	}
	
	//charAt() �޼��� : �ش��ε����� �ִ� ���� ��ȯ 
	String[] strAr= {"hong", "kim", "park"};
	System.out.println(strAr[0].charAt(2)); 
	System.out.println(strAr[1].charAt(1)); 
	System.out.println(strAr[2].charAt(0)); 

	}
}