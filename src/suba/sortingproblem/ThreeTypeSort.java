package suba.sortingproblem;

import java.util.Arrays;

public class ThreeTypeSort {

	public static void main(String[] args) {

		int arr[] = { 0, 2, 1, 2, 0 };

		// {0,0,1,1,2,2}

		int start = 0, end = arr.length - 1;

		int pivot = 1;

		int leftindex = start, rightindex = end;

		while (start <= rightindex) {

			if (arr[start] < pivot) {
				swap(arr, leftindex, start);
				start++;
				leftindex++;
			} else if (arr[start] > pivot) {
				swap(arr, rightindex, start);
				rightindex--;

			} else
				start++;

		}

		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
