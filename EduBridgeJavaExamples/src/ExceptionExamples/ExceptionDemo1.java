package ExceptionExamples;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		int a = 10, b = 0;
		
		try 
		{
			int c = a / b;
			System.out.println("Div : " + c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
			System.err.println(ae);
		}
		
		System.out.println("rest of the code..");
		
	}

}
