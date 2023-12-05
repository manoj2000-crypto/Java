package relationshipExample;

public class Grades extends Student{
	
	private String grade;
	private double percentage;
	
	public Grades() 
	{
		super();
		grade = "-";
	}
	
	public Grades(int id, String name, int phy, int chem, int maths) 
	{
		super(id, name,phy,chem,maths);
	}
	
	public void calculate() 
	{
		super.calculate();
		percentage = super.per;
		
		if(percentage >= 100) 
		{
			grade = "A+";
		}
		else if(percentage <= 99 && percentage >= 80) 
		{
			grade = "A";
		}
		else if(percentage <= 79 && percentage >= 60) 
		{
			grade = "B+";
		}
		else if(percentage <= 59 && percentage >= 50) 
		{
			grade = "B";
		}
		else if(percentage <= 49 && percentage >= 35) 
		{
			grade = "C";
		}
		else 
		{
			grade = "Fail";
		}
	}
	
	public void display() 
	{
		super.display();
		System.out.println("Grade : " + this.grade);
	}	
}
