package day_01;

import java.util.Scanner;

public class P_2_CirculNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 차수를 홀수로 입력하세요 : ");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
//		count: 숫자증가변수, i:행, j:열, sw: 부호변경, k:반복횟수
		int count = 0, i=0, j=-1, sw = 1, k = n;
		
		while(true) {
		//행 방향 채우기
			for(int p=0; p<k; p++) {
				j += sw;
				a[i][j] = ++count;
			}
			if(--k == 0) {
				break;
			}
		// 열 방향 채우기
			for(int p=0; p<k; p++) {
				i += sw;
				a[i][j] = ++count;
			}
			sw *= -1;
		}
		for(i=0; i<n; i++) {  // i 와 j 가 이미 선언되어 오류가 날때 리턴타입을 지운다
			for(j=0; j<n; j++) { // 지운후 에러뜨는 것은 while문에 끝나는지점이 없어서 뜨는것.
				System.out.printf("%3d  ", a[i][j]);
			}
			System.out.println();
		}
	}
}