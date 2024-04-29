package suba.maths;

public class ContigousSubarray {

	// contigous means --> next next
	public static void main(String[] args) {

		// int arr[] = { 10, 2, -2, -20, 10 };
		int arr[] = { 9, 4, 20, 3, 10, 5 };
		int target = 33;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == target) {
					count++;
					break;
				}
			}

		}

		System.out.println(count);
	}

}
