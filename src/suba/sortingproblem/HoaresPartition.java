package suba.sortingproblem;

import java.util.Arrays;

public class HoaresPartition {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 3, 9, 7 };
		int start = 0, end = arr.length - 1;

		quicksort(arr, start, end);

	}

	private static void quicksort(int[] arr, int low, int high) {

		int p = hoares(arr, low, high);
		System.out.println(Arrays.toString(arr));
		System.out.println(p);
		quicksort(arr, low, p - 1);
		quicksort(arr, p + 1, high);

	}

	private static int hoares(int[] arr, int start, int end) {

		int pivot = arr[start];

		while (start < end) {
			System.out.println("start" + start);
			System.out.println("end" + end);

			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;
			if (start >= end)
				return start;
			swap(arr, start, end);
			start++;
			end--;

		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
