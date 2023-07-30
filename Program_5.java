//Calculator with arithmatic operations

import java.util.Scanner;

class driver5
{
	public static void main(String args[])
	{
		double n1,n2;
		double result;
		int op;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter two operands to be operated on:");
		n1=inp.nextDouble();
		n2=inp.nextDouble();
		System.out.println("Enter a number for the operation of your choice:\n1.+\n2.-\n3.*\n4./");
		op=inp.nextInt();
		switch(op)
		{
		case 1:
			result = n1+n2;
			System.out.println("The result of addition between "+n1+" and "+n2+" is "+result+".");
			break;
		case 2:
			result = n1-n2;
			System.out.println("The result of subtraction between "+n1+" and "+n2+" is "+result+".");
			break;
		case 3:
			result = n1*n2;
			System.out.println("The result of multiplication between "+n1+" and "+n2+" is "+result+".");
			break;
		case 4:
			result = n1/n2;
			System.out.println("The result of division between "+n1+" and "+n2+" is "+result+".");
			break;
		default:
			System.out.println("The option you have entered in not available.");
			break;
		}
	}
}
