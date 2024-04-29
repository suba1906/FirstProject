package suba.binaryproblem;

public class Problem1 {

	public static void main(String[] args) {

		// Sorted Array
		int arr[] = { 10, 20, 30, 45, 50, 60 };
		int find = 45;

		System.out.println("normamlway" + normamlway(arr, find));
		System.out.println("binaryway" + binaryway(arr, find));
	}

	private static int normamlway(int[] arr, int find) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find)
				return i;
		}
		return -1;
	}

	private static int binaryway(int[] arr, int find) {

		// System.out.println("mid" + mid);
		int start = 0, end = arr.length-1;
		;

		while (start <= end) {
			// System.out.println("start");

			int mid = start + (end - start) / 2;
			if (arr[mid] == find)
				return mid;
			else if (arr[mid] < find)
				start = mid + 1;
			else
				end = mid - 1;

		}
		return -1;
	}

}
