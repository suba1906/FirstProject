package suba.sortingproblem;

import java.util.Arrays;

public class ThreeWayParttioning {

	public static void main(String[] args) {

		int arr[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		int range[] = { 14, 20 };
		// [1, 5, 4, 2, 14, 20, 54, 20, 3, 1, 87, 98, 32]

		partition(arr, 0, arr.length - 1, range[0], range[range.length - 1]);

	}

	private static void partition(int[] arr, int start, int end, int leftpivot, int rightpivot) {

		int leftindex = start, rightindex = end;

		for (int i = 0; i <= rightindex;) {

			if (arr[i] < leftpivot) {
				swap(arr, i, leftindex);

				leftindex++;
				i++;

			}

			else if (arr[i] > rightpivot) {
				swap(arr, i, rightindex);
				rightindex--;

			} else
				i++;

		}
		System.out.println(start);
		System.out.println(end);

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
