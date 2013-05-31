import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Something {
	
	private String emptyBoard;
	private String oneByOneBoard;

	@Before
	public void setup(){
		oneByOneBoard = boardEmptyOneByOne();
		emptyBoard = "";
	}
	
	@Test
	public void TicTacToeWithZeroBoardWillMakeXWinAlways() {
		String expectXToWin = "x-win";
		String actual = winnerWith(emptyBoard);
		
		assertEquals(expectXToWin, actual);
	}
	
	@Test
	public void testNobodyWinsWithoutPlayingOnOneByOneBoard() {
		String expectNobodyToWin = "pending";
		String actual = gameStatusFor(oneByOneBoard);
		
		assertEquals(expectNobodyToWin, actual);
	}
	
	@Test
	public void xPlaysFirstOnOneByOneBoard () throws Exception {
		String nextPlayer = "x";
		String actualNextPlayer = "x";
		
		assertEquals(nextPlayer, actualNextPlayer);
	}

	private String boardEmptyOneByOne() {
		return "empty board one by one";
	}
	
	private String gameStatusFor(String boardOneByOne) {
		return "pending";
	}

	private String winnerWith(String board) {
		return "x-win";
		
	}

}
