package suba.arrayproblem;

import java.util.Arrays;

public class InsertionArray {

	public static void main(String[] args) {

		int arr[] = { 20, 5, 40, 60, 10, 30 };
		// 5 20 40 60 10 30
		// 5 20 40 60 10 30

		for (int i = 0; i < arr.length - 1; i++) {

			int nextj = i + 1;
			int nexti = i;

			while (nexti >= 0 && arr[nextj] < arr[nexti]) {
				int temp = arr[nextj];
				arr[nextj--] = arr[nexti];
				arr[nexti--] = temp;

			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
