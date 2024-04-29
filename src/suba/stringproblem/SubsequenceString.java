package suba.stringproblem;

public class SubsequenceString {

	public static void main(String[] args) {

		String a = "geeksfor";
		String b = "eekr";
		boolean answer = solveRecursive(a, b, a.length(), b.length());
		System.out.println(answer);
		int j = 0;
		for (int i = 0; i < a.length() && j < b.length(); i++) {

			if (a.charAt(i) == b.charAt(j)) {
				j++;
			}
			// System.out.println("j" + j);

		}
		if (j == b.length())
			System.out.println("true");

		System.out.println("not true");

	}

	private static boolean solveRecursive(String a, String b, int m, int n) {

		if (n == 0)
			return true;
		if (m == 0)
			return false;

		if (a.charAt(m - 1) == b.charAt(n - 1))
			solveRecursive(a, b, m - 1, n - 1);

		else
			solveRecursive(a, b, m - 1, n);
		return false;

	}

}
