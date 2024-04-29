package suba.recrusion;

import java.util.Arrays;

public class QuickSortRecursion {

	public static void main(String[] args) {
		int arr[] = { 10, 80, 30, 90, 40, 50, 70 };

		
		int start = 0;
		int end = arr.length - 1;
		QuickSortRec(arr, start, end);
		System.out.println(Arrays.toString(arr));
	}

	private static void QuickSortRec(int[] arr, int start, int end) {
		System.out.println(Arrays.toString(arr));
		if (start > end)
			return;
		int mid = start + (end - start) / 2;
		int pivot = arr[mid];
		System.out.println(pivot);

		int low = start, high = end;
		while (low <= high) {
			//.out.println("low < high");
			while (arr[low] < pivot)
				low++;
			while (arr[high] > pivot)
				high--;

			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}

		}

		QuickSortRec(arr, start, high);
		QuickSortRec(arr, low, end);

	}

	

}
