package day_01;

import java.util.Random;

public class P_1_DiceCount {
	public static void main(String[] args) {
		// ÁÖ»çÀ§ °¹¼ö
		Random random = new Random();

		int num[] = new int[6];
		
		for(int i=1; i<=10; i++) {
			int r= random.nextInt(6);
			switch(r) {
			case 1: num[0]++; break;
			case 2: num[1]++; break;
			case 3: num[2]++; break;
			case 4: num[3]++; break;
			case 5: num[4]++; break;
			case 6: num[5]++; break;
		}}
		for(int i=0; i<num.length; i++) {
			int count = 0 + i+1;
			System.out.println(count +"ÀÇ °¹¼ö : " + num[i]);
		}
	}
}