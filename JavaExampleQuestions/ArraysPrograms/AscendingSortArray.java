package ArraysPrograms;
// Sort array elements in ascending order
public class AscendingSortArray {

	public static void main(String[] args) {
		
		int nums[] = {10,2,333,41,5};
		int i,j,temp ;
		for(i=0;i<nums.length-1;i++)
		{
			for(j=i+1; j<nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print("Ascending order : ");
		for(i=0;i<nums.length;i++)
		{
			System.out.print("\t" + nums[i]);
		}

	}

}
