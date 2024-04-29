package suba.arrayproblem;

public class Equilbrium {

	public static void main(String[] args) {

		int arr[] = { 4, -2, 2 };
		int rightsum = 0, leftsum = 0;
		boolean flag = false;
		for (int i = 1; i < arr.length; i++) {
			rightsum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			/*
			 * if (i == 0) { if (rightsum == leftsum) { System.out.println("true"); return;
			 * } } else { leftsum += arr[i - 1]; rightsum -= arr[i]; if (rightsum ==
			 * leftsum) { System.out.println("true" + rightsum + " " + leftsum); return; }
			 * 
			 * }
			 */

			if (i != 0) {
				leftsum += arr[i - 1];
				rightsum -= arr[i];
			}

			if (rightsum == leftsum) {
				System.out.println("true " + rightsum + " " + leftsum);
				flag = true;
				return;
			}
		}

		if (!flag)
			System.out.println("false " + rightsum + " " + leftsum);

	}
}
