//Fahrenheit to Degree Celsius Conversion (F-32)*5/9

import java.util.Scanner;

class driver1
{
	public static void main(String args[])
	{
		double f;
		double c;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		f=inp.nextDouble();
		c = (f-32)*5/9;
		System.out.println("The temperature in degree Celsius is "+c+".");
	}
}