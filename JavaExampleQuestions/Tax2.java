//Name : Manoj kale
//Program : Accept salary of a person and print tax amount. Tax is 10% if income<25000, otherwise 15%.
import java.util.Scanner;

public class Tax2 {

	public static void main(String[] args) {
		
		float tax,sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Salary : ");
		
		sal = sc.nextFloat();
		if(sal < 25000)
		{
			tax = (sal*0.10f); 
			System.out.println("Your tax(10%) ammount is : " + tax);
		}
		else
		{
			tax = (sal*0.15f);
			System.out.println("Your tax(15%) ammount is : " + tax);
		}
		sc.close();

	}

}
