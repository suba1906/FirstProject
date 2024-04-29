package suba.binaryproblem;

import java.util.Arrays;

public class TargetInTwoDimensional {

	public static void main(String[] args) {
		// sorted row two dimensional array
		int arr[][] = { { 10, 20, 30, 40 }, { 11, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
		int arr1[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 101, 105 } };

		int target = 20;

		int answer[] = serachTarget(arr, target);

		System.out.println(Arrays.toString(answer));
	}

	private static int[] serachTarget(int[][] arr, int target) {

		int r = 0;
		int c = arr.length - 1;
		while (r < arr.length && c >= 0) {
			if (arr[r][c] == target) {
				return new int[] { r, c };
			} else if (arr[r][c] < target)
				r++;
			else
				c--;
		}
		return new int[] { -1, -1 };

	}

}
