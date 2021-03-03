package yatzy;

import java.util.Arrays;
import java.util.Scanner;

public class Result {

	public int result(int roll[], int opt, int[] protChoise) {
		int sum = 0;
		int check = 0;
		Scanner scan = new Scanner(System.in);
		Protocol protocol = new Protocol();
		protocol.prot(sum, opt, protChoise);

		do {
			if (check == 1) {
				System.out.println("Gör ett annat val");
				opt = scan.nextInt();
			}
			check = 0;

			switch (opt) {
			case 1:
				System.out.println("1:or");
				sum = roll[0] + roll[1] + roll[2] + roll[3] + roll[4];
				check = 0;
				System.out.println(sum + " Java");
				protocol.prot(sum, opt - 1, protChoise);
				return sum;
			case 2:
				System.out.println("2:or");
				break;
			case 3:
				System.out.println("3:or");
				break;
			case 4:
				System.out.println("4:or");
				break;
			case 5:
				System.out.println("5:or");
				break;
			case 6:
				System.out.println("6:or");
				break;
			case 7:
				System.out.println("1 par");
				break;
			case 8:
				System.out.println("2 par");
				break;
			case 9:
				System.out.println("Tretal");
				break;
			case 10:
				System.out.println("Fyrtal");
				break;
			case 11:
				System.out.println("Liten stege");
				break;
			case 12:
				System.out.println("Stor stege");
				break;
			case 13:
				System.out.println("Kåk");
				Arrays.sort(roll);

				if ((roll[0] == roll[1]) && (roll[2] == roll[3]) && (roll[2] == roll[4])) {
					System.out.println(roll[0] + "" + roll[1] + "" + roll[2] + "" + roll[3] + "" + roll[4]);
					sum = roll[0] + roll[1] + roll[2] + roll[3] + roll[4];
					protocol.prot(sum, opt - 1, protChoise);
					check = 0;
					return sum;
				}
				if ((roll[0] == roll[1]) && (roll[0] == roll[2]) && (roll[3] == roll[4])) {
					System.out.println(roll[0] + "" + roll[1] + "" + roll[2] + "" + roll[3] + "" + roll[4]);
					sum = roll[0] + roll[1] + roll[2] + roll[3] + roll[4];
					protocol.prot(sum, opt - 1, protChoise);
					check = 0;
					return sum;
				}
				if (sum == 0) {
					System.out.println("Detta är ej en kåk");
					check = 1;
				}
				break;
			case 14:
				System.out.println("Chans");
				break;
			case 15:
				System.out.println("Yatzy");
				break;
			}
		} while (check == 1);

		/*
		 * for (int i = 0; i < 5; i++) { sum=sum+roll[i];
		 */

		// System.out.println("Totalen på tärningarna är " +sum);
		// Vart vill du spara ditt resultat?

		return opt;

	}

}
