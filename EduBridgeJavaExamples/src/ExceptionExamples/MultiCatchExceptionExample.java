package ExceptionExamples;

public class MultiCatchExceptionExample {

	public static void main(String[] args) {
		
		
		try {
			int a[] = new int[5];
			a[7] = 12/0;
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			aiob.printStackTrace();
		}
		
		System.out.println("Rest of the code ...");
		

	}

}
