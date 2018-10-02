package controller;

import javax.swing.JOptionPane;

public class Controller
{
	public void start()
	{
		// niceLoop();
		// bigLoop();
		forLoop();
		whileLoop();
		loopy();
		anotherLoop();
	}

	private void loopy()
	{
		// define variable before the loop.
		boolean isDone = false;
		int count = 0;

		while (!isDone) // Test the variable
		{
			JOptionPane.showMessageDialog(null, "I may have some looooops");
			// Evenutally change the loop variable.
			count++;
			if (count > 4)
			{
				isDone = true; // update variable
				// Variable in while loop can be seen after the squigles.
			}
		}

	}

	// private void bigLoop()
	// {
	// long sum = 999999999;
	// long big = 999999999;
	// while (3==3)
	// {
	// sum++;
	// big++;
	// System.out.println(sum*big*999999999);
	//
	// }
	// }
	// private void niceLoop()
	// {
	// for (int loop = 0; loop < 30; loop += 2)
	// {
	// System.out.println("The loop value is: " + loop);
	// }
	// }
	private void forLoop()
	{
		for (int i = 0; i < 4; i++)
		{
			JOptionPane.showMessageDialog(null, "This should loop four times.");
		}
	}

	private void whileLoop()
	{
		boolean loopDone = false;
		int loopCount = 1;
		while (!loopDone)
		{
			JOptionPane.showMessageDialog(null, "This will loop 4 times as well.");
			loopCount++;
			if (loopCount > 4)
			{
				loopDone = true;
			}
		}
	}

	public void anotherLoop()
	{
		long loopCount2 = 1;
		long sum = 0;
		boolean looped = false;
		while (!looped)
		{
			loopCount2++;
			if(loopCount2 % 4 == 0 || loopCount2 % 5 == 0) {
				sum+=loopCount2;
			System.out.println(loopCount2);
			}
			if (loopCount2 >= 1000000)
			{
				looped = true;
			}
			
		}
		System.out.println(sum);
	
	}

}
