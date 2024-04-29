package suba.binaryproblem;

public class FindElementInInfinity {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 90, 100, 110, 120, 165, 178, 190, 210, 230, 267, 290 };
		int x = 290;

		if (arr[0] == x)
			System.out.println(0);
		int i = 1;
		while (arr[i] < x) {

			i *= 2;
		}

		if (arr[i] == x)
			System.out.println("found  -->" + i);

		System.out.println(findInInfinity(arr, i / 2 + 1, i - 1, x));
	}

	private static int findInInfinity(int[] arr, int start, int end, int find) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == find)
				return mid;
			else if (arr[mid] < find) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

}
