package suba.arrayproblem;

public class MaxEvenOddsubarry {

	public static void main(String[] args) {

		int arr[] = { 10, 15, 18, 19, 23, 28, 33, 34, 99 };

		int count = 1, maxcoutn = 1;
		boolean even = arr[0] % 2 == 0 ? true : false;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] % 2 == 0 && !even || arr[i] % 2 != 0 && even) {

				count++;
				maxcoutn = Math.max(count, maxcoutn);

			} else {

				count = 1;
			}

			even = arr[i] % 2 == 0 ? true : false;
		}
		System.out.println(maxcoutn);

	}

}
