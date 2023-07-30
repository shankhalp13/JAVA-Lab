// Program for Bank usage

import java.util.Scanner;

class Bank
{
	String Name, Bank_Name, Branch, Address,Acc_type;
	int Acc_No;
	int created = 0;
	double temp;
	double Balance;
	Scanner inp = new Scanner(System.in);
	
	void create_acc()
	{
		System.out.println("Enter the following details:");
		System.out.print("Name: ");Name = inp.nextLine();
		System.out.print("Bank Name: ");Bank_Name = inp.nextLine();
		System.out.print("Branch of the bank: ");Branch = inp.nextLine();
		System.out.print("Address: ");Address = inp.nextLine();
		System.out.print("Account Type: "); Acc_type = inp.nextLine();
		System.out.print("Account number: ");Acc_No = inp.nextInt();
		System.out.print("Account Balance: ");Balance = inp.nextDouble();
		created = 1;
	}
	
	void credit()
	{
		if(created ==0)
		{
			System.out.println("You have not created any account till now:\n");
		}
		else
		{
			System.out.println("Enter the amount you want to credit to your account:");
			temp = inp.nextDouble();
			Balance = Balance + temp;
			System.out.println("Your current balance is "+Balance+".\n");

		}

	}
	void debit()
	{
		if(created ==0)
		{
			System.out.println("You have not created any account till now:\n");
		}
		else
		{
			System.out.println("Enter the amount you want to debit from your account:");
			temp = inp.nextDouble();
			if(temp > Balance)
			{
				System.out.println("You do not have sufficient balance.");
			}
			else
			{
				Balance = Balance - temp;
			}
			System.out.println("Your current balance is "+Balance+".\n");
		}
		
	}
	void display()
	{
		if(created ==0)
		{
			System.out.println("You have not created any account till now:\n");
		}
		else
		{
			System.out.println("Your Account details are as follows:");
			System.out.println("Name: "+Name);
			System.out.println("Bank Name: "+Bank_Name);
			System.out.println("Branch of the bank: "+Branch);
			System.out.println("Address: "+Address);
			System.out.println("Account Type: "+Acc_type);
			System.out.println("Account number: "+Acc_No);
			System.out.println("Account Balance: "+Balance+"\n");
		}
	}
}

class SBI extends Bank
{
	public static void main(String args[])
	{
		int option=1;
		Scanner inp =  new Scanner(System.in);
		SBI B1= new SBI();	
		while(option!=5)
		{
		 	System.out.println("Choose:\n1.Create an account.\n2.Credit in account.\n3.Debit in account.\n4.Display.\n5.Exit.\n");
			option = inp.nextInt();
			
			switch(option)
			{
			case 1:
				B1.create_acc();
				break;
			case 2:
				B1.credit();
				break;
			case 3:
				B1.debit();
				break;
			case 4:
				B1.display();
				break;
			case 5:
				break;
			default:
				System.out.println("You have entered the wrong option.");
				break;
			}
		}
	}
}
