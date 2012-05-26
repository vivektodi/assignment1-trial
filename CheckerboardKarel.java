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
		while(frontIsClear() && (leftIsBlocked() || rightIsBlocked()))
		{
			if (facingEast())
			{
				walkEast();
			}
			else
			{
				walkWest();
			}
		}
	}
	
	private void fillFirstAndWalk()
	{
		
	}
	
	private void skipFirstAndWalk()
	{
		move();
		fillFirstAndWalk();
	}
}
