package suba.binaryproblem;

import java.util.Arrays;

public class MajorityElement {
	private final static int CHAR = 256;

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 3, 3, 3 };
		int arr[] = new int[CHAR];
		for (int i = 0; i < A.length; i++) {
			arr[A[i]]++; // --> Add value in that
		}
		System.out.println(Arrays.toString(arr));

		int maxval = -1;

		for (int i = 0; i < A.length; i++) {

			if (arr[i] > A.length / 2) {
				maxval = arr[i] > maxval ? i : maxval;
			}
		}
		System.out.println(maxval);
	}

}
