package suba.arrayproblem;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int d = 3;

		d = d % arr.length; // to avoid index out of bound exeception if d is greater than n
		// firstmethod(d, arr);
		// secondmethod(d, arr, arr.length);
		thirdmethod(d, arr, arr.length);

		System.out.println(Arrays.toString(arr));

	}

	private static void thirdmethod(int d, int[] arr, int length) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, length - 1);
		reverse(arr, 0, length - 1);

	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}
	}

	private static void secondmethod(int d, int[] arr, int length) {
		int newarr[] = new int[d];

		for (int i = 0; i < d; i++) {
			newarr[i] = arr[i];
		}

		for (int i = d; i < length; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			arr[length - d + i] = newarr[i];
		}
	}

	private static void firstmethod(int d, int[] arr) {
		while (d > 0) {
			int temp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
			d--;
		}

	}

}
