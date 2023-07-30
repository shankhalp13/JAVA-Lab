//To catch some predefined exceptions
/*Write a java program to catch the following pre defined exception:
1. Arithmeic Exception
2. Array Index out of bound exception
3. Number format Exception
Demonstrate exception handling with the try catch finally clause.*/


class exercise
{
	public static void main(String args[])
	{
		int a,b;
		String name = "Shankhalp";
		int[] arr = new int[5];
		System.out.println("Arithmetic Exception");
		try{
			a=100;
			b=100/5;
		}
		catch(ArithmeticException e)
		{	
			System.out.println("Exception caught from 1.");
		}
		finally
		{
			System.out.println("ArrayIndexOutOfBounds Exception");
			try{
				arr[10]=20;
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{	
				System.out.println("Exception caught for 2.");
			}
			finally
			{
				System.out.println("End");
			}
		}
		System.out.println("Number format Exception");
		try{
			int i = Integer.parseInt(name);
		}
		catch(NumberFormatException exp)
		{	
			System.out.println("Exception caught for 3.");
		}
	}
}