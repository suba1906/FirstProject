package suba.arrayproblem;

public class PrefixSum {
	static int s = 0, end = 0, sum = 0;

	public static void main(String[] args) {

		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };

		int ans;
		ans = findPrefixnaive(arr, 0, 2);
		System.out.println("first sum " + ans);
		ans = findPrefixnaive(arr, 1, 3);
		System.out.println("scnd sum " + ans);
		ans = findPrefixnaive(arr, 2, 6);
		System.out.println("thirs sum " + ans);

		ans = findPrefixEffi(arr, 0, 2);
		System.out.println("fourth sum " + ans);

	}

	private static int findPrefixnaive(int[] arr, int start, int end) {

		int res = 0;
		for (int i = start; i <= end; i++) {
			// System.out.println("sum" + sum);
			res += arr[i];
		}

		return res;
	}

	private static int findPrefixEffi(int[] arr, int start, int end) {
		int res = 0;

		while (start < end) {

			res = res + arr[start] + arr[end];

			start++;
			end--;
			if (start == end)
				res = res + arr[start];

		}

		return res;
	}

}
