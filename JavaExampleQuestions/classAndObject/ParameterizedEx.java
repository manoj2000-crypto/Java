package classAndObject;

public class ParameterizedEx {
	
	public static void rectangle(int length, int breadth) {
		System.out.println("Area of rectangle : "+(length*breadth));
	}

	public void circle(double radius)
	{
		System.out.println("Area of circle : " + (3.14*radius*radius));
	}
	
	public double traingle(double base, double height) 
	{
		double a = (0.5*base*height);
		return a;
	}
	
	static {
		System.out.println("Befor main()");
	}
}
