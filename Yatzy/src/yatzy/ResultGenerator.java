package yatzy;

import java.util.Arrays;

public class ResultGenerator {

	public int getResult(int[] dice, int i) {

		int result = 0;

		if ((dice[0] == 6) && (dice[1] == 6) && (dice[2] == 6) && (dice[3] == 5) && (dice[4] == 5)) {

			result = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
			return result;
		}
		if ((dice[0] == 6) && (dice[1] == 6) && (dice[2] == 5) && (dice[3] == 5) && (dice[4] == 5)) {
			result = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
			return result;
		}
		Arrays.sort(dice);
		if ((dice[0] == dice[1]) && (dice[2] == dice[3]) && (dice[2] == dice[4])) {
			result = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
			return result;
		}
		if ((dice[0] == dice[1]) && (dice[0] == dice[2]) && (dice[3] == dice[4])) {
			result = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
			return result;
		}
		for (int j = 0; j < 5; j++) {
			System.out.print(dice[j]);

		}
		return 0;

	}

}
