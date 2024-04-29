package suba.binaryproblem;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Median2SortedArray {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 5, 15, 25, 35 };

		int arr3[] = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		int val = arr3.length / 2;

		if (arr3.length % 2 == 0) {
			System.out.println((double) (arr3[val] + arr3[val - 1]) / 2);
		} else {
			System.out.println(arr3[val]);

		}

		// arr[arr.le]

		int i = 0, j = 0, p = 0;

		int arr4[] = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr4[p] = arr1[i];
				i++;
			} else {
				arr4[p] = arr2[j];
				j++;

			}
			p++;
		}

		while (i < arr1.length) {
			arr4[p] = arr1[i];
			i++;
			p++;
		}

		while (j < arr2.length) {
			arr4[p] = arr2[j];
			j++;
			p++;
		}

		System.out.println("arr4 " +Arrays.toString(arr4));
	}

}
