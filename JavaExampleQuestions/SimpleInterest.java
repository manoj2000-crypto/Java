//Name : Manoj Kale
//3rd Program : Simple Interest.
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		
		System.out.print(" Enter Principal , Rate of Interest per year, Time : ");

		Scanner sc = new Scanner(System.in);
		float p = sc.nextFloat();
		float ri = sc.nextFloat();
		float t = sc.nextFloat();
		
		float si = ( (p*ri*t) / 100);
		
		System.out.println("Simple Interest : " + si);
		sc.close();
	}

}
