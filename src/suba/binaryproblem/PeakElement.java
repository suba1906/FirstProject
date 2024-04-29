package suba.binaryproblem;

public class PeakElement {

	public static void main(String[] args) {

		int arr[] = { 70, 80, 3, 20, 22, 33, 48, 51 };
		int arr1[] = { 10, 20, 15, 5, 23, 90, 67 };
		int arr2[] = { 90, 80 };
		int arr3[] = { 5, 10, 20, 16, 11, 13, 15 };

		// op -> 20

		int ans = findpeak(arr1);
		System.out.println(ans);
	}

	private static int findpeak(int[] arr) {

		int start = 0, end = arr.length - 1;
		// Base condition
		
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
				return arr[mid];
			}

			if (mid > 0 && arr[mid - 1] >= arr[mid])
				end = mid - 1;
			else {
				start = mid + 1;
			}
		}

		return 0;
	}

	/*
	 * if (arr[mid] >= arr[start]) {
	 * 
	 * if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return arr[mid]; else
	 * start = mid + 1; } else { end = mid; }
	 */

}
