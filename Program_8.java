//To design a class and define instance method to set a retrieve values for Name, ID and Address.

import java.util.Scanner;

class driver
{
	String Name, Address;
	int ID;
	Scanner inp = new Scanner(System.in);	

	void retrieve()
	{
		System.out.println("Enter the values for the following:");
		System.out.print("Name: ");Name = inp.nextLine();
		System.out.print("Address: ");Address=inp.nextLine();
		System.out.print("ID: ");ID=inp.nextInt();
	}
	
	void display()
	{
		System.out.println("The values are as follows:");
		System.out.println("Name: "+Name);
		System.out.println("Address: "+Address);
		System.out.println("ID"+ID);
	}

	public static void main(String args[])
	{
		driver D=new driver();
		D.retrieve();
		D.display();
	}
}