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
		putBeeper();
		placeCheckers();
	}
	
	private void placeCheckers()
	{
		while (frontIsClear())
		{
			walkTowardsRight();
			if(frontIsBlocked())
			{
				takeALeftTurn();
			}
			walkTowardsLeft();
			if(frontIsBlocked())
			{
				takeARightTurn();
			}
		}
		
	}
	private void walkTowardsRight()
	{
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
	
	private void takeALeftTurn()
	{
		turnLeft();
		move();
		turnLeft();
	}
	
}
