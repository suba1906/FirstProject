package suba.sortingproblem;

import java.util.Arrays;

public class MergeSort {
	static int minm = Integer.MAX_VALUE;

	public static void main(String[] args) {

		// int arr[] = { 10, 20, 5, 15 };
		int arr[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
		int m = 5;
		int start = 0, end = arr.length - 1;

		mergeSort(arr, start, end);
		System.out.println(Arrays.toString(arr));

		System.out.println(minm);

		int minmm = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - m + 1; i++) {

			//System.out.println(" asa" + arr[i + m - 1] + " a" + arr[i]);
			minmm = Math.min(Math.abs(arr[i + m - 1] - arr[i]), minmm);

		}

		System.out.println(minmm);

	}

	private static void mergeSort(int[] arr, int start, int end) {

		if (start < end) {
			int mid = start + (end - start) / 2; // --> to avoid over flow
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
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

			} else {
				arr[k] = rightarr[ri];
				ri++;

			}
			findmin(arr, k);

			k++;
		}

		while (li < leftarr.length) {
			arr[k] = leftarr[li];
			li++;
			findmin(arr, k);

			k++;
		}

		while (ri < rightarr.length) {

			arr[k] = rightarr[ri];
			ri++;
			findmin(arr, k);

			k++;
		}
	}

	private static void findmin(int[] arr, int k) {
		if (k > 0) {

			minm = Math.min(Math.abs(arr[k] - arr[k - 1]), minm);
		}

	}

}
