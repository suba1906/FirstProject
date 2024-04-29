package suba.recrusion;

public class AllSideMaze {

	public static void main(String[] args) {

		boolean maze[][] = { { true, true, true }, { true, true, true }, { true, true, true } };

		allsides("", "1", maze, 0, 0);
	}

	private static void allsides(String p, String step, boolean[][] maze, int row, int col) {

		// System.out.println(row + " " + col);

		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(step + p);
			return;
		}
		if (!maze[row][col])
			return;

		maze[row][col] = false; // here is the place where it enter in to all side calls

		if (row < maze.length - 1)
			allsides(p + "D", step + ((step.charAt(step.length() - 1) - '0') + 1), maze, row + 1, col);
		if (col < maze[0].length - 1)
			allsides(p + "R", step + ((step.charAt(step.length() - 1) - '0') + 1), maze, row, col + 1);
		if (row > 0)
			allsides(p + "U", step + ((step.charAt(step.length() - 1) - '0') + 1), maze, row - 1, col);
		if (col > 0)
			allsides(p + "L", step + ((step.charAt(step.length() - 1) - '0') + 1), maze, row, col - 1);

		// This is the place where all side call over .... again changing to true
		maze[row][col] = true;

	}

}
