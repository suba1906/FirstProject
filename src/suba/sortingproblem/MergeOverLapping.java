package suba.sortingproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverLapping {

	public static void main(String[] args) {

		int[][] arr = { { 7, 11 }, { 6, 10 }, { 4, 5 }, { 1, 3 }, { 2, 4 } };

		Arrays.sort(arr, Comparator.comparing(a -> a[0]));
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			// System.out.println(Arrays.toString(arr[i]));
			// System.out.println(Arrays.toString(arr[i + 1]));

			if (arr[i - 1][1] >= arr[i][0] && arr[i - 1][0] <= arr[i][1]) {
				System.out.println("before" + Arrays.toString(arr[i - 1]));

				int start = Math.min(arr[i - 1][0], arr[i][0]);
				int end = Math.max(arr[i - 1][1], arr[i][1]);
				arr[i - 1][0] = start;
				arr[i - 1][1] = end;

				System.out.println("After" + Arrays.toString(arr[i - 1]));

			}
			System.out.println(" ");

		}
	}

}
