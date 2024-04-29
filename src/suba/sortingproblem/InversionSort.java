package suba.sortingproblem;

public class InversionSort {
	static int count = 0;

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 3, 6, 5 };

		// here we using merge sort

		int start = 0, end = arr.length - 1;

		mergesort(arr, start, end);

	}

	private static void mergesort(int[] arr, int start, int end) {
		int mid = start + (end - start) / 2;
		if (end > start) {
			mergesort(arr, start, mid);
			mergesort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {

		int leftarr[] = new int[mid - start + 1];
		int rightarr[] = new int[end - mid];

		for (int i = 0; i < leftarr.length; i++) {
			leftarr[i] = arr[start + i];
		}

		for (int j = 0; j < rightarr.length; j++) {
			rightarr[j] = arr[mid + j + 1];
		}

		int li = 0, ri = 0, k = start;
		while (li < leftarr.length && ri < rightarr.length) {
			if (leftarr[li] < rightarr[ri]) {
				arr[k] = leftarr[li];
				li++;
				k++;

			} else {
				count += leftarr.length - li;
				arr[k] = rightarr[ri];
				ri++;
				k++;

			}
		}

		while (li < leftarr.length) {
			arr[k] = leftarr[li];
			li++;

			k++;
		}

		while (ri < rightarr.length) {

			arr[k] = rightarr[ri];
			ri++;

			k++;
		}

		System.out.println(count);
	}

}
