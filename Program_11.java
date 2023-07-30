/*Create a class Employee with the following data members such as name, emp_id, basic_salary, prov_fund. 
Method to accept and display data. To calculate salary, Salary = basic_salary + Prov_fund. Extend the 
class Manager from employee with data members house_allowance, travel_alowance and add method to accept
and display data. To calculate salary, Salary = basic_salary + prov_fund + house_allowance + 
travel_allowance. Extend class Director from Manager with data members holiday_allowance, bonus and 
method to accept and dispolay data. To calculate salary, Salary = basic_salary + prov_fund + 
house_allowance + travel_allowance + holidat_allowance + bonus. Create object of Employee, Manager, 
Director and find the total salary of the three. Demonstrate the concept of multilevel inheritance.*/


import java.util.Scanner;

class Employee
{
	String name;
	int emp_id,basic_salary,prov_fund,Salary;
	Scanner inp = new Scanner(System.in);
	
	void insert1()
	{
		System.out.print("Enter Name: ");name = inp.nextLine();
		System.out.print("Enter Employee ID: ");emp_id = inp.nextInt();
		System.out.print("Enter Basic Salary: ");basic_salary = inp.nextInt();
		System.out.print("Enter Provident Fund: ");prov_fund = inp.nextInt();
		
	}
	
	void display1()
	{
		System.out.println("\n\nName: "+name);
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Basic Salary: "+basic_salary);
		System.out.println("Provident Fund:"+prov_fund);
		Salary = basic_salary+prov_fund;
		System.out.println("\nThe salary of an Employee is "+Salary+".\n");
	}
}
class Manager extends Employee
{
	int house_allowance, travel_allowance;
	Scanner inp = new Scanner(System.in);
	int Salary2;
	void insert2()
	{
		insert1();
		System.out.print("Enter House Allowance: ");house_allowance = inp.nextInt();
		System.out.print("Enter Travel Allowance: ");travel_allowance = inp.nextInt();

		
	}
	
	void display2()
	{	
		display1();
		System.out.println("House Allowance: "+house_allowance);
		System.out.println("Travel Allowance: "+travel_allowance);

		Salary = super.Salary + house_allowance + travel_allowance;
		System.out.println("\nThe salary of a Manager is "+Salary+".\n");

	}
}
class Director extends Manager
{
	int holiday_allowance, bonus;
	Scanner inp = new Scanner(System.in);

	void insert3()
	{
		insert2();
		System.out.print("Enter Holiday Allowance: ");holiday_allowance = inp.nextInt();
		System.out.print("Enter Bonus: ");bonus = inp.nextInt();


		
		
	}
	
	void display3()
	{
		display2();
		System.out.println("Holiday Allowance: "+holiday_allowance);
		System.out.println("Bonus: "+bonus);

		Salary = super.Salary + holiday_allowance + bonus;
		System.out.println("\nThe salary of a Director is "+Salary+".\n");
	}
}

class driver
{	
	public static void main(String args[])
	{
		Employee E1 = new Employee();
		Manager E2 = new Manager();
		Director E3 = new Director();
	
		E3.insert3();
		E3.display3();
	}
	
}
