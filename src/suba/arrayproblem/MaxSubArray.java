package suba.arrayproblem;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {

		int arr[] = { -5, 1, -2, 3, -1, 2, -2 };

		int ans = arr[0];
		int maxarr = arr[0];
		for (int i = 1; i < arr.length; i++) {

			maxarr = Math.max(maxarr + arr[i], arr[i]);
			// arr[i] = sum;
			ans = Math.max(ans, maxarr);

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(ans);

	}

}
