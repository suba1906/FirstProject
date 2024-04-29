package suba.recrusion;

public class MazeProblem {

	public static void main(String[] args) {

		int ans = count(3, 3);
		System.out.println(ans);
		printval("", 3, 3);

		riverBlock("", 0, 0);
		// System.out.println("ans1" + riverBlock(0, 0));
	}

	private static int count(int row, int column) {

		// int count = 0;
		if (row == 1 || column == 1)
			return 1;

		int left = count(row - 1, column);
		int right = count(row, column - 1);
		int diagonal = count(row - 1, column - 1);

		left += right;
		left += diagonal;

		return left;
	}

	private static void printval(String p, int row, int column) {

		// both val become 1 you have return and keep check if one went one
		// before...dont minus that further

		if (row == 1 && column == 1) {
			System.out.println(p);
			return;
		}
		if (row > 1)
			printval(p + "D", row - 1, column);
		if (column > 1)
			printval(p + "R", row, column - 1);

	}

	private static void riverBlock(String p, int row, int column) {

		if (row == 1 && column == 1)
			return;
		if (row == 2 && column == 2) {
			System.out.println("2" +p);

			return;
		}

		if (row < 2)
			riverBlock(p + "D", row + 1, column);
		if (column < 2)
			riverBlock(p + "R", row, column + 1);

	}
}
