package suba.arrayproblem;

public class MaxConone {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 1, 1, 1, 0, 1, 1 };
		// output -> 3

		int count = 0, maxi = 0;

		for (int i = 0; i < arr.length; i++) {

			/*
			 * if (arr[i] == 1) { count += 1; if (i == arr.length - 1) maxi = Math.max(maxi,
			 * count);
			 * 
			 * } else { maxi = Math.max(maxi, count); count = 0; }
			 */

			if (arr[i] != 1) {
				count = 0;
				continue;
			}

			count += 1;
			maxi = Math.max(maxi, count);

		}
		System.out.println(maxi);
	}

}
