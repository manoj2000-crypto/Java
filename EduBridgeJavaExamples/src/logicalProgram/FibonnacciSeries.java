package logicalProgram;
/*
 * If we print the Fibonacci Series using 'int' datatype then we will get negative values, 
 * after a certain number of iterations.
 * 
 * I have tried several datatypes but out of that all 'double' datatype is giving me 
 * more accurate values because it is known for its precision.
 * 
 * I also tried the 'long' datatype, but it also gives a negative number after a certain iteration.
 * 
 * So, here firstly I am doing the operation using 'double' and then typecasting it into 'long'.
 * 
 * until here I am not getting negative numbers.
 * 
 * */
public class FibonnacciSeries {

	public static void main(String[] args) {
		
		double number1 = 0,  number2 = 1, number3 = 0;
		
		System.out.print(number1 + " " + number2);
		
		for(double i = 2; i<=100; i++) 
		{
			number3 = number1 + number2;
			System.out.print(" " + (long)number3);
			number1 = number2;
			number2 = number3;
		}
		
	}

}
