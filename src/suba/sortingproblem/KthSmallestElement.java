package suba.sortingproblem;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 4, 2, 9 };
		int k = 3;

		quickSort(arr, 0, arr.length - 1, k);

		/*
		 * mergesort(arr, 0, arr.length - 1);
		 * 
		 * System.out.println(arr[k - 1]);
		 */
	}

	private static void quickSort(int[] arr, int start, int end, int k) {
		try {
			int p;

			p = partition(arr, start, end);
			System.out.println(p);

			if (p == k - 1) {
				System.out.println(arr[p]);

				return;
			} else if (p > k - 1)
				quickSort(arr, start, p - 1, k);
			else
				quickSort(arr, p + 1, end, k);

			// System.out.println(p);
		} catch (Exception e) {

		}

	}

	private static int partition(int[] arr, int start, int end) {
		System.out.println(start + " " + end);
		int pivot = arr[end];

		int index = start;

		while (start < end) {

			if (arr[start] < pivot) {
				swap(arr, start, index);
				index++;
			}

			start++;
		}

		swap(arr, index, end);

		System.out.println(Arrays.toString(arr));

		return index;

	}

	private static void mergesort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2;

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
	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
