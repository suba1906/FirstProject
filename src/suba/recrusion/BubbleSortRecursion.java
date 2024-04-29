package suba.recrusion;

import java.util.Arrays;

public class BubbleSortRecursion {

	// moving greater value to the end
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 1 };

		int arr1[] = bubbleRec(arr, 1, arr.length - 1);
		System.out.println(Arrays.toString(arr1));
	}

	private static int[] bubbleRec(int[] arr, int start, int end) {

		if (end == 0)
			return arr;

		if (start > end) {
			return bubbleRec(arr, 1, end - 1);

		} else if (arr[start - 1] < arr[start]) {
			return bubbleRec(arr, start + 1, end);
		} else {
			int temp = arr[start - 1];
			arr[start - 1] = arr[start];
			arr[start] = temp;
			return bubbleRec(arr, start + 1, end);

		}
	}
	
	
	

}
