package suba.binaryproblem;

public class FirstOccurence {

	public static void main(String[] args) {

		int arr[] = { 10, 10, 15, 20, 20, 20, 25, 30, 30, 40 };

		int find = 20;

		int start = 0;
		int end = arr.length - 1;

		System.out.println(firstocc(arr, find, start, end));
		System.out.println(lastocc(arr, find, start, end));

	}

	private static int firstocc(int[] arr, int find, int start, int end) {
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == find) {
				// System.out.println("mid" + mid);
				if (mid != 0 && arr[mid - 1] == arr[mid]) {
					// System.out.println("inside" + mid);

					// start = mid - 1;
					end = mid - 1;

				} else
					return mid;
			}

			else if (arr[mid] < find)
				start = mid + 1;
			else
				end = mid - 1;

		}
		return -1;
	}

	private static int lastocc(int[] arr, int find, int start, int end) {
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == find) {
				// System.out.println("mid" + mid);
				if (mid != arr.length && arr[mid + 1] == arr[mid]) {

					start = mid + 1;
					// end = mid + 1;

					// System.out.println("end" + end + " " + start);

				} else
					return mid;
			}

			else if (arr[mid] < find)
				start = mid + 1;
			else
				end = mid - 1;

		}
		return -1;
	}

}
