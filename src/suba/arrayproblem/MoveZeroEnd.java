package suba.arrayproblem;

import java.util.Arrays;

public class MoveZeroEnd {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 0, 0, 30, 0, 0, 40 };
		// 10,20,30,40,0,0,0,0
		int arr1[] = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				// arr1[j] = arr[i];
				swap(arr, i, j);
				j++;
			}

		}

		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	/*
	 * private static void movezerotoend(int start, int[] arr) {
	 * System.out.println(start); arr[arr.length - 1] = arr[start]; for (int j =
	 * start; j < arr.length - 1; j++) {
	 * 
	 * if (arr[j + 1] != 0) arr[j] = arr[j + 1]; }
	 * 
	 * System.out.println(Arrays.toString(arr)); }
	 */

}
