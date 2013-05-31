import static org.junit.Assert.*;

import org.junit.Test;

public class Something {
	@Test
	public void TicTacToeWithZeroBoardWillMakeXWinAlways() {
		String boardZero = "";
		String expectXToWin = "x-win";
		String actual = winner(boardZero);
		
		assertEquals(expectXToWin, actual);
	}
	
	@Test
	public void testSomething() {
		String boardOneByOne = "empty board one by one";
		String expectNobodyToWin = "draw";
		String actual = winnerForDraw(boardOneByOne);
		
		assertEquals(expectNobodyToWin, actual);
	}
	
	private String winnerForDraw(String boardOneByOne) {
		return "draw";
	}

	private String winner(String board) {
		return "x-win";
		
	}

}
