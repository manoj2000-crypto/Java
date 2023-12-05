package classAndObject;

import java.util.Scanner;

class Employee
{
	double bonus;
	
	void empBonus() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee bonus : ");
		bonus = sc.nextDouble();
	}
	
}

class Developer extends Employee 
{
	double salary;
	
	void devSalary() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Salary of the developer : ");
		salary = sc.nextDouble();
		
		System.out.println("Developer salary( " + salary + " + " + bonus + ") with bonus = " + (salary + bonus));
	}
}

class Tester extends Employee
{
	double salary;
	
	void testerSalary() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Salary of the tester : ");
		salary = sc.nextDouble();
		
		System.out.println("Tester salary( " + salary + " + " + bonus + ") with bonus = " + (salary + bonus));
	}
}



public class InheritedDemo {

	public static void main(String[] args) {
		
		Developer dev = new Developer();
		dev.empBonus();
		dev.devSalary();
		
		Tester tester = new Tester();
		tester.empBonus();
		tester.testerSalary();

	}

}
