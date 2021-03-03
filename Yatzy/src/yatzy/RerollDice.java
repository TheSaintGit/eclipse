package yatzy;

import java.util.Scanner;

public class RerollDice {

	public static int roll(int roll[]) {
		Dice dice = new Dice();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur många tärningar vill du kasta om?: (ange 1-5) ");
		int reroll = scan.nextInt(); // Läser in antal tärningar att spara
		if (reroll >= 1 && reroll <= 4) {

			for (int i = 0; i < reroll; i++) {
				System.out.println("Vilken tärning vill du kasta om? ange (1-5) ");
				int choise = scan.nextInt();
				if (choise <= 5 && choise >= 1) {
					roll[choise - 1] = dice.dice();
				} else if (reroll == 5) {
					for (int j = 0; j < 5; j++) {
						roll[i] = dice.dice();
					}
				}
			}

		}
		// System.out.println("Vilka tärningar vill du spara? ange (1-5) ");
		return reroll;

	}
}
