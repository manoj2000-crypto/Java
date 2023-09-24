//5th Program : Salary tax on 12 Percentage 
//Name : Manoj Kale
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		float tax,sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary : ");
		
		sal = sc.nextFloat();
		//by default it takes double type data so we have to convert it to float
		tax = (sal*0.12f); 
		
		System.out.println("Your tax ammount is : " + tax);
		
		sc.close();

	}

}
