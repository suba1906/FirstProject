package suba.binaryproblem;

public class MinPages {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 10, 30 };
		int k = 2;
		int sum = 0, maxm = arr[0];

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			maxm = Math.max(arr[i], maxm);
		}

		// int val = (maxm + sum) / 2; // BODMAS
		int start = maxm;
		int end = sum, ans = 0;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (leftHalf(arr, arr.length, k, mid)) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
			}

		}

		System.out.println("ans" + ans);

	}

	private static boolean leftHalf(int[] arr, int n, int k, int mid) {
		// TODO Auto-generated method stub

		int k1 = 1;
		int cal = 0;
		System.out.println("mid" + mid);
		for (int i = 0; i < arr.length; i++) {

			cal += arr[i];
			if (cal > mid) {
				System.out.println("arr[i]" + cal);
				// maxim = Math.max(cal, maxim);
				cal = arr[i];
				k1++;

			}

		}
		return k1 > k ? true : false;

	}

}
