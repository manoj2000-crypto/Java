//Name : Manoj Kale
//Program : Accept a number from user and check whether it is +ve, -ve or zero.
import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if(num < 0)
			System.out.println(num + " is -ve");
		else if(num > 0)
			System.out.println(num + " is +ve");
		else
			System.out.println(num +" is 0");
	}

}
