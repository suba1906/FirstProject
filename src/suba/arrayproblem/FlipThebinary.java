package suba.arrayproblem;

public class FlipThebinary {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 0, 0, 0, 0, 1, 1 };

		effiecientway(arr);
		// either we need to convert as 111111 or 000000
		int onegroup = 0, zerogroup = 0;
		// int count = 0;
		int start = arr[0] == 1 ? 1 : 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (start == arr[i + 1]) {

				continue;
			} else {
				if (start == 1) {
					start = 0;
					onegroup++;
				} else {
					start = 1;

					zerogroup++;
				}

			}

		}

		if (arr[arr.length - 1] == 1)
			onegroup++;
		else
			zerogroup++;

		System.out.println(onegroup + "ds" + zerogroup);
	}

	private static void effiecientway(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0])
					System.out.print(" from " + i + "to ");
				else
					System.out.print(i - 1);

			}
		}

		if (arr[arr.length - 1] != arr[0])
			System.out.print(arr.length - 1);

	}

}
