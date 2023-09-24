package JavaExampleQuestions;
 
import java.util.Scanner;

public class Employee {

	//Data members
	public String empName;
	private int empCode;
	protected double basicSalary, allowance, grossSalary, tax, netSalary;
	
	//Member functions
	public void accept() 
	{
		//to input employee Name, employee code, basic salary.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		empName = sc.next();
		System.out.print(empName + " enter your code : ");
		empCode = sc.nextInt();
		System.out.print(empName + " enter your basic salary : ");
		basicSalary = sc.nextDouble();
		
		sc.close();
	}
	public void allow() 
	{
		//to calculate and store allowance as 55% of basic salary.
		allowance = ( basicSalary * 0.55d );
	}
	public void gross() 
	{
		//to calculate and store gross salary as sum of basic salary and allowance;
		grossSalary = ( basicSalary + allowance );
	}
	public void tax() 
	{
		//to calculate and store tax as 12% of gross salary;
		tax = ( grossSalary * 0.12d );
	}
	public void net() 
	{
		//to calculate and store net-Salary as gross-salary less tax;
		netSalary = ( grossSalary - tax );
	}
	void display() 
	{
		System.out.print("\n__________________________________________\n");
		System.out.print(this.empName + "\'s Salary Slip : \n");
		System.out.print("------------------------------------------\n");
		System.out.print("Employee Name : " + this.empName + "\n");
		System.out.print("Employee Code : " + this.empCode + "\n");
		System.out.print("Employee Basic Salary : " + this.basicSalary + "\n");
		System.out.print("Employee Allowance = ( " + this.basicSalary + " + 55% basic salary ) : " + this.allowance + "\n");
		System.out.print("Employee Gross Salary = ( " + this.basicSalary + " + " + this.allowance + ") : " + this.grossSalary + "\n");
		System.out.print("Tax = ( " + this.grossSalary + " X 12% tax ) : " + this.tax + "\n");
		System.out.print("Emlpoyee Tax : " + this.tax + "\n");
		System.out.print("Employee Net Salary : " + this.netSalary);
		System.out.print("\n------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.accept();
		e.allow();
		e.gross();
		e.tax();
		e.net();
		e.display();

	}

}
