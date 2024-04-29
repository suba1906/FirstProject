package suba.arrayproblem;

public class MaxDiffbtwTwo {

	public static void main(String[] args) {

		//int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		 //int arr[] = { 7, 9, 5, 6, 3, 2 };
		 int arr[] = {10,20,30};
		// int arr[] = { 30, 10, 8, 2 };
		int max = Integer.MIN_VALUE;

		int ans;
		// ans = firstMethod(arr, max);
		ans = secondmethod(arr, max);
		System.out.println(ans);

	}

	private static int secondmethod(int[] arr, int max) {

		int largest = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {

			/*
			 * if (arr[i - 1] > largest) { largest = arr[i - 1]; } else { int val = largest
			 * - arr[i - 1];
			 * 
			 * max = Math.max(val, max); }
			 */

			
			largest = Math.max(arr[i - 1], largest);
			max = Math.max(largest - arr[i - 1], max);

		}
		return max == Integer.MIN_VALUE ? -1 : max;
	}

	private static int firstMethod(int[] arr, int max) {
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[j] > arr[i]) {
					// int val = arr[j] - arr[i];
					max = Math.max(arr[j] - arr[i], max);

				}
			}
		}

		return max == Integer.MIN_VALUE ? -1 : max;
	}
}
