package suba.sortingproblem;

public class UnionSortedArray {

	public static void main(String[] args) {

		int a[] = { 1, 35 };
		int b[] = { 6, 9, 13, 15, 20, 25, 29, 46 };

		int x = 0, y = 0;

		while (x < a.length && y < b.length) {

			if (x > 0 && a[x] == a[x - 1]) {
				x++;
				continue;
			}

			if (y > 0 && b[y] == b[y - 1]) {
				y++;
				continue;
			}

			if (a[x] < b[y]) {
				System.out.println(a[x]);
				x++;
			} else if (a[x] > b[y]) {
				System.out.println(b[y]);
				y++;

			} else {
				System.out.println(b[y]);
				x++;
				y++;
			}

		}
		while (x < a.length) {

			if (x > 0 && a[x] == a[x - 1]) {
				y++;
				continue;
			} else {
				System.out.println(a[x]);
				x++;
			}

		}
		while (y < b.length) {

			if (y > 0 && b[y] == b[y - 1]) {
				y++;
				continue;
			} else {
				System.out.println(b[y]);
				y++;
			}

		}

	}

}
