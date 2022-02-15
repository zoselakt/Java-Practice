package day_01;

public class Z_Practice{
	
	public static void main(String[] args) {
		int intArray[] = {1,2,0,4,5};
		try {			
			String str = null;
			System.out.println(intArray[0]);
//			System.out.println(intArray[4] / intArray[2]);
			str.toString();
			System.out.println(intArray[5]);
			return;
		}catch(Exception e) {
			System.out.println("예외발생 " + e.getMessage());
		}
		finally {
			System.out.println("항상 실행되는 코드");
		}
	}
}