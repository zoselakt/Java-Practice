package day_01;

import java.util.Scanner;

public class P_2_Magicsquare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("배열의 차수를 홀수로 입력하세요 : ");
			n = sc.nextInt();
			if(n % 2 ==1) {
				break;
			}
			System.out.println("홀수를 입력해야되!!!");
		}
		
		// 입력받은 배열의 차수만큼 배열을 선언한다.
		int data[][] = new int [n][n];
		// 마방진의 첫 번째 숫자가 채워지는 첫줄 가운데자리
		int i=0, j = (n-1) / 2;
		
		//Math.pow : x의 y승을 계산한다. 5의 5승
		for(int k=1; k<=Math.pow(n, 2); k++) {
			data[i][j] = k;
			//배열의 채운 숫자(k)rk 5의 배수면 다음 숫자가 채워질 위치는 행만 1 증가시킨다.
			//5의배수가 아니면 오른쪽 위 방향으로 다음 숫자가 채워진다. (행은 -1, 열은 +1)
			if(k%n == 0) {
				i++;
			} else {
				if(--i<0) {
					// 행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i= n-1;
				}
				if(++j==n) {
					// 열이 배열의 범위를 벗어나면 첫 번째열로 변경한다.
					j= 0;
				}
			}
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.printf("%3d ", data[i][j]);
				
			}
			System.out.println();
		}

	}
}