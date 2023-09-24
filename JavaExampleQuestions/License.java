// Name : Manoj Kale
// Program : Accept age from user and check if he/she is eligible for license or not?
import java.util.Scanner;
public class License {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your age : ");
		int age= sc.nextInt();
		
		if(age <= 0)
		{
			System.out.println("Sorry. Your not eligible for license.");
		}
		else if(age >= 18)
		{
			System.out.println("Your eligible for license.");
		}
		else
		{
			System.out.println("Your not eligible for license.");
		}
		sc.close();
	}

}
