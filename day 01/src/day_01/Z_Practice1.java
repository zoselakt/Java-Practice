package day_01;


public class Z_Practice1 {
	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		try {			
			System.out.println(intArray[0]);
			System.out.println(intArray[5]);
			return;
		}catch(Exception e) {
			System.out.println("intArray배열의 크기는" + intArray.length+"입니다.");
		}
		finally {
			System.out.println("항상 실행되는 코드");
		}
	}
}

