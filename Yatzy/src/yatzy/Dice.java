package yatzy;

public class Dice {

	public int dice() {
		int dice = (int) (Math.random() * 6) + 1; // slumpar fram 1-6 p� en t�rning
		// System.out.println(dice);

		return dice;

	}
}
