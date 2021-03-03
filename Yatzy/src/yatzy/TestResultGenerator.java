package yatzy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestResultGenerator {

	@Test
	void testCheck28() {
		// Arrange
		int[] dice = { 6, 6, 6, 5, 5 };

		// Act
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(dice, 13);

		// Assert
		assertEquals(28, result);

		// fail("Not yet implemented");
	}

	@Test
	void testCheck27() {
		// Arrange
		int[] dice = { 6, 6, 5, 5, 5 };

		// Act
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(dice, 13);

		// Assert
		assertEquals(27, result);
	}

	@Test
	void testCheckNotKak() {
		// Arrange
		int[] dice = { 5, 2, 2, 2, 5 };
		int sum = dice[0] + dice[1] + dice[2] + dice[3] + dice[4];
		// Act
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(dice, 13);

		// Assert
		assertEquals(sum, result);

		// fail("Not yet implemented");
	}
}
