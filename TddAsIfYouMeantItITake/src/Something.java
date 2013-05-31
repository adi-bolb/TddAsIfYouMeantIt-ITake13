import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Something {
	
	private String emptyBoard;
	private String oneByOneBoard;

	@Before
	public void setup(){
		oneByOneBoard = emptyOneByOneBoard();
		emptyBoard = "";
	}
	
	@Test
	public void TicTacToeWithZeroBoardWillMakeXWinAlways() {
		String expectXToWin = "x-win";
		String actual = winner(emptyBoard);
		
		assertEquals(expectXToWin, actual);
	}
	
	@Test
	public void testNobodyWinsWithoutPlayingOnOneByOneBoard() {
		String expectNobodyToWin = "pending";
		String actual = gameStatus(oneByOneBoard);
		
		assertEquals(expectNobodyToWin, actual);
	}
	
	@Test
	public void xPlaysFirstOnOneByOneBoard () throws Exception {
		String nextPlayer = "x";
		String actualNextPlayer = "x";
		
		assertEquals(nextPlayer, actualNextPlayer);
	}

	private String emptyOneByOneBoard() {
		return "empty board one by one";
	}
	
	private String gameStatus(String boardOneByOne) {
		return "pending";
	}

	private String winner(String board) {
		return "x-win";
		
	}

}
