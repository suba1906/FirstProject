package suba.binaryproblem;

import java.util.Arrays;

public class SmallestPositiveMissingNum {

	public static void main(String[] args) {

		int arr[] = { 9, 10, 3, 4, 1, -1, -2 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// postivenumber starts from 1
		//[-2, -1, 1, 3, 4, 9, 10]
		/*
		 * 1) if mid <1 start = mid+1
		 * 2)  if(mid -1 >1 && arr[mid-1] == arr[mid]-1
		 * 
		 */
		
		
	}

}
