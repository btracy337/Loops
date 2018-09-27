package controller;

import javax.swing.JOptionPane;

public class Controller
{
	public void start()
	{
	niceLoop();
	//bigLoop();
	loopy();
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
			if (count > 10)
			{
				isDone = true; // update variable
				// Variable in while loop can be seen after the squigles.
			}
		}

	}

	private void bigLoop()
	{
		long sum = 999999999;
		long big = 999999999;
		while (3==3)
		{
			sum++;
			big++;
			System.out.println(sum*big*999999999);
			
		}
	}
	private void niceLoop()
	{
		for (int loop = 0; loop < 30; loop += 2)
		{
			System.out.println("The loop value is: " + loop);
		}
	}
}
