package suba.binaryproblem;

public class TripletSortedArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 8, 9, 20, 40 };
		int x = 51;

		System.out.println(findtriplet(arr, x));

	}

	private static boolean findtriplet(int[] arr, int find) {

		int start = 1, end = arr.length - 2;

		while (start < end) {

			// boolean ans = findPair(arr, start + 1, find - arr[start]);
			if (findPair(arr, start + 1, find - arr[start]))
				return true;
			else
				start++;

		}
		return false;
	}

	private static boolean findPair(int[] arr, int first, int find) {

		int end = arr.length - 1;
		// System.out.println(first);

		while (first <= end) {
			if (arr[first] + arr[end] == find) {
				// System.out.println(arr[first] + "" + arr[end]);
				return true;
			} else if (arr[first] + arr[end] > find)
				end--;
			else
				first++;
		}

		return false;
	}

}
