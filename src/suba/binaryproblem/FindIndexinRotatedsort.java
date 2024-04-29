package suba.binaryproblem;

public class FindIndexinRotatedsort {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		int start = 0, end = arr.length - 1;
		int target = 7;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println(mid);
			if (arr[mid] == target) {
				System.out.println("target found" + arr[mid] + "index  " + mid);
				return;
			}
			if (arr[start] < arr[mid]) {
				System.out.println("start lesser");
				if (target < arr[mid] && target >= arr[start]) {
					System.out.println("target condition");

					end = mid - 1;

				} else {
					System.out.println("target opp condition");

					start = mid + 1;
				}
			} else {
				if (target > arr[end]) {
					end = mid;

				} else
					start = mid;
			}

			
		}

		System.out.println("not found   " + -1);
	}

}
