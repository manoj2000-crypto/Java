package JavaExampleQuestions;

import java.util.Scanner;

public class Depositor {

	public String name;
	protected double principalAmount, numberOfYears, accumulatedAmount, rateOfInterest;
	protected String finalAmount;
	
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = sc.next();
		
		System.out.print("Enter principle amount : ");
		principalAmount = sc.nextDouble();
		
		System.out.print("Enter number of years : ");
		numberOfYears = sc.nextDouble();
		
		if(numberOfYears < 1)
			rateOfInterest = 9;
		else if(numberOfYears >= 1 && numberOfYears <= 3)
			rateOfInterest = 9.25;
		else if(numberOfYears >= 4 && numberOfYears <= 5)
			rateOfInterest = 9.5;
		else
			rateOfInterest = 9.75;
		
		System.out.println("rate of interest : " + rateOfInterest);
		sc.close();
	}
	
	private void amount() 
	{	
		accumulatedAmount = principalAmount*Math.pow( 1+(rateOfInterest/100) ,numberOfYears);
		finalAmount = String.format("Accumulated amount : %.2f", accumulatedAmount);
		System.out.println(finalAmount);
	}
	
	public static void main(String[] args) {
		
		Depositor depo = new Depositor();
		depo.accept();
		depo.amount();

	}

}
