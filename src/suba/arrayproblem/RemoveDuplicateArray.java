package suba.arrayproblem;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		// sorted duplicate array
		int arr[] = { 10, 10, 20, 20, 30, 30, 30, 40 };
		System.out.println(arr.length);
		int distintArr[] = new int[arr.length];
		int j = 1;
		distintArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (distintArr[j - 1] != arr[i]) {
				distintArr[j] = arr[i];
				j++;
				// j = i + 1;
			}

		}

		System.out.println(Arrays.toString(distintArr));
	}

}
