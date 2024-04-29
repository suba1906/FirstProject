package suba.binaryproblem;

public class CountOccurence {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 30, 40, 40, 40, 60 };

		int find = 40;

		int start = 0, end = arr.length - 1;

		int occurence = 0;
		int count = normaljava(arr, find);
		System.out.println("count using normal java " + count);

		int first = firstocc(arr, find, start, end);
		if (first != -1) {
			int last = lastocc(arr, find, start, end);
			occurence = (last - first) + 1;
		}
		System.out.println(occurence);
	}

	private static int normaljava(int[] arr, int find) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == find)
				count++;
		}

		return count;
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
