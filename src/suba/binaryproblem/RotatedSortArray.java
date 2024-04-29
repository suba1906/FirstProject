package suba.binaryproblem;

public class RotatedSortArray {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int x = 10;
		int ans = binaryfound(arr, 0, arr.length - 1, x);
		System.out.println(ans);

	}

	private static int binaryfound(int[] arr, int start, int end, int find) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == find)
				return mid;
			else if (arr[mid] > arr[start] && arr[start] < find) {

				return binaryfound(arr, start, mid - 1, find);

			}

			else {
				if (arr[end] >= find)
					return binaryfound(arr, mid + 1, end, find);
				else
					return binaryfound(arr, start, mid - 1, find);
			}
		}

		return -1;
	}

}
