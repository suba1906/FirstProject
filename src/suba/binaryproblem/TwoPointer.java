package suba.binaryproblem;

public class TwoPointer {

	public static void main(String[] args) {

		// pair is thr in sorted array tehn return true or false

		int arr[] = { 3, 8 };
		int x = 8;

		// if element greater thn x --> pir will not form

		System.out.println(findpair(arr, x));
	}

	private static boolean findpair(int[] arr, int find) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {

			if (arr[start] + arr[end] == find)
				return true;
			else if (arr[end] > find)
				end--;
			else
				start++;

		}
		return false;
	}

}
