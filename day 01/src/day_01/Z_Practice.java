package day_01;


public class Z_Practice{
	
	public static void main(String[] args) {
		Super sp = new Super();
		sp.ss();
		System.out.println(sp.x + sp.y);
		
		child ch = new child();
		ch.ss();
		System.out.println(ch.z + ch.j);
		
		Super sp1 = new child();
		System.out.println(sp1.x + sp1.y);
		
	}
}
class Super{
	int x = 100;
	int y = 200;
	public void ss() {
		System.out.println("부모 클래스");
	}
}
class child extends Super{
	int z = 1000;
	int j = 2000;
	public void ss() {
		System.out.println("자식클래스");
	}
}