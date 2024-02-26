package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {
	RockPaperScissors rockPaperScissors = new RockPaperScissors(); 

	@Test
	void CP1() {
		assertEquals("It's a tie!", rockPaperScissors.checkGame("Rock","Rock"));
	}
	@Test
	void CP2() {
		assertEquals("You win this round!", rockPaperScissors.checkGame("Rock","Scissors"));
	}
	@Test
	void CP3() {
		assertEquals("You win this round!", rockPaperScissors.checkGame("Paper","Rock"));
	}
	@Test
	void CP4() {
		assertEquals("You win this round!", rockPaperScissors.checkGame("Scissors","Paper"));
	}

}
