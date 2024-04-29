package suba.arrayproblem;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 20, 8 };

		int max = Integer.MIN_VALUE;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index=i;
			}
		}
		System.out.println(max);
		System.out.println(index);

	}

}
