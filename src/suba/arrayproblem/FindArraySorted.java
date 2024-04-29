package suba.arrayproblem;

public class FindArraySorted {

	public static void main(String[] args) {

		int arr[] = { 10, 30, 40, 30 };

		for (int i = 0; i < arr.length; i++) {

			if (i != arr.length - 1) { // if we checked in the backwards , not need to give this if condition
				if (arr[i] < arr[i + 1])
					continue;
				else {
					System.out.println("Not sorted");
					break;
				}
			}
		}
	}

}
