package DataAbstraction;

public interface Drawables {
	
	float PI = 3.14f;
	void calculate(); // abstract method
	
	static int square(int a ) 
	{
		return a*a;
	}
	
	default void cube(int x) 
	{
		System.out.println(" Cube of a number : " + (x*x*x));
	}
	
	
//	public static void main(String args[]) 
//	{
//		System.out.println("From Interface : " + square(5));
//	}

}
