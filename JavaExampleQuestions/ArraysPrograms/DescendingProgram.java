package ArraysPrograms;
/*
 * Read rollNo and marks of 5 students and print them in descending order of marks.   | DONE
 	RollNo	1	2	3	4	5
 	marks	65	58	89	42	76
 	
 	output :
 				Roll No : 	3	5	1	2	4
				Marks : 	89	76	65	58	42
 	 
 * */
public class DescendingProgram {

	public static void main(String[] args) {
		
		int rollNo[] = {1,2,3,4,5};
		int marks[] = {65,58,89,42,76};
		
		int i,j,temp,temp2;
		
		for(i=0; i<rollNo.length-1; i++)
		{
			for(j=i+1; j<rollNo.length; j++)
			{
				if(marks[i] < marks[j])
				{
					temp = marks[i]; 
					marks[i] = marks[j];
					marks[j] = temp;
					
					temp2 = rollNo[i]; 
					rollNo[i] = rollNo[j];
					rollNo[j] = temp2;
				}
			}
		}
		
		System.out.print("Roll No : ");
		for(i=0; i<rollNo.length;i++)
		{
			System.out.print("\t" + rollNo[i]);
		}
		System.out.print("\nMarks : ");
		for(i=0; i<rollNo.length;i++)
		{
			System.out.print("\t" + marks[i]);
		}
	}

}
