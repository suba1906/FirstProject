package suba.recrusion;

import java.util.Arrays;

public class MergeSortRecursion {

	public static void main(String[] args) {

		int arr[] = { 8, 3, 4, 12, 5, 6 };

		arr = mergeSortRec(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSortRec(int[] arr) {

		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int left[] = mergeSortRec(Arrays.copyOfRange(arr, 0, mid));

		int right[] = mergeSortRec(Arrays.copyOfRange(arr, mid, arr.length));
		return mergeSort1(arr, left, right);

	}

	private static int[] mergeSort1(int[] arr, int[] left, int[] right) {
		int arr1[] = new int[left.length + right.length];
		int i = 0, j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr1[k] = left[i];

				i++;
			} else {
				arr1[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {

			arr1[k] = left[i];
			k++;
			i++;

		}

		while (j < right.length) {

			arr1[k] = right[j];
			k++;
			j++;

		}
		return arr1;

	}

}
