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
	public void testNobodyWinsWithoutPlayingOnOneByOneBoard() {
		String boardOneByOne = "empty board one by one";
		String expectNobodyToWin = "pending";
		String actual = gameStatus(boardOneByOne);
		
		assertEquals(expectNobodyToWin, actual);
	}
	
	private String gameStatus(String boardOneByOne) {
		return "pending";
	}

	private String winner(String board) {
		return "x-win";
		
	}

}
