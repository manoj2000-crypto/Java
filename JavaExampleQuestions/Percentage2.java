//Name : Manoj Kale
//Program : Accept marks of 3 subjects and calculate total, percentage and grade.
import java.util.Scanner;

public class Percentage2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 subject marks : ");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		
		float total = (m1+m2+m3);
		
		float percentage = (total / 3);
		
		System.out.println("Your Percentage is : " + percentage);
		
		if(m1<40 || m2<40 || m3<40)
		{
			System.out.println("Fail");
		}
		else
		{
			if(percentage >= 90)
				System.out.println("A+");
			else if(percentage >= 75)
				System.out.println("A");
			else if(percentage >= 60)
				System.out.println("B+");
			else if(percentage >= 40)
				System.out.println("B");
			else
				System.out.println("Fail");
		}

	}

}
