package suba.arrayproblem;

public class MaxCircularSubarr {

	public static void main(String[] args) {

		int arr[] = { 8, -4, 3, -5, 4 };

		int maxarr = 0;
		int minarr = arr[0];
		int total = 0;

		for (int i = 1; i < arr.length; i++) {

			minarr += arr[i];
			total += arr[i];

			minarr = Math.min(arr[i], minarr);
			// minarr = Math.min(maxarr, minarr);

			if (maxarr < 0)
				maxarr = 0;
		}
		System.err.println(minarr);
		System.err.println(total - minarr);

	}

}
