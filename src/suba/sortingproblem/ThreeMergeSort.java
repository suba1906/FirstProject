package suba.sortingproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeMergeSort {

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4 };
		int B[] = { 1, 2, 3, 4, 5 };
		int C[] = { 1, 2, 3, 4, 5, 6 };

		int arr[] = firstSort(A, B);
		arr = firstSort(arr, C);
		List<Integer> list = new ArrayList<>();
		for (int i : arr)
			list.add(i);

		System.out.println(Arrays.toString(arr));
		System.out.println(list);

	}

	private static int[] firstSort(int[] leftarr, int[] rightarr) {

		int newArr[] = new int[leftarr.length + rightarr.length];
		int li = 0, ri = 0, k = 0;
		while (li < leftarr.length && ri < rightarr.length) {
			if (leftarr[li] < rightarr[ri]) {
				newArr[k] = leftarr[li];
				li++;
				k++;

			} else {
				newArr[k] = rightarr[ri];
				ri++;
				k++;

			}
		}

		while (li < leftarr.length) {
			newArr[k] = leftarr[li];
			li++;

			k++;
		}

		while (ri < rightarr.length) {

			newArr[k] = rightarr[ri];
			ri++;

			k++;
		}

		return newArr;
	}

}
