package suba.arrayproblem;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		// sorted array
		int arr[] = { 10, 10, 20, 25, 25, 25, 25 };

		int val = arr[0], count = 1;
		for (int i = 1; i < arr.length; i++) {

			if (val == arr[i])
				count++;
			else {
				System.out.println(val + " " + count);
				val = arr[i];
				count = 1;
			}
		}
		System.out.println(val + " " + count);
	}

}
