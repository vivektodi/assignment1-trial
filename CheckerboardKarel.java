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
		fillFirstAndWalk();
		while ((facingEast() && frontIsClear() && leftIsClear()) || (facingWest() && frontIsClear() && rightIsClear()))
		{
			if (frontIsBlocked() && facingEast())
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
					fillFirstAndWalk();
				}
			}
			if(frontIsBlocked() && facingWest())
			{
				turnRight();
				if (beepersPresent())
				{
					move();
					turnRight();
					skipFirstAndWalk();
				}
				else
				{
					move();
					turnRight();
					fillFirstAndWalk();
				}
			}
		}
	}
	
	private void fillFirstAndWalk()
	{
		putBeeper();
		while(frontIsClear())
		{
			move();
			if(frontIsClear())
			{
				move();
				putBeeper();
			}
		}
	}
	
	private void skipFirstAndWalk()
	{
		move();
		fillFirstAndWalk();
	}
}
