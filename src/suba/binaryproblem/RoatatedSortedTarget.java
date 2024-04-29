package suba.binaryproblem;

public class RoatatedSortedTarget {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3 };
		int target = 5;

		findtarget(arr, target);
		System.out.println(findtargetRecrusion(arr, target, 0, arr.length - 1));

	}

	private static void findtarget(int[] arr, int target) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				// System.out.println(arr[mid] + " " + target);
				System.out.println(mid);

				break;
			} else if (arr[start] < arr[mid]) {
				if (target >= arr[start] && target < arr[mid])
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if (target > arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}

		// System.out.println(-1);
	}

	private static int findtargetRecrusion(int[] arr, int target, int start, int end) {

		if (start > end) {
			return -1;

		}

		int mid = start + (end - start) / 2;
		if (arr[mid] == target)
			return mid;

		else if (arr[start] < arr[mid]) {
			if (target >= arr[start] && target < arr[mid])
				return findtargetRecrusion(arr, target, start, mid - 1);
			else
				return findtargetRecrusion(arr, target, mid + 1, end);

		} else {
			if (target > arr[mid] && target <= arr[end])
				return findtargetRecrusion(arr, target, mid + 1, end);
			else
				return findtargetRecrusion(arr, target, start, mid - 1);

		}

	}

}
