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
		walkRight();
	}
	
	private void walkRight()
	{
		if (beepersPresent())
		{
			move();
			skipFirstAndWalk();
		}
		else
		{
			firstFillAndWalk();
		}
		while(frontIsBlocked())
		{
			turnLeft();
			if (beepersPresent())
			{
				move();
				turnLeft();
				skipFirstAndWalk();
			}
			else
			{
				move();
				turnLeft();
				firstFillAndWalk();
			}
		}
		
	}
	
	private void skipFirstAndWalk()
	{
		move();
		firstFillAndWalk();
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
