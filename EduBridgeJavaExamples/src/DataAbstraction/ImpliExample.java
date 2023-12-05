package DataAbstraction;

public class ImpliExample implements Drawables 
{
	
	public void calculate() 
	{
		int radius = 10;
		System.out.println("Area of circle  : " + (PI*(radius*radius)));
	}

	public static void main(String[] args) {
		
		Drawables draw = new ImpliExample();
		draw.calculate();
		draw.cube(5);
		System.out.println("Square of a number : " + Drawables.square(5));
	}

}
