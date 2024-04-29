package suba.sortingproblem;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 2, 10, 8, 7 };
	//	int arr[] = { 2, 7, 8,10 };

		naiveMethod(arr);

	}

	private static void naiveMethod(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;

			for (int j = 0; j < arr.length - i - 1; j++) {
				// In every i th position i th element fixed in the array. So, in j th loop
				// arr.length -i-1
				System.out.println(j);
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;  // Optimized way
				}

			}
			if (!swapped)
				break;
		}

		System.out.println(Arrays.toString(arr));
	}

}
