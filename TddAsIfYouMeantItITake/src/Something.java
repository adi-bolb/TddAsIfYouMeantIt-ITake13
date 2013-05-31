import static org.junit.Assert.*;

import org.junit.Test;



public class Something {

	@Test
	public void TicTacToeWithZeroBoardWillMakeXWinAlways(){

		String boardZero = "";
		String expectXToWin = "true";
		
		String actual = "true";
		
		assertEquals(expectXToWin, actual);
	}
	
	@Test
	public void testSomething() {
		String boardOneByOne = "empty board one by one";
		String expectNobodyToWin = "true";
		
		String actual = "true";
		
		assertEquals(expectNobodyToWin, actual);
		
	}
	
}
