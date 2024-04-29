package suba.arrayproblem;

public class WindowSliding {
	static int maxs = 0;

	public static void main(String[] args) {

		int arr[] = { 1, 8, 30, -5, 20, 7 }, k = 3;
		// int arr[] = { 5, -10, 6, 90, 3 }, k = 2;

		for (int i = 0; i < arr.length - k; i++) {

			maxs = Math.max(maxs, findmax(arr, k, i));

		}
		// System.out.println(maxs);

		int currn = 0, res = 0;

		for (int i = 0; i < k; i++) {

			currn += arr[i];

		}
		res = currn;

		for (int j = k; j < arr.length; j++) {

			currn = currn + arr[j] - arr[j - k];
			// System.out.println("currn" + currn);
			res = Math.max(res, currn);

		}
		System.out.println(res);

	}

	private static int findmax(int[] arr, int k, int start) {

		int l = 0, ans = 0;
		while (l < k) {
			ans += arr[start + l];
			l++;
		}
		// System.out.println(ans);
		return ans;
	}

}
