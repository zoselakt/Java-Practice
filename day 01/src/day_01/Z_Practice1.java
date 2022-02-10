package day_01;

public class Z_Practice1 {

	public static void main(String[] args) {
		
		Z_Practice vo1 = new Z_Practice();
		Z_Practice vo2 = new Z_Practice("»´±Êµø", true, "1µÓ¿‘¥œ¥Ÿ.");
		
		System.out.println(vo1);
		System.out.println(vo2.toString());
		
		Z_Practice vo3 = new Z_Practice("º∫√·«‚", false, "¿Ãª€¿Ãø°ø‰");
		System.out.println(vo3);
		
		vo2.count =100;
		System.out.println(vo3.count);
		
		System.out.println(vo2.getName());
		vo2.setName("¿”≤©¡§");
		System.out.println(vo2.getName());
		
		
		
	}

}

