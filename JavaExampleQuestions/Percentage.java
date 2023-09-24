// Name : Manoj Kale
//4th Program : Calculate percentage of three subject.

import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 subject marks : ");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		float m3 = sc.nextFloat();
		
		float total = (m1+m2+m3);
		
		float percentage = total / 3;
		
		System.out.println("Your Percentage is : " + percentage);
	}

}
