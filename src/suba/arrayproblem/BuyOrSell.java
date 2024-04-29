package suba.arrayproblem;

public class BuyOrSell {

	public static void main(String[] args) {

		// int arr[] = { 1, 5, 8, 2, 1, 4 };
		// output -> 7+3= 10

		// int arr[] = { 1, 5, 3, 8, 12 };
		// output -> 4+9= 13

		// int arr[] = { 10, 20, 30 };
		// output 20

		int arr[] = { 1, 5, 3, 1, 2, 8 };
		// output 4+7 = 11

		int N = arr.length - 1;
		// System.out.println("N" + N);

		int ans;
		// ans = methodone(arr, N);
		ans = methodtwo(arr, N);

		System.out.println(ans);
		System.out.println("SUba");
		

		
	}

	private static int methodtwo(int[] arr, int n) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				count += arr[i] - arr[i - 1];
			}
		}
		return count;
	}

	private static int methodone(int[] arr, int N) {
		int start = arr[0], count = 0;
		for (int i = 1; i < arr.length; i++) {

			if (i == N && arr[i - 1] < arr[i]) {

				count = count + (arr[i] - start);
				break;
			}
			if (arr[i - 1] < arr[i]) {
				// System.out.println("arr[i]" + arr[i]);
				continue;
			} else {
				// System.out.println(arr[i]);
				if (arr[i - 1] != start)
					count = count + (arr[i - 1] - start);
				// System.out.println("count" + count);

				start = arr[i];
			}

		}
		return count;
	}

}
