package suba.arrayproblem;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 10, 10 };

		int firstlargest = getLargestElement(arr);
		System.out.println(firstlargest);

		int maxval = Integer.MIN_VALUE;
		int secondlargest = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > secondlargest && arr[i] != firstlargest) {

				secondlargest = arr[i];
			}
		}

		System.out.println(secondlargest);

	}

	private static int getLargestElement(int[] arr) {

		int max = Integer.MIN_VALUE;
		// int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				// index=i;
			}
		}

		return max;
	}

}
