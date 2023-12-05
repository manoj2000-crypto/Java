package relationshipExample;

public class Employee extends Person {

	double workingHour, perDay, salary;
	
	public Employee() 
	{
		super();
		workingHour = 8;
		perDay = 2000;
	}
	
	public Employee(int id, String name, Address address, double workingHour, double perDay) 
	{
		super(id,name,address);
		this.workingHour = workingHour;
		this.perDay = perDay ;
	}
	
	public void calculate() 
	{
		salary = workingHour * perDay ;
	}
	
	public void display() 
	{
		super.display();
		System.out.println("Salary : " + salary);
	}
	
}
