package suba.arrayproblem;

public class SubArrayGivenVal {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 }, sum = 33;

		int arr1[] = new int[arr.length];

		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("i" + i);
			arr1[i] = arr[i];
			for (int j = 0; j < i; j++) {
				// System.out.println("j" + j);
				arr1[j] = arr1[j] + arr[i];
				System.out.println(arr1[j]);
				if (arr1[j] == sum) {
					System.out.println("yes");
					found = true;
					break;
				}
			}
			if (found)
				break;
		}

	}

}
