package day_01;

import java.util.Random;

public class P_2_Cardshuffle {
	public static void main(String[] args) {
		
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		char symbol[] = {'¢¼', '¡ß', '¢¾', '¢À'};
		
		int card[] = new int[52];
		for(int i=0; i<card.length; i++) {
			card[i] = i;
		}
		for (int i=0; i<card.length; i++) {
			System.out.printf("%c%2s", symbol[card[i]/ 13], number[card[i]% 13]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}
		}
		System.out.println("==================¼¯±â Àü===============");
		
		Random random = new Random();
		for(int i=0; i<1000000; i++) {
			int r = random.nextInt(51)+1;
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for (int i=0; i<card.length; i++) {
			System.out.printf("%c%2s", symbol[card[i]/ 13], number[card[i]% 13]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}
		}
		System.out.println("==================¼¯Àº ÈÄ===============");
	}
}
