/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run()
	{
		startSolving();	
	}
	
	private void startSolving()
	{
		putBeeper();
		walkLeft();
	}
	
	private void walkLeft()
	{
		if (beepersPresent())
		{
			skipFirstAndWalk();
		}
		else
		{
			firstFillAndWalk();
		}
	}
	
	private void skipFirstAndWalk()
	{
		move();
		firstFirstAndWalk();
	}
	
	private void firstFillAndWalk()
	{
		putBeeper();
		while(frontIsClear())
		{
			move();
			if (frontIsClear())
			{
				move();
				putBeeper();
			}
		}
	}
}
