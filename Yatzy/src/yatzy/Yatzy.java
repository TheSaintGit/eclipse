package yatzy;

import java.util.Scanner;

public class Yatzy {

	public static void main(String[] args) {
		Menu menu1 = new Menu();
		Dice dice = new Dice();
		Result result = new Result();
		Protocol protocol = new Protocol();
		int[] protChoise = new int[15];
		Scanner scan = new Scanner(System.in);
		int endChoise = 0;
		int roll[] = new int[5];
		int choise = 0;
		int opt = 0;
		int sum = 0;
		int k = 0;
		System.out.println("Välkommen till Yatzy");
		System.out.println("Nu börjar spelet");
		System.out.println("-------------------");
		do {
			int j = 0;
			k++;
			System.out.println("Omgång" + k);
			System.out.println("Ditt första kast: ");
			System.out.println("------------------");
			for (int i = 0; i < 5; i++) { // Anropar Dice för kast av tärning
				roll[i] = dice.dice(); // 5 gånger;
				System.out.println("Tärning:" + (i + 1) + ": " + roll[i]); // Visar resultat
			}
			do {
				choise = menu1.menu1();
				if (choise < 2) {
					RerollDice.roll(roll); // Anropar saveDice för om kast
				}

				if (j == 0 && choise < 2) {
					System.out.println("Ditt andra kast: ");
				}
				if (j > 0 && choise < 2) {
					System.out.println("Ditt tredje kast: ");
				}
				System.out.println("------------------");
				j++;

				for (int i = 0; i < 5; i++) {

					System.out.println("Tärning:" + (i + 1) + ": " + roll[i]); // Visar resultat

				}
			} while ((choise == 1) && (j < 2));

			endChoise = menu1.menu2();
			if (endChoise == 1) {
				protocol.prot(sum, opt, protChoise);
				System.out.println("Vilken position vill du spara ditt resultat på? Välj 1-15 ");
				opt = scan.nextInt();
				result.result(roll, opt, protChoise); // Spara resultat

			} else if (endChoise == 2) {
				// Nästa omgång menyChoise=1;
			}
		} while (endChoise < 3);

		System.out.println(" Tack för att du har spelat Yatzy");
	}

}
