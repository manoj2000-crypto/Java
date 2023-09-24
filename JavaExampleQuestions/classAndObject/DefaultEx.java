package classAndObject;

import java.util.Scanner;

public class DefaultEx {
	
	int a, b;

	public void add() 
	{
		System.out.println("Add : " + (a+b));
	}
	
	public int sub() 
	{
		int c = a-b;
		return c;
	}
	
	public void acceptNumber() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}
}
