package suba.arrayproblem;

import java.util.Arrays;

public class TrappingRainwater {

	public static void main(String[] args) {

		int arr[] = { 7, 4, 0, 9 }, N = 4;

		int leftmax[] = new int[N];
		int rightmax[] = new int[N];

		leftmax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			leftmax[i] = Math.max(arr[i], leftmax[i - 1]);

			// System.err.println(leftmax[i]);
			// System.err.println(Arrays.toString(leftmax));

		}

		rightmax[N - 1] = arr[N - 1];
		for (int i = N - 2; i >= 0; i--) {

			rightmax[i] = Math.max(arr[i], rightmax[i + 1]);

		}
		System.err.println(Arrays.toString(rightmax));
		System.err.println(Arrays.toString(leftmax));
		int savewater = 0;

		for (int i = 0; i < arr.length; i++) {

			savewater += (Math.min(leftmax[i], rightmax[i]) - arr[i]);

		}

		System.out.println(savewater);
	}

}
