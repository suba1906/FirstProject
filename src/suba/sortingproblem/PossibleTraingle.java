package suba.sortingproblem;

import java.util.Arrays;

public class PossibleTraingle {

	public static void main(String[] args) {

		int arr[] = { 6, 4, 9, 7, 8 };

		// 3,4,6,7

		int start = 0;
		int end = arr.length;
		Arrays.sort(arr);

		int count = 0;

		while (start < end) {
			int l = start + 1, r = start + 2;
			while (l < end && r < end) {

				if (arr[start] + arr[l] > arr[r]) {
					System.out.println(arr[start] + "  " + arr[l] + "  " + arr[r]);
					count++;
					r++;
				} else {

					System.out.println("else");
					l++;
				}

				if (l == r)
					r++;

			}
			start++;

		}

		System.out.println(count);
	}

}
