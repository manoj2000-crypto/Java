//Name : Manoj Kale
// 1st Program : All Arithmetic operations 
import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("All Arithmetic operations : ");
		System.out.println("Enter two numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("Addition of two numbers : " + a + " + " + b + " = " + c);
		
		c = a - b;
		System.out.println("Subtraction of two numbers : " + a + " - " + b + " = " + c);
		
		c = a * b;
		System.out.println("Multiplication of two numbers : " + a + " x " + b + " = " + c);
		
		c = a / b;
		System.out.println("Subtraction of two numbers : " + a + " / " + b + " = " + c);
		sc.close();
	}

}
