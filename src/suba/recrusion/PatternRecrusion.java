package suba.recrusion;

public class PatternRecrusion {

	public static void main(String[] args) {

		// print * using recursion

		int n = 4;

		printPattern(n);
		printPattern1(n, 0);

	}

	private static void printPattern(int n) {

		if (n == 0)
			return;
		int i = n;
		while (i > 0) {
			System.out.print("*");
			i--;
		}
		System.out.println("");

		printPattern(n - 1);
	}

	private static void printPattern1(int n, int i) {

		if (n == 0)
			return;
		if (i < n) {
			
			printPattern1(n, i + 1);
			System.out.print("*");
		} else {
			

			printPattern1(n - 1, 0);
			System.out.println("");
		}
	}

}
