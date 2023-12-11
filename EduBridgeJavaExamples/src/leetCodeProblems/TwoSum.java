package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the two numbers 
	 * such that they add up to target.
	 * */
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> numberMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = (target - nums[i]);

			if (numberMap.containsKey(complement)) {
				return new int[] { numberMap.get(complement), i };
			}
			numberMap.put(nums[i], i);
		}

		return nums; // if above return works then it will not come here.
	}
	
	public static void main(String[] args) {
		TwoSum twoSumObj = new TwoSum();
		int arr[] = {2,3,4,2};
		System.out.println("Answer : " + Arrays.toString(twoSumObj.twoSum(arr, 7)));
	}

}
