package suba.recrusion;

import java.util.Arrays;

public class SelectionSortRecursion {

	// move lowest element to the starting
	public static void main(String[] args) {

		int arr[] = { 5, 1, 3, 8, 9, 2, 0 };

		selectionRec(arr, 0, 0, arr.length-1 );
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionRec(int[] arr, int start, int end, int n) {

		if (start > n)
			return;

		if (end > n)
			selectionRec(arr, start + 1, start + 1, n);

		else if (arr[end] < arr[start]) {
			// swap
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			selectionRec(arr, start, end + 1, n);

		} else {
			selectionRec(arr, start, end + 1, n);

		}

	}

}
