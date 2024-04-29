package suba.arrayproblem;

public class LeaderArrays {

	public static void main(String[] args) {

		int arr[] = { 7, 10, 6, 8, 2, 3 };

		// firstmethod(arr);
		secondmethod(arr);
	}

	private static void secondmethod(int[] arr) {

		int largest = arr[arr.length - 1];
		System.out.println(largest);

		for (int i = arr.length - 1; i > 0; i--) {

			if (arr[i - 1] > largest) {

				largest = arr[i - 1];
				System.out.println(largest);

			}

		}

	}

	private static void firstmethod(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] >= arr[i]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println(arr[i]);
			}

		}
	}

}
