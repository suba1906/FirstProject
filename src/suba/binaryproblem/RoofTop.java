package suba.binaryproblem;

public class RoofTop {

	public static void main(String[] args) {
		int arr[] = { 6, 9, 2, 7, 5, 4, 1, 9 };
		System.out.println(arr.length / 2);
		System.out.println(findrooftop(arr));
	}

	private static int findrooftop(int[] A) {
		int start = 0, end = A.length - 1;
		int leftmax = 0, rightmax = 0;
		while (start <= end) {

			if (start == end)
				return leftmax + rightmax;

			if (start <= (A.length / 2)) {
				System.out.println("start" + start);
				int left = A[start + 1] - A[start];
				leftmax = left > 0 ? leftmax += left : 0;
			}

			if (end > A.length / 2) {
				System.out.println("end" + end);

				int right = A[end] - A[end - 1];
				rightmax = right > 0 ? rightmax += right : 0;
			}
			start++;
			end--;

		}
		return leftmax + rightmax;

	}

}
