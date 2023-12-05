package relationshipExample;

public class Person {
	
	private int id;
	protected String name;
	Address address;
	
	public Person() 
	{
		id = 121;
		name = "Manoj";
		address = new Address();
	}
	
	public Person(int id, String name, Address address) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Person(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	public void display() 
	{
		System.out.println("-------------------------------------");
		System.out.println("Person Id : " + this.id);
		System.out.println("Person Name : " + this.name);
		System.out.println();
		//System.out.println("Person Address : " + this.address);
	}
	
}
