package suba.arrayproblem;

import java.util.Arrays;

public class ReversingArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		// 60,50,40,30,20,10

		int j = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {

			// swap
			if (i != j) {
				/*
				 * int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
				 */

				// swap without using third variable

				arr[i] = arr[i] + arr[j];

				arr[j] = arr[i] - arr[j];

				arr[i] = arr[i] - arr[j];

				j--;
			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
