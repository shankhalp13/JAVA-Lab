//Design a class student and admin with data members and implement constructor and display //data

import java.util.Scanner;

class student
{
	String Name, Dept, Address, Subject1, Subject2, Subject3;
	int Reg_No;
	Scanner inp = new Scanner(System.in);
	
	void insertdata()
	{
		System.out.println("Enter the details as specified:");
		System.out.print("Name:");Name=inp.nextLine();
		System.out.print("Department:");Dept=inp.nextLine();
		System.out.print("Address:");Address=inp.nextLine();
		System.out.print("Subject 1:");Subject1=inp.nextLine();
		System.out.print("Subject 2:");Subject2=inp.nextLine();
		System.out.print("Subect 3:");Subject3=inp.nextLine();
		System.out.print("Registration Number:");Reg_No=inp.nextInt();
		System.out.println("\n");
	}
	void displaydata()
	{
		System.out.println("The details of a student are as follows:");
		System.out.println("Name: "+Name);
		System.out.println("Department: "+Dept);
		System.out.println("Address: "+Address);
		System.out.println("Subject 1: "+Subject1);
		System.out.println("Subject 2: "+Subject2);
		System.out.println("Subject 3: "+Subject3);
		System.out.println("Registration Number: "+Reg_No+"\n\n");
	}
	student()
	{
		insertdata();
		System.out.println("******DEFAULT CONSTRUCTOR******");
		displaydata();
	}
	student(String N,String D,String AD, String S1, String S2, String S3, int RN)
	{
		Name=N;
		Dept=D;
		Address=AD;
		Subject1=S1;
		Subject2=S2;
		Subject3=S3;
		Reg_No=RN;
		System.out.println("******PARAMETERIZED CONSTRUCTOR******");
		displaydata();
	}
}

class admin
{
	public static void main(String args[])
	{
		student S1 = new student();
		student S2 = new student("Shank","CSE","Chisopani","DAA","DBMS","FLAT",12);
	}
}
