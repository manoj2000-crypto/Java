//Name : Manoj Kale
//Program : Accept no. of calls from user and print bill amount. 
//           Rs.1 per call should be charged if no. of calls is less than 200, 
//            otherwise Rs.3 per call.

import java.util.Scanner;

public class CallPrice {

	public static void main(String[] args) {
		
		int calls,amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of calls : ");
		calls = sc.nextInt();
		if(calls < 200)
		{
			amount = (calls * 1);
			System.out.println("Rs 1.0 per call \nYour bill amount is " + amount);
		}
		else
		{
			amount = (calls * 3);
			System.out.println("Rs 3.0 per call \nYour bill amount is " + amount);
		}
		sc.close();

	}

}
