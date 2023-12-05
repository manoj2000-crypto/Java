package classAndObject;

class ParentClass
{
	public void play() 
	{
		System.out.println("Parents wants to play Hockey!");
	}
}

public class ChildClass extends ParentClass {

	
	public void playFootball() 
	{
		System.out.println("Child wants to play football!");
	}
	
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		child.play();
		child.playFootball();
		
		ParentClass parent = new ParentClass();
		parent.play();
		
	}

}
