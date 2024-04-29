package suba.binaryproblem;

import java.util.Arrays;

public class CountMoreThanNoccu {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3, 3 };
		int N = 9, k = 4;

		int a = N / k;
		System.out.println(a);

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int count = 1, org = 0;
		int start = arr[0];
		boolean updated = false;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == start) {
				count++;
				if (count > a && !updated) {
					updated = true;
					org++;
				}
			} else {
				updated = false;
				start = arr[i];
				count = 1;
			}

		}

		System.out.println(org);

	}

}
