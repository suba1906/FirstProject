package suba.sortingproblem;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 10, 0, 8, 20, 2, 18 };
		int temparr[] = new int[arr.length];

		effiecntway(arr);
		// int prvminm = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(Arrays.toString(arr));
			int minm = Integer.MAX_VALUE;
			int index = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] < minm) {
					minm = arr[j];
					index = j;
				}
			}
			temparr[i] = minm;

			// prvminm = minm;
			arr[index] = Integer.MAX_VALUE;
		}

		System.out.println(Arrays.toString(temparr));
	}

	private static void effiecntway(int[] arr) {

		int minindex = 0, replaceindex = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minindex]) {
					// minm = arr[j];
					minindex = j;
				}

			}

			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;

			System.out.println("itertion for " + i + " th time" + Arrays.toString(arr) + "minindex " + minindex);
			// replaceindex++;

		}

		System.out.println("eff" + Arrays.toString(arr));

	}

}
