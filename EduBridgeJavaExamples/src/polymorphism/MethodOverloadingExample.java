package polymorphism;

public class MethodOverloadingExample {
	
	public int add(int a , int b) 
	{
		return (a + b);
	}
	
	public double add(double a , double b) 
	{
		return (a + b);
	}
	
	public int add(int a, int b, int c)
	{
		return (a + b + c);
	}

	public static void main(String[] args) {
		
		MethodOverloadingExample mole = new MethodOverloadingExample();
		System.out.println( mole.add(10, 5) ); //int with two parameters.
		System.out.println( mole.add(22.22, 11.11) ); //double with two parameters.
		System.out.println( mole.add(1, 2, 3) ); //int with three parameters.
	}

}
