package logicalProgram;

import java.util.Arrays;

public class XylemOrPhloem {

	public static void main(String[] args) {
		
		System.out.println("The given number is : " + Arrays.toString(args) );
		
		int firstNo = Integer.parseInt(args[0]);
		args[0] = "0";
		
		int lastNo = Integer.parseInt(args[args.length - 1]);
		args[args.length - 1] = "0";
		
		int outterSum = firstNo + lastNo;
		
		System.out.println("Outter No Sum : " + outterSum);
		
		int innerSum = 0;
		for(int i=0; i<args.length; i++)
		{
			System.out.print(args[i] + " ");
			innerSum = innerSum + Integer.parseInt( args[i] );
		}
		
		System.out.println("\nInner no sum : " + innerSum);
		
		if(outterSum == innerSum) 
		{
			System.out.println("The given number is Xylem number.");
		}
		else 
		{
			System.out.println("The given number is Phloem number.");
		}
		//example : 
		// 7 6 1 3 1 2 -> Phloem number.
		// 8 2 5 1 2 2 -> Xylem Number.
	}

}
