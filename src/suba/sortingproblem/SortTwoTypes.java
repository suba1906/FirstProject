package suba.sortingproblem;

import java.util.Arrays;

public class SortTwoTypes {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 0};

		// sort postive nd negative
		
		//Lumuto partition
		int low = 0, high = arr.length - 1;
		int index = low - 1;

		/*
		 * while (low <= high) { if (arr[low] > 0) low++; else { index++; swap(arr,
		 * index, low);
		 * 
		 * low++; } }
		 */
		

			while (low <= high) {
				if (arr[low] == 1)
					low++;
				else {
					index++;
					swap(arr, index, low);
	
					low++;
				}
			}


		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
