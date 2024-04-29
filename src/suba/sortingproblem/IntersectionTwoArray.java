package suba.sortingproblem;

public class IntersectionTwoArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 10, 10, 10, 15, 15, 20 };
		int arr2[] = { 5, 10, 10, 15, 30 };

		int x = 0, y = 0;

		while (x < arr.length && y < arr2.length) {

			if (x > 0 && arr[x] == arr[x - 1]) {
				x++;
				continue;
			}

			if (arr[x] < arr2[y]) {
				x++;
			}

			else if (arr[x] > arr2[y])
				y++;
			else {
				System.out.println(arr[x]);

				while (y < arr2.length - 1 && arr2[y] == arr2[y + 1]) {
					y++;
				}
				x++;
			}

		}
	}

}
