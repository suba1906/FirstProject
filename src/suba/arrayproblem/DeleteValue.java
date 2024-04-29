package suba.arrayproblem;

import java.util.Arrays;

public class DeleteValue {

	public static void main(String[] args) {

		int arr[] = { 10, 8, 9, 23 };

		int n = arr.length;
		int a = 9;
		int i;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] == a)
				break;

		}

		System.out.println(i);
		if (i == n)
			System.out.println(n);

		for (int j = i; j < n; j++) {

			arr[i] = arr[i + 1];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
