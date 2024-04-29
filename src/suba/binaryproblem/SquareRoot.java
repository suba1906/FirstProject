package suba.binaryproblem;

public class SquareRoot {

	public static void main(String[] args) {

		int x = 1065;

		System.out.println(System.currentTimeMillis());
		System.out.println(reccall(x, x / 2));

		System.out.println(System.currentTimeMillis());

		System.out.println(binarySearch(x));
		System.out.println(System.currentTimeMillis());

	}

	private static int binarySearch(int x) {

		int start = 0, end = x;
		int ans = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int sq = mid * mid;
			if (sq == x)
				return mid;
			else if (sq > x)
				end = mid - 1;
			else {
				start = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

	private static int reccall(int x, int i) {

		if (i * i > x) {
			// System.out.println(i * i);
			return reccall(x, i / 2);
		}

		while (i * i <= x) {
			i++;
		}
		return i - 1;

	}

}
