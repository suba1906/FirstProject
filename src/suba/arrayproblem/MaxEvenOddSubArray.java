package suba.arrayproblem;

public class MaxEvenOddSubArray {

	public static void main(String[] args) {

		int arr[] = { 10, 12, 7, 8, 11, 12, 14 };

		// op --> 6

		// checking first value as even or add
		boolean evnodd = arr[0] % 2 == 0 ? true : false;
		int count = 1, subarray = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && !evnodd || arr[i] % 2 != 0 && evnodd) {
				count++;
				evnodd = evnodd ? false : true;
			} /*
				 * else if (arr[i] % 2 != 0 && evnodd) { count++; evnodd = false; }
				 */
			else {
				count = 1;
			}

			subarray = Math.max(subarray, count);
		}

		System.out.println(subarray);
	}

}
