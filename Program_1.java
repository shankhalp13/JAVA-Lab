//Area of a circle with user giving radius.

import java.util.Scanner;

class driver
{
	public static void main(String args[])
	{	
		double r,area;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		r=inp.nextDouble();
		area = r * 3.14 * r;
		System.out.println("\nThe area of the circle having a radius of "+r+" is "+area+".");
	}

}