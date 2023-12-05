package relationshipExample;

public class Student extends Person {
	
	protected int phy, chem, maths;
	protected double total, per;
	
	public Student() 
	{
		super();
		phy = 0;
		chem = 0;
		maths = 0;
	}
	
	public Student(int id, String name, Address address, int phy, int chem, int maths) 
	{
		super(id, name, address);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	
	public Student(int id, String name, int phy, int chem, int maths) 
	{
		super(id, name);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	
	public void calculate() 
	{
		total = (phy + chem + maths);
		per = ( total / 3);
	}
	
	public void display() 
	{
		super.display();
		System.out.println("---:Marks :--- \nPhy : " + this.phy + ", \tChem : " + this.chem + ", \tMaths : " + this.maths);
		System.out.println("Total : " + this.total);
		System.out.println("Percentage : " + this.per);
	}

}
