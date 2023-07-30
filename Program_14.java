/* Write and test a program for creating Threads using Thread class:
1. extending from the thread class[Even & Odd 1 - 20]
2. Using Runnable interface[Even & Odd 1 - 20]
3. Display all the thread states.*/


import java.lang.Thread;
import java.lang.Runnable;


class T extends Thread 
{
	public void run()
	{
		int[] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("\nClass Thread created.");
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		finally
		{
			for(int i=0;i<20;i++)
			{
				if(array1[i]%2==0)
				{
					System.out.print("EVEN: "+array1[i]+"\t");
				}
				else
				{
					System.out.print("ODD: "+array1[i]+"\t");
	
				}
			}
			System.out.println("\nClass Thread TERMINATED.");
		}

	}
}
	

class R implements Runnable
{
	public void run()
	{
		int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("\nInterface Thread created.");

		for(int i=0;i<20;i++)
		{
			if(array2[i]%2==0)
			{
				System.out.print("even: "+array2[i]+"\t");
			}
			else
			{
				System.out.print("odd: "+array2[i]+"\t");

			}
		}
		System.out.println("\nInterface Thread TERMINATED.");

		
	}

}

class driver
{
	public static void main(String args[])
	{
		T ob1 = new T();
		ob1.start();

		R ob2 = new R();
		Thread ob3 = new Thread(ob2);
		ob3.start();
	}
}

