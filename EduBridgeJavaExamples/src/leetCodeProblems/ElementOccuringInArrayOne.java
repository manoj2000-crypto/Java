package leetCodeProblems;

public class ElementOccuringInArrayOne {
	/*
	 * Element appearing more than 25% in sorted array.
	 */
	public static int findSpecialElement(int[] arr) {
		int length = arr.length;
		int quarter = length / 4;

		for (int i = 0; i < length - quarter; i++) {
			if (arr[i] == arr[i + quarter]) {
				return arr[i];
			}
		}

		return -1; // If no element is found
	}

	public static void main(String[] args) {
		System.out.println("Answer : " + findSpecialElement(new int[] { 1, 2, 2, 6, 6, 6, 6, 3, 2 }));
	}

}
