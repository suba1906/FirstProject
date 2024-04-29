package suba.recrusion;

public class PrintNum {

	public static void main(String[] args) {

		// Print number till 1 in recrusion

		int N = 5;

		printNumber(N);

	}

	private static void printNumber(int n) {

		if (n == 0)
			return;
		//System.out.println(n);

		printNumber(n - 1);
		System.out.println(n);

	}

}
