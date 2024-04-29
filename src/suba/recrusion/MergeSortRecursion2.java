package suba.recrusion;

import java.util.Arrays;

public class MergeSortRecursion2 {

	public static void main(String[] args) {

		int arr[] = { 6, 2, 4, 1 };

		mergeSortRec(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSortRec(int[] arr, int start, int end) {

		if (start >= end) {
			//System.out.println("start" + start + " end" + end);

			return;
		}

		int mid = start + (end - start) / 2;

		mergeSortRec(arr, start, mid);
		//System.out.println(mid);
		mergeSortRec(arr, mid + 1, end);

		mergeSort(arr, start, mid, end);

	}

	private static void mergeSort(int[] arr, int start, int mid, int end) {

		//System.out.println("start " + start + " mid" + mid + "end " + end);

		int left[] = new int[mid - start + 1];
		int right[] = new int[end - mid];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[start + i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[mid + j + 1];
		}

		int li = 0, ri = 0, k = start;

		while (li < left.length && ri < right.length) {
			if (left[li] < right[ri]) {
				arr[k] = left[li];
				li++;

			} else {

				arr[k] = right[ri];
				ri++;

			}

			k++;
		}

		while (li < left.length) {

			arr[k] = left[li];
			li++;

			k++;
		}

		while (ri < right.length) {

			arr[k] = right[ri];
			ri++;

			k++;
		}

	}

}
