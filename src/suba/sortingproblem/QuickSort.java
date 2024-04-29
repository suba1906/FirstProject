package suba.sortingproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 3, 9, 7 };

		int p = 4;

		if (p != arr.length - 1)
			swap(arr, p, arr.length - 1);

		int low = 0, high = arr.length - 1, index = low - 1;
		int pivot = arr[high];
		
		System.out.println(pivot);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				index++;
				swap(arr, index, i);
			}
		}
		swap(arr, index + 1, high);

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
