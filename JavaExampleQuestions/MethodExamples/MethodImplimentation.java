package MethodExamples;
import java.util.Scanner;
/*
 * create a class MethodImpl, use switch case to give user choice(use do-while)
	1.check whether person is eligible for voting
	2.check whether number is +ve, -ve or zero
	3.check whether number is even or odd
	4.check whether number is armstrong number or not
	5.check whether number is palindrome number or not
 * 
 * */
public class MethodImplimentation {
	
	Scanner sc = new Scanner(System.in);
	private int n = 0;
	
	public void isEligible()
	{
		System.out.print("Enter age to check if your eligible or not : ");
		n = sc.nextInt();
		if( n >= 18 )
			System.out.print("Your eligible for voting.");
		else
			System.out.print("Your not eligible for voting.");
	}
	
	protected void checkNumber() 
	{
		System.out.print("Enter number to +ve, -ve or Zero : ");
		n = sc.nextInt();
		if(n>0) 
		{
			System.out.println(n + " is +ve");
		}
		else if(n<0) 
		{
			System.out.println(n + " is -ve");
		}
		else 
		{
			System.out.println(n + " is Zero.");
		}
	}
	
	public void checkEvenOdd() 
	{
		System.out.print("Enter number to check : ");
		n = sc.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println(n + " is Even.");
		}
		else 
		{
			System.out.println(n +" is Odd.");
		}
	}
	
	private void checkArmStrong() 
	{
		System.out.print("Enter number to check armstrong or not : ");
		n = sc.nextInt();
		
		int rem, sum = 0, originalNumber;
		originalNumber = n; 
		while(originalNumber != 0) 
		{
			rem = ( originalNumber % 10 );
			sum = sum + (rem*rem*rem);
			originalNumber = ( originalNumber / 10 );
		}
		if(sum == n)
			System.out.println(n + " is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");
	}
	
	protected void palindrome() 
	{
		System.out.print("Enter the number to check palindrome : ");
		n = sc.nextInt();
		int sum = 0, remainder, sameNumber;
		
		sameNumber = n;
		
		while(n > 0)
		{
			remainder = ( n % 10 ); 
			sum = remainder + ( sum * 10 );
			n = ( n / 10 );
		}
		if( sameNumber == sum )
			System.out.println(sameNumber + " is palindrome number.");
		else
			System.out.println(sameNumber + " is not a palindrome number.");
	}

	public static void main(String[] args) {
		
		MethodImplimentation mi = new MethodImplimentation();
		Scanner sc1 = new Scanner(System.in);
		char ch;
		do 
		{
			System.out.println("\n1. Check Voting Eligiblity. \n2. Check number +ve, -ve, Zero. \n3. Check number is Even or Odd. \n4. Check number is Armstrong or not. \n5. Check number is palindrome or not.");
			System.out.print("\nEnter your choice : ");
			int choice =  sc1.nextInt();
			
			switch(choice) 
			{
				case 1 :
					mi.isEligible();
					break;
				case 2 :
					mi.checkNumber();
					break;
				case 3 :
					mi.checkEvenOdd();
					break;
				case 4 :
					mi.checkArmStrong();
					break;
				case 5 :
					mi.palindrome();
					break;
				default : 
					System.out.println("Please enter above choices");
					break;
			}
			System.out.print("\n\nDo you want ot continue press y|Y : ");
			ch = sc1.next().charAt(0);
		}
		while( ch == 'y' || ch == 'Y' );
		sc1.close();
	}

}
