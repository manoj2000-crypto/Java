package logicalProgram;
// Print : (1,3) , (3,5) , (5,7) , (7,9) , (9,11) , (11,13) , (13,15) , (15,17) , (17,19) , (19,21)
public class LogicalProgram1 {

	public static void main(String[] args) {
		
		int a = 1;
		
		for(int i = 1; i<=10; i++) 
		{
			System.out.print("("+a++ + "," + ++a + ")");
			if(i<10) 
			{
				System.out.print(" , ");
			}
		}
		
	}

}
