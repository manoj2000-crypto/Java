package MethodExamples;
//create Arithmetic class and perform all Arithmetic operations.
public class Arithmetic {
	
	public static void addition(int a, int b) 
	{
		System.out.println("Addition of  two number : " + ( a + b ) );
	}
	
	private int subtraction(int n1, int n2) 
	{
		return ( n1 - n2 );
	}
	
	protected double divisionUsingDouble(double d1, double d2)
	{
		return ( d1 / d2 );
	}
	
	public float divisionUsingFloat(float f1, float f2) 
	{
		return ( f1 / f2 );
	}
	
	public long multiplication(long p, long q) 
	{
		return ( p * q );
	}
	
	private boolean isEven(int number) 
	{
		if(number % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Arithmetic.addition( 100, 2002 ); //Static method
		
		Arithmetic ar = new Arithmetic(); // Object creating
		System.out.println("Subtraction      : " + ar.subtraction( 55, 44 ) );
		System.out.println("Divisoin(Double) : " + ar.divisionUsingDouble( 100.101055, 2.222222 ) );
		System.out.println("Division(Float)  : " + ar.divisionUsingFloat( 4.444f, 2.002f ) );
		System.out.println("Multiplication   : " + ar.multiplication( 12346578, 87654321 ) );
		System.out.println("isEven ?(T or F) : " + ar.isEven( 20 ) );
	}

}