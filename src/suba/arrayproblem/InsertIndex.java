package suba.arrayproblem;

import java.util.Arrays;

public class InsertIndex {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 6, 7 ,0}, sizeofarray = 6, index = 3, element = 88;

		for (int i = arr.length - 2; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = element;

		System.out.println(Arrays.toString(arr));

	}

}
