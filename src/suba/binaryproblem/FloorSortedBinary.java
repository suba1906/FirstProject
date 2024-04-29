package suba.binaryproblem;

public class FloorSortedBinary {

	public static void main(String[] args) {

		long arr[] = { 10, 20, 30, 40, 50, 60 };
		long target = 45;
		// op -> 2 bcz 10,20,30 are smallest than 40 and 30 is largest among that
		int start = 0, end = arr.length - 1;

		System.out.println(binnaryway(arr, target, start, end));

	}

	private static int binnaryway(long[] arr, long target, int start, int end) {

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;

		}

		return end > 0 ? end : -1;
	}

}
