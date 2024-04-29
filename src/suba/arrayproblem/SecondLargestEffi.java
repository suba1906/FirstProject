package suba.arrayproblem;

import java.util.ArrayList;

public class SecondLargestEffi {

	public static void main(String[] args) {

		int arr[] = { 30, 30, 30,40,40,20,5};
		int firstlargest = -1;
		int secondlargest = -1;
		ArrayList<Integer> list = new ArrayList<>();
		// int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = arr[i];

				// index=i;
			}

			if (secondlargest < arr[i] && arr[i] != firstlargest)
				secondlargest = arr[i];

		}

		list.add(firstlargest);
		list.add(secondlargest);

		System.out.println("firstlargest" + firstlargest);
		System.out.println("secondlargest" + secondlargest);
	}

}
