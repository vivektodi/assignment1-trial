/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run()	{
		while(frontIsClear())	{
			turnLeft();
			fillColumn();
			turnLeft();
			goToNextColumn();
		}
		turnLeft();
		fillColumn();
		turnLeft();
	}
	
	public void fillColumn()	{
		scaleColumn();
		turnAround();
		completeColumn();
	}
	
	public void scaleColumn()	{
		while(frontIsClear())	{
			move();
		}
	}
	
	public void completeColumn()	{
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		if(noBeepersPresent()){
			putBeeper();
		}
	}
	public void goToNextColumn()
	{
		for(int i = 0; i < 4; i++)
		{
			move();
		}
	}
}
