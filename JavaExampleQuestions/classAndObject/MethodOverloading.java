package classAndObject;

public class MethodOverloading {

	public int doSomething(int a, int b) 
	{
		int c = a + b;
		return c;
	}
	
	public int doSomething(int z) 
	{
		return (z*z*z);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mol = new MethodOverloading();
		System.out.println(" Addition : "  + mol.doSomething(10, 20) );
		System.out.println(" Cube     : "  + mol.doSomething(2) );
	}

}
