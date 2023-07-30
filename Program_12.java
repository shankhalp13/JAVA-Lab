//Multiple inheritance with interface

import java.util.Scanner;

class student
{
	String name;
	int roll_no, marks1, marks2;
	Scanner inp = new Scanner(System.in);
	void ins()
	{
		System.out.println("Enter the data for the following with marks out of 50:");
		System.out.print("Name: ");name=inp.nextLine();
		System.out.print("Roll No: ");roll_no=inp.nextInt();
		System.out.print("Marks1: ");marks1=inp.nextInt();
		System.out.print("Marks2: ");marks2=inp.nextInt();
	}
	
	void disp()
	{
		System.out.println("\n****RESULT****:");
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+roll_no);
		System.out.println("Marks1: "+marks1);
		System.out.println("Marks2: "+marks2);
	}

}

interface exams
{
	void calculate();
	void dispresult();
}

class result extends student implements exams
{
	double percentage;
	public void calculate()
	{
		percentage = marks1 + marks2;
	}
	public void dispresult()
	{
		System.out.println("The percentage that Mr "+name+" obtained is "+percentage+" %.");
	}
	
	public static void main(String args[])
	{
		result S1 = new result();
		S1.ins();
		S1.disp();
		S1.calculate();
		S1.dispresult();
	}
}
