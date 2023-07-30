//Show the using of an array.

import java.util.Scanner;

class driver7
{
	public static void main(String args[])
	{
		int n;
		//int array[];
		//array = new int[5];
		int[] array = new int[20];
		int[] array2 = {1,2,3,4,5};
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		n=inp.nextInt();
		System.out.println("Enter the elements for the array:");
		for(int i = 0;i<n;i++)
		{
			array[i]=inp.nextInt();
		}
		System.out.println("The elements aof the array are:");
		for(int i = 0;i<n;i++)
		{
			System.out.println(array[i]);
			System.out.println(array2[i]);
		}
		
	}
}

