package JavaExampleQuestions;

import java.util.Scanner;

public class Best {
	
	//Data members : custName,phoneNo,number of calls, tax and bill.
	public String custName;
	private long phoneNo;
	protected double tax, bill;
	protected int numberOfCalls;
	private String finalBill = "", str1 = "";
	private char[] chArray;
	
	/*
	 * Member Functions :
	accept() : input custName, phoneNo and calls from user
	billing() : calculate bill amount based on the following condition
	 * */
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		custName = sc.next();
		
		System.out.print( this.custName + " enter your phone number : ");
		
		do //using do while loop for accepting only 10 digits and not accepting less zero
		{
			phoneNo = sc.nextLong(); 
			str1 = String.valueOf(phoneNo); //converting phone no into string.
			chArray = str1.toCharArray(); //converting string to char array.
			//checking char array length equals 10 or not and less than zero or not.
			if((chArray.length != 10) || (phoneNo <= 0) )
				System.out.print("\nEnter 10 digit only!\nNot less than zero!\nEnter again : ");
		}
		while((chArray.length != 10) || (phoneNo <= 0) );
		
		System.out.print( this.custName + " enter number of calls : ");
		numberOfCalls = sc.nextInt();
		
		sc.close();
	}
	
	protected void billing() 
	{
		if( numberOfCalls <= 100) 
		{
			System.out.println("Rate per call : Nil");
		}
		else if( numberOfCalls >= 101 && numberOfCalls <= 300)
		{
			bill = ( numberOfCalls * 0.80 );
			tax = ( bill * 0.12 );
			bill = ( bill + tax );
			finalBill = String.format("final bill : %.2f", bill);
			System.out.println(finalBill);
		}
		else if(numberOfCalls >= 301 && numberOfCalls <= 500) 
		{
			bill = ( numberOfCalls * 1.25 );
			tax = ( bill * 0.12 );
			bill = ( bill + tax);
			finalBill = String.format("final bill : %.2f", bill);
			System.out.println(finalBill);
		}
		else 
		{
			bill = ( numberOfCalls * 2.50 );
			tax = ( bill * 0.12 );
			bill = ( bill + tax );
			finalBill = String.format("final bill : %.2f", bill);
			System.out.println(finalBill);
		}
	}
	
	
	public static void main(String[] args) {
		
		Best best = new Best();
		best.accept();
		best.billing();
		
	}

}
