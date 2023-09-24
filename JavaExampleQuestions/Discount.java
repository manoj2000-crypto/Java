//Name : Manoj Kale
//Program : Accept purchase amount from the user and print discount amount. 
//                 10% discount on purchase if amount is greater than or equal to 10000, 
//                 otherwise 2% discount. 

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		float dis,amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your purchase amount : ");
		amount = sc.nextFloat();
		if(amount >= 10000)
		{
			dis = (amount*0.10f); 
			System.out.println("Your amount is " + amount + ", discount(10%) : " + dis);
		}
		else
		{
			dis = (amount*0.02f);
			System.out.println("Your amount is " + amount + ", discount(2%) : " + dis);
		}
		sc.close();
	}

}