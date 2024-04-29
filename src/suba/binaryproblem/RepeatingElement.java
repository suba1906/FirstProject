package suba.binaryproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatingElement {

	static class Pair {
		long x;
		long y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
	}

	public static void main(String[] args) {

		int arr[] = { 0, 2, 1, 3, 2, 2 };
		int arr3[] = { 1, 2, 3, 3, 4 }; // sorted array

		Pair p = findarray(arr3);
		System.out.println(p.toString());
		int arr4[] = { 1, 2, 3, 2, 3, 4, 5, 6 };

		System.out.println(findarray1(arr4));

		boolean arr1[] = new boolean[arr.length];
		int arr2[] = new int[arr.length - 1];

		Arrays.fill(arr1, false);
		// [F,F,F,F,F,F,F]

		for (int i = 0; i < arr.length; i++) {
			if (arr1[arr[i]])
				System.out.println(arr[i]);
			arr1[arr[i]] = true;

			arr2[arr[i]]++;
		}

		// System.out.println(Arrays.toString(arr1));
	}

	private static Pair findarray(int[] arr) {
		int count = 1;
		// int maxval = 0;
		boolean repeat = false;
		int a = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				repeat = true;
				a = arr[i];
				count++;

			}
		}
		return repeat ? new Pair(a, count) : new Pair(-1, -1);

	}

	private static int[] findarray1(int[] arr) {

		int newArr[] = new int[2];
		// Arrays.fill(newArr,-1);
		int k = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("loop break " +i);
			if (k >= 2) {
				break;
			}
			if (map.containsKey(arr[i])) {
				newArr[k++] = arr[i]; // u can increase like this also
				// k++;

			} else
				map.put(arr[i], 1);

		}
		return newArr;

	}

}
