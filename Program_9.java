//Method overloading with different data types and number of parameters.

import java.util.Scanner;

class driver10
{
	double result;
	void solve(int l,int b)
	{
		result=l*b;
		System.out.println("The area of quadrilateral is "+result+".");
	}

	void solve(double r)
	{
		result=3.14*r*r;
		System.out.println("The area of circle is "+result+".");
	}

	void solve(int l,int b,int w)
	{
		result=l*b*w;
		System.out.println("The volume of quadrilateral is "+result+".");
	}
		
	void solve(int l)
	{
		System.out.println("The length of a line is "+l+".");
	}

	public static void main(String args[])
	{
		driver10 D = new driver10();
		D.solve(10);
		D.solve(12,15);
		D.solve(12.5);
		D.solve(5,6,7);
	}
}