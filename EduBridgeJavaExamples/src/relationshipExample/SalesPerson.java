package relationshipExample;

public class SalesPerson extends Employee{
	
	double sales, commission, totalSalary;
	
	public SalesPerson() 
	{
		super();
		sales = 82;
	}
	
	public SalesPerson(int id, String name, Address address, double workingHour, double perDay, double sales, double commission) 
	{
		super(id, name, address, workingHour, perDay);
		this.sales = sales;
	}
	
	public void calculate() 
	{
		super.calculate();
		if(sales>=95)
			commission = salary * 0.2;
		else if(sales>=80)
			commission = salary * 0.1;
		else if(sales>=70)
			commission = salary * 0.05;
		else
			commission = 0;
		
		totalSalary = salary + commission;
	}
	
	public void display() 
	{
		super.display();
		System.out.println("Sales : " + sales);
		System.out.println("Commision : " + commission);
		System.out.print("Total Salary : " + totalSalary);
	}
	
}
