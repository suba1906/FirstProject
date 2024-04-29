package suba.sortingproblem;

import java.util.Arrays;

public class MinmunDiff {

	// static int minm = Integer.MAX_VALUE;

	public static void main(String[] args) {

		int arr[] = { 3, 7, 5, 4, 6, 2, 9 };
		int arr1[] = { 3, 4, 1, 9, 56, 7, 9, 12 };

		int m = 5;

		int minm = mergeSort(arr1, 0, arr.length - 1, Integer.MAX_VALUE);

		System.out.println(Arrays.toString(arr1));

		int minmm = Integer.MAX_VALUE;

		for (int i = 0; i < arr1.length - m + 1; i++) {

			System.out.println(" asa" + arr1[i + m - 1] + " a" + arr1[i]);
			minmm = Math.min(Math.abs(arr1[i + m - 1] - arr1[i]), minmm);

		}

		System.out.println(minmm);
	}

	private static int mergeSort(int[] arr, int start, int end, int minm) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(arr, start, mid, minm);
			mergeSort(arr, mid + 1, end, minm);
			minm = merge(arr, start, mid, end, minm);

		}
		return minm;

	}

	private static int merge(int[] arr, int start, int mid, int end, int minm) {

		int leftarr[] = new int[mid - start + 1];
		int rightarr[] = new int[end - mid];

		int x = 0, y = 0, k = start;

		for (int i = 0; i < leftarr.length; i++) {
			leftarr[i] = arr[start + i];
		}

		for (int j = 0; j < rightarr.length; j++) {
			rightarr[j] = arr[mid + j + 1];
		}

		while (x < leftarr.length && y < rightarr.length) {

			if (leftarr[x] < rightarr[y]) {
				arr[k] = leftarr[x];

				x++;
			} else {
				arr[k] = rightarr[y];
				y++;
			}

			minm = findmin(arr, k, minm);

			k++;

		}

		while (x < leftarr.length) {
			arr[k] = leftarr[x];

			x++;
			minm = findmin(arr, k, minm);

			k++;
		}

		while (y < rightarr.length) {
			arr[k] = rightarr[y];

			y++;
			minm = findmin(arr, k, minm);
			k++;
		}
		return minm;

	}

	private static int findmin(int[] arr, int k, int minm) {
		if (k > 0) {

			minm = Math.min(Math.abs(arr[k] - arr[k - 1]), minm);
		}
		return minm;

	}

}
