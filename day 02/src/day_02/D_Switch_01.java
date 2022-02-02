package day_02;

public class D_Switch_01 {
	public static void main(String[] args) {
		// switch-case 문은 if문 보다 코드가 더 간결하게 작성가능하다.
		// 조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행문이 결정될때 사용
		
		int month = 10;
		int day;
		
		switch(month) { // ()안에는 변수가 들어간다.
			case 1:	case 3:	case 5:	case 7:	case 8:
			case 10: case 12:
				day = 31;
				break; // break를 하지않으면 모두실행됨.
			case 2:
				day = 28;
				break;
				
			case 4: case 6: case 9: case 11:
				day=30;
				break;
			default:
				day = 0;
				break;
		}
		System.out.println(month + "월은" + day + "일 까지 있습니다.");

	}}
