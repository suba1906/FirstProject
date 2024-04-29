package suba.binaryproblem;

public class RecrusiveBinary {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };

		int find = 50;

		int ans = binaryway(arr, find, 0, arr.length - 1);
		System.out.println(ans);
	}

	private static int binaryway(int[] arr, int find, int start, int end) {

		int mid = start + (end - start) / 2;

		if (start > end) // base condition
			return -1;

		if (arr[mid] == find)
			return mid;

		if (arr[mid] < find)
			return binaryway(arr, find, mid + 1, end);
		else
			return binaryway(arr, find, start, mid - 1);

	}

}
