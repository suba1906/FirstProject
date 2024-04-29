package suba.arrayproblem;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseSubarray {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		int k = 3, n = 5;

		int arr[] = new int[n];
		int l = 0;
		for (int i = k - 1; i >= 0; i--) {
			arr[l] = array.get(i);
			l++;
		}

		for (int j = n - 1; j >= k; j--) {
			arr[l] = array.get(j);
			l++;
		}

		/*	for (int i = k - 1; i >= 0; i--) {
		//	arr[l] = array.get(i);
			array.set(l, AL2.get(i));
			l++;
		}

        if(k<n)
        {
		for (int j = n - 1; j >= k; j--) {
		//	arr[l] = array.get(j);
			array.set(l, AL2.get(j));
			l++;
		}
		}*/
		System.out.println(Arrays.toString(arr));
	}

}
