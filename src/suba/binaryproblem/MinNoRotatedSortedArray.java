package suba.binaryproblem;

public class MinNoRotatedSortedArray {

	public static void main(String[] args) {

		int arr[] = { 100, 500, 50, 60, 90 };

		int arr2[] = { 70, 80, 3, 20, 22, 33, 48, 51 };

		System.out.println(findMin(arr2));

	}

	private static int findMin(int[] arr) {

		int start = 0, end = arr.length - 1;
		int minval = arr[0];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] >= arr[start]) {
				minval = Math.min(minval, arr[start]);

				start = mid + 1;

			} else {

				end = mid;

			}

		}
		return minval;
	}

}
