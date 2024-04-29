package suba.sortingproblem;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int a[] = { 10, 15, 20 };
		int b[] = { 5, 6, 6, 15 };

		int x = 0, y = 0;

		while (x < a.length && y < b.length) {

			if (a[x] < b[y]) {
				System.out.print(a[x] + " ");
				x++;
			} else {
				System.out.print(b[y] + " ");
				y++;
			}

		}

		while (x < a.length) {
			System.out.print(a[x] + " ");
			x++;
		}

		while (y < b.length) {
			System.out.print(b[y] + " ");
			y++;
		}

	}

}
